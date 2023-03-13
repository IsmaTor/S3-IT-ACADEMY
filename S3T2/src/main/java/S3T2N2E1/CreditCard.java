package S3T2N2E1;

import java.util.Scanner;

public class CreditCard implements Pasarella {
	Scanner entrada = new Scanner(System.in);

	private MetodePagament pagament;

	// constructor
	public CreditCard(MetodePagament pago) {
		pagament = pago;
	}

	@Override
	public void pasarellaPagament() {
		int pin = 1234;
		int cont = 0;
		int intents;

		System.out.println("Realitzant pagament amb targeta de crèdit, un moment si us plau...\n");
		try {
			do {
				System.out.println("Introdueixi PIN de la seva targeta de crèdit: \n");
				intents = entrada.nextInt();

				if (intents == pin) {
					System.out.println("PIN CORRECTE.");
					cont = 3;
					pagament.compra();
				} else {
					System.out.println("PIN INCORRECTE.");
					cont = cont + 1;
					if (cont == 3) {
						System.out.println("Targeta de crèdit bloquejada, si us plau poseu-vos en contacte amb el vostre banc.");
					} else if (cont == 1) {
						System.out.println("Quedan 2 intents");
					} else if (cont == 2) {
						System.out.println("Queda 1 intent");
					}
				}
			} while (cont < 3);

		} catch (Exception ex) {
			System.out.println("ERROR: Ordre no suportada, només introduir números.");
		}
	}
}