package udemy;

import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int girisHakki = 3;
		String kullanici = "ayse";
		String parola = "1234";
		
		
		
		System.out.println("***********************************");
		System.out.println("Hoşgeldiniz...");
		System.out.println("***********************************");
		
		
		while(true) {
			
			System.out.println("Kullanıcı adını giriniz:  ");
			String girilenKullanici = scanner.nextLine();
			System.out.println("Parola giriniz:  ");
			String girilenParola = scanner.nextLine();
			
			if (girilenKullanici.equals(kullanici) && girilenParola.equals(parola)) {
				
				System.out.println("Başarıyla giriş yaptınız. Hoşgaeldiniz "+kullanici);
				break;
				
			}  else if(girilenKullanici.equals(kullanici) && !girilenParola.equals(parola)) {
				
				System.out.println("Parolanız yanlış...");
				girisHakki--;
				System.out.println("Kalan giriş hakkı: "+girisHakki);
				
			}   else if(!girilenKullanici.equals(kullanici) && girilenParola.equals(parola)) {
				
				System.out.println("Kullanıcı adınız yanlış...");
				girisHakki--;
				System.out.println("Kalan giriş hakkı: "+girisHakki);
				
			}   else  {
				System.out.println("Kullanıcı adı ve parola yanlış..");
				girisHakki--;
				System.out.println("Kalan giriş hakkı: "+girisHakki);
				
			} 
			
			if(girisHakki == 0) {
				
				System.out.println("3 kez başarısız giriş yaptınız. Programdan çıkılıyor...");
				break;
			}
			
		}
	}
}
