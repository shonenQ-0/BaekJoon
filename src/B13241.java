import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        long a = Long.parseLong(str.nextToken());
        long b = Long.parseLong(str.nextToken());

        long max = Math.max(a,b);
        long min = Math.min(a,b);

        long tmp;
        while(max % min != 0){
            tmp = max % min;
            max = min;
            min = tmp;
        }

        System.out.println(a * b / min);
    }
}
