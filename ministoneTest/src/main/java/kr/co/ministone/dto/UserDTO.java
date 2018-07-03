package kr.co.ministone.dto;

public class UserDTO {
	
	private	String uid;
	private String pw;
	private String email;
	private String username;
	private String phone;
	private int win;
	private int lose;
	private double pov;
	private int level;
	private int point;
	private int logincheck;
	
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public UserDTO(String uid, int point) {
		super();
		this.uid = uid;
		this.point = point;
	}

	public UserDTO(String uid, String pw, String email, String username, String phone, int win, int lose, double pov,
			int level, int point, int logincheck) {
		super();
		this.uid = uid;
		this.pw = pw;
		this.email = email;
		this.username = username;
		this.phone = phone;
		this.win = win;
		this.lose = lose;
		this.pov = pov;
		this.level = level;
		this.point = point;
		this.logincheck = logincheck;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public double getPov() {
		return pov;
	}

	public void setPov(double pov) {
		this.pov = pov;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getLogincheck() {
		return logincheck;
	}

	public void setLogincheck(int logincheck) {
		this.logincheck = logincheck;
	}

	
	
	
	
	
}
