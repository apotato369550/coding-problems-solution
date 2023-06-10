package Fibonacci;

// understand this
class FibonacciRecursive {
    FibonacciRecursive(int terms){
        System.out.println(fib(terms));
    }

    private int fib(int terms){
        if(terms < 0) {
            return 0;
        } else if(terms == 0){
            return 0;
        } else if(terms == 1){
            return 1;
        } else {
            return fib(terms - 1) + fib(terms - 2);
        }
    }
}
