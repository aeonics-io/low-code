import aeonics.data.*;
import aeonics.util.*;
import java.util.function.Supplier;

public class RegressFunction extends Item.Abstract implements Regress, Supplier<Regress>
{
	/**
	 * This getter lets you build or set parameters for your Regress handler.
	 * In this simple case, we just return <code>this</code>.
	 *
	 * @return a valid Regress
	 */
	public Regress get() { return this; }
	
	/**
	 * Apply some processing on the provided message.
	 * You should alter the message in-place.
	 *
	 * @param message the input message
	 * @return <code>null</code> if the processing is complete and the next
	 *         Regress handler may continue processing after this one.
	 *         Return a Message instance (the one provided or a new one) to
	 *         stop the processing chain and directly output the supplied value.
	 * @throws RuntimeException if anything goes wrong. The message will be discarded
	 *         with the exception's message for explanation.
	 */
	public Message apply(Message message)
	{
		// YOUR CODE HERE
		message.put("key", "value");
		return null;
	}
}
