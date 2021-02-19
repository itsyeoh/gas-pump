package MetaActions.PumpGasUnit;
import Data.*;


//All of the methods here are implemented using Strategy pattern.

public class PumpGasUnit1 extends PumpGasUnit {
	public PumpGasUnit1(DataStore d) { super(d); }

	public void PumpGasUnit() {
		DS1 dataStore = (DS1)this.d;
		dataStore.L += 1;
		dataStore.total += dataStore.price;
	}
}
