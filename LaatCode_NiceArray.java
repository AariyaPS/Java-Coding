/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println("Enter the no. of elements in an array:");
	    int n=sc.nextInt();
	    
	    int[] a=new int[n];
	    
	    for(int i=0;i<n;i++){
	        System.out.println("Enter a element in an array:");
	        a[i]=sc.nextInt();
	    }
	    
	    System.out.println("Enter the value of k:");
	    int k=sc.nextInt();
	    
	    int currSum=0;
	    int subarray=0;
	    
	    Map<Integer,Integer> hmap=new HashMap<>();
	    
	    hmap.put(currSum,1);
	    
	    for(int num:a){
	        currSum += num%2;
	        
	        if(hmap.containsKey(currSum-k))
	        subarray += hmap.get(currSum-k);
	        
	        hmap.put(currSum,hmap.getOrDefault(currSum,0)+1);
	    }
	    
	    System.out.println(subarray);
	}
}