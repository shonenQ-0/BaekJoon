import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class B24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;
        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        str = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(str.nextToken());
        }
        str = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(str.nextToken());
            if (arr[i] == 0) dq.add(tmp);
        }
        int count = Integer.parseInt(br.readLine());
        str = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            dq.addFirst(Integer.parseInt(str.nextToken()));
            sb.append(dq.pollLast()).append(" ");
        }
        System.out.println(sb);
    }
}
