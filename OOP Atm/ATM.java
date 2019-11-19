import java.util.Scanner;

public class ATM {

	public void calis(Hesap hesap) {
		// login kontrol edileceði için login classýndan bir tane obje oluþturulacak.

		Login login = new Login();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bankamýza hoþgeldiniz...... ");
		System.out.println("****************************");
		System.out.println("Kullanýcý giriþi:");
		System.out.println("****************************");

		int girisHakki = 3;

		while (true) {
			if (login.login(hesap)) {
				System.out.println("Giriþ baþarýlý ! ");
				break;
			} else {
				System.out.println("Giriþ baþarýsýz !");
				girisHakki -= 1;
				System.out.println("Kalan giriþ hakký : " + girisHakki);

			}
			if (girisHakki == 0) {
				System.out.println("Giriþ hakkýnýz bitti... ");
				return; // Metodu o anda sonlandýrma.
			}
		}

		System.out.println("******************************");
		String islemler = "1. bakiye görüntüle\n" + "2. para yatýrma\n" + "3. para çekme\n" + "Çýkýþ için q'ya basýn";
		System.out.println(islemler);

		System.out.println("***********************************");

		while (true) {
			System.out.println("Ýþlem seçiniz: ");
			String islem = scanner.nextLine();
			if (islem.equalsIgnoreCase("q")) {
				break;
			} else if (islem.equals("1")) {
				System.out.println("Bakiyeniz = " + hesap.getBakiye());
				
			} else if (islem.equals("2")) {
				System.out.println("Yatýrmak istediðiniz tutar ? ");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				hesap.paraYatir(tutar);
				
			} else if (islem.equals("3")) {
				System.out.println("Çekmek istediðiniz tutar ? ");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				hesap.paraCek(tutar);
			}else {
				System.out.println("Geçersiz iþlem!");
			}
		}

	}
}
