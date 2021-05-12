class Persist {
  public static int persistence(long n) {
    long product = n;
    int result = 0;
    // long to string not integer
    while(String.valueOf(product).length() != 1){
      long multiplied = 1;
      long num = product;
      while(num != 0){
        long digit = num % 10;
        multiplied *= digit;
        num /= 10;
      }
      product = multiplied;
      result++;
    }
      
    return result;
  }
}