/*
 * Tên: Thái Quang Hưng
 * MSSV: 17211TT3105
 * Lớp: S6
 * Bài 7b
 */
package bai7b;

import bai7a.Point;

public class Circle{
	private double radius;
	private Point p;
	public Circle(int xValue, int yValue, double radiusValue)
	{
		this.radius = radiusValue;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
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
