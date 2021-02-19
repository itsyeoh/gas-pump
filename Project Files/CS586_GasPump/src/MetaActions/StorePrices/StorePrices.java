package MetaActions.StorePrices;
import Data.*;

public abstract class StorePrices {
	DataStore d;
	public StorePrices() { }
	public StorePrices(DataStore d) { 
		System.out.println("received");
		this.d = d; }
	
	public abstract void StorePrices();
}
