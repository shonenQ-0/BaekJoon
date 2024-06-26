import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class B2577 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int M = A*B*C;
        String S = Integer.toString(M);

        int[] n = new int[10];
        for (int i = 0; i < S.length(); i++) {
            n[S.charAt(i) - 48] ++;
        }
        for (int i = 0; i < n.length; i++){
            System.out.println(n[i]);
        }

    }
}
