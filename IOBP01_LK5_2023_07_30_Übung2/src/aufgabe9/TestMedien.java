package aufgabe9;

public class TestMedien {

	public static void main(String[] args) {
		Medium m1 = new Medium();
		m1.setTitel("Unbekanntes Medium");
		m1.setAnzahlExemplare(2);
		
		Buch b1 = new Buch ();
		b1.setTitel("C als erste Programmiersprache");
		b1.setIsbn("123-456-345-21");
		b1.setAnzahlExemplare(3);
		
		Zeitschrift z1 = new Zeitschrift ();
		z1.setTitel("Java Spektrum");
		z1.setIssn("123-456-345-22");
		z1.setAnzahlExemplare(2);
		
		Medium[] arr = new Medium[3];
		arr[0] = m1;
		arr[1] = b1;
		arr[2] = z1;
		
		for (Medium ref : arr) {
			System.out.println(ref.getBeschreibung());
		}
	}

}
