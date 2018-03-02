package biblioteka;

public class Knjiga {
	
	private String naslov;
	private String isbn;
	private String izdavac;	
	private int izdanje;
	private Autor[] autori;
	
	
	
	public Autor[] getAutori() {
		return autori;
	}
	public void setAutori(Autor[] autori) {
		this.autori = autori;
	}
	public String getNaslov() {
		return naslov;
	}
	public String getIsbn() {
		return isbn;
	}
	
	public String getIzdavac() {
		return izdavac;
	}
	public int getIzdanje() {
		return izdanje;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}
	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}
	
	
}
