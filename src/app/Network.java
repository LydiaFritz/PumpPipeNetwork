/**
 * 
 */
package app;

import java.util.ArrayList;

/**
 * @author Lydia
 *
 */
public class Network {

	private ArrayList<Component> myNetwork;
	
	/**
	 * Construct an empty network
	 */
	public Network() {
		myNetwork = new ArrayList<Component>();
	}
	
	/**
	 * 
	 * @return
	 * calculate and return the total network pressure
	 */
	public double getNetworkPressure() {
		double totPressure = 0.0;
		
		//******************
		//c is polymorphic
		//******************
		for(Component c : myNetwork) {
			totPressure += c.getPressure();
		}
		return totPressure;
	}
	
	public void addComponent(Component c) {
		//output added to illustrate
		//polymorphic variable c in action
		if(c instanceof Pump)
			System.out.println("adding pump: +" + c.getPressure() + " psi." );
		else if(c instanceof Pipe)
			System.out.println("adding pipe: " + c.getPressure() + " psi.");
		
		myNetwork.add(c);
	}
	
	
}
