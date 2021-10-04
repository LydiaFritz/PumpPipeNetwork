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
	 * @param p
	 * p is length of pipe
	 * p represents the reduction
	 * in pressure supplied by this pipe
	 */
	public Pipe(double p) {
		super(p);
	}

	/**
	 * return the length of pipe * -1
	 */
	public double getPressure() {
		return super.getPressure() * -1;
	}

}
