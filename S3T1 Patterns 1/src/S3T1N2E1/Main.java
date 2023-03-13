package S3T1N2E1;

import java.util.Scanner;

public class Main {
	private static Scanner entrada = new Scanner(System.in);
	
	private static Agenda agenda = new Agenda();
	
	private static AbstractFactory factory;
	@SuppressWarnings("unused")
	private static Telefons nouTelefon;
	@SuppressWarnings("unused")
	private static Adreces novaAdreca;
	
	private static String tipus;
	
	public static void afegirTelefon() {
		String numTlf;
		
		System.out.println("Introdueix el número de telèfon: ");
		numTlf = entrada.next();
		System.out.println("Introdueix el tipus de número: NACIONAL o INTERNACIONAL");
		tipus = entrada.next();
		factory = ProduccioFactory.getFactory("TELEFON");
		nouTelefon = factory.getTelefons(tipus);
		agenda.afegir(numTlf);
	}
	
	public static void afegirAdreca() {
		String adreca;
		
		System.out.println("Introdueix la adreça: ");
		adreca = entrada.next();
		System.out.println("Introdueix el tipus de client: NACIONAL o INTERNACIONAL");
		tipus = entrada.next();
		factory = ProduccioFactory.getFactory("ADRECA");
		novaAdreca = factory.getAdreces(tipus);
		agenda.afegir(adreca);
	}

	public static void main(String[] args) {
		int opcio = 0;
		
		try {
			do {
				System.out.println("Introdueix la opció: \n"
						+ "1. Afegir número de telèfon: \n"
						+ "2. Afegir adreça: \n"
						+ "0. Sortir.");
				
				opcio = entrada.nextInt();
				
				switch (opcio) {
				case 1:
					afegirTelefon();
					break;
				case 2:
					afegirAdreca();
					break;
				case 0: 
					System.out.println("Adeu.");
					break;
				default:
					System.out.println("ERROR: La opció no es correcte.");
					break;
				}
			
			}while (opcio != 0);
			
		} catch (Exception ex) {
			System.out.println("ERROR: Ordre no suportada, només introduir números.");
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
