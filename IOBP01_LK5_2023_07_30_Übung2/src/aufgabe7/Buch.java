package aufgabe7;

public class Buch extends Medium{
	private String isbn;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBeschreibung ()
	{
		return "Buch: " + super.getBeschreibung() + ", ISBN;" + isbn;
	}
}
