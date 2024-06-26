import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        a.append(str.nextToken());
        b.append(str.nextToken());

        a.reverse();
        b.reverse();

        String as = a.toString();
        String bs = b.toString();

        int A = Integer.parseInt(as);
        int B = Integer.parseInt(bs);
        int big;
        if(A>B) big = A;
        else big = B;

        System.out.println(big);
    }
}
