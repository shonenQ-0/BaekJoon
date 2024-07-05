import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] check = new int[N];
        int[] num = new int[N];
        int tmp = 0;
        int start = 0;
        int end = 0;
        int count = 0;

        for (int i = 0; i < N; i++) {
            int m = Integer.parseInt(br.readLine());
            if (i == 0) start = m;
            if (i == N -1) end = m;
            num[i] = m;
            tmp = m - tmp;
            check[i] = tmp;
            tmp = m;
        }
        int dirtn = check[1];

        for (int i = 2; i < check.length; i++) {
            dirtn = rhd(dirtn, check[i]);
        }

        for (int i = start; i <= end; i += dirtn) {
           count++;
        }

        System.out.println(count - N);
    }

    public static int rhd(int n, int m){
        int max = Math.max(n, m);
        int min = Math.min(n, m);

        while(max % min != 0){
            int tmp = max % min;
            max = min;
            min = tmp;
        }
        return min;
    }
}
