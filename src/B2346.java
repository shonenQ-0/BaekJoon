import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;
        Deque<Integer> d = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 1; i <= N; i++) {
            d.add(i);
        }
        str = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str.nextToken());
        }

        int turn = arr[0];
        int tmp = 0;
        sb.append(d.pollFirst()).append(" ");

        while(d.size() > 1){
            if (turn > 0){
                for (int i = 0; i < turn - 1; i++) {
                    d.addLast(d.pollFirst());
                }
                tmp = d.pollFirst();
                sb.append(tmp).append(" ");
                turn = arr[tmp - 1];
            }else {
                for (int i = turn + 1; i < 0; i++) {
                    d.addFirst(d.pollLast());
                }
                tmp = d.pollLast();
                sb.append(tmp).append(" ");
                turn = arr[tmp - 1];
            }
        }
        sb.append(d.poll());
        System.out.println(sb);
    }
}
