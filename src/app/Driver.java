package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		
		//create a network 
		Network n = new Network();
		
		//a component reference 
		Component c;
		  
		//Scanner to read from a file 
		Scanner fin = new Scanner(new  File("network_long.in")); 
		
		//test read from file 
		while(fin.hasNext()) { 
			//get the char 
			char ch = fin.next().charAt(0);
		    //is it a pump or pipe?
			if(ch == 'U')
				//it's a pump, initialize c as a pump
				c  = new Pump(fin.nextDouble()); 
			else //initialize c as a pipe
				c = new  Pipe(fin.nextDouble());
		  
			//add this component to the network
			n.addComponent(c); 
			//see updated pressure on the network 
			double pressure = n.getNetworkPressure();
			System.out.printf("The current pressure on the network is %.3f\n", pressure);
		  } 
				
	}

}
