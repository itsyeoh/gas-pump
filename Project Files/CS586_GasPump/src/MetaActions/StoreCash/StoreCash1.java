package MetaActions.StoreCash;
import Data.*;
import AF.*;

public class StoreCash1 extends StoreCash {
	public StoreCash1(DataStore d) { super(d); }

	public void StoreCash() {
		DS1 dataStore = (DS1) this.d;
		dataStore.cash = dataStore.temp_c;
		System.out.println("Storing cash...");
	}
}
