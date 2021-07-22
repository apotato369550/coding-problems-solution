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
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */

    public static String timeInWords(int h, int m) {
    // Write your code here
        // this is interesting
        // ill take it
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("ten");
        list.add("eleven");
        list.add("twelve");
        
        if(m == 0){
            return list.get(h - 1) + " o' clock";
        } 
        if(m == 15){
            return "quarter past " + list.get(h - 1);
        } 
        if(m == 30){
            return "half past" + list.get(h - 1);
        }
        if(m == 45){
            if(h == 12){
                return "quarter to 1"; 
            } else {
                return "quarter to " + (h + 1);
            }
        }
        // forgot to convert numbers to text
        // fix this portion
        if(m > 30){
            if(h == 12){
                return (m - 30) > 1 ? (m - 30) + " minutes to 1" : "1 minute past 1";
            } else {
                return (m - 30) > 1 ? (m - 30) + " minutes to " + (h + 1) : "1 minute past " + (h + 1);
            }
        }
        
        return m > 1 ? m + " minutes past " + h : "1 minute past " + h;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
