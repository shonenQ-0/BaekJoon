import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class B10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N ; i++) {
            short num = Short.parseShort(br.readLine());
            arr[i] = num;
        }

        Arrays.sort(arr);

        for(int i : arr){
            sb.append(i).append("\n");
        }
        System.out.println(sb);

        /* 메모리 초과
        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }

        Arrays.sort(arr);

        for (int i : arr){
            System.out.println(i);
        }

         */

    }
}
