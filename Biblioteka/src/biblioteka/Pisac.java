package biblioteka;

import java.util.LinkedList;
import java.util.List;

public class Pisac extends AbstractEntity {

	private static int brojac = 0;
	private String ime;
	private String prezime;
	private String zemljaRodjenja;
	private int godinaRodjenja;
	private List<Knjiga> knjige = new LinkedList<Knjiga>();

	public Pisac(String ime, String prezime, String zemljaRodjenja, int godinaRodjenja) {
		super(brojac++);
		this.ime = ime;
		this.prezime = prezime;
		this.zemljaRodjenja = zemljaRodjenja;
		this.godinaRodjenja = godinaRodjenja;
		System.out.println("Uspesno ste uneli pisca.");
	}
	public void dodajKnjigu(Knjiga knjiga) {
		knjige.add(knjiga);
	}
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getZemljaRodjenja() {
		return zemljaRodjenja;
	}

	public void setZemljaRodjenja(String zemljaRodjenja) {
		this.zemljaRodjenja = zemljaRodjenja;
	}

	public int getGodinaRodjenja() {
		return godinaRodjenja;
	}

	public void setGodinaRodjenja(int godinaRodjenja) {
		this.godinaRodjenja = godinaRodjenja;
	}

	public void listanjeKnjiga() {
		for (Knjiga knjiga : knjige) {
			System.out.println(knjiga);
		}
	}

	@Override
	public String toString() {
		return "Pisac [ime=" + ime + ", prezime=" + prezime + ", zemljaRodjenja=" + zemljaRodjenja + ", godinaRodjenja="
				+ godinaRodjenja + ", knjige=" + knjige + ", getId()=" + getId() + "]";
	}

}
