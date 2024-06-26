import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class B2444 {
    public static void main(String[] args) throws IOException { //2×N-1까지 별이 출력됨
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                    }
                for (int j = 0; j < i * 2 - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }else {
                for (int j = 0; j < i - n; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (n * 2 - 1) - (i-n)*2; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
