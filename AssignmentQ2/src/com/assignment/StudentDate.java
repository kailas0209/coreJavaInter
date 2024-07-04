package com.assignment;

import java.util.Scanner;

public class StudentDate {
	private int rollno;
	private String name ;
	private int marks;
	
	public StudentDate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDate(int rollno, String name , int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public void initStudentDate(int rollno, String name, int marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	public void printStudentDate() {
		System.out.println("Rollno "+rollno +" - "+name+" - "+marks);
	}
	public void acceptStudentDate() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter Roll No ");
		this.rollno = sc.nextInt();
		
		System.out.println(" Enter Name ");
		this.name = sc.next();
		
		System.out.println(" Enter Marks ");
		this.marks = sc.nextInt();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDate abc = new StudentDate();
		
		abc.printStudentDate();
		abc.acceptStudentDate();
		abc.printStudentDate();
	}

}
