package AbstractFactory;

public class YandexFactory implements Factory  {
    

	
	@Override
	public Login getLogin() {
		return new LogInEmailYandex();
	}

	@Override
	public FindInformation getFindInformation() {
		return new FindInformationYandex();
	}

	
}
