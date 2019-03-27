import java.util.ArrayList;

import aplicatie.Monom;
import aplicatie.Polinom;

public class ImpartireString {

	
	public Polinom traducere_string(String str) {
		
		ArrayList<Monom> monoame = new ArrayList<>();
		String[] monoameImpartite = str.split(" ", 0);
		for (String a: monoameImpartite )
		{
			String[] divizareMonom = a.split("x\\^",0);
			monoame.add(new Monom(Integer.parseInt(divizareMonom[0]),Integer.parseInt(divizareMonom[1])));	
		}
		
	return new Polinom(monoame);
	
	}	
}
