
public class Klaa {
	private String tekst;

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public Klaa(String tekst) {
		this.tekst = tekst;
	}
	
	public void funkcja() {
		int liczba;
		int suma = 0;
		char tmp;
		for(int i = 0; i < tekst.length(); i++) {
			if(!Character.isLetter(tekst.charAt(i)) && !Character.isWhitespace(tekst.charAt(i))) {
				//System.out.println(tekst.charAt(i));
				liczba = Character.getNumericValue(tekst.charAt(i));
				//System.out.println(liczba);
				suma = suma + liczba;
			}
		}
		System.out.println(suma);
	}
}
