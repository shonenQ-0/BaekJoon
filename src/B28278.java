import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        StringTokenizer str;
        for (int i = 0; i < N; i++) {
            str = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(str.nextToken());

            switch (n){
                case 1 :
                    st.push(Integer.parseInt(str.nextToken()));
                    break;
                case 2 :
                    if (st.empty()) System.out.println(-1);
                    else System.out.println(st.pop());
                    break;
                case 3 :
                    System.out.println(st.size());
                    break;
                case 4 :
                    if (st.empty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                case 5 :
                    if (!st.empty()) System.out.println(st.peek());
                    else System.out.println(-1);


            }
        }
    }
}
