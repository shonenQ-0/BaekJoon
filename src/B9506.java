import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();

        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == -1) break;

            int sum = 0;
            String s = "1";

            for (int i = 1; i <= N; i++) {
                if (N % i == 0) arr.add(i);
            }

            //마지막 약수는 자기자신임으로 포함시키면 안된다 포함시킬경우 2배의 수가 계산됨
            for (int i = 0; i < arr.size() - 1; i++) {
                sum += arr.get(i);
            }

            if (sum == N) { // 완전수의 경우 N = 약수 + 약수 + 약수
                // 위와 마찬가지로 항상 포함되는 1과 자기자신의 숫자는 제외 시켜야 한다.
                for (int i = 1; i < arr.size() - 1; i++) {
                    s += " + " + arr.get(i);
                }
                System.out.println(N + " = " + s);
            } else System.out.println(N + " is NOT perfect.");
            // arrlist를 초기화 시켜줘야한다.
            arr.clear();

        }
    }
}
