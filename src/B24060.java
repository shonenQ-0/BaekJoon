import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B24060 {
    static int[] arr;
    static int[] tmp;
    static int result = -1;
    static int cnt = 0;
    static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(str.nextToken());
        K = Integer.parseInt(str.nextToken());

        arr = new int[N];
        tmp = new int[N];

        str = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str.nextToken());
        }


        mergeSort(arr, 0, arr.length - 1);

        /*
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

         */
        System.out.println(result);



    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;

            mergeSort(arr, l, mid); //  좌측 분할
            mergeSort(arr, mid + 1, r); //우측 분할

            merge(arr, l, mid, r); //병합

        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int t = 0;

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                tmp[t++] = arr[i++];
            }else {
                tmp[t++] = arr[j++];
            }
        }

        while (i <= mid){
            tmp[t++] = arr[i++];
        }

        while(j <= high){
            tmp[t++] = arr[j++];
        }

        i = low;
        t = 0;
        while (i <= high){
            cnt++;

            if (cnt == K){
                result = tmp[t];
                break;
            }

            arr[i++] = tmp[t++];
        }


    }
}

