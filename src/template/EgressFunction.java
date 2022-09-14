import aeonics.data.*;
import aeonics.util.*;
import java.util.function.Supplier;

public class EgressFunction extends Item.Abstract implements Egress, Supplier<Egress>
{
	/**
	 * This getter lets you build or set parameters for your Egress handler.
	 * In this simple case, we just return <code>this</code>.
	 *
	 * @return a valid Egress
	 */
	public Egress get() { return this; }
	
	/**
	 * This is a terminal operation.
	 * Do whatever you need with the input message.
	 *
	 * @param message the input message
	 * @throws RuntimeException if anything goes wrong. The message will be discarded
	 *         with the exception's message for explanation.
	 */
	public void accept(Message message)
	{
		// YOUR CODE HERE
		System.out.println(message);
	}
}
