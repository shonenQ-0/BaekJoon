import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11022 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t =Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());
            int sum = a + b;
            System.out.println("Case #" + i + ": "+ a + " + " + b + " = " + sum);
        }
    }
}
