package JavaKamp_Gun1Odevler.asalSayilar;

public class Main {

	public static void main(String[] args) {
		
		//Say�n�n asal olup olmad���n�n kontrol edilmesi
		
				int sayi=61;
				boolean sayiAsal=true;
				
				if(sayi<2)
				{
					System.out.println("Say� ge�erli de�ildir.");
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
					System.out.println(sayi+" asald�r.");
				}
				else
				{
					System.out.println(sayi+" asal de�ildir.");
				}
				

	}

}
