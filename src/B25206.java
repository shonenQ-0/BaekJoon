import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B25206 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;
        double sum = 0;
        double num = 0;
        double tmp = 0;
        double all = 0;
        String grade;

        for (int i = 0; i < 20; i++) {
            str = new StringTokenizer(br.readLine());
            str.nextToken();

            num = Double.parseDouble(str.nextToken());
            if(num == 1.0){
                tmp = 1.0;
            } else if (num == 2.0) {
                tmp = 2.0;
            } else if (num == 3.0) {
                tmp = 3.0;
            } else if (num == 4.0) {
                tmp = 4.0;
            }
            all += tmp;

            grade = str.nextToken();
            switch (grade){
                case "A+" :
                sum += 4.5 * tmp;
                break;

                case "A0" :
                sum += 4.0 * tmp;
                break;

                case "B+" :
                sum += 3.5 * tmp;
                break;

                case "B0" :
                sum += 3.0 * tmp;
                break;

                case "C+" :
                sum += 2.5 * tmp;
                break;

                case "C0"  :
                sum += 2.0 * tmp;
                break;

                case "D+" :
                sum += 1.5 * tmp;
                break;

                case "D0" :
                sum += tmp;
                break;

                case "F" :
                sum += 0;
                break;

                case "P" :
                    all -= tmp;
                    break;
            }
        }

        double total = sum/ all;
        System.out.println(total);
    }
}
