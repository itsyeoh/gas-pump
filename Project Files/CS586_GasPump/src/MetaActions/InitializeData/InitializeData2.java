package MetaActions.InitializeData;
import Data.*;

//All of the methods here are implemented using Strategy pattern.

public class InitializeData2 extends InitializeData {
	public InitializeData2(DataStore d) { super(d); }

	public void InitializeData() {
		DS2 dataStore = (DS2)this.d;
		dataStore.price = 0;
	}
}
