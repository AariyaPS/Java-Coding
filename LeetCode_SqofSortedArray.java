/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


/*  You are given two sorted arrays ; both arrays were of size N ;  you have to find a pair of numbers such that sum of those 
numbers <=x and as close as possible to x*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    int a[] = {-4,-1,0,3,10};
	    int b[] = sortedSquares(a);
	    
	    for(int i=0;i<b.length;i++)
	    System.out.println(b[i]);
	}
	
	public static int[] sortedSquares(int[] nums) {
        
        int l = nums.length-1;
        int ans[] = new int[nums.length];
        int left=0, right=l;


        while(left<=right)
        {
            if(Math.abs(nums[left])>Math.abs(nums[right]))
            {
                ans[l--] = nums[left]*nums[left];
                left++;
            }
            else
            {
                ans[l--] = nums[right]*nums[right];
                right--;
            }
        }

        return ans;
    }

}