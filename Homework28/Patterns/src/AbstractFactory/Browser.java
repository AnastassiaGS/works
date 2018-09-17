package AbstractFactory;

public class Browser {
	private Login login;
	private FindInformation findInformation;
	
	
	public Browser(Factory factory) {
		login=factory.getLogin();
		findInformation=factory.getFindInformation();
	}
	
    public void workWithBrowser() {
    	login.loadBrowser();
    	login.submitLoginAndPassword();
    	login.loginEmail();
    	findInformation.loadBrowser();
    	findInformation.findData();
    }
    
    
}
