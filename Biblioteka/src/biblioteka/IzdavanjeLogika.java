package biblioteka;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class IzdavanjeLogika {

	private static List<Izdavanje> izdavanja = new LinkedList<Izdavanje>();

	public static Izdavanje nadjiIzdavanje() {
		int i = ScannerHelper.getInt("Unesite id.");
		for (Izdavanje izdavanje : izdavanja) {
			if (izdavanje.getId() == i) {
				return izdavanje;
			}
		}
		System.out.println("Izdavanje " + i + " ne postoji");
		return null;
	}

	public static void dodajIzdavanje() {
		if (KnjigaLogika.getBrojac() == 0) {
			System.out.println("Nema knjiga z ainzajmljivanje");
			return;
		} else {
			System.out.println("Imate " + KnjigaLogika.getBrojac() + " slobodnih knjiga.");
		}
		Knjiga k = KnjigaLogika.nadjiKnjigu();
		if (k == null)
			return;
		Korisnik ko = KorisnikLogika.nadjiKorisnika();
		if (ko == null)
			return;
		if (!k.getStatus().equals(KnjigaStatus.SLOBODNA)) {
			System.out.println("Ne mozete iznajmiti knjigu. Status " + k.getStatus());
			return;
		}
		izdavanja.add(new Izdavanje(ko, k));
	}

	public static void zatvoriIzdavanje() {
		Izdavanje i = nadjiIzdavanje();
		if (i == null)
			return;
		if (i.getStatus().equals(StatusIzdavanja.U_TOKU)) {
			i.Vracanje();
		} else {
			System.out.println("Izdavanje je vec zavrseno.");
		}
	}

	public static void listanjeIzdavanja() {
		for (Izdavanje izdavanje : izdavanja) {
			System.out.println(izdavanje);
		}
	}

	public static void ListPrekoracenihIzdavanja() {
		for (Izdavanje izdavanje : izdavanja) {
			if (izdavanje.getStatus().equals(StatusIzdavanja.U_TOKU)) {
				if (izdavanje.getDatumVracanjaKnjige().compareTo(LocalDateTime.now().minusMonths(1)) < 0)
					System.out.println(izdavanje);
			}
		}
	}

	public static void listZadatogIznajmljivanja() {
		SimpleDateFormat sdf =  new SimpleDateFormat("MMM-dd-yyyyl");
		Date d = null;
        Date d1 = null;
        Date d2 = null;
        d2 = sdf.parse(source)
        String date = ScannerHelper.getString("Unesite pocetni datum pretrage.");
        d = sdf.parse(date);
        String date1 = ScannerHelper.getString("Unesite zavrsni datum pretrage.");
        d1 = sdf.parse(date1);
		for (Izdavanje izdavanje : izdavanja) {
			  d2 = sdf.parse(izdavanje.getDatumIzdavanja());
			if (izdavanje.getDatumIzdavanja().isAfter(d) && izdavanje.getDatumVracanjaKnjige().isBefore(d1)) {
				
			}
		}
	}

}
