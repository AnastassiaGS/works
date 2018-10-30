package model;

public class Recipients {
	private int id;
	private String email;
	private String text;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	@Override
	public String toString() {
		return "Recipient: ID=" + this.id + " Email=" + this.email + " Text=" + this.text;
	}

}
