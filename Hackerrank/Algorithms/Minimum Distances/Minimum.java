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
     * Complete the 'minimumDistances' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int minimumDistances(List<Integer> a) {
    // Write your code here
    // fix edge case w/ 1;
        if(a.size() == 2 && a.get(0) == a.get(1)){
            return 1;
        }
        int minimum = Integer.MAX_VALUE;
        for(int i = 0; i < a.size(); i++){
            for(int j = i + 1; j < a.size() - 1; j++){
                int num1 = a.get(i);
                int num2 = a.get(j);
                if(num1 == num2 && j - i < minimum){
                    minimum = j - i;
                }
            }
        }
        if(minimum == Integer.MAX_VALUE){
            return -1;
        }
        return minimum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
