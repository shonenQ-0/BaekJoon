import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;
        ArrayList<Integer> arr = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());
        str = new StringTokenizer(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(str.nextToken());
            for (int j = 1; j <= num; j++) {
                if(num % j ==0){
                    arr.add(j);
                }
            }
           if (arr.size() == 2) count++;
           arr.clear();

        }
        System.out.println(count);

    }
}
