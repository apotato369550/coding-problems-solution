import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'workbook' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY arr
     */

    public static int workbook(int n, int k, List<Integer> arr) {
        // Write your code here
        // this is harder than i thought
        // separate loop for page and chapters?
        // a single chapter can span multiple pages
        // total pages = sum or all elements in arr / k
        // pages in a chapter = arr[i] / k rounded up
        
        // create the book, then scan through the book
        // there are a lot of excess pages
        
        // you can't create the book fully
        // you must construct the book chapter by chapter
        
        // SUBLISTS!!
        // nope. sublists do not work...
        // i should try an arithmetic solution
        
        // how to get current page: get question number + number of questions previously rounded up / k
        
        // WE MADE THE BOOK!!!!
        int special = 0;
        int previous = 0;
        
        for(int i = 0; i < arr.size(); i++){
            for(int j = 1; j <= arr.get(i); j++){
                int current = (int) Math.ceil((int) Math.ceil((float) j / k) + Math.ceil((float) previous / k));
                if(j == current){
                    special++;
                }
            }
            // THIS WORKS MOTHERFUCKER:DDD
            // now do the scanning
            previous += arr.get(i) >= k ? arr.get(i) : k;
        }
        
        return special;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int result = Result.workbook(n, k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
