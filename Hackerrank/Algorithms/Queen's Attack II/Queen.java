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
     
    public boolean isObstacle(int x, int y){
        // work on this
        return true;
    }

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
            // inverted??
            // bruh inverted
            int x = r_q;
            int y = c_q;
            List<Integer> velocity = velocities.get(i);
            int xVelocity = velocity.get(0);
            int yVelocity = velocity.get(1);
            boolean obstacleFound = false;
            // System.out.println("Velocity: (" + xVelocity + ", " + yVelocity + ")");
            // System.out.println("Length: " + n);
            // logic x and y are wrong
            // System.out.println("Starting X and Y: (" + x + ", " + y + ")");
            while((x >= 1 && x <= n) && (y >= 1 && y <= n) && !obstacleFound){
                x += xVelocity;
                y += yVelocity;
                
                if((x < 1 || x > n) || (y < 1 || y > n)){
                    break;
                }
                
                for(List<Integer> obstacle : obstacles){
                    if(x == obstacle.get(0) && y == obstacle.get(1)){
                        obstacleFound = true;
                        break;
                    }
                }
                if(obstacleFound){
                    break;
                } else {
                    // System.out.println("(" + x + ", " + y + ")");
                    squares++;
                }
                // sample case 2 shows 12
            }
        }
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
