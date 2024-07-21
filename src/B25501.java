import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B25501 {

    static int count;
    static String s;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            s = br.readLine();
            count = 0;
            System.out.println(isPalindrome(0, s.length() - 1) + " " + count);

        }
    }
    public static int isPalindrome(int n, int m) {
        count++;
        if (n >= m) {
            return 1;
        }else if(s.charAt(n) != s.charAt(m)) {
            return 0;
        }else {
            return isPalindrome(n + 1, m - 1);
        }

    }
}
