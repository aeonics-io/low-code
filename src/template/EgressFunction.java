import aeonics.data.*;
import aeonics.util.*;
import java.util.function.Supplier;

public class EgressFunction extends Item.Abstract implements Egress, Supplier<Egress>
{
	public Egress get()
	{
		Function f = new Function();
		f.decode(Data.emptyMap().put("name", "Function name"));
		return f;
	}
	
	public void accept(Message message)
	{
		// YOUR CODE HERE
		System.out.println(message);
	}
}
