package biblioteka;

public class Test {

	public static void main(String[] args) {

		ciklus: while (true) {
			System.out.println("1 Unos korisnika");
			System.out.println("2 Unos knjige");
			System.out.println("3 Unos pisca");
			System.out.println("4 Dodaj pisca knjizi");
			System.out.println("5 Iznajmljivanje");
			System.out.println("6 Vracanje");
			System.out.println("7 Pretraga korisnika po imenu");
			System.out.println("8 Pretraga korisnika po prezimenu.");
			System.out.println("9 Pretraga korisnika po BRoju clanske kartice.");
			System.out.println("10 Pretraga pisca po imenu.");
			System.out.println("11 Pretraga pisca po prezimenu");
			System.out.println("12 Pretraga pisca po godini rodjenja.");
			System.out.println("13 Pretraga po zemlji rodjenja.");
			System.out.println("14 Pretraga knjiga po imenu.");
			System.out.println("15 Pretraga knjiga po piscu.");
			System.out.println("16 Pretraga knjiga po ISBN broju.");
			System.out.println("17 Ispis svih pisaca.");
			System.out.println("18 Ispis svih knjiga trazenog pisca.");
			System.out.println("19 Ispis svih korisnika");
			System.out.println("20 Ispis svih iznajmljivanja jendog korisnika.");
			System.out.println("21 Ispis svih iznajmljivanja jedne knjige.");
			System.out.println("22 Ispis svih prekoracenih iznajmljivanja.");
			System.out.println("23 Ispis svih iznajmljivanja u zadatom preiodu.");
			System.out.println("24 Prikaz svih spornih iznajmljivanja jednog korisnika.");
			System.out.println("0 Kraj programa.");
			int izbor = ScannerHelper.getInt("Unesite opciju.");
			switch (izbor) {
			case 0:
				break ciklus;
			case 1:
				KorisnikLogika.dodajKorisnika();
				break;
			case 2:
				KnjigaLogika.dodajKnjigu();
				break;
			case 3:
				KnjigaLogika.dodajPisca();
				break;
			case 4:
				KnjigaLogika.dodajPisca();
				break;
			case 5:
				IzdavanjeLogika.dodajIzdavanje();
				break;
			case 6:
				IzdavanjeLogika.zatvoriIzdavanje();
				break;
			case 7:
				KorisnikLogika.pretragaPoImenu();
				break;
			case 8:
				KorisnikLogika.pretragaPoPrezimenu();
				break;
			case 9:
				KorisnikLogika.pretragaPoBrojuClanske();
				break;
			case 10:
				PisacLogika.pretragaPoImenu();
				break;
			case 11:
				PisacLogika.pretragaPoPrezimenu();
				break;
			case 12:
				PisacLogika.pretragaPoGodiniRodjenja();
				break;
			case 13:
				PisacLogika.pretragaPoZemlji();
				break;
			case 14:
				KnjigaLogika.pretragaPoImenu();
				break;
			case 15:
				KnjigaLogika.pretragaPoPiscu();
				break;
			case 16:
				KnjigaLogika.pretragaPoISBN();
				break;
			case 17:
				PisacLogika.listanjePisaca();
				break;
			case 18:
				PisacLogika.listanjeKnjigaPisca();
				break;
			case 19:
				KorisnikLogika.listanjeKorsinika();
				break;
			case 20:
				KorisnikLogika.listanjeIznajmljivanjaJednog();
				break;
			case 21:
				KnjigaLogika.listanjeIzdavanja();
				break;
			case 22:
				IzdavanjeLogika.ListPrekoracenihIzdavanja();
				break;
			case 23:
				IzdavanjeLogika.listZadatogIznajmljivanja();
				break;
			case 24:
				KorisnikLogika.prikazSPornihIznajmljivanja();
				break;
			}
		}
		System.out.println("Kraj programa.");
	}
}
