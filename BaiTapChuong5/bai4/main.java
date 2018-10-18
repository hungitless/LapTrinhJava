/*
 * Tên: Thái Quang Hưng
 * MSSV: 17211TT3105
 * Lớp: S6
 * Bài 3
 */
package bai4;

public class main {
	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien("thai quang hung", 510);
		NhanVien nv2 = new NhanVien("thai phuong", 400);
		
		nv1.xuatTieuDe();
		System.out.println(nv1.toString());
		System.out.println(nv2.toString());
		}
}
