package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      System.out.println("Hello");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int q = sc.nextInt();
		//System.out.println("q is :"+q);
	int price = 5;
	int totalprice = q * price;
	//System.out.println("Total price "+ totalprice);
	if(totalprice>100) {
System.out.println("Total bill with dis "+totalprice*3);
	}
	else {
		System.out.println("Your Total Bill : "+totalprice);
	}
	}

}
