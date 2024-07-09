import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int as = Integer.parseInt(str.nextToken());
        int am = Integer.parseInt(str.nextToken());

        str = new StringTokenizer(br.readLine());
        int bs = Integer.parseInt(str.nextToken());
        int bm = Integer.parseInt(str.nextToken());

        int max = Math.max(am, bm);
        int min = Math.min(am, bm);
        int tmp;

        while(max % min != 0){
            tmp = max % min;
            max = min;
            min = tmp;
        }

        int rm = bm * am / min;

        am = rm / am;
        bm = rm / bm;

        as *= am;
        bs *= bm;

        int rs = as + bs;

        while(true) {
            max = Math.max(rs, rm);
            min = Math.min(rs, rm);

            while (max % min != 0) {
                tmp = max % min;
                max = min;
                min = tmp;
            }

            rs /= min;
            rm /= min;

            if (min == 1) break;
        }


        System.out.println(rs + " " + rm);
    }
}
