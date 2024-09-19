package package1;

public class User {
	private String name;
	private String phone;
	private String address;
	private String id;
	private String pw;
	private boolean login_staus=false;
	
	public User() {
		
	}
	
	public User(String pName, String pPhone, String pAddress) {
		this.name = pName;
		this.phone = pPhone;
		this.address = pAddress;
		
	}
	
	String getName () {
		return this.name;
	}
	
	String getPhone () {
		return this.phone;
	}
	
	String getAddress () {
		return this.address;
	}
	
	String getId () {
		return this.id;
	}
	
	String getPw () {
		return this.pw;
	}
	
	public void printInfo() {
		System.out.print(this.name + "님의 주소: ");
		System.out.println(this.address);
		System.out.print(this.name + "님의 전화번호: ");
		System.out.println(this.phone + "\n");
	}
	
	public void setId(String pId) {
		this.id = pId;
	}
	
	public void setPw(String pPw) {
		this.id = pPw;
	}
	
	public void login() {
		this.login_staus=true;
	}
	
	public void logout() {
		this.login_staus=false;
	}
	
	public boolean isLogin() {
		return this.login_staus;
	}
	

}
