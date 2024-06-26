import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 2;
        int row = 1;
        // 바둑판 점 개수 구하는 공식을 이용하였다.
        //점이 찍힐 때 행열이 2의 제곱으로 증가하였기 때문이다
        // 2*2 > 4*4 > 8*8 순으로 증가
        for (int i = 0; i < N; i++) {
            row = row * count;
        }

        System.out.println((row + 1) * (row + 1));



    }
}