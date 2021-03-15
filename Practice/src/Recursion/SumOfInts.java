package Recursion;

class SumOfInts {
    SumOfInts(int n){
        int sum = sum(n);
        System.out.println(sum);
    }

    private int sum(int n){
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }
}
