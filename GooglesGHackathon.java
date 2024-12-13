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
	    
	    System.out.println("Enter the value of n:");
	    int n = sc.nextInt();
	    
	    System.out.println("Enter the value of q (no. of ranges):");
	    int q = sc.nextInt();
	    
	    System.out.println("Enter the value of n:");
	    int p = sc.nextInt();
	    
	    
	    int a[] = new int[10]00;
	    
	    for(int i=0;i<q;i++){
	        
	        System.out.println("Enter the lower value of range:");
	        int l = sc.nextInt();
	        System.out.println("Enter the higher value of range:");
	        int r= sc.nextInt();
	        
	        a[l]=a[l]+1;
	        
	        if(r+1<n)
	        a[r+1]=a[r]-1;
	    }
	    
	    
	    for(int i=1;i<=n;i++){
	        a[i]=a[i]+a[i-1];
	    }
	    
	    
	    for(int i=0;i<p;i++){
	        System.out.println("Enter the value of lamp to be found:");
	        int y = sc.nextInt();
	        System.out.println("Lamp "+y+" will enlighten, "+a[y]+" times.");
	    }
	}
	
}