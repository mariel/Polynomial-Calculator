package aplicatie;

import java.util.ArrayList;
import java.util.Collections;

public class Polinom {

	private ArrayList<Monom> monoame;
	
	
	public Polinom(ArrayList<Monom> monoame) {
		this.monoame=monoame;
	}
	
	
	public String adunare(Polinom p){
		ArrayList<Monom> result = new ArrayList<>();
		int x=-1;
		
		eticheta:for(Monom i: this.monoame) {
					for(Monom j: p.monoame )
						if ( i.getPutere() == j.getPutere() ) {
							i.adunare(j.getCoeficient());
							x=p.monoame.indexOf(j);
						}
					if (x!=-1)
						p.monoame.remove(x);
					if(monoame.isEmpty() )
						break eticheta;
					
				}
		result.addAll(this.monoame);
		result.addAll(p.monoame);
		Collections.sort(result);
		return new Polinom(result).toString();
		
	}
	
	
	public String scadere(Polinom p){
		ArrayList<Monom> result = new ArrayList<>();
		int x;
		p.schimbaSemn();
		
		eticheta:for(Monom i: this.monoame) {
				x=-1;
				for(Monom j: p.monoame )
					if ( i.getPutere() == j.getPutere() ) {
							i.adunare(j.getCoeficient());
							x=p.monoame.indexOf(j);
					}
				if (x!=-1)
					p.monoame.remove(x);
				if(p.monoame.isEmpty() )
					break eticheta;
		}
		result.addAll(this.monoame);
		result.addAll(p.monoame);
		Collections.sort(result);
		return new Polinom(result).toString();
		
	}
	
	public String inmultire(Polinom p1) {
		
		ArrayList<Monom> rezultat=new ArrayList<>();
		
		for(Monom i:this.monoame)
			for(Monom j: p1.monoame)
				rezultat.add(new Monom( i.getCoeficient()*j.getCoeficient(), i.getPutere()+j.getPutere() ) );
		Polinom r=new Polinom(rezultat);
		 String s=r.adunaTermeniiAsemenea();
		 return s;
		
		
	}
	
	public String derivare(){
		ArrayList<Monom> rezultat = new ArrayList<>();
		for (Monom i: this.monoame)
			rezultat.add(new Monom(i.getCoeficient()*i.getPutere(), i.getPutere()-1));
		Polinom r= new Polinom(rezultat);
		return r.toString();
		
	}
	
	public String toString() {
		String rez="";
		for(Monom m:monoame)
			rez+=m.toString();
		return rez;
	}
	
	public void sortare() {
		Collections.sort(monoame);
	}
	
	public void schimbaSemn() {
		for(Monom m:monoame)
			m.schimbaSemn();
	}
	
	public String adunaTermeniiAsemenea() {
		ArrayList<Monom> copie=new ArrayList<>();
		copie.addAll(this.monoame);
		Polinom p1=new Polinom(copie);
 	    return this.adunare(p1);
	}
}
