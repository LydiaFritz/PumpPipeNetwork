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
		for(var v : myNetwork) {
			totPressure += v.getPressure();
		}
		return totPressure;
	}
	
	public void addComponent(Component c) {
		myNetwork.add(c);
	}
	
	
}
