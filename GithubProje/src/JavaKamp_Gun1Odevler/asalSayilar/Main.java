package JavaKamp_Gun1Odevler.asalSayilar;

public class Main {

	public static void main(String[] args) {
		
		//Sayýnýn asal olup olmadýðýnýn kontrol edilmesi
		
				int sayi=61;
				boolean sayiAsal=true;
				
				if(sayi<2)
				{
					System.out.println("Sayý geçerli deðildir.");
					return;
				}
				for(int i=2; i<sayi; i++)
				{
			       if(sayi%i==0)
			       {
			    	   sayiAsal=false;
			       }
		        }
				
				if(sayiAsal)
				{
					System.out.println(sayi+" asaldýr.");
				}
				else
				{
					System.out.println(sayi+" asal deðildir.");
				}
				

	}

}
