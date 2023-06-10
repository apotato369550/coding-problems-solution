package Recursion;

class Factorial {
    Factorial(int n){
        int factorial = this.fact(n);
        System.out.println(factorial);
    }

    private int fact(int n){
        if(n <= 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}
