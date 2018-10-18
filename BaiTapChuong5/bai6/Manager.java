/*
 * Tên: Thái Quang Hưng
 * MSSV: 17211TT3105
 * Lớp: S6
 * Bài 6
 */
package bai6;

public class Manager extends Employee {
	private double bonus;
	
	public Manager(String n, double s, int year, int month, int day) {
		super(n, s, year, month, day);
		// TODO Auto-generated constructor stub
	}
	
	public double getSalary()
	{
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
}
