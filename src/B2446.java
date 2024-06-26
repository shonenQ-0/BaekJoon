import java.io.IOException;
import java.util.Scanner;

public class B2446 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                sb.append(" ");
            }
            for (int k = 0; k < (2 * n - 1) - (2 * i); k++) {
                sb.append('*');
            }
            sb.append('\n');
        }
        for (int i = 0; i < n - 1; i++) {

            for (int j = 1; j < (n - 1) - i; j++) {
                sb.append(' ');
            }
            for (int k = 0; k < 3 + 2 * i; k++) {
                sb.append('*');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}


