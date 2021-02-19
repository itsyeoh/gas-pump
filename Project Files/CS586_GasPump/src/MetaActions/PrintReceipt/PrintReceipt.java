package MetaActions.PrintReceipt;
import Data.*;

//All of the methods here are implemented using Strategy pattern.

public abstract class PrintReceipt {
	DataStore d;
	public PrintReceipt() { }
	public PrintReceipt(DataStore d) { this.d = d; }
	public abstract void PrintReceipt();
}
