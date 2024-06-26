import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaseConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();


        int N = Integer.parseInt(br.readLine());

        conversion(N,2);
        conversion(N, 36);

    }

    public static void conversion(int numeber, int n) {
        StringBuilder sb = new StringBuilder();
        int current = numeber;

        while(current > 0){
            if(current % n < 10){
                sb.append(current % n);
            }
            else {
                sb.append((char)(current % n - 10 + 'A'));
            }
            current /= n;
        }
        System.out.println(sb.reverse());

    }

    // w진법을 10진수로 돌리기
    public static void TenConversion(String s,int w){
        char[] c = s.toCharArray();
        int ans = 0;

        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'A'){ // A를 10으로 'A' - 'A' + 10
                ans = ans * w + (c[i] - 'A' + 10);
            }else { // 숫자 캐릭터는 0을 빼주면 자기자신의 수를 가진다.
                ans = ans * w + (c[i] - '0');
            }
            
        }


    }



}
