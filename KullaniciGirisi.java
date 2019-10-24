package udemy;

import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int girisHakki = 3;
		String kullanici = "ayse";
		String parola = "1234";
		
		
		
		System.out.println("***********************************");
		System.out.println("Hoþgeldiniz...");
		System.out.println("***********************************");
		
		
		while(true) {
			
			System.out.println("Kullanýcý adýný giriniz:  ");
			String girilenKullanici = scanner.nextLine();
			System.out.println("Parola giriniz:  ");
			String girilenParola = scanner.nextLine();
			
			if (girilenKullanici.equals(kullanici) && girilenParola.equals(parola)) {
				
				System.out.println("Baþarýyla giriþ yaptýnýz. Hoþgaeldiniz "+kullanici);
				break;
				
			}  else if(girilenKullanici.equals(kullanici) && !girilenParola.equals(parola)) {
				
				System.out.println("Parolanýz yanlýþ...");
				girisHakki--;
				System.out.println("Kalan giriþ hakký: "+girisHakki);
				
			}   else if(!girilenKullanici.equals(kullanici) && girilenParola.equals(parola)) {
				
				System.out.println("Kullanýcý adýnýz yanlýþ...");
				girisHakki--;
				System.out.println("Kalan giriþ hakký: "+girisHakki);
				
			}   else  {
				System.out.println("Kullanýcý adý ve parola yanlýþ..");
				girisHakki--;
				System.out.println("Kalan giriþ hakký: "+girisHakki);
				
			} 
			
			if(girisHakki == 0) {
				
				System.out.println("3 kez baþarýsýz giriþ yaptýnýz. Programdan çýkýlýyor...");
				break;
			}
			
		}
	}
}
