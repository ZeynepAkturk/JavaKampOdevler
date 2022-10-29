package JavaKamp_Gun2Odevler.classesSample;



public class Main {

	public static void main(String[] args) {
		
		DortIslem dortIslem=new DortIslem();
		int sonuc=dortIslem.Cikar(7, 5);
		System.out.println("Sonuc"+sonuc);
		
		
		
		Product product =new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");;
		product.setPrice(500);
		product.setStockAmount(12);
		
		System.out.println(product.getName());
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
	}

}
