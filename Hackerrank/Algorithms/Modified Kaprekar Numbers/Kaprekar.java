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
     * Complete the 'kaprekarNumbers' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER p
     *  2. INTEGER q
     */

    public static void kaprekarNumbers(int p, int q) {
    // Write your code here
        // this looks pretty easy
        String kaprekar = "";
        
        for(int i = p; i <= q; i++){
            // figure this out
            // search how to add up the digits of a number in java
            // there is something wrong with this formula?
            int squared = i * i;
            int sum = 0;
            int temp = 0;
            System.out.println(i + " Squared: " + squared);
            // you don't add the sum, you split it evenly with the first int being smaller if the thing is odd, then u add it
            while(squared > 0){
                temp = squared % 10;
                sum = sum + temp;
                squared = squared / 10;
            }
            
            System.out.println(i + " Sum: " + sum);
            
            if(sum == i){
                kaprekar += i + " ";
            }
        }
        
        if(kaprekar == ""){
            System.out.println("Invalid Range");
        } else {
            System.out.println(kaprekar);
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        Result.kaprekarNumbers(p, q);

        bufferedReader.close();
    }
}
