import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(str.nextToken());
        int K = Integer.parseInt(str.nextToken());
        int ans = 0;
        //실수 1 : 배열을 선언해서 조건에 맞는 인덱스에 넣어버리는 실수를 했음
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0){
                arr.add(i);
            }
        }
        //실수 2 : 값이 존재하지 않는 인덱스를 가르킬 시 IndexOutOfBoundsException에러가 발생했다
        //해결 : arr의 사이즈를 모르는 상태로 특정 인덱스를 가르쳤을때 그 값이 arrlist의 사이즈보다 컸기때문에 오류가 발생한 것
        // 리스트의 크기가 K의 범위안에 적용되는지를 확인하는 과정이 필요했다.
        if (arr.size() < K || arr.get(K-1) == null) ans = 0;
        else ans = arr.get(K-1);

        System.out.println(ans);
    }
}
