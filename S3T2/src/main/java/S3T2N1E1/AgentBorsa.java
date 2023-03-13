package S3T2N1E1;

import java.util.ArrayList;

public class AgentBorsa implements Observable {
	
	private ArrayList<Observador> agents;
	
	//constructor
	public AgentBorsa() {
		agents = new ArrayList<Observador>();
	}
	
	public void notificarAccions() {
		
		notificar();
	}
	
	public void enllacarAgents(Observador obj) {
		agents.add(obj);
	}

	@Override
	public void notificar() {
		for(Observador ob : agents) {
			ob.update();
		}
		// TODO Auto-generated method stub
	}
}
