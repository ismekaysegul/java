package udemy;

import java.util.Scanner;

public class ArmstrongSayisi {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bir sayı giriniz :  ");

		int sayi = scanner.nextInt();
		int sayiYedek = sayi;

		// Basamak sayısı hesapla.
		int basamakSayisi = 1;
		int toplam = 0;
		while (true) {
			if (sayi < 10) {
				System.out.println("Girilen sayının basamak sayısı = " + basamakSayisi);
				toplam += sayi;
				break;
			} else {
				int kalan = (sayi % 10);
				toplam += kalan;
				sayi = sayi / 10;

				basamakSayisi++;

			}

		}
		System.out.println("Sayı değerleri toplamı  =  " + (toplam));
		System.out.println("Sayı değerleri toplamı*Basamak sayısı  =  " + (toplam*basamakSayisi));
		
		System.out.println("***************************************");
		System.out.println("Peki Armstrong sayısı mı?");
		System.out.println("***************************************");
		
		scanner.nextLine();
		
		if(sayiYedek == (toplam*basamakSayisi)) {
			System.out.println("EVET ! "+sayiYedek+" sayısı bir Armstrong sayısıdır.");
		} else {
			System.out.println("HAYIR ! "+sayiYedek+" sayısı bir Armstrong sayısı değildir.");
		}
		
	}

}
