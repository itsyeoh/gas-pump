package MetaActions.EjectCard;
import Data.*;

//All of the methods here are implemented using Strategy pattern.

public class EjectCard2 extends EjectCard {
	
	public EjectCard2(DataStore d) { super(d); }

	// Reset all card information in the GP2 system
	public void EjectCard() {
		DS2 dataStore = (DS2)this.d;
		dataStore.pin = "";
		dataStore.temp_p = "";
	}
}
