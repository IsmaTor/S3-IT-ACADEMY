package S3T1N1E1;

import java.util.ArrayList;
import java.util.Scanner;

public class Undo {
	
	private static Scanner entrada = new Scanner(System.in);
	
	//variable
	private static Undo und;
	private ArrayList<String> historial = new ArrayList<String>();
	
	//constructor
	private Undo() {
		
	}
	
	//mètode Singleton
	public static synchronized Undo getInstance() { //només un subprocés pot accedir a aquest mètode una sola vegada.
		if(und == null) {
			und = new Undo();
		}
		return und;
	}
	
	//getter
	public ArrayList<String> getHistorial() {
		return historial;
	}
	
	//setter
	public void setHistorial(ArrayList<String> historial) {
		this.historial = historial;
	}
	
	//mètodes
	public void afegirOrdre() {
		
		String ordre;
		
		System.out.println("Afegix el nou ordre");
		ordre = entrada.next();
		
		if (historial.size() <= 0 || historial.size() > 0) {
			historial.add(ordre);
			System.out.println("Ordre afegida correctament.");
		} else {
			System.out.println("ERROR: Ordre no afegida.");
		}
	}
	
	public void mostrarOrdre() {
		
		if (historial.size() > 0)
		for (String comando : historial) {
			System.out.println(comando);
		}else {
			System.out.println("ERROR: Ordre no trobada.");
		}
	}
	
	public void eliminarOrdre() {//eliminar l'ultima posició
		
		int index = historial.size() - 1;
		historial.remove(index);
	}
}
