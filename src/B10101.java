import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a + b + c == 180 && a == b && b == c) {
            System.out.println("Equilateral");
        } else if (a + b + c == 180 && a == b || b == c || a==c) {
            System.out.println("Isosceles");
        }else if (a + b + c == 180){
            System.out.println("Scalene");
        }else System.out.println("Error");

    }
}
