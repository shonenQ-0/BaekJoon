import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

public class B5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            sb.delete(0, sb.length());
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                switch (s.charAt(j)) {
                    case '<'  : if (!left.isEmpty()){
                        right.push(left.pop());
                    }break;
                    case '>'  : if (!right.isEmpty()){
                        left.push(right.pop());
                    }break;
                    case '-' : if (!left.isEmpty()){
                        left.pop();
                    }break;

                    default: left.push(s.charAt(j));
                }
            }

            while (!left.isEmpty()){
                right.push(left.pop());
            }
            while (!right.isEmpty()){
                sb.append(right.pop());
            }
            System.out.println(sb);
        }
    }
}


