import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        // work on this
        SimpleDateFormat parser = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat display = new SimpleDateFormat("HH:mm:ss");
        try{
            Date date = parser.parse(s);
            return display.format(date);
        } catch (Exception e) {
            // 
        }
        return "";
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
