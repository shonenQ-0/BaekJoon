import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;

        int N = Integer.parseInt(br.readLine());
        Point[] arr = new Point[N];

        for (int i = 0; i < N; i++) {
            str = new StringTokenizer(br.readLine());
            arr[i] = new Point(Integer.parseInt(str.nextToken()), Integer.parseInt(str.nextToken()));
        }

        Arrays.sort(arr, Comparator.comparingInt((Point ponint) -> ponint.y)
                .thenComparingInt(point -> point.x));

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].x + " " + arr[i].y);

        }

    }
}
