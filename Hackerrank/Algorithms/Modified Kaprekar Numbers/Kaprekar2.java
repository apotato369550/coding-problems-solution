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
     
    private static boolean isKaprekar(int num){
        long squared = (long) num * num;
        String str = String.valueOf(squared);
        String left = str.substring(0, str.length() / 2);
        String right = str.substring(str.length() / 2);
        
        int numberLeft = (left.isEmpty()) ? 0 : Integer.parseInt(left);
        int numberRight = (right.isEmpty()) ? 0 : Integer.parseInt(right);
        
        if(numberLeft + numberRight == num){
            System.out.print(num + " ");
            return true;
        } else {
            return false;
        }
        // work on this
    }

    public static void kaprekarNumbers(int p, int q) {
        boolean kaprekar = false;
        for(int i = p; i <= q; i++){
            if(isKaprekar(i)){
                kaprekar = true;
            }
        }
        if(!kaprekar){
            System.out.print("INVALID RANGE");
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
