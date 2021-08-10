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
     * Complete the 'queensAttack' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER r_q
     *  4. INTEGER c_q
     *  5. 2D_INTEGER_ARRAY obstacles
     */

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
    // Write your code hereList
        int squares = 0;
        
        int x = r_q;
        int y = c_q;
        
        // something wrong with the formula, i can feel it
        // yep something's wrong
        // I need a new notebook to do these type of calculations
        // copy formulas from geeksforgeeks
        int north = n - y;
        int south = y - 1;
        int east = n - x;
        int west = x - 1;
        
        int northEast = Math.min(n - x, n - y);
        int northWest = Math.min(x - 1, n - y);
        int southEast = Math.min(x - 1, y - 1);
        int southWest = Math.min(n - x, y - 1 );
        
        for(List<Integer> obstacle : obstacles){
            if(x == obstacle.get(0) && obstacle.get(1) < y){
                south = Math.min(south, y - obstacle.get(y) - 1)             
            }
            if(x == obstacle.get(0) && obstacle.get(1) > y){
                north = Math.min(north, obstacle.get(1) - y - 1)
            }
        }
        
        squares += north;
        squares += south;
        squares += east;
        squares += west;
        
        squares += northEast;
        squares += northWest;
        squares += southEast;
        squares += southWest;
        
        return squares;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int r_q = Integer.parseInt(secondMultipleInput[0]);

        int c_q = Integer.parseInt(secondMultipleInput[1]);

        List<List<Integer>> obstacles = new ArrayList<>();

        IntStream.range(0, k).forEach(i -> {
            try {
                obstacles.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.queensAttack(n, k, r_q, c_q, obstacles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
