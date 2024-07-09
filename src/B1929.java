import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1929 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());

        int[] arr = new int[m + 1];

        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 2; i < arr.length; i++) {
            if(arr[i] == 0) continue;

            for (int j = i + i; j < arr.length; j += i) {
                arr[j] = 0;
            }
        }

        for (int i = n; i < arr.length; i++) {
            if (arr[i] != 0) sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }
}
