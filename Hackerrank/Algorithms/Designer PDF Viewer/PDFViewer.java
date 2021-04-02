import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int i = 0; i < h.length; i++){
            map.put(alphabet.charAt(i), h[i]);
        }
        
        int maxHeight = 0;
        for(int i = 0; i < word.length(); i++){
            int height = map.get(word.charAt(i));
            if(height > maxHeight){
                maxHeight = height;
            }
        }
        
        
        return maxHeight * word.length();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

