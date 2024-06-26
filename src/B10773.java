import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class B10773 {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> st = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        int num;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(br.readLine());
            if(num == 0 && !st.empty()){
                st.pop();
            }else st.push(num);
        }
        int size = st.size();

        for (int i = 0; i < size; i++) {
            sum += st.pop();
        }

        System.out.println(sum);

    }
}
