package kr.co.ministone.chat;

public class Card {

	private String name;
	private String place;
	private String cardNum;
	
	public Card() {}
	
	public Card(String name, String place, String cardNum) {
		super();
		this.name = name;
		this.place = place;
		this.cardNum = cardNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	
	
}
