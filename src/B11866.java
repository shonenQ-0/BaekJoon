import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(str.nextToken());
        int K = Integer.parseInt(str.nextToken());

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        sb.append("<");

        while(q.size() > 1){
            for (int i = 0; i < K - 1; i++) {
                q.add(q.poll());
            }

            sb.append(q.poll()).append(",").append(" ");
        }

        sb.append(q.poll()).append(">");

        System.out.println(sb);

    }
}
