import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;

        while (true) {
            str = new StringTokenizer(br.readLine());
            int[] arr = {Integer.parseInt(str.nextToken()), Integer.parseInt(str.nextToken()), Integer.parseInt(str.nextToken())};

            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;
            Arrays.sort(arr);

            if(arr[2] >= arr[0] + arr[1]) {
                System.out.println("Invalid");
            }else if(arr[0] == arr[1] && arr[1] == arr[2]) {
                System.out.println("Equilateral");
            }else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
                System.out.println("Isosceles");
            }else {
                System.out.println("Scalene");
            }

        }
    }
}
