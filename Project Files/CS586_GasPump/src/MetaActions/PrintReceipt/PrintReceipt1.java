package MetaActions.PrintReceipt;
import Data.*;
//All of the methods here are implemented using Strategy pattern.


public class PrintReceipt1 extends PrintReceipt {
	public PrintReceipt1(DataStore d) { super(d); }

	public void PrintReceipt() {
		DS1 dataStore = (DS1)this.d;
		System.out.println("[RECEIPT]");
		System.out.println("Liters pumped: " + dataStore.L);
		System.out.println("Price/liter: $" + dataStore.price);
		System.out.println("Total price: $" + dataStore.total);
	}
}