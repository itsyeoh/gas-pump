package MetaActions.StorePin;
import Data.*;

public abstract class StorePin {
	DataStore d;
	public StorePin() {
		
	}
	
	public StorePin(DataStore d) {
		d = this.d;
	}
	
	public abstract void StorePin();
}
