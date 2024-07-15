import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(str.nextToken());
        int K = Integer.parseInt(str.nextToken());

        System.out.println(factorial(N) / (factorial(K) * factorial(N-K)));

    }
    public static int factorial(int n){
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
