/*
 * Tên: Thái Quang Hưng
 * MSSV: 17211TT3105
 * Lớp: S6
 * Bài 5
 */
package bai5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address dcNha1 = new Address("a","a","a",55);
		Address dcTruong1 = new Address("b","b","b",55);
		Student sv1 = new Student("hung","thai",dcNha1,dcTruong1);
		System.out.println(sv1.toString());
		
		Address dcNha2 = new Address("a","a","a",55);
		Address dcTruong2 = new Address("b","b","b",55);
		Student sv2 = new Student("hung","thai",dcNha2,dcTruong2);
		System.out.println(sv2.toString());
	}

}
