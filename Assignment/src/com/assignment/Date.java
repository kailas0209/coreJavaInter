package com.assignment;

import java.util.Scanner;

public class Date {

		private int dd;
		private int mm;
		private int yy;
		
		
	
	public Date() {
			super();
			// TODO Auto-generated constructor stub
		}



	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}


  public void initDate(int day, int month, int year) {
	  this.dd = day;
	  this.mm = month;
	  this.yy = year;
	   
	  
  }
   public void printDate() {
	   System.out.println("Date "+ dd + " / " +mm+ " / "+yy);
	   
	   
   }
   
   public void acceptDate() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a Date ");
		this.dd = sc.nextInt();
		
		System.out.println(" Enter a Month ");
		this.mm = sc.nextInt();
		
		System.out.println(" Enter a Year ");
		this.yy = sc.nextInt();
		
		
	}
 
	public static void main(String[] args) {
		Date abc = new Date();
		abc.initDate(2, 9, 1999);
		abc.printDate();
		abc.acceptDate();
		abc.printDate();
	}
	
	

}
