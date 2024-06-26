import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B10807 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());

        int[] n = new int[a];

        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(str.nextToken());
        }

        int c = Integer.parseInt(br.readLine());
        int start = 0;
        int count = 0;
        while (start < n.length){
            if (n[start] == c){
                count++;
                start++;
            }else start++;
        }
        System.out.println(count);
    }
}
