import java.util.*;

public class MostDigits {
  public static int findLongest(int[] numbers) {
    // convert int to long int
    int longest = 0;
    int index = 0;
    for(int i = 0; i < numbers.length; i++){
      // this formula does not take into account the negative sign of negative integers
      String number = Integer.toString(Math.abs(numbers[i]));
      if(number.length() > longest){
        index = i;
        longest = number.length();
      }
    }
    return numbers[index];
  }
}