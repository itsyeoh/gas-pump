package MetaActions.StorePrices;
import Data.*;

public class StorePrices1 extends StorePrices{
	public StorePrices1(DataStore d) { super(d); }

	public void StorePrices() {
		DS1 dataStore = (DS1) this.d;
		dataStore.price = dataStore.temp_a;
	}
}
