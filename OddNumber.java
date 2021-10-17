/**
 * 
 */
package com.practice.example;
import java.util.Scanner;
/**
 * @author Ahana
 *
 */
public class OddNumber {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter a Number :");
	int a=obj.nextInt();
	if (a%2==0)
	{	System.out.print("    This is even number");
	}
	else
		System.out.print(+a+" is odd number");
	
}
}
