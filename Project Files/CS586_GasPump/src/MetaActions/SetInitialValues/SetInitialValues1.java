package MetaActions.SetInitialValues;
import Data.*;

public class SetInitialValues1 extends SetInitialValues {
	public SetInitialValues1(DataStore d) {
		super(d);
	}

	public void SetInitialValues() {
		DS1 dataStore = (DS1) this.d;
		dataStore.L = dataStore.total = 0;
		
	}
}
