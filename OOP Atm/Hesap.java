
public class Hesap {

	private String kullaniciAdi;
	private String parola;
	private int bakiye;

	public Hesap(String kullaniciAdi, String parola, int bakiye) {
		this.bakiye = bakiye;
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public int getBakiye() {
		return bakiye;
	}

	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}

	public void paraYatir(int tutar) {
		this.bakiye += tutar;
		System.out.println("Yeni bakiye = " + bakiye);
	}

	public void paraCek(int tutar) {
		if (bakiye < tutar) {
			System.out.println("Yetersiz bakiye! Bakiyeniz: " + bakiye);
		} else if (tutar > 1500) {
			System.out.println("1500 TL üzeri tutar giremezsiniz!");
		} else {
			bakiye -= tutar;
			System.out.println("Yeni bakiye = " + bakiye);
		}

	}
}
