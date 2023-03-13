package S3T2N2E1;

import java.util.Scanner;

public class MainBotiga {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			
			MetodePagament tpv = new MetodePagament();

			// Asignem un pagament a tpv
			ComteCorrent comteCorrent = new ComteCorrent(tpv);
			CreditCard creditCard = new CreditCard(tpv);
			PayPal payPal = new PayPal(tpv);

			// pagament

			int opcio = 0;

			try {
				do {
					System.out.println("Escull mètode de pagament: \n" 
							+ "1. ComteCorrent \n" 
							+ "2. Targeta de Crèdit \n"
							+ "3. PayPal \n" 
							+ "0. Sortir / Finalitzar compra.");

					opcio = entrada.nextInt();

					switch (opcio) {
					case 1:
						comteCorrent.pasarellaPagament();
						break;
					case 2:
						creditCard.pasarellaPagament();
						break;
					case 3:
						payPal.pasarellaPagament();
					case 0:
						System.out.println("Adeu.");
						break;
					default:
						System.out.println("ERROR: Opció no valida.");
						break;
					}
				} while (opcio != 0);
				
			} catch (Exception ex) {
				System.out.println("ERROR: Ordre no suportada, només introduir números.");
			}
		}

		// TODO Auto-generated method stub
	}
}
