/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.util.*;

public class Main
{
    private static int p=-1;
    
    public static boolean isSubsequence(String a,String b){
        
        int i=0,j=0,count=0;
        int n=a.length();
        int m=b.length();
        
        while(i<m && j<n)
        {
            if(b.charAt(i)==a.charAt(j))
            {
                if(count==0)
                p=j;
                
                i++;
                j++;
                count++;
            }
            else
            j++;
            
        }
        return(count == m);
    }
    
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter the string A = ");
	String A = sc.nextLine();
	
	System.out.println("Enter the string B = ");
	String B = sc.nextLine();
	
	int ans =-1;
	
	
	
	for(int i=1;i<B.length();i++)
	{
	    for(char ch='a';ch<='z';ch++)
	    {
	        StringBuilder word = new StringBuilder(B);
	        word.setCharAt(i,ch);
	        p=-1;
	        if(isSubsequence(A,word.toString()))
	        {ans=p+1;}
	    }
	}
	
	System.out.println("First index = "+ans);
	}
}