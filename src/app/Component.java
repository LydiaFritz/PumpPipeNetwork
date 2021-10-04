/**
 * 
 */
package app;

/**
 * @author Lydia
 * parent class for the Pump and Pipe class
 */
public abstract class Component {
	
	private double pressure;
	
	/**
	 * 
	 * @param pressure
	 * Initializes the pressure for this component
	 * Pipe 'pressure' is the length of the pipe
	 * Pump pressure is the pressure added by the pump
	 */
	public Component(double pressure) {this.pressure = pressure;}
		
	/**
	 * 
	 * @return
	 * the pressure of the component
	 */
	public double getPressure() {return pressure;}
}
