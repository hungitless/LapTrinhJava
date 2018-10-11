/*
 * Ten: Thai Quang Hung
 * Mssv: 17211TT3105
 * Lop: S6
 * Bai: 3
*/
package BaiTap3;

import java.util.Scanner;

public class Point {
	Scanner sc = new Scanner(System.in);
	protected int x;
	protected int y;
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public Point()
	{
		this.x = 0;
		this.y = 0;
	}
	public Point(int nx, int ny)
	{
		this.x = nx;
		this.y = ny;
	}
	public void nhap()
	{
		System.out.print("Nhap x: ");
		x = sc.nextInt();
		System.out.print("Nhap y: ");
		y = sc.nextInt();	
	}
	public void xuat()
	{
		System.out.println("a3 X:" + x);
		System.out.println("a3 Y:" + y);
	}
}
