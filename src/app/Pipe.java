/**
 * 
 */
package app;

/**
 * @author Lydia
 *
 */
public class Pipe extends Component {
	

	/**
	 * 
	 */
	public Pipe(double p) {
		super(p);
	}
	
	public double getPressure() {
		return super.getPressure() * -1;
	}

}
