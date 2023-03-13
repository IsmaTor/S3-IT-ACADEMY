package S3T2N1E1;

import java.util.Scanner;

public class Agencia implements Observador {
	
	Scanner entrada = new Scanner(System.in);
	
	private String avis;

	//constructor
	public Agencia () {
		
	}

	@Override
	public void update() {
		System.out.println("Notificar l'estat de les accions: PUJANT o BAIXANT");
		avis = entrada.nextLine();
			// TODO Auto-generated method stub
			if (avis.equalsIgnoreCase("PUJANT")) {
				System.out.println("Les accions estàn pujant.");
			} else if (avis.equalsIgnoreCase("BAIXANT")) {
				System.out.println("Les accions estàn baixant.");
			}
		}
		// TODO Auto-generated method stub
}
