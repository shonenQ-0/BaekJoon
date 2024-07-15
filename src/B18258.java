import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int last = 0;

        for (int i = 0; i < N; i++) {
            str = new StringTokenizer(br.readLine());
            switch (str.nextToken()){
                case "push" :
                    last = Integer.parseInt(str.nextToken());
                    queue.add(last);
                    break;
                case "pop" :
                    if (!queue.isEmpty()) sb.append(queue.poll()).append("\n");
                    else sb.append(-1).append("\n");
                    break;
                case "size" :
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty" :
                    if (queue.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "front" :
                    if (!queue.isEmpty()) sb.append(queue.peek()).append("\n");
                    else sb.append(-1).append("\n");
                    break;
                case "back" :
                    if (!queue.isEmpty()) {
                        sb.append(last).append("\n");
                    }else sb.append(-1).append("\n");
            }
        }
        System.out.println(sb);

    }
}
