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
	    
	    System.out.println("Enter the string s:");
	    String s=sc.next();
	    
	    System.out.println("Enter the string t:");
	    String t=sc.next();
	    
	    Map<Character,Integer> mp1=new HashMap<>();
	    Map<Character,Integer> mp2=new HashMap<>();
	    
	    
	    for(int i=0;i<s.length();i++){
	        mp1.put(s.charAt(i),mp1.getOrDefault(s.charAt(i),0)+1);
	    }
	    
	    for(int i=0;i<t.length();i++){
	        mp2.put(t.charAt(i),mp2.getOrDefault(t.charAt(i),0)+1);
	    }
	    
	    int cnt=Integer.MAX_VALUE;
	    
	    for(int i=0;i<t.length();i++){
	        char a=t.charAt(i);
	        
	        if(!mp1.containsKey(a)){
	            System.out.println(0);
	            return;
	        }
	        
	        int val = mp1.get(a)/mp2.get(a);
	        cnt = Math.min(cnt,val);
	    }
	  
	  System.out.println(cnt);
	}
}