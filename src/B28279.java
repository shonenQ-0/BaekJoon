import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class B28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;
        Deque<Integer> d = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            str = new StringTokenizer(br.readLine());

            int tmp = Integer.parseInt(str.nextToken());
            switch (tmp){
                case 1 : d.addFirst(Integer.parseInt(str.nextToken())); break;
                case 2 : d.addLast(Integer.parseInt(str.nextToken())); break;
                case 3 : if (!d.isEmpty()) sb.append(d.pollFirst()).append("\n"); else sb.append(-1).append("\n"); break;
                case 4 : if (!d.isEmpty()) sb.append(d.pollLast()).append("\n"); else sb.append(-1).append("\n"); break;
                case 5 : sb.append(d.size()).append("\n"); break;
                case 6 : if (d.isEmpty()) sb.append(1).append("\n"); else sb.append(0).append("\n"); break;
                case 7 : if (!d.isEmpty()) sb.append(d.getFirst()).append("\n"); else sb.append(-1).append("\n"); break;
                case 8 : if (!d.isEmpty()) sb.append(d.getLast()).append("\n"); else sb.append(-1).append("\n"); break;
            }
        }
        System.out.println(sb);


    }
}
