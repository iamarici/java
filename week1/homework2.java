package week1;

public class homework2 {

	public static void main(String[] args) {
		
	 System.out.println("merhaba dünya");
	 
	 int ogrencisayısı = 12;
	 String mesaj = "öğrencisayısı :";
	 
	 System.out.println(mesaj + ogrencisayısı);
	 
	 int sayi = 5;
	 if(sayi <15) {
	System.out.println("sayı 15 den küçüktür");
	 }
	 else if(sayi == 35) {
     System.out.println("sayı 35 e eşittir");
	 }
	 else {
     System.out.println("sayı 15 den büyüktür");
	 }
	 
	 int bir = 24;
	 int iki = 25;
	 int üç = 2;
	 int enbutuksayı = bir;
	 
	 if (enbutuksayı < iki) {
		 enbutuksayı = iki;		 
	 }
	 if (enbutuksayı < üç) {
		 enbutuksayı = üç;
		 
	 }
	 System.out.println(enbutuksayı);
	 
	 char grade = 'A';
	 
	 switch (grade) {
	case 'A':
		System.out.println("mükemmel : geçtiniz");
		break;
	case 'B':
		System.out.println("Çok güzel : geçtiniz");
		break;
	case 'C':
		System.out.println("iyi : geçtiniz");
		break;
	case 'D':
		System.out.println("fena değil : geçtiniz");
		break;
	case 'F':
		System.out.println("malesef kaldınız");
		break;
	default:
		
		System.out.println("geçersiz not girdiniz");
	}
	 
	 for(int a = 2; a<10;a+=2) {
	 System.out.println(a);
	 }
	 System.out.println("for döngüsü bittti");
	 
	 int i=1;
	 while(i<10) {
		 System.out.println(i);
		 i+=2;
	 }
	 int j=100;
	 do {
		 System.out.println("loglandı");
		 System.out.println(j);
		 j+=2;
	 }while(j<10);
	 System.out.println("do - while döngüsü bitti");
	 
	 String ogrenci1 = "Engin";
	 String ogrenci2 = "Mehmet";
	 String ogrenci3 = "Mert";
	 String ogrenci4 = "Berk";
	 String ogrenci5 = "Damira";
	 String ogrenci6 = "Gamze";

	 System.out.println(ogrenci1);
	 System.out.println(ogrenci2);
	 System.out.println(ogrenci3);
	 System.out.println(ogrenci4);
	 System.out.println(ogrenci5);
	 System.out.println(ogrenci6);
	
	 String[] ogrenciler = new String[3];
	 ogrenciler[0] = "Engin";
	 ogrenciler[1] = "Mehmet";
	 ogrenciler[2] = "Mert";
	 
	 for(int i=0;i<ogrenciler.length;i++) {
		 System.out.println(ogrenciler[i]);
	 }
	}
}
