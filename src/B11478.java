import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class B11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        
        HashSet<String> hs = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; i + j <= s.length() ; j++) {
                hs.add(s.substring(i, j + i));
            }
        }
        System.out.println(hs.size());
    }
}


/*
        while(len != 0){
            tmp = "";
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < s.length(); j++) {
                    tmp += s.charAt(j);
                    if (tmp.length() == len) {
                        System.out.println(tmp);
                        hs.add(tmp);
                        tmp = "";
                        
                    }
                }
            }
            len--;
        }


 */
 