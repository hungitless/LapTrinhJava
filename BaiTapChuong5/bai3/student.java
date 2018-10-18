/*
 * Tên: Thái Quang Hưng
 * MSSV: 17211TT3105
 * Lớp: S6
 * Bài 3
 */
package bai3;

public class student {
	private String ten;
	private double toan;
	private double ly;
	private double hoa;
	
	public student() {
		super();
	}
	public student(String ten, double toan, double ly, double hoa) {
		super();
		this.ten = ten;
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getToan() {
		return toan;
	}
	public void setToan(double toan) {
		this.toan = toan;
	}
	public double getLy() {
		return ly;
	}
	public void setLy(double ly) {
		this.ly = ly;
	}
	public double getHoa() {
		return hoa;
	}
	public void setHoa(double hoa) {
		this.hoa = hoa;
	}
	public double tb()
	{
		return (toan + ly + hoa) / 3;
	}
	public String toString()
	{
		return "Info: " + ten + "Diem trung binh: " + tb();
	}

}
