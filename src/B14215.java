import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int[] arr = {Integer.parseInt(str.nextToken()),Integer.parseInt(str.nextToken()),Integer.parseInt(str.nextToken())};
        int x = 0;
        Arrays.sort(arr);

        if (arr[2] >= arr[1] + arr[0]) {
            while (arr[2] >= arr[1] + arr[0]) {
                arr[2]--;
                x = arr[2] + arr[1] + arr[0];
            }
            System.out.println(x);
        }else if (arr[2] < arr[1] + arr[0]){
            System.out.println(arr[2] + arr[1] + arr[0]);
        }else if (arr[0] == arr[1] && arr[0] == arr[2]){ //정삼
            System.out.println(arr[0] * 3);
        }else if (arr[0] == arr[1] || arr[1] == arr[2]){ //이등변
            if (arr[0] == arr[1]){
                System.out.println(arr[0] * 2 + arr[2]);
            }else System.out.println(arr[1] * 2 + arr[2]);
        }




    }
}
