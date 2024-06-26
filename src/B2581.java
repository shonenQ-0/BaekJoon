import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int min = 100000;
        int sum = 0;

        for (int i = N; i <= M ; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) arr.add(i);
            }
            if (arr.size() == 2){
                sum += i;
                if (i < min) min = i;
            }
            arr.clear();
        }
        if (sum > 0){
            System.out.println(sum);
            System.out.println(min);
        }else System.out.println(-1);

    }
}
