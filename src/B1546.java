import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1546 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int max = 0;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            int grade = Integer.parseInt(str.nextToken());
            arr[i] = grade;
            if(grade > max) max = grade;
        }
        for (int i = 0; i < n; i++) {
            int a = arr[i];
            double av = (double) a / max * 100;
            sum = sum + av;
        }
        System.out.println(sum / n);

    }
 }

