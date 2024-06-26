import java.io.IOException;
import java.util.Scanner;

public class B2438 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = "*";

        for (int i = 1; i <= N; i++) {
            System.out.println(s.repeat(i));
        }
    }
}
