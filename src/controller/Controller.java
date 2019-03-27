package controller;
import gui.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import aplicatie.*;

public class Controller {
	
	private Menu view;
	private Model model;
	
	public Controller(Menu view, Model model) {
		this.view = view;
		this.model = model;
		this.view.adaugaAscultator(new Ascultator());
	}
	
	public class Ascultator implements ActionListener{

		String strp1, strp2, result;
		Polinom p1, p2;
		
		
		public void actionPerformed(ActionEvent e) {
			
			strp1=view.getPolinom1();
			strp2=view.getPolinom2();
			p1=model.makePolinom(strp1);
			p2=model.makePolinom(strp2);
			p1.sortare();
			p2.sortare();
					
			String choice =view.getAlegere();
				
			if (choice.equals("Adunare") )
				view.setRezultat(p1.adunare(p2));
						
			if(choice.equals("Scadere") )
				view.setRezultat(p1.scadere(p2));
					
			if(choice.equals("Inmultire") )
				view.setRezultat(p1.inmultire(p2));
					
			if(choice.equals("Derivare Polinom 1"))
				view.setRezultat(p1.derivare());
					
			if(choice.equals("Derivare Polinom 2"))  
				view.setRezultat(p2.derivare());
		}
	}
	
}

