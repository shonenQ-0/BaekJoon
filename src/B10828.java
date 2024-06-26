import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B10828 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> st = new Stack<Integer>();
        int N = Integer.parseInt(br.readLine());

        int getNum;
        String s = "";
        for (int i = 0; i < N; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            switch (str.nextToken()) {

                case "push":
                    getNum = Integer.parseInt(str.nextToken());
                    st.push(getNum);
                    break;

                    case "pop" :
                    if (!st.empty()) {
                        System.out.println(st.pop());
                    }else System.out.println(-1);
                    break;

                    case "size" :
                    System.out.println(st.size());
                    break;


                    case "empty" :
                    if (st.empty()) {
                        System.out.println(1);
                    }else System.out.println(0);
                    break;

                    case "top" :
                    if (st.empty()){
                        System.out.println(-1);
                    }else System.out.println(st.peek());
                    break;
            }
        }
    }
}
