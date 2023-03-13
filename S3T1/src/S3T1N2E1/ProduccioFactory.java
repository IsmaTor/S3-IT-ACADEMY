package S3T1N2E1;

public class ProduccioFactory {
	
	public static AbstractFactory getFactory(String factory) {
		if (factory.equalsIgnoreCase("TELEFON")) {
			return new GestorFactoryTelefons();
		} else if (factory.equalsIgnoreCase("ADRECA")) {
			return new GestorFactoryAdreces();
		}
		return null;
	}
}
