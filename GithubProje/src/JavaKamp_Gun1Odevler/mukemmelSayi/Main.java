package JavaKamp_Gun1Odevler.mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		
		//Sayýnýn mükemmel sayý olup olmadýðýnýn kontrol edilmesi
		//Kendisi hariç pozitif tam bölenlerinin toplamý kendisine eþit olan sayýlara "Mükemmel sayý" denir.
				
				int sayi=28;
				int toplam=0;
				
				for(int i=1; i<sayi; i++)
				{
					if(sayi%i==0)
					{
						toplam+=i;
					}
				}
				
				if(toplam==sayi)
				{
					System.out.println(sayi+ " mükemmel sayýdýr.");
				}
				else
				{
					System.out.println(sayi + " mükemmel sayý deðildir.");
				}
				

	}

}
