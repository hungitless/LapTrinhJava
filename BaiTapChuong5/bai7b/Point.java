/*
 * Tên: Thái Quang Hưng
 * MSSV: 17211TT3105
 * Lớp: S6
 * Bài 7b
 */
package bai7b;

public class Point {
	protected int x;
	protected int y;
	
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
	public Point()
	{
		x = 0;	
		y = 0;
	}
	public Point(int x, int y){
		super();
		this.x = x;
		this.y = y;
	}
	public String toString()
	{
		return "X: " + x + " Y: " + y; 
	}
}