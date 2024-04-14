package com.java.leetcode;

import java.io.*;
import java.util.*;



class Result {

    /*
     * Complete the 'getMinOperations' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY data as parameter.
     */

    public static int getCount(List<Integer> data, int count, int i, int j){
        if(i>=j){
            return count;
        }
        int k=i+1; 
        int l= j-1;
        if(data.get(i)!= data.get(j)){
            count ++;
            List<Integer> dataA = new ArrayList<>();
                 for(Integer element: data)
                     dataA.add(element); 
            List<Integer> dataB = new ArrayList<>();
                 for(Integer element: data)
                     dataB.add(element);  
             Collections.replaceAll(dataB, data.get(i), data.get(j));
             Collections.replaceAll(dataA, data.get(j), data.get(i));
            return Math.min(getCount(dataB, count, k, l),(getCount(dataA,count, k, l)));
        }
        return getCount(data,count,k,l);
    }

    public static int getMinOperations(List<Integer> data) {
    // Write your code here/
    
    return getCount(data,0,0,data.size()-1);
    
    
    
    }
    
   

}
public class MinOpForPalindrome {
    public static void main(String[] args) throws IOException {
       
        List<Integer> data = Arrays.asList(1,2,3,7,1,5);
        int result = Result.getMinOperations(data);
        System.out.println(result);
    }
}
