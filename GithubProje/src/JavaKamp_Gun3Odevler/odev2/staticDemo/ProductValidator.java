package JavaKamp_Gun3Odevler.odev2.staticDemo;

public class ProductValidator {
	
	public static boolean isValid(Product product)
	{
		if(product.price>10 && !product.name.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
