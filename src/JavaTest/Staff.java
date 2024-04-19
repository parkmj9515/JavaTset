package JavaTest;

public class Staff extends User {
	
	private int salary;
	
	public Staff() {
		
	}
	

	
	public Staff (String id,String pw,String name, int salary) {
		super();
		this.salary = salary;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Staff [salary=" + salary + "]";
	}
	
	@Override
	public void showInfo() {
		System.out.println("아이디:" + getId() + " 비번:" + getPw() + " 이름:" +getName() + " 월급:" + salary);
	}
}
