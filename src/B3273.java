import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int[] n = new int[a];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(st.nextToken());
        }
        int x = Integer.parseInt(br.readLine());

        int start = 0, end = n.length - 1, count = 0;
        Arrays.sort(n);

        while(start < end) {
            int sum = n[start] + n[end];

            if(sum == x) count++;
            if (sum < x) {
                start++;
            }else end--;
        }
        System.out.println(count);
    }
}
