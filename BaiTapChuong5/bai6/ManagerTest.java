/*
 * Tên: Thái Quang Hưng
 * MSSV: 17211TT3105
 * Lớp: S6
 * Bài 6
 */
package bai6;

public class ManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager boss = new Manager("Carl Craker", 8000, 1987, 12, 15);
		boss.setBonus(5000);
		
		Employee[] staff = new Employee[3];
		staff[0] = boss;
		staff[1] = new Employee("Harry Hacker", 5000, 1989, 10, 1);
		staff[2] = new Employee("Tommt Tester", 4000, 1990, 3, 14);
		
		for(int i = 0; i < staff.length; i++)
		{
			Employee e = staff[i];
			System.out.println("Name: " + e.getName() + "Salary: " + e.getSalary());
		}
	}

}
