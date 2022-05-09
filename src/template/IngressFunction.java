import aeonics.data.*;
import aeonics.util.*;
import aeonics.data.ingress.BasicIngress;
import java.util.function.Supplier;

public class IngressFunction extends BasicIngress implements Supplier<Ingress>
{
	public Ingress get()
	{
		Function f = new Function();
		f.decode(Data.emptyMap()
			.put("name", "Function name")
			.put("topic", "[name of topic to publish in]")
		);
		return f;
	}
	
	public Message get()
	{
		// YOUR CODE HERE
		Message message = Factory.of(Message.class).produce(Message.class, Data.empty());
		message.put("key", "value");
		return message;
	}
}
