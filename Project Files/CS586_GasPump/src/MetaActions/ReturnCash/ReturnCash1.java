package MetaActions.ReturnCash;
import Data.*;

//All of the methods here are implemented using Strategy pattern.
public class ReturnCash1 extends ReturnCash {
	public ReturnCash1(DataStore d) { super(d); }

	public void ReturnCash() {
		DS1 dataStore = (DS1)this.d; 
		int returnCash = dataStore.cash - dataStore.total;
		System.out.println("Returned cash is " + returnCash);
	}
}
