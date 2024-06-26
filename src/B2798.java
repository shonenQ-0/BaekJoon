import java.awt.image.Kernel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());
        int[] arr = new int[N];
        int tmp;
        int max = Integer.MIN_VALUE;


        str = new StringTokenizer(br.readLine());
        for (int i = 0; i <arr.length; i++) {
            arr[i] = Integer.parseInt(str.nextToken());
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (i == j || j == k || i == k) continue;
                    tmp = arr[i] + arr[j] + arr[k];
                    if (tmp > max && tmp <= M) max = tmp;
                }
            }
        }
        System.out.println(max);



    }
}
