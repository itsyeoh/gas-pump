package MetaActions.StorePin;
import Data.*;

public class StorePin2 extends StorePin {
	public StorePin2(DataStore d) { super(d); }
	public void StorePin() {
		DS2 dataStore = (DS2) this.d;
		dataStore.pin = dataStore.temp_p;
		System.out.println("Storing pin...");
	}
}
