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

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array = ");
		int n =sc.nextInt();

		int[] a=new int[n+1];
		int[] b=new int[n+1];

		for (int i=0; i<n; i++) {
			System.out.println("Enter the element in the array A = ");
			a[i] =sc.nextInt();
		}

		for (int i=0; i<n; i++) {
			System.out.println("Enter the element in the array B = ");
			b[i] =sc.nextInt();
		}


		System.out.println("Enter the target = ");
		int y =sc.nextInt();

		int sum=0,v=0, fnum=0, lnum=0;

		int i=0,j=n-1;

		while(i<n && j>=0)
		{
				sum = a[i]+b[j];

				if(sum<=y) {

					if(sum>v) {
						fnum=a[i];
						lnum=b[j];
						v=sum;
					}
					i++;
				}
				else
					j--;
		}

		System.out.println("Closest Sum = "+v);
		System.out.println("First Number from array A = "+fnum);
        System.out.println("Another Number from array B = "+lnum);
	}
}