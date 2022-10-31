package JavaKamp_Gun3Odevler.odev2.staticDemo;

public class Main {

	public static void main(String[] args) {
		
		ProductManager manager= new ProductManager();
		Product product=new Product();
		product.name="Mouse";
		product.price=11;
		
		manager.add(product);
		
			

	}

}
