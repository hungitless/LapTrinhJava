/*
 * Tên: Thái Quang Hưng
 * MSSV: 17211TT3105
 * Lớp: S6
 * Bài 4
 */
package bai4;

public class NhanVien {
	private String maNV;
	private int soSanPham;
	
	
	public NhanVien() {
		super();
	}
	
	public NhanVien(String maNV, int soSanPham) {
		super();
		this.maNV = maNV;
		this.soSanPham = soSanPham;
	}
	
	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public int getSoSanPham() {
		return soSanPham;
	}

	public void setSoSanPham(int soSanPham) {
		if(soSanPham > 0)
		{
			this.soSanPham = soSanPham;
		}
		else
		{
			this.soSanPham = 0;
		}	
	}
	public boolean coVuotChuan()
	{
		if(soSanPham > 500)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public String getTongKet()
	{
		if(coVuotChuan() == true)
		{
			return "Vuot";
		}
		else
		{
			return "";
		}
	}
	public double getLuong()
	{
		if(coVuotChuan() == true)
		{
			return (soSanPham - 500) * 30000 + (500 * 20000);
		}
		else
		{
			return soSanPham * 20000;
		}
	}
	public static void xuatTieuDe()
	{
		System.out.println("Ma Nhan Vien\t\tSo San Pham\t\tLuong\t\tTong Ket");
	}
	public String toString()
	{
		return (maNV + "\t\t" + soSanPham + "\t\t\t" + getLuong() + "\t\t" + getTongKet());
	}
}
