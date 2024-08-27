/*Check if there are any two Equal numbers in an array at a distance less than or equal to k */

import java.util.*;

public class Hashing_CheckTwoNumAtEqDist {
    public static void main(String args[]) {
        int[] nums = { 1, 1, 3, 1, 2, 3 };
        Map<Integer, Integer> hmap = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        int c=0;

        for (int i = 0; i < nums.length; i++) {
            if (hmap.containsKey(nums[i]) && i - hmap.get(nums[i]) <= k) {
                System.out.println("True");
                c=1;
                break;
            }
            hmap.put(nums[i], i);
        }
        if(c==0)
        System.out.println("False");
    }
}