package S3T1N2E1;

public class GestorFactoryAdreces extends AbstractFactory {

	@Override
	public Adreces getAdreces(String adreces) {
		// TODO Auto-generated method stub
		if (adreces.equalsIgnoreCase("NACIONAL")) {
			return new AdreceNacional(adreces);
		} else if (adreces.equalsIgnoreCase("INTERNACIONAL")) {
			return new AdreceInternacional(adreces);
		}
		return null;
	}

	@Override
	Telefons getTelefons(String telefons) {
		// TODO Auto-generated method stub
		return null;
	}
}
