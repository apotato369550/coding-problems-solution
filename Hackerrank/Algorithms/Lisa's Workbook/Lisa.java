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
        
        List<List<Integer>> book = new ArrayList<>();
        int totalPages = 0;
        for(int chapter : arr){
            totalPages += chapter;
        }
        
        int chapter = 0;
        int lastQuestion = 1;
        // polish this
        for(int i = 0; i < totalPages; i++){
            List<Integer> page = new ArrayList<>();
            for(int j = lastQuestion; j <= arr.get(chapter); j++){
                if(j >= k){
                    lastQuestion = j;
                    break;
                }
                page.add(j);
            }
            if(lastQuestion >= arr.get(chapter)){
                chapter++;
            }
            book.add(page);
        }
        
        for(int i = 0; i < book.size(); i++){
            System.out.println("Page number " + (i + 1));
            for(int j = 0; j < book.get(i).size(); j++){
                System.out.println(book.get(i).get(j));
            }
        }
        
        /*
        int special = 0;
        for(int i = 0; i < arr.size(); i++){
            int page = i + 1;
            int problems = arr.get(i);
            if(problems >= page){
                special++;
            }
        }
        System.out.println("Special: " + special);
        return special;
        */
        return 0;
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
