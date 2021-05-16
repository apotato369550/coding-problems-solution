import java.util.*;

public class DuplicateEncoder {
  static String encode(String word){
    String encoded = "";
    
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    for(int i = 0; i < word.length(); i++){
      char character = Character.toLowerCase(word.charAt(i));
      if(map.containsKey(character)){
        map.put(character, map.get(character) + 1);
      } else {
        map.put(character, 1);
      }
    }
    
    for(int i = 0; i < word.length(); i++){
      char character = Character.toLowerCase(word.charAt(i));
      if(map.get(character) > 1){
        encoded += ")";
      } else {
        encoded += "(";
      }
    }
    
    
    return encoded;
  }
}