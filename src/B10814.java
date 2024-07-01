import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer str;
        Object[][] arr = new Object[N][2];

        for (int i = 0; i < N; i++) {
            str = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0) arr[i][j] = Integer.parseInt(str.nextToken());
                else arr[i][j] = str.nextToken();
            }
        }
       // 컴파일 에러
       // Arrays.sort(arr, Comparator.comparing((String[] s) -> s[0].length()).thenComparing(s -> s[0].charAt(1)));

        //  오브젝트[][] 배열을 사용할때 람다 표현식 (o -> (int) o[0])은 각 행의 첫 번째 열을 정수로 캐스팅하여 비교 기준으로 사용해야한다.
        Arrays.sort(arr, Comparator.comparing(o -> (int)o[0]));

        for (Object[] s : arr){
            for (Object i : s){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
