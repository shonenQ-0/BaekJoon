import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        int count = 0;

        // HashMap을 사용한 풀이법
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            hashMap.put(br.readLine(), 0);
        }
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (hashMap.containsKey(s)){
                count++;
            }
        }

        /* 시간초과
        for (int i = 0; i < ex.length; i++) {
            ex[i] = br.readLine();
            for (int j = 0; j < tc.length; j++) {
                if (ex[i].contains(tc[j])) count++;
            }
        }
         */
        System.out.println(count);
    }
}
