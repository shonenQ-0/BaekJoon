import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Stack;

public class B6198 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> st = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        long result = 0;

        for (int i = 0; i < n; i++) {
            int h = Integer.parseInt(br.readLine());

            while (!st.isEmpty()){
                if (st.peek() <= h){
                    st.pop();
                }else break;
            }
            result += st.size();
            st.push(h);
        }
        System.out.println(result);

    }
}

        /*
        int[] arr = new int[n + 1];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(br.readLine());
            arr[i] = tmp;
            st.push(tmp);
        }
        for (int i = 0; i < arr.length; i++) {
            int idx = i + 1;

            if (idx == arr.length) {
                break;
            }

            while(idx < n){
                if (arr[i] > arr[idx]){
                    count++;
                }else break;
                idx ++;
            }
        }

        System.out.println(count);
         */

