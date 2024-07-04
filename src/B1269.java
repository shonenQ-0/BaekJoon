import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        boolean[] a = new boolean[100000001];
        int count = 0;

        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());

        str = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[Integer.parseInt(str.nextToken())] = true;
        }

        str = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int x = Integer.parseInt(str.nextToken());
            if (a[x]) a[x] = false;
            else a[x] = true;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i]) count++;
        }
        System.out.println(count);

    }
}
