public class Kata {

  public static String high(String s) {
    String alphabet = " abcdefghijklmnopqrstuvwxyz";
    String bestWord = "";
    int highestScore = 0;
    
    String words[] = s.split(" ");
    for(int i = 0; i < words.length; i++){
      int currentScore = 0;
      for(int j = 0; j < words[i].length(); j++){
        for(int n = 0; n < alphabet.length(); n++){
          if(Character.toLowerCase(words[i].charAt(j)) == alphabet.charAt(n)){
            currentScore += n;
            break;
          }
        }
      }
      if(currentScore > highestScore){
        highestScore = currentScore;
        bestWord = words[i];
      }
    }
    return bestWord;
  }

}