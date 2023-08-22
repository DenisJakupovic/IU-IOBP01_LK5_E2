package aufgabe9;

public class Zeitschrift extends Medium{
	private String issn;

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public String getBeschreibung ()
	{
		return "Zeitschrift: " + super.getBeschreibung() + ", ISSN;" + issn;
	}
}
