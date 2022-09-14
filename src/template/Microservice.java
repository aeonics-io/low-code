import aeonics.rest.*;
import aeonics.data.*;
import aeonics.util.*;
import java.util.function.Supplier;

public class Microservice implements Supplier<RestEndpoint>
{
	/**
	 * This getter lets you build or set parameters for your RestEndpoint.
	 *
	 * @see the javadoc for details about the RestEndpoint
	 * @return a valid RestEndpoint
	 */
	public RestEndpoint get()
	{
		return new RestEndpoint("/test", "GET")
		{
			public Data handle(Data parameters)
			{
				// YOUR CODE HERE
				return Data.emptyMap();
			}
		}
		.add(new Parameter("name").optional(false).min(1).max(5));
	}
}
