import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class exex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        ArrayList<String> word = new ArrayList<String>();

        for (int i = 0; i < num; i++) {
            word.add(br.readLine());
        }
        for (int i = 0; i < num; i++) {
            for (int j = i; j < num; j++) {
                if (word.get(i).length() > word.get(j).length()) {
                    word.add(i, word.get(j));
                    word.remove(j+1);
                }
                if (word.get(i).length() == word.get(j).length() && word.get(i).compareTo(word.get(j)) > 0) {
                    word.add(i, word.get(j));
                    word.remove(j+1);
                }
            }
        }

        for (int i = 1; i < word.size(); i++) {
            if (word.get(i).compareTo(word.get(i-1)) == 0){
                word.remove(i);
            }
        }

        for (int i = 0; i < word.size(); i++) {
            System.out.println(word.get(i));
        }
    }
}