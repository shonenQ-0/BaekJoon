import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        /*시간초과
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            zeroCount = 0;
            oneCount = 0;
            fibo(n);
            sb.append(zeroCount).append(" ").append(oneCount).append("\n");
        }

        System.out.println(sb);


    }
    static int zeroCount = 0;
    static int oneCount = 0;

    static int fibo(int n){
        if (n == 0) {
            zeroCount++;
            return 1;
        } else if (n == 1) {
            oneCount++;
            return 1;
        }else {
            return fibo(n-1) + fibo(n - 2);
        }

         */
    }
}
