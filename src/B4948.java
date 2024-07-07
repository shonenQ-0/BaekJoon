import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4948 {

    public static void main(String[] args) throws IOException   {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            if (n == 0) break;

            int[]arr= new int[n * 2 + 1];

            for (int i = 2; i < arr.length; i++) {
                arr[i] = i;
            }

            for (int i = 2; i < arr.length; i++) {
                if (arr[i] == 0) continue;
                for (int j = i+i; j < arr.length; j += i) {
                    arr[j] = 0;
                }
            }

            for (int i = n; i < arr.length; i++) {
                if (n < i & arr[i] != 0) count++;
            }

            System.out.println(count);
        }

    }
}
