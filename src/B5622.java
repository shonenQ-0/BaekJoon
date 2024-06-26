import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B5622 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int count = 0;
        char c;
        int acs = 0;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            acs = Integer.valueOf(c);
            if (acs < 68) count+= 3; // abc
            else if (acs < 71) count += 4; // def
            else if (acs < 74) count += 5; // ghi
            else if (acs < 77) count += 6; // jkl
            else if (acs < 80) count += 7; // mno
            else if (acs < 84) count += 8; // pqrs
            else if (acs < 87) count += 9;
            else count +=10;
        }
        System.out.println(count);

    }
}

