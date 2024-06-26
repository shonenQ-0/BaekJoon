import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str= new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(str.nextToken());
        int n = Integer.parseInt(str.nextToken());

        while(num > 0){
            if (num % n < 10 ) sb.append(num % n);
            else sb.append((char)(num % n - 10 + 'A')); //형 변환을 해줘야 한다.
      // ex) num & 3 == 13 이다 13 - 10 + 'A' == 'D'
            num /= n;
        }
        System.out.println(sb.reverse()); // 리버스 필수임
    }
}
