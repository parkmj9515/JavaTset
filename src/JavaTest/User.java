package JavaTest;

public class User {
	
	private String id;
	private String pw;
	private String name;
	
	public User() {
		
	}
	
	
	public User(String id,String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	//	Getter / Setter

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	
	
	public void showInfo() {
		System.out.println("아이디:"+id +" 패스워드:" + pw + " 이름:"+name);
		}
		
	}
	
	
	
	


