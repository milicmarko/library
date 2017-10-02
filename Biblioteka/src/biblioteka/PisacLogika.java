package biblioteka;

import java.util.LinkedList;
import java.util.List;

public class PisacLogika {

	private static List<Pisac> pisci = new LinkedList<Pisac>();

	public static void dodajPisca() {
		String ime = ScannerHelper.getString("Unesite ime.");
		String prezime = ScannerHelper.getString("Unesite prezime.");
		String zemljaRodjenja = ScannerHelper.getString("Unesite zemlju rodjenja.");
		int godinaRodjenja = ScannerHelper.getInt("Unesite godinu rodjenja.");
		pisci.add(new Pisac(ime, prezime, zemljaRodjenja, godinaRodjenja));
	}

	public static Pisac nadjiPisca() {
		int id = ScannerHelper.getInt("Unesite id pisca.");
		for (Pisac pisac : pisci) {
			if (pisac.getId() == id) {
				return pisac;
			}
		}
		System.err.println("Pisac sa id: " + id + " ne postoji!");
		return null;
	}

	public static void pretragaPoImenu() {
		String ime = ScannerHelper.getString("Unesite ime pisca.");
		for (Pisac pisac : pisci) {
			if (pisac.getIme() == ime) {
				System.out.println(pisac);
			}
			System.out.println("Pisac " + ime + " ne postoji");
			return;
		}
	}

	public static void pretragaPoPrezimenu() {
		String prezime = ScannerHelper.getString("Unesite ime pisca.");
		for (Pisac pisac : pisci) {
			if (pisac.getPrezime() == prezime) {
				System.out.println(pisac);
			}
			System.out.println("Pisac " + prezime + " ne postoji");
			return;
		}
	}

	public static void pretragaPoGodiniRodjenja() {
		int godinaRodjenja = ScannerHelper.getInt("Unesite godinu rodjenja pisca.");
		for (Pisac pisac : pisci) {
			if (pisac.getGodinaRodjenja() == godinaRodjenja) {
				System.out.println(pisac);
			}
			System.out.println("Pisac rodjen" + godinaRodjenja + " ne postoji");
			return;
		}
	}

	public static void pretragaPoZemlji() {
		String zemlja = ScannerHelper.getString("Unesite zemlju pisca.");
		for (Pisac pisac : pisci) {
			if (pisac.getZemljaRodjenja() == zemlja) {
				System.out.println(pisac);
			}
			System.out.println("Pisac iz" + zemlja + " ne postoji.");
			return;
		}
	}
	
	public static void listanjePisaca() {
		for (Pisac pisac : pisci) {
			System.out.println(pisac);
		}
	}

	public static void listanjeKnjigaPisca() {
		Pisac pisac = nadjiPisca();
		if (pisac == null)
			return;
		pisac.listanjeKnjiga();
	}

}
