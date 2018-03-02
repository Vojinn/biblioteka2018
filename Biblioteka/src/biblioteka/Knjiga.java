package biblioteka;

public class Knjiga {
	
	private String naslov;
	private String isbn;
	private String autori;	
	private String izdavac;	
	private int izdanje;
	public String getNaslov() {
		return naslov;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getAutori() {
		return autori;
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
	public void setAutori(String autori) {
		this.autori = autori;
	}
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}
	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}
	
	
}
