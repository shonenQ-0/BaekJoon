import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
/*  시간초과로 틀린 케이스
        int A = Integer.parseInt(str.nextToken());
        int B = Integer.parseInt(str.nextToken());
        int V = Integer.parseInt(str.nextToken());
        int count = 1;
        int hope = 0;

        if (A > V) System.out.println(count);
        else {
            while (hope <= V) {
                if (hope + A >= V) break;
                else {
                    hope += A;
                    hope -= B;
                    count++;
                }

            }
        }
        System.out.println(count);

 */
        int A = Integer.parseInt(str.nextToken());
        int B = Integer.parseInt(str.nextToken());
        int V = Integer.parseInt(str.nextToken());
        int count;

        // v-b 는 달팽이가 마지막날 오르는 거리
        // a-b는 달팽이가 하루에 이동할 수 있는 거리
        //나눠주면 달팽이가 이동한 날이되는데
        //if문 조건은 나머지가 남았을때 때 하루 더 가야된다
        count = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0) count++;

        System.out.println(count);




    }
}
