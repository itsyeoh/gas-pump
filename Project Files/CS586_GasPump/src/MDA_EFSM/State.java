package MDA_EFSM;
import OP.OP;

//This is abstract state, part of the state pattern design for MDA-EFSM.
public abstract class State {
	public MDA_EFSM m;
	public OP p;
	
	public State(MDA_EFSM m, OP p) { 
		this.m = m; 
		this.p = p;
	}

	public void Activate() { }
	public void Start() { }
	public void Reject() { }
	public void Cancel() { }
	public void Approved() { }
	public void StartPump() { }
	public void Pump() { }
	public void StopPump() { }
	public void SelectGas(int g) { }
	public void CorrectPin() { }
	public void IncorrectPin(int max) { }
	public void PayCash() { }
	public void PayCredit() { }
	public void PayDebit() { }
}