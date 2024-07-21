import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class B1874 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<Integer>();
        StringBuilder sb = new StringBuilder();

        int start = 0;

        int N = Integer.parseInt(br.readLine());
        while(N-- > 0){
            int target = Integer.parseInt(br.readLine());

            if (target > start){
                for (int i = start + 1; i <= target; i++) {
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                start = target;
            } else if (stack.peek() != target) {
                System.out.println("NO");
                System.exit(0);
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}