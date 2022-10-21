package JavaKamp_Gun1Odevler.sayiBulma;

public class Main {

	public static void main(String[] args) {
		
		int[]sayilar=new int[] {1,2,5,7,9,0};
		int aranacak=10;
		boolean sayiVar=false;
		
		for(int i=0;i<sayilar.length;i++)
		{
			if(sayilar[i]==aranacak)
			{
				sayiVar=true;
				break;
			}
		}
		
		if(sayiVar)
		{
			System.out.println("Sayý vardýr.");
		}
		else
		{
			System.out.println("Sayý yoktur.");
		}

	}

}
