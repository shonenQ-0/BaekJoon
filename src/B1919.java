import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = new String[2];
        input[0] = br.readLine();
        input[1] = br.readLine();

        int[] alphbet = new int[26];
        int[] alpha = new int[26];
        int count = 0;

        for (int i = 0; i < input[0].length(); i++) {
            alphbet[input[0].charAt(i) - 'a']++;
        }

        for (int i = 0; i < input[1].length(); i++) {
            alpha[input[1].charAt(i) - 'a']++;
        }

        for (int i = 0; i < alphbet.length; i++) {
            int pare = alphbet[i] - alpha[i];
            if (pare != 0) count += Math.abs(pare);
        }

        System.out.println(count);

    }
}
