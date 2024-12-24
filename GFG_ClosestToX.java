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
	    int N = 4, M = 4;
        int arr[ ] = {1, 4, 5, 7};
        int brr[ ] = {10, 20, 30, 40}; 
        int X = 32;
        
        ArrayList<Integer> r=new ArrayList<>();
        
        r=printClosest(arr,brr,N,M,X);
        
        System.out.println("x = "+X);
        
        for(int i=0;i<r.size();i++)
        System.out.println(r.get(i));
        
	}
	
	public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        // code here
        
        ArrayList<Integer> ans=new ArrayList<>();
        
        int sum=0; int fnum=0; int snum=0; int v=0; int bv=Integer.MAX_VALUE, gnum=0, lnum=0;
        
        int i=0; int j=m-1; int ls=0; int g8=0;
        
        while(i<n && j>=0)
        {
            
            sum=arr[i]+brr[j];
            
            if(sum<=x)
            {
                
                if(sum>v)
                {
                    v = sum;
                    fnum = arr[i];
                    snum = brr[j];
                    ls=1;
                }
                
                i++;
            }
            else
            {
                
                if(sum<bv)
                {
                    bv = sum;
                    gnum = arr[i];
                    lnum = brr[j];
                    g8 = 1;
                }
                
                j--;
            }
        }
        
        
        if(ls==1)
        {
            
            int dv = Math.abs(x-v);
            
            if(g8==1)
            {
                int dbv = Math.abs(bv-x);
                
                if(dbv<dv)
                {
                    ans.add(gnum);
                    ans.add(lnum);
                }
                
                else 
                {
                    ans.add(fnum);
                    ans.add(snum);
                }
            }
            
            else
            {
                ans.add(fnum);
                ans.add(snum);
            }
        }
        else
        {
            ans.add(gnum);
            ans.add(lnum);
        }
        
        
        return ans;
    }
}