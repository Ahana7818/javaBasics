package com.practice.example;

public class PolyParent {
	
	void Sound()
	{
		System.out.println("parent sound function");
	}
	//void Order()
	//{
		//System.out.println("parent order function");
	//}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PolyParent polyObject  ;
		System.out.println("parent obj value");
		polyObject = new Polychild();
		polyObject.Sound();
		polyObject.Sound();
		polyObject.toString();
		//polyObject.Order();
		polyObject = new Polychild2();
		polyObject.Sound();
		//polyObject.Order();
		Polychild childObject = new Polychild2();
		childObject.order2();
		

	}

}
