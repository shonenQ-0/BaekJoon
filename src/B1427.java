import javax.naming.PartialResultException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class B1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        Character[] c = new Character[s.length()];
        for (int i = 0; i < s.length(); i++){
            c[i] = s.charAt(i);
        }

        Arrays.sort(c, Collections.reverseOrder());

        for (char i : c){
            System.out.print(i);
        }
    }
}
