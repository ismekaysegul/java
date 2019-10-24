package udemy;

import java.util.Scanner;

public class FaizHesabi {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Yatýracaðýnýz tutarý giriniz:  ");
		double anapara = scanner.nextInt();

		System.out.print("Yýl sayýsý giriniz:  ");
		int yil = scanner.nextInt();

		for (int i = 0; i < yil; i++) {
			
			anapara += (0.06*anapara);
			
			System.out.println((i+1)+". yýl sonunda toplam anapara = "+anapara);

		}

	}

}
