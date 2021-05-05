import java.util.*;
import java.lang.*;

public class Accumul {
    
    public static String accum(String s) {
      String newString = "";
      for(int i = 0; i < s.length(); i++){
          char currentCharacter = s.charAt(i);
          newString += Character.toUpperCase(currentCharacter);
          for(int j = 0; j < i; j++){
            newString += Character.toLowerCase(currentCharacter);
          }
          if(i < s.length() - 1){
            newString += "-";
          }
      }
      return newString;
    }
}