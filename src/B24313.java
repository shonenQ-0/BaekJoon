import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(str.nextToken());
        int a0 = Integer.parseInt(str.nextToken());

        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        if (a1*n0 + a0 <= c*n0 && c >= a1) {
            System.out.println("1");
        }else System.out.println("0");
    }
}
