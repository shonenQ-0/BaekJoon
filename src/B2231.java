import java.io.*;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class B2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 1; i <= N; i++) {
            int num = i; // num에 i값을 넣어 초기화하지않아서 무한루프에 도는 문제가 있었다.
            int tmp = 0;

            while(num != 0){
                tmp += num % 10;
                num /= 10;
            }
            if (tmp + i == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}