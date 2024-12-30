/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of n = ");
		int n =sc.nextInt();
		
		int[] A= new int[n];
		
		for(int i=0;i<n;i++){
		    System.out.println("Enter the element in array A = ");
		   A[i] =sc.nextInt();
		}
		
		System.out.println("Enter the value of m = ");
		int m =sc.nextInt();
		
		int[] B= new int[m];
		
		for(int i=0;i<m;i++){
		    System.out.println("Enter the element in array B = ");
		   B[i] =sc.nextInt();
		}
		
		int goodIndex = countGoodIndex(A,n,B,m);
		
		System.out.println("No. of good indexes = "+goodIndex);
	}
	
	public static int countGoodIndex(int[] A,int n, int[] B,int m){
	    
	    int[] prefB = new int[];
	    int[] sufB =new int[];
	    
	    int i=0,j=0;
	    
	    
	    //To populate the prefix array
	    while(i<m && j<n){
	        if(A[j]==B[i]){
	            prefB[i]=j;
	            i++;
	            j++;
	        }
	        else 
	        j++;
	    }
	    
	    i=m-1;
	    j=n-1;
	    
	    
	    //To populate the suffix array
	    while(j>=0 && i>=0){
	        if(A[j]==B[i]){
	            sufB[i]=j;
	            i--;
	            j--;
	        }
	        else
	        j--;
	    }
	    
	    
	    //To count no. of good indexes
	    int good=0;
	    
	    for(int i=0;i<m;i++){
	        
	        int l = (i>0)?prefB[i-1]:-1;
	        int r = (i<m-1)?sufB[i+1]:n;
	        
	        if(l<r){
	            good++;
	        }
	    }
	    
	    return good;
	}
}