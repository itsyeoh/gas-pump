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

//This contains all concrete factory methods for GP2.
// meta-actions
public class GP2Factory extends AbstractFactory {
	// Gas Pump 2 associated data structure
	public GP2Factory(DataStore d) {
		this.dataStore = d;
	}
	
	public StorePrices GetStorePrices() {
		return new StorePrices2(this.dataStore);
	}

	public PayMsg GetPayMsg() {
		return new PayMsg2();
	}

	public StoreCash GetStoreCash() {
		return new StoreCash2(this.dataStore);
	}

	public DisplayMenu GetDisplayMenu() {
		return new DisplayMenu2();
	}

	public RejectMsg GetRejectMsg() {
		return new RejectMsg2();
	}

	public SetPrice GetSetPrices() {
		return new SetPrice2(this.dataStore);
	}

	public SetInitialValues GetSetInitialValues() {
		return new SetInitialValues2(this.dataStore);
	}

	public PumpGasUnit GetPumpGasUnit() {
		return new PumpGasUnit2(this.dataStore);
	}

	public GasPumpedMsg GetGasPumpedMsg() {
		return new GasPumpedMsg2(this.dataStore);
	}

	public PrintReceipt GetPrintReceipt() {
		return new PrintReceipt2(this.dataStore);
	}

	public CancelMsg GetCancelMsg() {
		return new CancelMsg2();
	}

	public ReturnCash GetReturnCash() {
		return new ReturnCash2(this.dataStore);
	}

	public WrongPinMsg GetWrongPinMsg() {
		return new WrongPinMsg2();
	}

	public StorePin GetStorePin() {
		return new StorePin2(this.dataStore);
	}

	public EnterPinMsg GetEnterPinMsg() {
		return new EnterPinMsg2();
	}

	public InitializeData GetInitializeData() {
		return new InitializeData2(this.dataStore);
	}

	public SetW GetSetW() {
		return new SetW2();
	}

	public EjectCard GetEjectCard() {
		return new EjectCard2(this.dataStore);
	}

}
