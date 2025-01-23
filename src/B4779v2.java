import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4779v2 {
    static StringBuilder builder;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String t;
        while ((t = br.readLine()) != null) {
            int N = Integer.parseInt(t);
            n = (int) Math.pow(3, N);
            String s = "-".repeat(n);
            builder = new StringBuilder(s);
            sp(0, n);
            System.out.println(builder);
        }
    }

    private static void sp(int start, int end) {
        if (end - start == 1 ) return;
        //왼쪽 가르기
        //왼쪽 시작점, 왼쪽 끝점, 오른쪽 시작점, 오른쪽 끝점이 필요하다.
        //왼쪽 시작점은
        //오른쪽 가르기
        int len = end - start;
        int leftS = start;
        int leftE = leftS + len / 3;
        int rightS = end - len / 3;
        int rightE = end;

        sp(leftS, leftE);
        sp(rightS, rightE);

        for (int i = leftE; i < rightS; i++) { // 9 18
            builder.setCharAt(i, ' ');
        }
    }
}
