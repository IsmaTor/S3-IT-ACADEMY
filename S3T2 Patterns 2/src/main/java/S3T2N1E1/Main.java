package S3T2N1E1;

public class Main {

	public static void main(String[] args) {
		
		AgentBorsa agent = new AgentBorsa();
		
		Agencia agencia = new Agencia();
		
		agent.enllacarAgents(agencia);
		
		agent.notificarAccions();
		
		// TODO Auto-generated method stub
	}
}
