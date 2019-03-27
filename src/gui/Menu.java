package gui;
import java.awt.*;
	import java.awt.event.ActionListener;

	import javax.swing.*;
	import javax.swing.border.TitledBorder;

	public class Menu extends JFrame{
		
		private JPanel panel,panel1,panel2,panel3,panel4;
		private JTextField field1, field2;
		@SuppressWarnings("rawtypes")
		private JComboBox choice;
		private JLabel result;
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		public Menu() {
			
			panel = new JPanel();
			panel.setLayout(new GridLayout(4,0,0,70));
			
			
			field1 = new JTextField("");
			panel1=new JPanel();
			panel1.setBorder(new TitledBorder("Introduceti primul polinom"));
			panel1.setLayout(new GridLayout(1,1));
			panel1.add(field1);
			
			
			
			field2 = new JTextField("");
			panel2=new JPanel();
			panel2.setBorder(new TitledBorder("Introduceti al doilea polinom"));
			panel2.setLayout(new GridLayout(1,1));
			panel2.add(field2);
			
			panel3 = new JPanel();
			panel3.setBorder(new TitledBorder("Alegeti o operatie"));
			choice = new JComboBox(new String[] {"Alege Operatia", "Adunare", "Scadere", "Inmultire", "Derivare Polinom 1","Derivare Polinom 2"});						
			panel3.add(choice);
			
			
			panel4 = new JPanel();
			panel4.setBorder(new TitledBorder("Rezultatul"));
			result = new JLabel("Rezultatul");
			panel4.add(result);
			
			
			
			panel.add(panel1);
			panel.add(panel2);
			panel.add(panel3);
			panel.add(panel4);
			
			
			this.setSize(500, 500);
			this.add(panel);
			this.setVisible(true);
		}
		
		
		public String getPolinom1() {
			return field1.getText();
		}
		
		public String getPolinom2() {
			return field2.getText();
		}
		
		public void setRezultat(String string) {
			this.result.setText(string);
		}
		
		public void adaugaAscultator(ActionListener a) {
			choice.addActionListener(a);
			
		}
		
		
		public String getAlegere() {
			return choice.getSelectedItem().toString();
		}
		
		
	}
