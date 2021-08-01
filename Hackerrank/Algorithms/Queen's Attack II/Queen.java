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
        List<List<Integer>> velocities = new ArrayList<List<Integer>>();
        velocities.add(Arrays.asList(0, 1));
        velocities.add(Arrays.asList(1, 0));
        velocities.add(Arrays.asList(0, -1));
        velocities.add(Arrays.asList(-1, 0));
        velocities.add(Arrays.asList(1, 1));
        velocities.add(Arrays.asList(-1, -1));
        velocities.add(Arrays.asList(1, -1));
        velocities.add(Arrays.asList(-1, 1));
        
        int squares = 0;
        
        // this sure as hell don't work
        
        for(int i = 0; i < velocities.size(); i++){
            int x = c_q;
            int y = r_q;
            List<Integer> velocity = velocities.get(i);
            int xVelocity = velocity.get(0);
            int yVelocity = velocity.get(1);
            boolean obstacleFound = false;
            
            while((x + xVelocity > n || x + xVelocity < 1) && (y + yVelocity > n || y + yVelocity < 1) && !obstacleFound){
                obstacleFound = false;
                
                x += xVelocity;
                y += yVelocity;
                
                for(List<Integer> list : obstacles){
                    int obstacleX = list.get(0);
                    int obstacleY = list.get(1);
                    
                    if(x == obstacleX && y == obstacleY){
                        obstacleFound = true;
                        break;
                    }
                }
                
                if(!obstacleFound){
                    squares++;
                }
            }
        }
        
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
