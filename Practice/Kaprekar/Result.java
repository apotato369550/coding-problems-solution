package Kaprekar;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'kaprekarNumbers' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER p
     *  2. INTEGER q
     */

    public static void kaprekarNumbers(int p, int q) {
        // Write your code here
        // this looks pretty easy
        String kaprekar = "";

        for(int i = p; i <= q; i++){
            // figure this out
            // search how to add up the digits of a number in java
            // there is something wrong with this formula?
            // it's the long?
            // test it in a compiler
            String squared = Long.toString(i * i);
            // test this in the compiler??
            int sum = 0;
            int temp = 0;
            // you don't add the sum, you split it evenly with the first int being smaller if the thing is odd, then u add it
            // fix this tmr

            if(squared == ""){
                continue;
            }

            if(squared.length() > 1){
                int mid = squared.length() / 2;
                int left = Integer.parseInt(squared.substring(0, mid));
                int right = Integer.parseInt(squared.substring(mid));
                sum = left + right;
            } else {
                sum = Integer.parseInt(squared);
            }


            if(sum == i){
                kaprekar += i + " ";
            }
        }

        // 2 out of 7 test cases failed. Why?

        if(kaprekar == ""){
            System.out.println("Invalid Range");
        } else {
            System.out.println(kaprekar);
        }
    }

}