public class FindDivisor {

  public long numberOfDivisors(int n) {
    // TODO please write your code below this comment
    int divisors = 0;
    for(int i = 1; i <= n; i++){
      if(n % i == 0){
        System.out.println(i);
        divisors++;
      }
    }
    return divisors;
  }

}