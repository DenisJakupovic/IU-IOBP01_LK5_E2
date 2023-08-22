package aufgabe9;

public class Medium {
	private String titel;
	private int anzahlExemplare;

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public int getAnzahlExemplare() {
		return anzahlExemplare;
	}

	public void setAnzahlExemplare(int anzahlExemplare) {
		this.anzahlExemplare = anzahlExemplare;
	}
	
	public String getBeschreibung ()
	{
		return "Titel: " + titel + ", Anzahl Exemplare: " + anzahlExemplare;
	}
}
