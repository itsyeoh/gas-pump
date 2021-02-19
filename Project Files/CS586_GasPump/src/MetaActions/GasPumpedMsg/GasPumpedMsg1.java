package MetaActions.GasPumpedMsg;
import Data.*; 

//All of the methods here are implemented using Strategy pattern.

public class GasPumpedMsg1 extends GasPumpedMsg {
	public GasPumpedMsg1(DataStore d) { this.d = d; }

	public void GasPumpedMsg() {
		DS1 dataStore = (DS1)this.d;
		System.out.println("The system pumped " + dataStore.L + " liters.");
	}
}
