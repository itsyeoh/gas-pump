package MDA_EFSM;
import OP.OP;

//This is state S2, part of the state pattern design for MDA-EFSM.
public class S2 extends State {
	public S2(MDA_EFSM m, OP p) { super(m, p); }

	public void Approved() {
		if (m.s == m.LS[3]) {
			p.DisplayMenu();
			p.EjectCard();
			m.s = m.LS[4];
			System.out.println("Current State: S3");
		}
	}
	
	public void Reject() {
		if (m.s == m.LS[3]) {
			p.RejectMsg();
			p.EjectCard();
			m.s = m.LS[1];
			System.out.println("Current State: S0");
		}
	}
}