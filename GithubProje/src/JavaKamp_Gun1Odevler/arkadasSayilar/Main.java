package JavaKamp_Gun1Odevler.arkadasSayilar;

public class Main {

	public static void main(String[] args) {
	//�ki say� birbirinin kendisi hari� b�lenleri toplam�na e�itse bu say�lara arkada� say�lar denir.
		
		int sayi1=220;
		int sayi2=284;
		int toplam1=0;
		int toplam2=0;
		
		for(int i=1;i<sayi1;i++)
		{
			if(sayi1%i==0)
			{
				toplam1+=i;
			}
		}
		
		for(int i=1;i<sayi2;i++)
		{
			if(sayi2%i==0)
			{
				toplam2+=i;
			}
		}
		
		if(toplam1==sayi2 && toplam2==sayi1)
		{
			System.out.println(sayi1 + " ve "+ sayi2 + " arkada� say�d�rlar.");
		}
		else
		{
		    System.out.println(sayi1 + " ve "+ sayi2 + " arkada� say� de�ildirler.");
		}
	}

}
