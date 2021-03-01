import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        
        float[] fractionsPercentage = new float[3];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                fractionsPercentage[2]++;
            }
            if(arr[i] > 0){
                fractionsPercentage[0]++; 
            }
            if(arr[i] < 0){
                fractionsPercentage[1]++;
            }
        }

        for(int i = 0; i < fractionsPercentage.length; i++){
            float arrayLength = arr.length;
            System.out.println(fractionsPercentage[i] / arrayLength);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
