import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String , String> hs = new HashMap<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            String name = str.nextToken();
            String status = str.nextToken();
            hs.put(name, status);
        }

        ArrayList<String> arr = new ArrayList<>();

        for (Map.Entry<String,String> entry : hs.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            if (value.equals("enter")) arr.add(key);
        }

        Collections.sort(arr,Comparator.reverseOrder());

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }



    }
}
