/**
 * 
 */
package com.practice.example;
import java.util.Scanner;
/**
 * @author Vedhant
 *
 */
public class SwapNum {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a 3 values: ");
		int a1=obj.nextInt();
		int a2=obj.nextInt();
		int a3=obj.nextInt();
		System.out.println("Before swapping :" +a1 +" "+a2+ " "+a3);
		int temp=a1;
		a1=a2;
		a2=a3;
		a3=temp;
		System.out.println("After swapping  :" +a1 +" "+a2+ " "+a3);
	}

}
