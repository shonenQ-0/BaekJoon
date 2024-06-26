
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class B10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] n = new int[26];
        for (int i = 0; i < s.length(); i++) {
            n[s.charAt(i) - 97] ++;
        }
        for (int i = 0; i < n.length; i++){
            System.out.print(n[i] + " ");
        }
    }
}

