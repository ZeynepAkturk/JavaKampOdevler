package JavaKamp_Gun1Odevler.mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		
		//Say�n�n m�kemmel say� olup olmad���n�n kontrol edilmesi
		//Kendisi hari� pozitif tam b�lenlerinin toplam� kendisine e�it olan say�lara "M�kemmel say�" denir.
				
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
					System.out.println(sayi+ " m�kemmel say�d�r.");
				}
				else
				{
					System.out.println(sayi + " m�kemmel say� de�ildir.");
				}
				

	}

}
