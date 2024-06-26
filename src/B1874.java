import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1874 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int lastNum = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            
            if (num > lastNum) {
                for (int j = lastNum ; j < num ; j++) {
                    
                }
            }
        }

    }

}