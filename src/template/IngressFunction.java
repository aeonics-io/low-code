import aeonics.data.*;
import aeonics.util.*;
import aeonics.data.ingress.BasicIngress;
import java.util.function.Supplier;

public class IngressFunction extends BasicIngress implements Supplier<Ingress>
{
	/**
	 * This getter lets you build or set parameters for your Ingress handler.
	 * In this simple case, we just return <code>this</code>.
	 *
	 * @return a valid Ingress
	 */
	public Ingress get() { return this; }
	
	/**
	 * This method is called to initialize stuff.
	 * Example: open a network connection.
	 * (you may remove this method if you dont need it)
	 */
	public void beforeStart() { }
	
	/**
	 * This method is called to cleanup stuff.
	 * Example: close a network connection.
	 * (you may remove this method if you dont need it)
	 */
	public void afterStop() { }
	
	/**
	 * This method emits messages out of the blue.
	 * This method is called in an infinite loop, so it is your responsibility
	 * to <code>sleep()</code> or <code>wait()</code> as required.
	 *
	 * Example: read from the network
	 *
	 * @return Return a valid Message instance to inject in the system, or
	 *         <code>null</code> if there is nothing going on.
	 */
	public Message get() throws InterruptedException
	{
		// YOUR CODE HERE
		Thread.sleep(1000);
		Message message = new Message();
		message.put("time", System.currentTimeMillis());
		return message;
	}
}
