package ders;

import java.util.Scanner;

public class AtmProgrami {
	/*
	 * İşlemler: 1. işlem: Bakiye Öğrenme 2. işlem: Para Çekme 3. işlem: Para
	 * yatırma Çıkış: q
	 * 
	 * Not: do-while kullanacağız.
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//		System.out.println("İşlemler:");
//		System.out.println("1. işlem: Bakiye Öğrenme");
//		System.out.println("2. işlem: Para Çekme");
//		System.out.println("3. işlem: Para yatırma");
//		System.out.println("Çıkış: q");
		while(true) {
		String islemler = "İşlemler:\n"
						+"1. işlem: Bakiye Öğrenme\n"
				        +"2. işlem: Para Çekme\n"
						+"3. işlem: Para yatırma\n"
				        +"Çıkış: q\n";

		System.out.println("*******************");
		System.out.println(islemler);
		System.out.println("*******************");

		String secim = scanner.nextLine();
		
		if(secim.equals("q")) {
			System.out.println("Programdan çıkılıyor...");
			break;
		} else {
		
		int bakiye = 1000;

		switch (secim) {
		case "1":
			System.out.println("Bakiyeniz: " + bakiye);
			break;
			
		case "2":
			System.out.println("Lütfen çekmek istediğiniz tutarı giriniz.");
			int cekilenTutar = scanner.nextInt();
			
			if(cekilenTutar>bakiye) {
				System.out.println("Bakiyeniz yetersiz.");
			} else {
				bakiye-=cekilenTutar;
				System.out.println(cekilenTutar+"TL çekmiş bulunmaktesınız. Güncel tutar =  "+bakiye);
				
			}
			break;
			
		case "3":
			System.out.println("Lütfen yatırmak istediğiniz tutarı giriniz.");
			int yatirilanTutar = scanner.nextInt();
			bakiye+=yatirilanTutar;
			System.out.println("Yatırma işlemi gferçekleşti. Güncel tutar ="+bakiye);

			break;

		default:
			System.out.println("Geçersiz işlem!");
			break;
		}
		}
	}
	}
}
