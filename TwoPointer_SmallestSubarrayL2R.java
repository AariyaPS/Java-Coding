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
		
		int[] a= new int[n];
		
		for(int i=0;i<n;i++){
		    System.out.println("Enter the element in array A = ");
		   a[i] =sc.nextInt();
		}
		
		System.out.println("Enter the lower bound = ");
		int l =sc.nextInt();
		
		System.out.println("Enter the upper bound = ");
		int r =sc.nextInt();
		
		Map<Integer,Integer> hmap = new HashMap<>();
		
		int i=0,j=0;
		int u = Integer.MAX_VALUE;
		
		while(i<n && j<n){
		    
		    if(a[j]>=l && a[j]<=r){
		        hmap.put(a[j],hmap.getOrDefault(a[j],0)+1);
		    }
		    
		    
		    if(hmap.size()==r-l+1){
		        
		        int len = j-i+1;
		        u =Math.min(u,len);
		        
		        if(a[i]>=l && a[i]<=r){
		            hmap.put(a[i],hmap.get(a[i])-1);
		            
		            if(hmap.get(a[i])==0)
		            hmap.remove(a[i]);
		        }
		        i++;
		        
		        if(a[j]>=l && a[j]<=r){
		            hmap.put(a[j],hmap.get(a[j])-1); //temporarily removing j
		            
		            if(hmap.get(a[j])==0)
		            hmap.remove(a[j]);
		        }
		    }
		    
		    else
		    j++;
		}
		
		if (u == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(u);
        }
		
	}
}