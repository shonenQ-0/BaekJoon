import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B13909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        /*
        int[] arr = new int[N + 1];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = 0;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
            for (int j = i + i; j < arr.length ; j+=i) {
                if (arr[j] == 1) arr[j] = 0;
                else arr[j] = 1;
            }
        }
        int count = 0;
        for (int c : arr){
            if (arr[c] == 1) count++;
        }
        System.out.println(count);

         */
        int count = 0;
        for (int i = 0; i < (int)Math.sqrt(N); i++) {
            count++;
        }
        System.out.println(count);
        /*

        int count = 0;
        for (int i = 1; i * i <= N ; i++) {
            count++;
        }

         */

    }
 }

