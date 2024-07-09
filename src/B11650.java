import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;
        int N = Integer.parseInt(br.readLine());
        /* Point를 사용한 방법
        Point[] arr = new Point[N];

        for (int i = 0; i < N; i++) {
            str = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(str.nextToken());
            int Y = Integer.parseInt(str.nextToken());

            arr[i] = new Point(X,Y);
        }

        Arrays.sort(arr, Comparator.comparingInt((Point point) -> point.x)
                .thenComparingInt(point -> point.y));

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].x + " " + arr[i].y);
           }

         */

        int[][] arr = new int[N][2];
        for (int i = 0; i < arr.length; i++) {
            str = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(str.nextToken());
            }
        }

        //2차원 배열의 정렬의 경우
        //Comparator는 두개의 값을 비교하는 도구
        //.comparingInt는 숫자를 비교할수 있게 해준다.
        // i = 배열의 행에서 - > (가져오라는 의미) i[0] 첫번째를 가져와서 비교하는 역할
        Arrays.sort(arr, Comparator.comparingInt((int[] i) -> i[0])
                .thenComparingInt(i -> i[1]));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}
