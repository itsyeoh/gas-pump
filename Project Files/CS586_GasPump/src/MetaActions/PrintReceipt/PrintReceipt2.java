package MetaActions.PrintReceipt;
import Data.*;

//All of the methods here are implemented using Strategy pattern.

public class PrintReceipt2 extends PrintReceipt {
	public PrintReceipt2(DataStore d) { super(d); }

	public void PrintReceipt() {
		DS2 dataStore = (DS2)this.d;
		System.out.println("[RECEIPT]");
		System.out.println("Gallons pumped: " + dataStore.G);
		System.out.println("Price/gallon: $" + dataStore.price);
		System.out.println("Total price: $" + dataStore.total);
	}
}