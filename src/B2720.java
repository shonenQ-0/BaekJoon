import javax.imageio.spi.IIORegistry;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i <N; i++) {
            int num = Integer.parseInt(br.readLine());
            sb.append(num / 25).append(" ");
            num = num % 25;
            sb.append(num / 10).append(" ");
            num = num % 10;
            sb.append(num / 5).append(" ");
            num = num % 5;
            sb.append(num).append(" ");

            System.out.println(sb);
            sb.delete(0,sb.length()); // stringbuilder 초기화 시켜야됨
        }

    }
}
