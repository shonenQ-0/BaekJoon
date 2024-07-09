import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());

        HashMap<Integer,String> numberKey = new HashMap<>();
        HashMap<String,Integer> StringKey = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String p = br.readLine();
            numberKey.put(i,p);
            StringKey.put(p,i);
        }


        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (49 <= s.charAt(0) && s.charAt(0) <= 57){
                int key = Integer.parseInt(s);
                System.out.println(numberKey.get(key));
            }else System.out.println(StringKey.get(s));
        }
    }
}
