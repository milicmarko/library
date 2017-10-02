package biblioteka;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Korisnik extends AbstractEntity {

	private static int brojac = 0;
	private String ime;
	private String Prezime;
	private String email;
	private int brojClanskeKartice;
	private List<Izdavanje> izdavanja = new LinkedList<Izdavanje>();

	public Korisnik(String ime, String prezime, String email, int brojClanskeKartice) {
		super(brojac++);
		this.ime = ime;
		Prezime = prezime;
		this.email = email;
		this.brojClanskeKartice = brojClanskeKartice;
		System.out.println("Uspesno ste kreirali korisnika.");
	}

	public void dodajIzdavanje(Izdavanje izdavanje) {
		izdavanja.add(izdavanje);
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return Prezime;
	}

	public void setPrezime(String prezime) {
		Prezime = prezime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBrojClanskeKartice() {
		return brojClanskeKartice;
	}

	public void setBrojClanskeKartice(int brojClanskeKartice) {
		this.brojClanskeKartice = brojClanskeKartice;
	}

	public void listanjeIzdavanja() {
		for (Izdavanje izdavanje : izdavanja) {
			System.out.println(izdavanje);
		}
	}

	public void spornaIznajmljivanja() {
		for (Izdavanje izdavanje : izdavanja) {
			if (izdavanje.getStatus().equals(StatusIzdavanja.U_TOKU)) {
				if (izdavanje.getDatumVracanjaKnjige().compareTo(LocalDateTime.now().minusMonths(1)) < 0)
					System.out.println(izdavanje);
			}
		}
	}

	@Override
	public String toString() {
		return "Korisnik [ime=" + ime + ", Prezime=" + Prezime + ", email=" + email + ", brojClanskeKartice="
				+ brojClanskeKartice + ", getId()=" + getId() + "]";
	}

}
