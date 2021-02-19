package MetaActions.DisplayMenu;
import Data.*;

//All of the methods here are implemented using Strategy pattern.

public abstract class DisplayMenu {
	DataStore d;
	public DisplayMenu() { }
	public DisplayMenu(DataStore d) { this.d = d; }
	public abstract void DisplayMenu();
}
