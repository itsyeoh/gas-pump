package MDA_EFSM;
import OP.OP;

// This is state S0, part of the state pattern design for MDA-EFSM.
public class S0 extends State {
	public S0(MDA_EFSM m, OP p) { super(m, p); }

	public void Start() {
		if (m.s == m.LS[1]) {
			p.PayMsg();
			p.InitializeData();
			p.SetW(1);
			m.s = m.LS[2];
			System.out.println("Current State: S1");
		}
	}
}
