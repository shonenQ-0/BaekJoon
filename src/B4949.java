import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String s = br.readLine();
            if (s.equals(".")) break;
            System.out.println(checker(s));
        }
    }
    public static String checker(String s) {
        Stack<Character> big = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                big.push(s.charAt(i));
            } else if (s.charAt(i) == ']') {
                if (big.empty() || big.peek() == '(') return "no";
                else big.pop();
            } else if (s.charAt(i) == '(') {
                big.push(s.charAt(i));
            }else if (s.charAt(i) == ')'){
                if (big.empty() || big.peek() == '[') return "no";
                else big.pop();
            }
        }
        if (big.empty()) return "yes";
        else return "no";
    }
}
