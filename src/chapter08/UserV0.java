package chapter08;

public class UserV0 {
	private String id;
	private String pw;
	private String name;
	
	
	
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



	public UserV0(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}



	@Override
	public String toString() {
		return "UserV0 [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	
	
}
