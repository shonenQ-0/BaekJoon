import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class B20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(str.nextToken());
        int L = Integer.parseInt(str.nextToken());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (s.length() < L) continue;
            map.put(s, map.getOrDefault(s, 0) + 1);// 중복된 경우 카운트 증가, 처음은 1
        }

        List<String> list = new ArrayList<>(map.keySet());

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 빈도수에 따른 내림차순
               if (Integer.compare(map.get(o1), map.get(o2)) != 0){ // 중복횟수가 같지 않으면
                   return Integer.compare(map.get(o2), map.get(o1)); //
               }
               // 문자열 길이에 따른 내림차순
               if (o1.length() != o2.length()) {
                   return o2.length() - o1.length();
               }
               //사전순 정렬
               return o1.compareTo(o2);
            }
        });

        for (String s : list) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);

    }
}
