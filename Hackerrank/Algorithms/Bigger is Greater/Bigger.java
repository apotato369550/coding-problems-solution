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
    public static List<String> list = new ArrayList<String>();
    
    public static String swap(String string, int i, int j){
        char temp;
        char[] charArray = string.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    
    public static void permutate(String string, int left, int right){
        if(left == right){
            list.add(string);
        } else {
            for(int i = left; i <= right; i++){
                string = swap(string, left, i);
                permutate(string, left + 1, right);
                string = swap(string, left, i);
            }
        }
        
    }

    public static String biggerIsGreater(String w) {
        if(w.length() <= 2){
            StringBuilder reverse = new StringBuilder(w).reverse();
            if(w.compareTo(reverse.toString()) <= 0){
                return reverse.toString();
            } else {
                return "no answer";
            }
        }
        permutate(w, 0, w.length() - 1);
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            String current = list.get(i);
            if(current.compareTo(w) > 0){
                return current;
            }
            // refine this answer;
        }
        // ican't fucking believe i lost my solution.
        // bruh
        // copy geeksforgeeks solution first
        return "no answer";
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
