package pages;

public class SQLUser {
	private String login;
	private String password;

	public String getLogin() {
		return login;
	}

	public String setLogin(String login) {
		return this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public String setPassword(String password) {
		return this.password = password;
	}

	@Override
	public String toString() {
		return "Login=" + this.login + " Password=" + this.password;
	}
}