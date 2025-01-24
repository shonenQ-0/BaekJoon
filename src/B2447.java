import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class B2447 {
    static boolean[][] board;
    static int in;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        in = Integer.parseInt(br.readLine());

        board = new boolean[in][in];

        for (int i = 0; i < in; i++) {
            Arrays.fill(board[i], true);
        }

        rec(in);
        for (int i = 0; i < in; i++) {
            for (int j = 0; j < in; j++) {
                bw.write(board[i][j] ? '*' : ' ');
            }
            bw.newLine();
        }
        bw.flush();
    }

    private static void rec(int n) {
        if (n == 1) {
            return;
        }
        int N = n / 3;
        for (int i = 0; i < in; i++) {
            for (int j = 0; j < in; j++) {
                if ((i / N) % 3 == 1 && (j / N) % 3 == 1) {
                    board[i][j] = false;
                }
            }
        }
        rec(N);
    }
}

