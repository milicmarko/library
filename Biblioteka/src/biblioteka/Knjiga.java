package biblioteka;

import java.util.LinkedList;
import java.util.List;

public class Knjiga extends AbstractEntity {

	private static int brojac = 0;
	private String ime;
	private int godinaIzdanja;
	private int ISBNBroj;
	private int broj;
	private Pisac pisac;
	private KnjigaStatus status;
	private Korisnik korisnik;
	private List<Izdavanje> izdavanja = new LinkedList<Izdavanje>();

	public Knjiga(String ime, int godinaIzdanja, int ISBNBroJ) {
		super(brojac++);
		this.ime = ime;
		this.godinaIzdanja = godinaIzdanja;
		this.ISBNBroj = ISBNBroj;
		status = KnjigaStatus.SLOBODNA;
		System.out.println("Uspesno ste uneli knjigu.");
	}

	public Pisac getPisac() {
		return pisac;
	}

	public void dodajPisca(Pisac pisac) {
		this.pisac = pisac;
	}

	public void dodajIzdavanje(Izdavanje izdavanje) {
		izdavanja.add(izdavanje);
	}

	public KnjigaStatus getStatus() {
		return status;
	}

	public void setStatus(KnjigaStatus status) {
		this.status = status;
	}

	public void vratiKnjigu() {
		if (status == KnjigaStatus.IZNAJMLJENA) {
			status = KnjigaStatus.SLOBODNA;
			System.out.println("Uspesno ste vratili knjigu.");
			return;
		}
		System.out.println("Ne mozete vratiti knjigu. Status " + status);
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}

	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}

	public int getISBNBroj() {
		return ISBNBroj;
	}

	public void setISBNBroj(int iSBNBroj) {
		ISBNBroj = iSBNBroj;
	}

	public void listanjeIzdavanje() {
		for (Izdavanje izdavanje : izdavanja) {
			System.out.println(izdavanje);
		}
	}

	@Override
	public String toString() {
		return "Knjiga [ime=" + ime + ", godinaIzdanja=" + godinaIzdanja + ", ISBNBroj=" + ISBNBroj + ", pisac=" + pisac
				+ ", getId()=" + getId() + "]";
	}

}
