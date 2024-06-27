import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());
        String[] arr = new String[N];


        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        String[] wb = new String[8];
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) wb[i] = "WBWBWBWB";
            else wb[i] = "BWBWBWBW";
        }
        String[] bw = new String[8];
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) bw[i] = "BWBWBWBW";
            else bw[i] = "WBWBWBWB";
        }
        int min = 33;

        for (int i = 0; i < (N - 7); i++) {
            for (int j = 0; j < (M - 7); j++) {
                int wbCount = 0;
                int bwCount = 0;
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        if (wb[k].charAt(l) != arr[k + i].charAt(l + j) ) wbCount++;
                        if (bw[k].charAt(l) != arr[k + i].charAt(l + j)) bwCount++;
                    }
                }
                if (min > wbCount || min > bwCount){
                    min = Math.min(wbCount, bwCount);
                }
            }
        }
        System.out.println(min);


    }
}

