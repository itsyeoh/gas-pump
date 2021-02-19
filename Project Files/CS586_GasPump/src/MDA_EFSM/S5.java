package MDA_EFSM;
import OP.OP;

//This is state S5, part of the state pattern design for MDA-EFSM.
public class S5 extends State {
	public S5(MDA_EFSM m, OP p) { super(m, p); }
	
	public void Pump() {
		// self-looping state
		if(m.s == m.LS[5]) {
			p.PumpGasUnit();
			p.GasPumpedMsg();
		}
	}
	
	public void StopPump() {
		if (m.s == m.LS[5]) {
			p.PrintReceipt();
			m.s = m.LS[1];
			System.out.println("Current State: S0");
		}
	}
}
