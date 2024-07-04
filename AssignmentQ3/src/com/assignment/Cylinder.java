package com.assignment;

import java.util.Scanner;

public class Cylinder {
	private double radius;
	private double height;
	private double volume;
	public Cylinder() {
		
		
	}
	
	public Cylinder(double radius, double height) {
		
	}
	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public void getvolume() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter radius");
		this.radius = sc.nextInt();
		
		System.out.println("Enter height");
		this.height = sc.nextInt();
		
	}
	
	public void printvolume() {
		volume = 3.14 * radius * radius * height;
		System.out.println(" Volume of Cylinder"+volume);
		
	}

	public static void main(String[] args) {
		
		Cylinder xyz = new Cylinder();
//	 xyz.getRadius();
//	 xyz.setRadius(2);
//	 xyz.getHeight();
//	 xyz.setHeight(4);
//	 xyz.printvolume();
		Cylinder xyz1 = new Cylinder();
		xyz1.getvolume();
		xyz1.printvolume();

	}

}
