import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B4779{

    static char[] c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        String input;
        while((input = br.readLine()) != null) {
            int N = Integer.parseInt(input);
            int len = (int)Math.pow(3, N);
            c = new char[len];
            sb = new StringBuilder();
            Arrays.fill(c, '-');


          cantor(0, c.length);
            for (int i = 0; i < c.length; i++) {
                sb.append(c[i]);
            }
            System.out.println(sb);
        }
   }
   public static void cantor(int start, int length){

       if (length <= 1) {
           return;
       }
       int len = length/3;

       for (int i = start + len; i < start + len*2; i++) {
           c[i] = ' ';
       }

       cantor(start, len);
       cantor(start + len * 2, len);
   }
}