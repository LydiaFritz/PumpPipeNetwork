/**
 * 
 */
package app;

/**
 * @author Lydia
 *
 */
public abstract class Component {
	
	private double pressure;
	
	public Component(double pressure) {this.pressure = pressure;}
		
	public double getPressure() {return pressure;}
}
