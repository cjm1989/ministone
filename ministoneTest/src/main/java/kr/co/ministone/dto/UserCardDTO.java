package kr.co.ministone.dto;

public class UserCardDTO {
	private int cid;
	private String uid;
	
	public UserCardDTO() {
		// TODO Auto-generated constructor stub
	}

	public UserCardDTO(int cid, String uid) {
		super();
		this.cid = cid;
		this.uid = uid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	
	
}
