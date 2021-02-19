package MetaActions.SetW;
import Data.*;

public class SetW1 extends SetW {
	public SetW1(DataStore d) { super(d); }

	public void SetW(int w) {
		DS1 dataStore = (DS1) this.d;
		dataStore.w = w;
	}
}
