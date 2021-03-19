import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        // use maps, modulo, and division
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < ar.length; i++){
            int sock = ar[i];
            
            if(map.containsKey(sock)){
                map.put(sock, map.get(sock) + 1);
            } else {
                map.put(sock, 1);
            }
        }
        
        int pairs = 0;
        
        for(Map.Entry entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
            pairs += (int) entry.getValue() / 2;
        }
        
        return pairs;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
