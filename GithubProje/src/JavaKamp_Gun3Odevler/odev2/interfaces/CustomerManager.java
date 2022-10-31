package JavaKamp_Gun3Odevler.odev2.interfaces;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal)
	{
		this.customerDal=customerDal;
	}
	public void add()
	{
		customerDal.Add();
	}

}
