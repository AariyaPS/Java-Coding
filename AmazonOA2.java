/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    int[] arr = {1, 5, 5, 1, 1, 8, 8, 10, 10};
        int minOps = minOperationsToDestroyArray(arr);
        if (minOps == -1) {
            System.out.println("it's not possible to destroy the array.");
        } else {
            System.out.println("Minimum number of operations to destroy the array: " + minOps);
        }
	}
	
	public static int minOperationsToDestroyArray(int[] arr){
	      Map<Integer,Integer> hmap=new HashMap<>();
	      
	      for(int num:arr){
	          hmap.put(num,hmap.getOrDefault(num,0)+1);
	      }
	     
	     int minOperations = 0;
        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            int freq = entry.getValue();
            if (freq == 1) {
                return -1; // According to Tariquddin’s law
            } else {
                // According to Tanmai’s Law
                minOperations += freq / 3 + (freq % 3 != 0 ? 1 : 0);
            }
        }
        return minOperations;
	}
}