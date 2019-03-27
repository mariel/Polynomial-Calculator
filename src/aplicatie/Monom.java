package aplicatie;

public class Monom implements Comparable<Monom>{

	private int coeficient;
	private int putere;
	
	public Monom(int coeficient, int putere) {
		this.coeficient = coeficient;
		this.putere = putere;
	}
	
	public int getPutere() {
		return putere;
	}
	
	public int getCoeficient() {
		return coeficient;
	}
	
	public void adunare(int x) {
		coeficient += x;
	}
	
	public void scadere(int x) {
		coeficient = coeficient - x;
	}

	@Override
	public int compareTo(Monom a) {
		return a.putere-this.putere; 
	}
	
	public String toString() {
		String s="";
		if (coeficient == 0)
			return s;
		else {
			if ( coeficient > 0)
				s += " +";
			s += coeficient;
			s += "x^";
			s += putere;
		}
		
		return s;
		
	}
	
	public void schimbaSemn() {
		coeficient =- coeficient;
	}
	
	
	
}
