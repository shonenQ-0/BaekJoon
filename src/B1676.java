import java.io.BufferedReader;
import java.util.Scanner;

public class B1676 {
    static int count = 0;
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long a = f(N);
        int b = 10;
        System.out.println("a = "+ a);

        while(true){


            if(a % b == 0){
                count++;
                System.out.println(count);
                b *= 10;
            }else break;
        }
        System.out.println(count);



    }
    static int f(int n){
        if(n == 1){
            return 1;
        }
        return n * f(n-1);
    }
}
// biginteger 사용해서 풀어보기
