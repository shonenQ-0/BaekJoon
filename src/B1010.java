import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.StringTokenizer;

public class B1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            str = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(str.nextToken());
            int m = Integer.parseInt(str.nextToken());

            System.out.println(factorial(m).divide(factorial(n).multiply(factorial(m - n))));
        }

    }
    static BigInteger factorial(int n){
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
