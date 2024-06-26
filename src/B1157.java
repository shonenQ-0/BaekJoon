import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int max = 0;
        char ch = '?';

        int[] arr = new int[26]; // 알파벳 26개

        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z'){
                arr[s.charAt(i) - 97]++;
            }else {
                arr[s.charAt(i) - 65]++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if(arr[i] > max) {
                max = arr[i];
                ch = (char)(i + 65);
            }
            else if (arr[i] == max){
                ch = '?';
            }

        }
        System.out.println(ch);


    }
}