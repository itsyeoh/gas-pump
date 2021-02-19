package MDA_EFSM;
import OP.OP; 

//This is the context class, part of the state pattern design for MDA-EFSM.
public class MDA_EFSM {
	public State s;
	public State[] LS;
	public int k;
	
	public MDA_EFSM(OP p) {
		// initlalize all the states
		LS = new State[7];
		LS[0] = new Start(this, p);
		LS[1] = new S0(this, p);
		LS[2] = new S1(this, p);
		LS[3] = new S2(this, p);
		LS[4] = new S3(this, p);
		LS[5] = new S5(this, p);
		LS[6] = new S8(this, p);
		s = LS[0];	// starting point
		k = 0;		// pin attempt count
	}
	
	// meta-events to be implement by states
	public void Activate() 	{ s.Activate(); }
	public void Start() 	{ s.Start(); }
	public void Reject() 	{ s.Reject(); }
	public void Cancel() 	{ s.Cancel(); }
	public void Approved() 	{ s.Approved(); }
	public void StartPump() { s.StartPump(); }
	public void Pump() 		{ s.Pump(); }
	public void StopPump() 	{ s.StopPump(); }
	public void SelectGas(int g) { s.SelectGas(g); }
	public void CorrectPin() { s.CorrectPin(); }
	public void IncorrectPin(int max) { s.IncorrectPin(max); }
	public void PayCash() 	{ s.PayCash(); }
	public void PayCredit() { s.PayCredit(); }
	public void PayDebit() 	{ s.PayDebit(); }
}
