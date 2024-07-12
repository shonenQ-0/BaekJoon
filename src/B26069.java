import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;
        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        String s = "ChongChong";

        set.add(s);

        for (int i = 0; i < N; i++) {
            str = new StringTokenizer(br.readLine());
            String a = str.nextToken();
            String b = str.nextToken();

            if(set.contains(a) || set.contains(b)){
                set.add(a);
                set.add(b);
            }
        }
        System.out.println(set.size());
    }
}
