package biblioteka;

import java.util.LinkedList;
import java.util.List;

public class KorisnikLogika {

	private static List<Korisnik> korisnici = new LinkedList<Korisnik>();

	public static void dodajKorisnika() {
		String ime = ScannerHelper.getString("Unesite ime.");
		String prezime = ScannerHelper.getString("Unesite prezime");
		String email = ScannerHelper.getString("Unesite email.");
		int brojClanskeKartice = ScannerHelper.getInt("Unesite broj clanske kartice.");
		korisnici.add(new Korisnik(ime, prezime, email, brojClanskeKartice));
	}

	public static Korisnik nadjiKorisnika() {
		int id = ScannerHelper.getInt("Unesite id korisnika.");
		for (Korisnik korisnik : korisnici) {
			if (korisnik.getId() == id) {
				return korisnik;
			}
		}
		System.out.println("Korisnik sa id " + id + " ne postoji.");
		return null;
	}

	public static void pretragaPoImenu() {
		String ime = ScannerHelper.getString("Unesite ime korisnika.");
		for (Korisnik korisnik : korisnici) {
			if (korisnik.getIme() == ime) {
				System.out.println(korisnik);
			}
			System.out.println("Korisnik " + ime + " ne postoji");
			return;
		}
	}

	public static void pretragaPoPrezimenu() {
		String prezime = ScannerHelper.getString("Unesite ime korisnika.");
		for (Korisnik korisnik : korisnici) {
			if (korisnik.getPrezime() == prezime) {
				System.out.println(korisnik);
			}
			System.out.println("Korisnik " + prezime + " ne postoji");
			return;
		}
	}

	public static void pretragaPoBrojuClanske() {
		int broj = ScannerHelper.getInt("Unesite broj clanske kartice korisnika.");
		for (Korisnik korisnik : korisnici) {
			if (korisnik.getBrojClanskeKartice() == broj) {
				System.out.println(korisnik);
			}
			System.out.println("Korisnik sa" + broj + " clanske kartice ne postoji");
			return;
		}
	}

	public static void listanjeKorsinika() {
		for (Korisnik korisnik : korisnici) {
			System.out.println(korisnik);
		}
	}

	public static void listanjeIznajmljivanjaJednog() {
		Korisnik korisnik = nadjiKorisnika();
		if (korisnik == null)
			return;
		korisnik.listanjeIzdavanja();
	}

	public static void prikazSPornihIznajmljivanja() {
		Korisnik k = nadjiKorisnika();
		k.spornaIznajmljivanja();
	}
}
