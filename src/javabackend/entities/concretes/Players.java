package javabackend.entities.concretes;

public class Players {
	
	private int id;
	private String firstName;
	private String lastName;
	private int dogum;
	int indentityNumber;
	public Players(int id, String firstName, String lastName, int dogum, int indentityNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dogum = dogum;
		this.indentityNumber = indentityNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDogum() {
		return dogum;
	}
	public void setDogum(int dogum) {
		this.dogum = dogum;
	}
	public int getIndentityNumber() {
		return indentityNumber;
	}
	public void setIndentityNumber(int indentityNumber) {
		this.indentityNumber = indentityNumber;
	}


}
