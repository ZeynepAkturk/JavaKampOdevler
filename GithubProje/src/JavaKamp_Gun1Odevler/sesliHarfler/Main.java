package JavaKamp_Gun1Odevler.sesliHarfler;

public class Main {

	public static void main(String[] args) {
		  //Harfin ince veya kal�n sesli harf olup olmad���n�n kontrol edilmesi
		
				char harf='�';
				
				switch(harf)
				{
				
				case 'a': 
				case '�':
				case 'o':
				case 'u': 
				System.out.println(harf +" kal�n sesli harftir.");
				break;
				case 'e':
				case 'i':
				case '�':
				case '�':
				System.out.println(harf +" ince sesli harftir.");
				break;
				default: System.out.println("Girilen harf ne kal�n ne de ince sesli harftir.");
				break;
				}
	}

}
