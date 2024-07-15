import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       System.out.println(f(Integer.parseInt(br.readLine())));

    }
    public static int f(int n){
        if (n <= 1) return 1;
        return n * f(n - 1);
    }
}
