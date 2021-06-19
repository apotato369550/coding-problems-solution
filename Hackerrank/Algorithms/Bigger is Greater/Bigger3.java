import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'biggerIsGreater' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING w as parameter.
     */

    public static String biggerIsGreater(String w) {
        if(w.length() == 1){
            return "no answer";
        }
        
        int maxLex1 = 0;
        int maxLex2 = 0;
        // this is a weird thing???
        for(int i = 1; i < w.length(); i++){
            if(w.charAt(i) > w.charAt(i - 1)){
                maxLex1 = (i > maxLex1) ? i : maxLex1;
            }
        }
        
        if(maxLex1 == 0){
            return "no answer";
        }
        
        for(int i = maxLex1; i < w.length(); i++){
            if(w.charAt(i) > w.charAt(maxLex1 - 1)){
                maxLex2 = i;
            }
        }
        // work on this
        
        StringBuilder word = new StringBuilder(w);
        char temp = word.charAt(maxLex1 - 1);
        word.setCharAt(maxLex1 - 1, word.charAt(maxLex2));
        word.setCharAt(maxLex2, temp);
        
        int left = maxLex1;
        int right = word.length() - 1;
        while(left < right){
            temp = word.charAt(left);
            word.setCharAt(left, word.charAt(right));
            word.setCharAt(right, temp);
            left++;
            right--;
        }
        
        return word.toString();
        // make notes
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, T).forEach(TItr -> {
            try {
                String w = bufferedReader.readLine();

                String result = Result.biggerIsGreater(w);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
