import java.util.Scanner;

public class ATM {

	public void calis(Hesap hesap) {
		// login kontrol edilece�i i�in login class�ndan bir tane obje olu�turulacak.

		Login login = new Login();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bankam�za ho�geldiniz...... ");
		System.out.println("****************************");
		System.out.println("Kullan�c� giri�i:");
		System.out.println("****************************");

		int girisHakki = 3;

		while (true) {
			if (login.login(hesap)) {
				System.out.println("Giri� ba�ar�l� ! ");
				break;
			} else {
				System.out.println("Giri� ba�ar�s�z !");
				girisHakki -= 1;
				System.out.println("Kalan giri� hakk� : " + girisHakki);

			}
			if (girisHakki == 0) {
				System.out.println("Giri� hakk�n�z bitti... ");
				return; // Metodu o anda sonland�rma.
			}
		}

		System.out.println("******************************");
		String islemler = "1. bakiye g�r�nt�le\n" + "2. para yat�rma\n" + "3. para �ekme\n" + "��k�� i�in q'ya bas�n";
		System.out.println(islemler);

		System.out.println("***********************************");

		while (true) {
			System.out.println("��lem se�iniz: ");
			String islem = scanner.nextLine();
			if (islem.equalsIgnoreCase("q")) {
				break;
			} else if (islem.equals("1")) {
				System.out.println("Bakiyeniz = " + hesap.getBakiye());
				
			} else if (islem.equals("2")) {
				System.out.println("Yat�rmak istedi�iniz tutar ? ");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				hesap.paraYatir(tutar);
				
			} else if (islem.equals("3")) {
				System.out.println("�ekmek istedi�iniz tutar ? ");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				hesap.paraCek(tutar);
			}else {
				System.out.println("Ge�ersiz i�lem!");
			}
		}

	}
}
