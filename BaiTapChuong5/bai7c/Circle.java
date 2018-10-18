package bai7c;

import java.util.Scanner;

public class Circle {
	private int x;
	private int y;
	private double radius;
	
	public Circle(int x, int y, double radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap x: ");
		x = sc.nextInt();
		System.out.print("Nhap y: ");
		y = sc.nextInt();
		System.out.print("Nhap radius: ");
		radius = sc.nextDouble();
	}
	
}
