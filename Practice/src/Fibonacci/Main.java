package Fibonacci;
import Fibonacci.Fibonacci;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Print n Fibonacci Numbers");
        System.out.println("2 - Print nth Fibonacci Number");

        int input = scanner.nextInt();

        if(input == 1){
            System.out.println("Enter value of n: ");
            int n = scanner.nextInt();

            Fibonacci fib = new Fibonacci(n);
        } else if(input == 2){
            System.out.println("Enter value of n: ");
            int n = scanner.nextInt();

            FibonacciRecursive fib = new FibonacciRecursive(n);
        } else {
            System.out.println("Invalid Input");
        }

        System.out.println("End of program");
    }
}
