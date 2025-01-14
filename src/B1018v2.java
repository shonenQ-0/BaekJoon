import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1018v2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());

        int standard = 32;
        int min = Integer.MAX_VALUE;

        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                min = Math.min(min,getCount(board, i, j));
            }
        }
        System.out.println(min);
    }

    private static int getCount(char[][] board, int startX, int startY) {
        int wCount = 0;
        int bCount = 0;

        String[] s = {"WBWBWBWB", "BWBWBWBW"};

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char c = board[startX + i][startY + j];
                if (c != s[i % 2].charAt(j)) wCount++; // 시작이 wb 인것
                if (c != s[(i + 1) % 2].charAt(j)) bCount++; // 시작이 bw 인것
            }
        }
        return Math.min(wCount, bCount); // 두가지 경우의 값을 비교해 작은 값을 리턴
    }
}
