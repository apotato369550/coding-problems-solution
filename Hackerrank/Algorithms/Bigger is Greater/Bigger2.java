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
    // traverse through the string in reverse order
    // if w[i] < w[i + 1] then split w into two substrings
    // take the substring on the right and find the smallest character lexicographically
    // swap that character with w[i]
    // sort the second substring lexicographically increasing
        if(w.length() <= 2){
            StringBuilder reverse = new StringBuilder(w).reverse();
            if(w.compareTo(reverse.toString()) < 0){
                return reverse.toString();
            } else {
                return "no answer";
            }
        }
        
        int split = 0;
        
        for(int i = w.length() - 2; i > 0; i--){
            char current = w.charAt(i);
            char previous = w.charAt(i + 1);
            if(current.compareTo(previous) < 0){
                split = i;
                break;
            }
        }
        
        String left = w.substring(0, i + 1);
        String right = w.substring(i);
        
        // continue work here
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
