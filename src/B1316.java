import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class B1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        while(n --> 0){
            String s = br.readLine();
            int[] arr = new int[26];
            count++;

            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(i-1)){
                    arr[s.charAt(i-1)-97] = -1;
                    if (arr[s.charAt(i)-97] == -1){
                        count--;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
