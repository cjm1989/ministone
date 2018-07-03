package kr.co.ministone.dto;

public class deckDTO {
	
	private String title;
	private String cid;
	private String name;
	private int mana;
	private int atk;
	private int hp;
	private String cardtext;
	private String img;
	private String checkok;
	
	public deckDTO() {
		super();
	}
	
	
	
	public deckDTO(String title, String cid, String name, int mana, int atk, int hp, String cardtext, String img,
			String checkok) {
		super();
		this.title = title;
		this.cid = cid;
		this.name = name;
		this.mana = mana;
		this.atk = atk;
		this.hp = hp;
		this.cardtext = cardtext;
		this.img = img;
		this.checkok = checkok;
	}

	

	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
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





	public String getCheckok() {
		return checkok;
	}



	public void setCheckok(String checkok) {
		this.checkok = checkok;
	}



	@Override
	public String toString(){
		return "deckDTO[tilte="+title+",cid="+cid+
				",name="+name+",mana="+mana+",atk="+atk+
				",hp="+hp+",cardtext="+cardtext+
				",img="+img+"]";}
	
	}
	
	

