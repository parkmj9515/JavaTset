package OracleTest;

public class PhoneBookVO {
	
	private Long id;
	private String name;
	private String ph;
	private String tel;

	
	public PhoneBookVO() {
		
	}
	
	public PhoneBookVO(Long id,String name, String ph, String tel) {
		super();
		this.id = id;
		this.name = name;
		this.ph = ph;
		this.tel = tel;
	}
	
	public PhoneBookVO(String name, String ph,String tel) {
		super();
		this.name = name;
		this.ph = ph;
		this.tel = tel;
	}
	

	
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPh() {
		return ph;
	}

	public void setPh(String ph) {
		this.ph = ph;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "PhoneBookVO [id=" + id + ", name=" + name + ", ph=" + ph + ", tel=" + tel + "]";
	}


	
	
	
}
