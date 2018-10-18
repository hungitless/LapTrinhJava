/*
 * Tên: Thái Quang Hưng
 * MSSV: 17211TT3105
 * Lớp: S6
 * Bài 5
 */
package bai5;

public class Student {
	private String fisrtName;
	private String lastName;
	private Address homeAddress;
	private Address schoolAddress;
	
	public String getFisrtName() {
		return fisrtName;
	}

	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}


	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(Address schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public Student(String fisrtName, String lastName, Address homeAddress, Address schoolAddress) {
		super();
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.homeAddress = homeAddress;
		this.schoolAddress = schoolAddress;
	}
	
	public String toString()
	{
		return "Ten: " + lastName + " " + fisrtName + " " + homeAddress + schoolAddress;
	}
	
}
