package BaiTap1;

import java.util.Scanner;

public class Point {
	Scanner sc = new Scanner(System.in);
	//khai bao thuoc tinh private
	private int x = 0;
	private int y = 0;
	
	//khoi tao khong tham so
	public Point()
	{
		x = 0;
		y = 0;
	}
	//khoi tao co 2 tham so int
	public Point(int nX, int nY)
	{
		x = nX;
		y = nY;
	}
	public Point(Point a)
	{
		x = a.x;
		y = a.y;
	}
	//set & get
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
	public int[] getXY()
	{
		int []arr = new int[2];
		arr[0] = x;
		arr[1] = y;
		
		return arr;
	}
	public void getXY(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	// 2 tham so
	public double distance(int x, int y)
	{
		return Math.round(Math.sqrt(Math.pow((this.x - x),2) + Math.pow((this.y - y),2))); 
	}
	//copy
	public double distance(Point a)
	{
		return Math.round(Math.sqrt(Math.pow((this.x - a.x),2) + Math.pow((this.y - a.y),2)));
	}
	//khong tham so
	public double distance()
	{
		return Math.round(Math.sqrt(Math.pow((this.x - this.x),2) + Math.pow((this.y - this.y),2)));
	}
//	public void nhap()
//	{
//		System.out.print("Nhap x: ");
//		x = sc.nextInt();
//		System.out.print("Nhap y: ");
//		y = sc.nextInt();
//	}
}
