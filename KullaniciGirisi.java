package udemy;

import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int girisHakki = 3;
		String kullanici = "ayse";
		String parola = "1234";
		
		
		
		System.out.println("***********************************");
		System.out.println("Ho�geldiniz...");
		System.out.println("***********************************");
		
		
		while(true) {
			
			System.out.println("Kullan�c� ad�n� giriniz:  ");
			String girilenKullanici = scanner.nextLine();
			System.out.println("Parola giriniz:  ");
			String girilenParola = scanner.nextLine();
			
			if (girilenKullanici.equals(kullanici) && girilenParola.equals(parola)) {
				
				System.out.println("Ba�ar�yla giri� yapt�n�z. Ho�gaeldiniz "+kullanici);
				break;
				
			}  else if(girilenKullanici.equals(kullanici) && !girilenParola.equals(parola)) {
				
				System.out.println("Parolan�z yanl��...");
				girisHakki--;
				System.out.println("Kalan giri� hakk�: "+girisHakki);
				
			}   else if(!girilenKullanici.equals(kullanici) && girilenParola.equals(parola)) {
				
				System.out.println("Kullan�c� ad�n�z yanl��...");
				girisHakki--;
				System.out.println("Kalan giri� hakk�: "+girisHakki);
				
			}   else  {
				System.out.println("Kullan�c� ad� ve parola yanl��..");
				girisHakki--;
				System.out.println("Kalan giri� hakk�: "+girisHakki);
				
			} 
			
			if(girisHakki == 0) {
				
				System.out.println("3 kez ba�ar�s�z giri� yapt�n�z. Programdan ��k�l�yor...");
				break;
			}
			
		}
	}
}
