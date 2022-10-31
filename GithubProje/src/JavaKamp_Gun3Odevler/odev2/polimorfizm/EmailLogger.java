package JavaKamp_Gun3Odevler.odev2.polimorfizm;

public class EmailLogger extends BaseLogger {

	public void log(String message)
	{
		System.out.println("Logged to email: "+ message);
	}

}
