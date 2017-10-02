package biblioteka;

import java.util.LinkedList;
import java.util.List;

public class KnjigaLogika {
	private static int brojac = 0;
	private static List<Knjiga> knjige = new LinkedList<Knjiga>();
	private static int broj = 0;

	public static void dodajKnjigu() {
		String ime = ScannerHelper.getString("Unesite ime.");
		int godinaIzdanja = ScannerHelper.getInt("Unesite godinu izdavanja.");
		int ISBNBroj = ScannerHelper.getInt("Unesite ISBN broj");
		broj++;
		knjige.add(new Knjiga(ime, godinaIzdanja, ISBNBroj));
	}

	public static void listanjeSlobodnihKNjiga() {
		for (Knjiga knjiga : knjige) {
			if (knjiga.getStatus() == KnjigaStatus.SLOBODNA) {
				System.out.println(knjiga);
				brojac++;
			} else {
				System.out.println("Nema slobodnih knjiga.");
			}
		}
	}

	public static int getBroj() {
		return broj;
	}

	public static void pretragaPoPiscu() {
		Pisac ime = PisacLogika.nadjiPisca();
		for (Knjiga knjiga : knjige) {
			if (knjiga.getPisac() == ime) {
				System.out.println(knjiga);
			}
			System.out.println("Korisnik " + ime + " ne postoji");
			return;
		}
	}

	public static int getBrojac() {
		return brojac;
	}

	public static void dodajPisca() {
		Pisac p = PisacLogika.nadjiPisca();
		if (p == null)
			return;
		Knjiga k = KnjigaLogika.nadjiKnjigu();
		if (k == null)
			return;
		k.dodajPisca(p);
		p.dodajKnjigu(k);
	}

	public static Knjiga nadjiKnjigu() {
		int id = ScannerHelper.getInt("Unesite id.");
		for (Knjiga knjiga : knjige) {
			if (knjiga.getId() == id) {
				return knjiga;
			}
		}
		System.out.println("Knjiga sa id: " + id + " ne postoji.");
		return null;
	}

	public static void pretragaPoImenu() {
		String ime = ScannerHelper.getString("Unesite ime korisnika.");
		for (Knjiga knjiga : knjige) {
			if (knjiga.getIme() == ime) {
				System.out.println(knjiga);
			}
			System.out.println("Korisnik " + ime + " ne postoji");
			return;
		}
	}

	public static void pretragaPoISBN() {
		int broj = ScannerHelper.getInt("Unesite ISBN broj.");
		for (Knjiga knjiga : knjige) {
			if (knjiga.getISBNBroj() == broj) {
				System.out.println(knjiga);
			}
			System.out.println("Knjiga sa ISBN: " + broj + " ne postoji");
			return;
		}
	}

	public static void listanjeKnjiga() {
		for (Knjiga knjiga : knjige) {
			System.out.println(knjiga);
		}
	}

	public static void listanjeIzdavanja() {
		Knjiga k = nadjiKnjigu();
		if (k == null)
			return;
		k.listanjeIzdavanje();

	}

}
