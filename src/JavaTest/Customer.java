package JavaTest;

public class Customer extends User {
	
	private int point;
	
	public Customer() {
		
	}
	
	
	public Customer(String id, String pw,String name,int point) {
		super();
		this.point = point;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Customer [point=" + point + "]";
	}
	
	@Override
	public void showInfo() {
		System.out.println("아이디:" + getId() + " 비번:" + getPw() + " 이름:" + getName()+ " 포인트:" + point);
	}

}
