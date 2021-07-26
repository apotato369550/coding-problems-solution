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
     // repeated modifier?

    public static String timeInWords(int h, int m) {
        List<String> nums = new ArrayList<>();
        
        nums.add("one");
        nums.add("two");
        nums.add("three");
        nums.add("four");
        nums.add("five");
        nums.add("six");
        nums.add("seven");
        nums.add("eight");
        nums.add("nine");
        nums.add("ten");
        nums.add("eleven");
        nums.add("twelve");
        nums.add("thirteen");
        nums.add("fourteen");
        nums.add("fifteen");
        nums.add("sixteen");
        nums.add("seventeen");
        nums.add("eighteen");
        nums.add("nineteen");
        
        List<String> tens = new ArrayList<>();
        
        tens.add("twenty");
        tens.add("thirty");
        tens.add("forty");
        tens.add("fifty");
        
        // try fixing this
        
        if(m == 0){
            return nums.get(h - 1) + " o' clock";
        } 
        if(m == 15){
            return "quarter past " + nums.get(h - 1);
        } 
        if(m == 30){
            return "half past" + nums.get(h - 1);
        }
        if(m == 45){
            if(h == 12){
                return "quarter to one"; 
            } else {
                return "quarter to " + (h + 1);
            }
        }
        
        String converted = "";
        int tensDigit = 0;
        int onesDigit = 0;
        System.out.println("Tens: " + tensDigit);
        System.out.println("Ones: " + onesDigit);
        // fix this
        if(m > 30){
            tensDigit = (int) Math.floor((double) (30 - (m - 30)) / 10);
            onesDigit = (30 - (m - 30)) % 10;
            
            if(tensDigit > 1){
                converted = tens.get(tensDigit - 2) + " " + nums.get(onesDigit - 1);
            } else {
                converted = nums.get((30 - (m - 30)) - 1);
            }
            
            System.out.println(converted);
            
            if(h == 12){
                return (m - 30) > 1 ? converted + " minutes to one" : "one minute past one";
            } else {
                return (m - 30) > 1 ? converted + " minutes to " + nums.get(h) : "one minute past " + nums.get(h - 1);
            }
        }
        
        tensDigit = (int) Math.floor((double) m / 10);
        onesDigit = m % 10;
        
        if(tensDigit > 0){
            converted = tens.get(tensDigit - 2) + " " + nums.get(onesDigit - 1);
        } else {
            converted = nums.get(m - 1);
        }
            
        System.out.println(converted);
        
        return m > 1 ? converted + " minutes past " + nums.get(h) : "one minute past " + nums.get(h);
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
