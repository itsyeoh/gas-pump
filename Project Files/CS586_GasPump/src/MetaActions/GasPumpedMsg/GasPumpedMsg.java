package MetaActions.GasPumpedMsg;
import Data.*;

//All of the methods here are implemented using Strategy pattern.

public abstract class GasPumpedMsg {
	DataStore d;
	public GasPumpedMsg() { }
	public GasPumpedMsg(DataStore d) { this.d = d; }
	public abstract void GasPumpedMsg();
}
