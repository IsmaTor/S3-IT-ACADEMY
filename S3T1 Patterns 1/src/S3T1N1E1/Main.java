package S3T1N1E1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			
			int opcio = 0;
			
			Undo history = Undo.getInstance();
			
			do {
				System.out.println("Escogeix una opció: \n" 
						+ "1. Afegeix ordre \n"
						+ "2. Mostrar ordre \n"
						+ "3. Eliminar ordre \n"
						+ "0. Sortir");
				opcio = entrada.nextInt();
				
				switch (opcio) {
				case 1:
					history.afegirOrdre();
					break;
				
				case 2:
					history.mostrarOrdre();
					break;
					
				case 3:
					history.eliminarOrdre();
					break;
				
				case 0:
					System.out.println("Adeu");
					break;
					
				default: 
					System.out.println("La opció no es correcta");
					break;
				}
				
			} while (opcio != 0);
			
		} catch (Exception ex) {
			System.out.println("ERROR: Ordre no suportada, només introduir números.");
		}
		
		// TODO Auto-generated method stub
	}

}
