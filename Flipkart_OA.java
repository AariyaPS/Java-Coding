/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
 
        int[] b = new int[n];
        for (int i = 0; i < n; ++i) {
            b[i] = scanner.nextInt();
        }
        
        
        int i=0,j=0,v=0;
        Map<Integer,Integer> hmap = new HashMap<>();
        
        while(i<n && j<n)
        {
            
            if(!hmap.containsKey(b[j]))
            {
                hmap.put(b[j],j);
                v = Math.max(v,j-i+1);
                j++;
            }
            else
            {
                int id = hmap.get(b[j]);
                while(i<=id){
                    hmap.remove(b[i]);
                    i++;
                }
                i = id + 1;
                hmap.put(b[j], j);
                j++;
            }
        }
        
        System.out.println("Length of longest subarray = "+v);
	}
}