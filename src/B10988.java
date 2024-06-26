import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class B10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length -1;
        int result = 1;

        while(start < end){
            if (arr[start] == arr[end]){
                start ++;
                end --;
                result = 1;
                System.out.println(result);
            }else {
                result = 0;
                System.out.println(result);
                break;
            }
        }

        System.out.println(result);
    }
}
