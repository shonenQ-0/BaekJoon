import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.StringTokenizer;

public class B11328 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] inputs = br.readLine().split(" ");
            String p = inputs[0];
            String q = inputs[1];

            int[] alph = new int[26];
            boolean ispossible = true;

            for (int j = 0; j < p.length(); j++) {
                alph[p.charAt(j) - 'a']++;
            }
            for (int j = 0; j < q.length(); j++) {
                alph[q.charAt(j) - 'a']--;
            }

            for (int j = 0; j < alph.length; j++) {
                if (alph[j] != 0) {
                    ispossible = false;
                }
            }

            if (ispossible) {
                System.out.println("Possible");
            }else System.out.println("Impossible");


        }

    }
}
