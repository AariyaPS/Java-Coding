/*Count all the (i,j) Pairs such that b[i] + b[j] == k (count of such pairs.) [i<j]  */

import java.util.*;
public class Hashing_CountPairsEqK{
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4, 5};
        int k = 6;
        int count=0;
        
        Map<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement = k- arr[i];

            if(hmap.containsKey(complement))
            count += hmap.get(complement);

            hmap.put(arr[i],hmap.getOrDefault(arr[i], 0)+1);
        }
        System.out.println("Total no. of pairs = "+ count);
    }
}