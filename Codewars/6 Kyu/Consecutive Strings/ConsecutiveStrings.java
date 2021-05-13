class LongestConsec {
    
    public static String longestConsec(String[] strarr, int k) {
        String longest = "";
      // there is something wrong with this conditional here...
        for(int i = 0; i < strarr.length - k + 1; i++){
          String newString = "";
          for(int j = i; j < i + k; j++){
            newString += strarr[j];
          }
          if(newString.length() > longest.length()){
            longest = newString;
          }
        }
      return longest;
    }
}