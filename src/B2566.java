import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;
        int[][] a = new int[9][9];

        for (int i = 0; i < 9; i++) {
            str = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                a[i][j] = Integer.parseInt(str.nextToken());
            }
        }
        int max = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <9; j++) {
                if(a[i][j]>max) {
                    max = a[i][j];
                    x = i + 1;
                    y = j + 1;
                }else if (max == 0){ // 최대값이 0인 경우 나머지도 모두 0이므로 0에 대한 코드를 작성했어야 함
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(x + " " + y);
    }
}
