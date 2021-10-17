/**
 * 
 */
package com.practice.example;
import java.util.Scanner;

/**
 * @author Vedhant
 *
 */
public class AddNumber {
public static void main(String[] args) {
	int c, a ,b;
	Scanner obj= new Scanner(System.in);
	System.out.print("Enter value of A= ");
	a=obj.nextInt();
	System.out.print("Enter value of B= ");
	b=obj.nextInt();
	c=a+b;
	System.out.print("Addition of A and B:  "+c);
}
}
