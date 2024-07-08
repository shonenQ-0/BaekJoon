import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            System.out.println(checker(br.readLine()));
        }
    }
    public static String checker(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') st.push(s.charAt(i));
            else if (st.empty()) {
                return "NO";
            }else st.pop();
        }

        if (st.empty()) return "YES";
        else return "NO";
    }
}
