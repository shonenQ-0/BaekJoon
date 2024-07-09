import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int result = 0;
        for (int i = 666; i < Integer.MAX_VALUE ; i++) {
            String s = String.valueOf(i);
            if (s.contains("666")){
                count++;
            }
            if (count == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);

    }
}
