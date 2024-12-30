/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
        int[] b = new int[n];
        int count=0;
        
        for(int i=0;i<n;i++){
            System.out.println("Enter the element in array : ");
            b[i] = sc.nextInt();
        }
        
        
        System.out.println("Enter the lower bound: ");
        int l= sc.nextInt();
        
        System.out.println("Enter the upper bound: ");
        int r =sc.nextInt();
        Arrays.sort(b);
        
        count = numOfSubarray(b,r)-numOfSubarray(b,l-1);
        
        System.out.println("Number of subarrays between "+l+" and "+r+" is = "+count);
	}
	
	public static int numOfSubarray(int[] b, int k)
	{
	    int c=0;
	    
	    for(int i=0,j=b.length-1;i<b.length;i++)
	    {
	        int sum = b[i]+b[j];
	        
	        while(sum>k && i!=j){
	            j--;
	            sum = b[i]+b[j];
	        }
	        
	        if(i==j)
	        break;
	        
	        c += j-i;
	    }
	    
	    return c;
	}
}