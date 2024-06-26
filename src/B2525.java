import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.util.StringTokenizer;

public class B2525 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(str.nextToken());
        int b = Integer.parseInt(str.nextToken());
        int c = Integer.parseInt(br.readLine());

        int min = 60 * a + b;
        min += c;

        a = min / 60;
        b = min % 60;

        if(a > 23){
            int w =  a - 24;
            a = w;
        }

        System.out.println(a + " " + b);
    }
}
