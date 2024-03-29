package MDA_EFSM;
import OP.OP;

//This is state S3, part of the state pattern design for MDA-EFSM.
public class S3 extends State {
	public S3(MDA_EFSM m, OP p) { super(m, p); }

	public void SelectGas(int g) {
		// self-looping state
		if (m.s == m.LS[4]) {
			p.SetPrice(g);
		}
	}
	
	public void StartPump() {
		if (m.s == m.LS[4]) {
			p.SetInitialValues();
			m.s = m.LS[5];
			System.out.println("Current State: S5");
		}
	}
	
	public void Cancel() {
		if (m.s == m.LS[4]) {
			p.CancelMsg();
			p.ReturnCash();
			m.s = m.LS[1];
			System.out.println("Current State: S0");
		}
	}
	
}
