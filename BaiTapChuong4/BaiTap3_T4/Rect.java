/*
* Ten: Thai Quang Hung
* Mssv: 17211TT3105
* Lop: S6
* Bai: 3
*/
package BaiTap3;

import java.util.Scanner;

public class Rect{
	Scanner sc = new Scanner(System.in);
	private Point a = new Point();
	private Point b = new Point();
	
	public Rect()
	{
		a.x = 2;
		a.y = 3;
		b.x = 4;
		b.y = 5;
	}
	
	public Rect(Point c, Point d)
	{
		a.x = c.x;
		a.y = c.y;
		b.x = d.x;
		b.y = d.y;
	}
	public void nhap()
	{
		a.nhap();
	}
	public void xuat()
	{
		System.out.println("a = " + a.x + "; " + a.y);
		System.out.println("b = " + b.x + "; " + b.y);
	}
	public void kiemTraDiem(Point c)
	{
		if(c.x >= a.x && c.x <= b.x && c.y >= b.y && c.y <= a.y)
		{
			System.out.println("Nam trong chu nhat!!!");
		}
		else
		{
			System.out.println("Khong nam trong chu nhat!!!");
		}
	}
	public boolean kiemTraGiaoNhau(Point c, Point d)
	{
		if(c.x >= a.x && c.x <= b.x && c.y >= b.y && c.y <= a.y)
		{
			return true;
		}
		else
		if(d.x >= a.x && d.x <= b.x && d.y >= b.y && d.y <= a.y)
		{
				return true;
		}
		else if(c.x >= a.x && c.x <= b.x && d.y >= b.y && d.y <= a.y)
		{
			return true;
		}
		else if(d.x >= b.x && d.x <= b.x && c.y >= b.y && c.y <= a.y)
		{
			return true;
		}
		return false;
	}
}
