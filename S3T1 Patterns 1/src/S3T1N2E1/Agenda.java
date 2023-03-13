package S3T1N2E1;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<String> agenda = new ArrayList<String>();

	public void afegir(String afegir) {
		
		if (agenda.size() <= 0 || agenda.size() > 0) {
			agenda.add(afegir);
			System.out.println("Objecte afegit correctament.");
		} else {
			System.out.println("ERROR: L'objecte no s'ha pogut afegir.");
		}
	}
}
