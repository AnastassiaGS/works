package AbstractFactory;

public class MailFactory implements Factory  {

	
	@Override
	public Login getLogin() {
	   return new LogInEmailMail();
	}

	@Override
	public FindInformation getFindInformation() {
		return new FindInformationMail();
	}

}
