
public class Main {



			public static void main(String[] args) {
				
				// **** Verilen sayinin Asal Sayi olup olmadiginin kontrol edilmesi ****
				
				int sayi=61;
				int kalan=-1; 
				boolean asalMi=true;
				
				if(sayi==1)
				{
					System.out.println("Girilen sayi asal degildir.");
					return;
				}
				if(sayi<1)
				{
					System.out.println("Girilen sayi gecersiz sayidir.");
					return;
				}
				
				for(int i=2; i<=sayi-1; i++)
				{   
					kalan=sayi%i;
					if(kalan==0)
					{
					asalMi=false;
					break;
					}
				}
				
				if(asalMi)
				{
					System.out.println("Girilen sayi asaldir.");
				}
				else
				{
					System.out.println("Girilen sayi degildir.");
				}
				

			}

		


	}


