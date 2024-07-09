import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B17103 {


    static int[] arr;
    static void eratosthenesSieve(){
        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == 0) continue;
            for (int j = i + i; j < arr.length; j+=i) {
                arr[j] = 0;
            }
        }
    }

    /*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    }

     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new int[1000001];
        eratosthenesSieve();
        for (int i = 0; i < N; i++) {
            int m = Integer.parseInt(br.readLine());
            int count = 0;

            for (int j = 2; j <= m / 2; j++) {
             if (arr[j] + arr[m - j] == m) count++;
            }
            System.out.println(count);
        }
    }

}
