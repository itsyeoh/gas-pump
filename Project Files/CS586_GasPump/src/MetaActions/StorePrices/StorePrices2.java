package MetaActions.StorePrices;
import Data.*;

public class StorePrices2 extends StorePrices {
	public StorePrices2(DataStore d) { super(d); }

	public void StorePrices() {
		DS2 dataStore = (DS2) this.d;
		dataStore.Rprice = dataStore.temp_a;
		dataStore.Dprice = dataStore.temp_b;
		dataStore.Sprice = dataStore.temp_c;
	}
}
