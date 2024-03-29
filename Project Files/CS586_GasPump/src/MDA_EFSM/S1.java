package MDA_EFSM;
import OP.OP;

//This is state S1, part of the state pattern design for MDA-EFSM.
public class S1 extends State {
	public S1(MDA_EFSM m, OP p) { super(m, p); }

	public void PayCredit() {
		if (m.s == m.LS[2]) {
			m.s = m.LS[3];
			System.out.println("Current State: S2");
		}
	}
	
	public void PayDebit() {
		if (m.s == m.LS[2]) {
			p.EnterPinMsg();
			p.StorePin();
			m.k = 0;
			m.s = m.LS[6];
			System.out.println("Current State: S8");
		}
	}
	
	public void PayCash() {
		if (m.s == m.LS[2]) {
			p.StoreCash();
			p.DisplayMenu();
			p.SetW(1);
			m.s = m.LS[4];
			System.out.println("Current State: S3");
		}
	}
	
}
