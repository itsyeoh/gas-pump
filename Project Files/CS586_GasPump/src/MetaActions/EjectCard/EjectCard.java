package MetaActions.EjectCard;
import Data.*;

//All of the methods here are implemented using Strategy pattern.

public abstract class EjectCard {
	DataStore d;
	public EjectCard() { }
	public EjectCard(DataStore d) { this.d = d; }
	public abstract void EjectCard();
}
