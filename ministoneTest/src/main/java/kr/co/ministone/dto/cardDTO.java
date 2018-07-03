package kr.co.ministone.dto;

public class cardDTO {
	
	private String cid;
	private String name;
	private int mana;
	private int atk;
	private int hp;
	private String cardtext;
	private String img;
	
	
	public cardDTO() {}


	public cardDTO(String cid, String name, int mana, int atk, int hp, String cardtext, String img) {
		super();
		this.cid = cid;
		this.name = name;
		this.mana = mana;
		this.atk = atk;
		this.hp = hp;
		this.cardtext = cardtext;
		this.img = img;
	}


	public String getCid() {
		return cid;
	}


	public void setCid(String cid) {
		this.cid = cid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMana() {
		return mana;
	}


	public void setMana(int mana) {
		this.mana = mana;
	}


	public int getAtk() {
		return atk;
	}


	public void setAtk(int atk) {
		this.atk = atk;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public String getCardtext() {
		return cardtext;
	}


	public void setCardtext(String cardtext) {
		this.cardtext = cardtext;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}
	
	
	
	
	
	

}
