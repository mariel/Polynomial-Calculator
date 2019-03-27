import aplicatie.*;
import gui.*;

import controller.*;

public class Main {

	public static void main(String[] args) {
		
		
		Menu view = new Menu();
		Model model = new Model();
		@SuppressWarnings("unused")
		Controller controller= new Controller(view, model);
		
		
	}
} 

