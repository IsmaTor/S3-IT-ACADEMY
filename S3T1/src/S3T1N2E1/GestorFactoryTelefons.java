package S3T1N2E1;

public class GestorFactoryTelefons extends AbstractFactory {

	@Override
	Telefons getTelefons(String numeros) {
		// TODO Auto-generated method stub
		if (numeros.equalsIgnoreCase("NACIONAL")) {
			return new TelefonsNacional(numeros);
		} else if (numeros.equalsIgnoreCase("INTERNACIONAL")) {
			return new TelefonsInternacional(numeros);
		}
		return null;
	}

	@Override
	Adreces getAdreces(String adreces) {
		// TODO Auto-generated method stub
		return null;
	}
}
