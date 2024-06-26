import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char s = br.readLine().charAt(0);
        System.out.println(s); // 캐릭터 하나 찍기
        System.out.println((int)s); // 아스키코드 몇번인지 찍으려면 int로 타입캐스티을 해준다.

    }
}
