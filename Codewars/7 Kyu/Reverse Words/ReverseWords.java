public class Kata
{
  public static String reverseWords(final String original)
  {
    if(original.trim().length() == 0){
      return original;
    }
    String words[] = original.split(" ");
    String newString = "";
    for(int i = 0; i < words.length; i++){
      StringBuilder reverse = new StringBuilder();
      reverse.append(words[i]);
      reverse.reverse();
      newString += reverse.toString();
      if(i < words.length - 1){
        newString += " ";
      }
    }
    
    return newString;
  }
}