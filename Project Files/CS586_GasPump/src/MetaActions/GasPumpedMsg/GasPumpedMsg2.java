package MetaActions.GasPumpedMsg;
import Data.*;

//All of the methods here are implemented using Strategy pattern.

public class GasPumpedMsg2 extends GasPumpedMsg {
	public GasPumpedMsg2(DataStore d) { super(d); }

	public void GasPumpedMsg() {
		DS2 dataStore = (DS2)this.d;
		System.out.println("The system pumped " + dataStore.G + " gallons.");
	}
}
