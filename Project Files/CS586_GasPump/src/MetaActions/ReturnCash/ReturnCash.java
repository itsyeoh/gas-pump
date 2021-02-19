package MetaActions.ReturnCash;
import Data.*;

//All of the methods here are implemented using Strategy pattern.
public abstract class ReturnCash {
	DataStore d;
	
	public ReturnCash() { }
	public ReturnCash(DataStore d) { this.d = d; }
	public abstract void ReturnCash();
}