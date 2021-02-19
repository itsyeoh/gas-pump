package MetaActions.SetInitialValues;
import Data.*;

public class SetInitialValues2 extends SetInitialValues {
	public SetInitialValues2(DataStore d) { super(d); }

	public void SetInitialValues() {
		DS2 dataStore = (DS2) this.d;
		dataStore.G = 0;
		dataStore.total = 0;
	}
}
