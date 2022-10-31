package JavaKamp_Gun3Odevler.odev2.polimorfizm;

public class Main {

	public static void main(String[] args) {
		
		/*DatabaseLogger logger=new DatabaseLogger();
		logger.Log("Log mesaj�");*/
		
		/*BaseLogger[] loggers=new BaseLogger[] {new FileLogger(),new EmailLogger(), new DatabaseLogger()};
		
		for(BaseLogger log:loggers)
		{
			log.Log("Log mesaj�");
		}

		*/
		CustomerManager customerManager=new CustomerManager(new DatabaseLogger()); //polimorfizm
		customerManager.add();

	}

}
