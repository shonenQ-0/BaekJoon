import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11021 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t =Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());

            int sum = Integer.parseInt(str.nextToken()) + Integer.parseInt(str.nextToken());
            System.out.println("Case #" + i + ": " +  + sum);
        }
    }
}
