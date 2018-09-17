package modele;

public class Email {

	private int id;
	private String emailOfReceiver;
	private String subject;
	private String bodyOfEmail;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailOfReceiver() {
		return emailOfReceiver;
	}

	public void setEmailOfReceiver(String emailOfReceiver) {
		this.emailOfReceiver = emailOfReceiver;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return bodyOfEmail;
	}

	public void setBodyOfEmail(String bodyOfEmail) {
		this.bodyOfEmail = bodyOfEmail;
	}

	@Override
	public String toString() {
		return "Email: id=" + id + ", emailOfReceiver=" + emailOfReceiver + ", subject=" + subject + ", bodyOfEmail=" + bodyOfEmail;
	}

}
