    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class B15894 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            long N = Integer.parseInt(br.readLine());
            // (n * (사각형 한 변의 길이 + 3))  + N
            System.out.println((N)*3 + N);

        }
    }
