package AF;

import MetaActions.CancelMsg.*;
import MetaActions.DisplayMenu.*;
import MetaActions.EjectCard.*;
import MetaActions.EnterPinMsg.*;
import MetaActions.GasPumpedMsg.*;
import MetaActions.InitializeData.*;
import MetaActions.PayMsg.*;
import MetaActions.PrintReceipt.*;
import MetaActions.PumpGasUnit.*;
import MetaActions.RejectMsg.*;
import MetaActions.ReturnCash.*;
import MetaActions.SetInitialValues.*;
import MetaActions.SetPrice.*;
import MetaActions.SetW.*;
import MetaActions.StoreCash.*;
import MetaActions.StorePin.*;
import MetaActions.StorePrices.*;
import MetaActions.WrongPinMsg.*;
import Data.*;

//This contains all concrete factory methods for GP1.
// meta-actions
public class GP1Factory extends AbstractFactory {
	// Gas Pump 1 associated data structure
	public GP1Factory(DataStore d) {
		this.dataStore = d;
	}

	
	public StorePrices GetStorePrices() {
		return new StorePrices1(this.dataStore);
	}

	public PayMsg GetPayMsg() {
		return new PayMsg1();
	}

	public StoreCash GetStoreCash() {
		return new StoreCash1(this.dataStore);
	}

	public DisplayMenu GetDisplayMenu() {
		return new DisplayMenu1();
	}

	public RejectMsg GetRejectMsg() {
		return new RejectMsg1();
	}

	public SetPrice GetSetPrices() {
		return new SetPrice1();
	}

	public SetInitialValues GetSetInitialValues() {
		return new SetInitialValues1(this.dataStore);
	}

	public PumpGasUnit GetPumpGasUnit() {
		return new PumpGasUnit1(this.dataStore);
	}

	public GasPumpedMsg GetGasPumpedMsg() {
		return new GasPumpedMsg1(this.dataStore);
	}

	public PrintReceipt GetPrintReceipt() {
		return new PrintReceipt1(this.dataStore);
	}

	public CancelMsg GetCancelMsg() {
		return new CancelMsg1();
	}

	public ReturnCash GetReturnCash() {
		return new ReturnCash1(this.dataStore);
	}

	public WrongPinMsg GetWrongPinMsg() {
		return new WrongPinMsg1();
	}

	public StorePin GetStorePin() {
		return new StorePin1();
	}

	public EnterPinMsg GetEnterPinMsg() {
		return new EnterPinMsg1();
	}

	public InitializeData GetInitializeData() {
		return new InitializeData1();
	}

	public SetW GetSetW() {
		return new SetW1(this.dataStore);
	}

	public EjectCard GetEjectCard() {
		return new EjectCard1();
	}

}