import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int[] a = new int[6];
        int tmp;

        int[] b = new int[6];
        b[0] = 1;
        b[1] = 1;
        b[2] = 2;
        b[3] = 2;
        b[4] = 2;
        b[5] = 8;

        for (int i = 0; i < 6; i++) {
            tmp = Integer.parseInt(str.nextToken());
            a[i] = b[i] - tmp;
        }

        for(int i : a){
            System.out.print(i + " ");
        }
    }
}
