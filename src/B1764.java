import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        ArrayList<String> arr = new ArrayList<>();

        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        int count = 0;

        HashSet<String> name = new HashSet<>();

        for (int i = 0; i < n; i++) {
            name.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (name.contains(s)) {
                count++;
                arr.add(s);
            }
        }

        Collections.sort(arr);

        System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.println(arr.get(i));
        }
    }
}
