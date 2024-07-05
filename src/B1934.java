import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            str = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());
            int max = Math.max(a,b);
            int min = Math.min(a,b);
            int tmp;
            while(max % min != 0){
                tmp = max % min;
                max = min;
                min = tmp;
            }
            System.out.println(a*b/min);
        }
    }
}
