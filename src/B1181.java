import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class B1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            hashSet.add(br.readLine());
        }
        String[] arr = new String[hashSet.size()];
        hashSet.toArray(arr);

        Arrays.sort(arr, Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));

        for (String s : arr) {
            System.out.println(s);
        }

    }
}
