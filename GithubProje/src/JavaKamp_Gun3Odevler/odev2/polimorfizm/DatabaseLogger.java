package JavaKamp_Gun3Odevler.odev2.polimorfizm;

public class DatabaseLogger extends BaseLogger {
	
	public void log(String message)
	{
		System.out.println("Logged to database: "+ message);
	}

}
