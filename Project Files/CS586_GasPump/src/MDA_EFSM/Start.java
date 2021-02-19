package MDA_EFSM;
import OP.OP;

//This is state Start, part of the state pattern design for MDA-EFSM.
public class Start extends State {
	public Start(MDA_EFSM m, OP p) { super(m, p); }

	public void Activate() {
		if (m.s == m.LS[0]) {
			p.StorePrices();
			m.s = m.LS[1];
			System.out.println("Current State: S0");
		}
	}
}
