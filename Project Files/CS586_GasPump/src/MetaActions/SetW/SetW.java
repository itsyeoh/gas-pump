package MetaActions.SetW;
import Data.*; 

public abstract class SetW {
	DataStore d;
	public SetW() {
		
	}
	
	public SetW(DataStore d) {
		this.d = d;
	}
	
	public abstract void SetW(int w);
}
