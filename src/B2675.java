import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;

public class B2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(str.nextToken());
            String s = str.nextToken();
            for (int j = 0; j < s.length(); j++) {
                char p = s.charAt(j);
                String w = String.valueOf(p);
                System.out.print(w.repeat(m));
            }
            System.out.println();
        }

    }
}
