import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            queue.add(Integer.parseInt(str.nextToken()));
        }

        int num = 1;

        while(!queue.isEmpty()){
            if (queue.peek() == num){
                queue.poll();
                num++;
            } else if (!stack.isEmpty() && stack.peek() == num) {
                stack.pop();
                num ++;
            }else {
                stack.push(queue.poll());
            }
        }
        while(!stack.isEmpty()){
            if (stack.peek() == num){
                stack.pop();
                num++;
            }else {
                System.out.println("Sad");
                return;
              // return과  break; 의 차이가 뭐지?
            }
        }
        System.out.println("Nice");
    }
}
