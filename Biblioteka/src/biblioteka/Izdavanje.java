package biblioteka;

import java.time.LocalDateTime;

public class Izdavanje extends AbstractEntity {
	private static int brojac = 0;
	private LocalDateTime datumIzdavanja;
	private LocalDateTime datumVracanjaKnjige;
	private Korisnik korisnik;
	private Knjiga knjiga;
	private StatusIzdavanja status;

	public Izdavanje(Korisnik korisnik, Knjiga knjiga) {
		super(brojac++);
		this.datumIzdavanja = LocalDateTime.now();
		this.korisnik = korisnik;
		this.knjiga = knjiga;
		knjiga.dodajIzdavanje(this);
		korisnik.dodajIzdavanje(this);
		
	}

	public LocalDateTime getDatumIzdavanja() {
		return datumIzdavanja;
	}

	public LocalDateTime getDatumVracanjaKnjige() {
		return datumVracanjaKnjige;
	}

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public Knjiga getKnjiga() {
		return knjiga;
	}

	public StatusIzdavanja getStatus() {
		return status;
	}

	public void Vracanje() {
		datumVracanjaKnjige = LocalDateTime.now();
		knjiga.setStatus(KnjigaStatus.SLOBODNA);
		status = StatusIzdavanja.VRACEN;
	}

	@Override
	public String toString() {
		return "Izdavanje [datumIzdavanja=" + datumIzdavanja + ", korisnik=" + korisnik + ", knjiga=" + knjiga
				+ ", getId()=" + getId() + "]";
	}

}
