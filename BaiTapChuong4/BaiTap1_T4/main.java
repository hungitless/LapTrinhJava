package BaiTap1;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//khoi tao diem a
		Point p1 = new Point(2,2);//khoi tao diem p1 co 2 tham so int 2 int 2
		Point p2 = new Point();//khoi tao diem p2 khong co tham so
		Point p3 = new Point(1,1); //khoi tao diem p3 co 2 tham so int 1 int 1
		
		//co 2 tham so
		System.out.println("Khoang cach co 2 tham so: " + p1.distance(2, 4)); // ham khoang cach tu p1 den dien khoi tao diem a1 2 tham so int 2 int 4
		//copy
		System.out.println("Khoang cach copy: " + p2.distance(p1)); // ham khoang cach tu p2 den diem a1
		//khong tham so
		System.out.println("Khoang cach copy: " + p3.distance());// ham khoang cach tu p3 den diem mac dinh int 0 int 0
	}
}
