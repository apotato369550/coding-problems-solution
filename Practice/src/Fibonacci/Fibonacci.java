package Fibonacci;

class Fibonacci {
    Fibonacci(int terms) {
        int num1 = 1;
        int num2 = 0;
        int fib = 0;

        for (int i = 0; i < terms; i++) {
            System.out.println(fib);

            num2 = num1;
            num1 = fib;
            fib = num1 + num2;
        }
    }
}
