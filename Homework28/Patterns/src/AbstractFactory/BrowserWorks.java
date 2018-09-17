package AbstractFactory;

public class BrowserWorks {
	

	private void run(String searchEngineName) {
		Factory factory=null;
		if(searchEngineName.contains("Mail")) {
			factory=new MailFactory();
			new Browser(factory);
		}else {
			factory=new YandexFactory();
			new Browser(factory);
		}
		
		if(factory !=null) {
		   factory.getLogin();
		   System.out.println("Login was created to: " + factory.getLogin());
		   factory.getFindInformation();
		   System.out.println("Login was created to: " + factory.getFindInformation());
		}
	}	
	
	public static void main(String[] args) {
		
        BrowserWorks browserWorks = new  BrowserWorks(); 
        System.out.println("Run example for Mail");
        String searchEngineName = "Mail"; //Выбранная страна - Япония
        browserWorks.run(searchEngineName); 

        System.out.println("Run example for Yandex");
        String searchEngineName1 = "Yandex"; 
        browserWorks.run(searchEngineName1); 

    }

}
	
	



    