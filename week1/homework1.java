package week1;

public class homework1 {

	public static void main(String[] args) {
		int not = 55;
		//int kredi =100000;
		//double notOrtalaması = 50.5;
		//String isim = "Engin Demiroğ";
		//boolean SistemeGirisYapmısmı = true;

		if(not > 50) {
		System.out.println("geçti");	
		}
		else if(not >=40 ) {	
		System.out.println("bütünleme");
		}
		else {
			System.out.println("Kaldı");	
		}
				
		for(int i=0;i<=100000000;i+=2) {
			System.out.println(i);
			
		}
		int sayi= 10;
		while (sayi<=100) {
			System.out.println(sayi);
			sayi= sayi + 10;
		}
		
		int sayi2 = 11;
		do {
			System.out.println(sayi2);
			sayi = sayi +10;
		}while(sayi2 >100);
			
		String[] sehirler1 = new String[] {"ankara","istanbul","konya};"};
		for (String sehir : sehirler1){
			System.out.println(sehir);		
		}
		for( int i = 0 ; i<3; i++) {
			System.out.println(sehirler1[i]);
			
		}
		int[] sayilar = new int[]{1,2,3,4,5,6,7,8,9,10};
		int aranacak = 9;
		boolean varmı = false;
		 for (int sayi4 : sayilar) {
			 if (sayi == aranacak) {
				 varmı = true;
				 break;
			 }
		 }
		String mesaj ="";
		if (varmı) {
			mesaj = ("sayı mevcuttur:" + aranacak);
			mesajver(mesaj);	
		}else {
			mesajver("sayı mevcut değildir: " + aranacak);
		}

		public static void mesajver
		
		
	}

}
