package MetaActions.PayMsg;

import Data.DataStore;

//All of the methods here are implemented using Strategy pattern.

public class PayMsg1 extends PayMsg{
	public void PayMsg() {
		System.out.println("You could now select a payment method (2) or (6).");
	}
}
