package MetaActions.InitializeData;
import Data.*;

//All of the methods here are implemented using Strategy pattern.

public abstract class InitializeData {
	DataStore d;
	public InitializeData() { }
	public InitializeData(DataStore d) { this.d = d; }
	public abstract void InitializeData();
}
