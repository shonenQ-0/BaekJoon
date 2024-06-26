import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;
        // x,y의 max value를 0으로 두는 실수를 하니 모든값이 음수인 조건에서 max값이 0으로 고정되있는 문제가 발생한다
        // 앞으로 max값을 구하려면 Math.MIN_VALUE를 사용해야겠다.
/*
        int N = Integer.parseInt(br.readLine());
        int[] x = new int[N+1];
        int[] y = new int[N+1];
        int xMax, xMin, yMax, yMin ,tmp;
        xMax = yMax =  0;
        xMin = yMin = 100000;

        for (int i = 0; i < N; i++) {
            str = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(str.nextToken());

            tmp = x[i];
            if (tmp > xMax) xMax = tmp;
            if (tmp < xMin) xMin = tmp;

            y[i] = Integer.parseInt(str.nextToken());

            tmp = y[i];
            if (tmp > yMax) yMax = tmp;
            if (tmp < yMin) yMin = tmp;
        }
        if (N == 1){
            System.out.println(0);
        }
        System.out.println((xMax - xMin) * (yMax - yMin));

 */
        int xMax, xMin, yMax, yMin;
        xMax = yMax = Integer.MIN_VALUE;
        xMin = yMin = Integer.MAX_VALUE;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            str = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(str.nextToken());
            int y = Integer.parseInt(str.nextToken());

            xMax = Math.max(xMax, x);
            xMin = Math.min(xMin,x);
            yMax = Math.max(yMax,y);
            yMin = Math.min(yMin,y);
        }
        System.out.println((xMax - xMin) * (yMax - yMin));
    }
}
