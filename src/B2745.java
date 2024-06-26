import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
public class B2745 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        String S = str.nextToken();
        int B = Integer.parseInt(str.nextToken());
        int tmp = 1;
        int sum = 0;
// 오른쪽부터 계산을 해야한다
        for(int i = S.length()-1 ; i >= 0; i--){
            char C = S.charAt(i);

            if ('A' <= C && C<= 'Z') {
                sum += (C - 'A' + 10) * tmp;
                System.out.println(sum);
            } else {
                sum += (C - '0') * tmp;
                System.out.println(sum);
            }
            tmp *= B;
        }

        System.out.println(sum);

    }
}

 */
class B2745{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        String s = str.nextToken();
        int n = Integer.parseInt(str.nextToken());

        char[] c = s.toCharArray();
        int ans = 0;

        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'A'){
                ans = ans * n + (c[i] - 'A' + 10);
            }else ans = ans * n + (c[i] - '0');

        }
        System.out.println(ans);
    }
}
