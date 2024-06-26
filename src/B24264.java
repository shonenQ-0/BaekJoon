import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B24264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Integer.parseInt(br.readLine());

        //입력값이 최대 50000이 주어짐으로 int가 아닌 long을 사용하는것이 옳다.
        System.out.println(N*N);
        System.out.println(2);
    }
}
