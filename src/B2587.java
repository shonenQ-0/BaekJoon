import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class B2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int avg = 0;
        int mid;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int N = Integer.parseInt(br.readLine());
            avg += N;
            arr.add(N);
        }
        Collections.sort(arr);
        mid = arr.get(2);

        System.out.println(avg / 5);
        System.out.println(mid);
    }
}
