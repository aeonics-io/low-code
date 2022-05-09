import aeonics.data.*;
import aeonics.util.*;
import java.util.function.Supplier;

public class Function extends Item.Abstract implements Regress, Supplier<Regress>
{
	public Regress get()
	{
		Function f = new Function();
		f.decode(Data.emptyMap().put("name", "Function name"));
		return f;
	}
	
	public Message apply(Message message)
	{
		// YOUR CODE HERE
		message.put("key", "value");
		return null;
	}
}
