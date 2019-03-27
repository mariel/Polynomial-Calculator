package aplicatie;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Model {
	
	public Polinom makePolinom(String str) {
		
		ArrayList<Monom> monoame = new ArrayList<>();
		Pattern pattern = Pattern.compile("([+-]?[^-+]+)");
		Matcher matcher = pattern.matcher(str);
		String s;
		int[] v;
		
		while( matcher.find() ) {
			 s=matcher.group(1);
			 v=split(s);
			 monoame.add(new Monom(v[0], v[1]));
			}
				
	Polinom p=new Polinom(monoame);
	return p;
	}	
		
		
	public int[] split(String str) {	
		
		int coeficient;
		int putere;
		String[] parti;
		
		if( str.contains("^") )
			{
				parti=str.split("x\\^");
				coeficient=Integer.parseInt(parti[0]);
				putere=Integer.parseInt(parti[1]);
			}
		else 
			if (str.contains("-x")) {
				coeficient=-1;
				putere=1;
			}
			else
				if ( str.contains("x"))
				{
					parti=str.split("x");
					coeficient=Integer.parseInt(parti[0]);
					putere=1;
				}
				else 
				{
					coeficient=Integer.parseInt(str);
					putere=0;
				
				}
		
		int[] v= new int[]{coeficient, putere};
		return v;
	}
	
}
