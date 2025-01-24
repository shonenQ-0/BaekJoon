import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B11729 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        bw.write((int) Math.pow(2, n) - 1 + "\n");
        hanoi(1, 2, 3, n);
        bw.flush();
    }

    private static void hanoi(int from, int tmp, int to, int n) throws IOException {
        if (n == 0) {
            return;
        }
        hanoi(from, to, tmp, n - 1);
        bw.write(from + " " + to + "\n");
        hanoi(tmp, from, to, n - 1);
    }
}