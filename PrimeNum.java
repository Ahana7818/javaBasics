/**
 * 
 */
package com.practice.example;

import java.util.Scanner;

/**
 * @author Ahana
 * 50 = 1,2,5,10,25
 * 30 = 1,2,3,5,6,10,15
 * 60 = 1,2,3,5,6,10,15,20,30
 */
public class PrimeNum {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a Number :");//50
		int a=obj.nextInt();//50
		for(int i = 2;i<=a;i++){
			if(primeN(i)){
				System.out.print(i+" ");
			}
		}
		
	}
	private static boolean primeN(int num)
	{ 
		boolean isPrime = true;
		int temp=num/2;//25
		
		for (int i=2;i<=temp;i++)//25
		{	
			if (num%i==0){
				isPrime = false;
				
				break;
			}
			
	   }
	
		return isPrime;
	}

}
//15

