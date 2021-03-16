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

public class Solution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        // brute-force approach
        
        // use/implement a hashmap here
        // iterate through elements of the array
        // feel free to reference the previous problem
        int result = 0;
        
        // adds items to map
        Map<Integer, Integer> map = new HashMap<>();
        for(int value : arr){
            if(!map.containsKey(value)){
                map.put(value, 1);
            } else {
                map.put(value, map.get(value) + 1);
            }
        }
        
        int highestValue = 0;
        
        // gets the highestValue frequency
        for(int number: map.keySet()){
            int key = number;
            int value = map.get(number);
            
            if(value > highestValue){ highestValue = value; }
        }
        
        int highestKey = 5;
        
        for(int number: map.keySet()){
            if(map.get(number) != highestValue) { continue; }
            if(number < highestKey) { highestKey = number; } 
        }
        
        result = highestKey;
        
        // create section that gets map items with highest frequency
        // return key that has highest frequency
        
        return result;
    }