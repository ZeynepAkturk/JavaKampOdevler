package JavaKamp_Gun1Odevler.sesliHarfler;

public class Main {

	public static void main(String[] args) {
		  //Harfin ince veya kalýn sesli harf olup olmadýðýnýn kontrol edilmesi
		
				char harf='ö';
				
				switch(harf)
				{
				
				case 'a': 
				case 'ý':
				case 'o':
				case 'u': 
				System.out.println(harf +" kalýn sesli harftir.");
				break;
				case 'e':
				case 'i':
				case 'ü':
				case 'ö':
				System.out.println(harf +" ince sesli harftir.");
				break;
				default: System.out.println("Girilen harf ne kalýn ne de ince sesli harftir.");
				break;
				}
	}

}
