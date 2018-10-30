package pages;

public class LoginAndPassword {
	static SQLUser user = new SQLUser();

	static String a = user.getLogin();
	static String b = user.getPassword();

	protected static final String MAIN_URL = "http://mail.ru";
	protected static final String CHROMEDRIVER_EXE = "F:\\1\\chromedriver.exe";
	protected static final String LOGIN = "vasus82";
	protected static final String PASSWORD = "82vfhfljyf30";
}
