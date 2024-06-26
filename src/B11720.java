import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B11720 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - '0';
            sum += num;
        }
        System.out.println(sum);
    }
}
