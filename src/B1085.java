import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(str.nextToken());
            int y = Integer.parseInt(str.nextToken());
            int w = Integer.parseInt(str.nextToken());
            int h = Integer.parseInt(str.nextToken());

            int min = x;

            int a = w - x;
            int b = h - y;

            if (min > y) min = y;
            if (min > a) min = a;
            if (min > b) min = b;

            System.out.println(min);


    }
}
