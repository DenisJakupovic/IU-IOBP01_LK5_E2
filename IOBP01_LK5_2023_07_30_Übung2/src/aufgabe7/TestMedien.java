package aufgabe7;

public class TestMedien {

	public static void main(String[] args) {
		Medium m1 = new Medium();
		m1.setTitel("Unbekanntes Medium");
		m1.setAnzahlExemplare(2);
		
		System.out.println("Medium: " + m1.getTitel() + " " + m1.getAnzahlExemplare());
		System.out.println("Medium: " + m1.getBeschreibung());
		
		Zeitschrift z1 = new Zeitschrift ();
		z1.setTitel("Java Spektrum");
		z1.setIssn("123-456-345-22");
		z1.setAnzahlExemplare(2);
		
		System.out.println (z1.getBeschreibung());
	}

}
