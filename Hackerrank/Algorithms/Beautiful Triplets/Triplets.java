import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'beautifulTriplets' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static int beautifulTriplets(int d, List<Integer> arr) {
    // Write your code here
        // look through all notes
        // get 3 digit combinations of all numbers here...
        List<List<Integer>> permutations = new ArrayList<>();
        int beautiful = 0;
        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.size(); j++){
                if(j == i){
                    continue;
                }
                for(int k = 0; k < arr.size(); k++){
                    if(j == k){
                        continue;
                    }
                    // get rid of list
                    // calculate beauty immediately
                    List<Integer> permutation = new ArrayList<Integer>();
                    permutation.add(arr.get(i));
                    permutation.add(arr.get(j));
                    permutation.add(arr.get(k));
                    
                    permutations.add(permutation);
                }
            }
        }
        
        for(List<Integer> permutation : permutations){
            System.out.println(permutation);
        }
        
        return beautiful;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int result = Result.beautifulTriplets(d, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
