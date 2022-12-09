package jaxwsservice;

import javax.xml.ws.Endpoint;

/** Java 6 and later allow simple web services to be
 * "deployed" using just the Java SE. So just run this!
 * No need to make up a war structure, two config files,
 * jar up and deploy.
 */
public class ServiceMain {
	
	public static void main(String[] args) {
		// tag::main[]
		// Create the "service stub"
		Calc impl = new Calc();
		// Start the service running
		Endpoint ep =
			Endpoint.publish("http://localhost:7094/calc", impl);
		System.out.println("Endpoint running: " + ep);
		// end::main[]

	}
}
