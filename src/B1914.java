import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1914 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        if (N > 20) {
            System.out.println((int) Math.pow(2, N)-1);
        } else {
            hanoi(1, 2, 3, N);
            System.out.println((int)Math.pow(2,N) - 1);
            System.out.println(sb);
        }
    }

    public static StringBuilder sb = new StringBuilder();


    static long count = 0;

    public static void hanoi(int from, int tmp, int to, int n) {
        if (n == 0) {
            return;
        }

        hanoi(from, to, tmp, n - 1);
        sb.append(from).append(" ").append(tmp).append("\n");
        hanoi(tmp, from, to, n - 1);
    }
}