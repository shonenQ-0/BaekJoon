import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        System.out.println(fibo(N));

    }

    static int fibo(int n){
        if (n == 0 ){
            return 0;
        } else if (n < 3) {
            return 1;
        }else return fibo(n-1) + fibo(n - 2);
    }
}
