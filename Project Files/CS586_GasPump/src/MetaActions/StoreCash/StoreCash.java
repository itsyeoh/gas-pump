package MetaActions.StoreCash;
import Data.*;

public abstract class StoreCash {
	DataStore d;
	public StoreCash(DataStore d) { d = this.d; }
	
	public abstract void StoreCash();
}
