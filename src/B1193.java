import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int i = 1; // 시작은 1/1 1칸밖에 없다.
        int sum = 0;

        while(true){
            if (N <= i + sum) {

                if (i % 2 == 1) { // 나머지가 1이면 우상단
                    System.out.println((i - (N - sum - 1) + "/" + (N - sum)));
                    break;
                } else {
                    System.out.println((i - sum) + "/" + (i - (N - sum - 1)));
                    break;
                }
            }else {
                sum += i;
                i++;
            }

        }

    }
}
