import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B3986 {
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        count = 0;
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            good(s);
        }
        System.out.println(count);
    }
    public static void good(String s){
        Stack<Character> st = new Stack<>();
        if (s.length() % 2 != 0){
            return;
        }

        st.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (!st.isEmpty() && st.peek() == s.charAt(i)){
                st.pop();
            }else st.push(s.charAt(i));
        }

        if (st.isEmpty()) count++;


    }
}