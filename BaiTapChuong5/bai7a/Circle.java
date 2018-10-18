/*
 * Tên: Thái Quang Hưng
 * MSSV: 17211TT3105
 * Lớp: S6
 * Bài 7a
 */
package bai7a;

import java.util.Scanner;

public class Circle extends Point{
	protected double radius;
	private String a;
	
	public Circle(int xValue, int yValue, double radiusValue)
	{
		super(xValue, yValue);
		this.radius = radiusValue;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	//nhap
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
	public double getDiameter()
	{
		return getRadius() * 2;
	}
	
	public double getCircumference()
	{
		return getDiameter() * Math.PI;
	}
	
	public double getArea()
	{
		return getRadius() * getRadius() * Math.PI;
	}
	public String toString()
	{
		return "Toa do: " + super.toString() + " Ban kinh: " + getCircumference() + " Chu vi: " + getArea();
	}
}
