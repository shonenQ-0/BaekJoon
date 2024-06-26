import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class B11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> decimal = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());
        int size;


        // 약수를 찾고 소수인지 확인 후 list에 넣기
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) arr.add(j);
                }
                if (arr.size()==2) decimal.add(i);
            }
            arr.clear();
        }

        //N==1 이라고 해놓고 돌리고 있네 병ㅇ신
        while(N != 1){
            size = decimal.size();
            if (N % decimal.get(size-1) == 0){
                arr.add(decimal.get(size - 1));
                N /= decimal.get(size - 1);
            }else {
                decimal.remove(size - 1);
            }
        }

        Collections.reverse(arr);

        for(int i : arr){
            System.out.println(i);
        }



    }
}
