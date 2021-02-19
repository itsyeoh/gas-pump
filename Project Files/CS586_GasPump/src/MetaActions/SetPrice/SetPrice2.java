package MetaActions.SetPrice;
import Data.*;
public class SetPrice2 extends SetPrice {
	public SetPrice2(DataStore d) { super(d); }

	public void SetPrice(int g) {
		DS2 dataStore = (DS2) this.d;
		
		if(g == 1) {	// selected Regular gas pricing
			dataStore.price = dataStore.Rprice;
		} else if (g == 2) { // selected super pricing
			dataStore.price = dataStore.Sprice;
		} else if (g == 3) { // selected Diesel pricing
			dataStore.price = dataStore.Dprice;
		}
		
	}
}
