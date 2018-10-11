/*
* Ten: Thai Quang Hung
* Mssv: 17211TT3105
* Lop: S6
* Bai: 3
*/
package BaiTap3;

public class main {
	public static void main(String[] args){
		//Khoi tao diem tren trai
		Point a1 = new Point(2, 5);
	
		//Khoi tao diem duoi phai
		Point a2 = new Point(6, 1);

		//Khoi tao hinh chu nhat co 2 diem
		Rect r = new Rect(a1, a2);
		Point a3 = new Point(2, 8);
		Point a4 = new Point(2, 7);
		Point a5 = new Point(5, 5);
		
		
		r.kiemTraDiem(a3);//kiem tra diem co trong hinh chu nhat khong
		
		//Kiem tra hinh chu nhat (a4, a5) co giao voi hinh chu nhat r khong
		if(r.kiemTraGiaoNhau(a4, a5) == true)
		{
			System.out.println("Co");
		}
		else
		{
			System.out.println("Khong");
		}
	}
}
