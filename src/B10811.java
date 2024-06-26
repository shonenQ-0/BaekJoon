import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10811 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        for (int i = 0; i < m; i++) {
            str = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(str.nextToken())-1;
            int r = Integer.parseInt(str.nextToken())-1;

            while(s < r){
                int tmp = arr[s];
                arr[s++] = arr[r];
                arr[r--] = tmp;
            }
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
