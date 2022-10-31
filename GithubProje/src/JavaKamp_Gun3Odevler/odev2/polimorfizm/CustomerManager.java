package JavaKamp_Gun3Odevler.odev2.polimorfizm;

public class CustomerManager {
	
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger)
	{
		this.logger=logger;
	}
	public void add()
	{
		System.out.println("Müþteri eklendi.");
		/*DatabaseLogger logger=new DatabaseLogger();
		logger.Log("Log mesajý");*/ //baðýmlý kod
		this.logger.log("Log mesajý");
	}
}
