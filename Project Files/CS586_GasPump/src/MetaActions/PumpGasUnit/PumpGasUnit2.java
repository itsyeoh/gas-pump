package MetaActions.PumpGasUnit;
import Data.*;


//All of the methods here are implemented using Strategy pattern.
public class PumpGasUnit2 extends PumpGasUnit {
	public PumpGasUnit2(DataStore d) { super(d); }

	public void PumpGasUnit() {
		DS2 dataStore = (DS2)this.d;
		dataStore.G += 1;
		dataStore.total += dataStore.price;
	}
}
