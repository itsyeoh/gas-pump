package MetaActions.PumpGasUnit;
import Data.*;

//All of the methods here are implemented using Strategy pattern.
public abstract class PumpGasUnit {
	DataStore d;
	public PumpGasUnit() { }
	public PumpGasUnit(DataStore d) { this.d = d; }
	public abstract void PumpGasUnit();
}