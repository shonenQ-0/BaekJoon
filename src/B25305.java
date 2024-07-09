import javax.naming.PartialResultException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class B25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(str.nextToken());
        int K = Integer.parseInt(str.nextToken());

        str = new StringTokenizer(br.readLine());
        Integer[] a = new Integer[N];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(str.nextToken());
        }

        //내림차순 정렬의 경우
        // int,char 같은 primitive type은 사용이 불가하고 wrapper class를 사용해야한다
        Arrays.sort(a,Collections.reverseOrder());

        System.out.println(a[K - 1]);

    }
}
