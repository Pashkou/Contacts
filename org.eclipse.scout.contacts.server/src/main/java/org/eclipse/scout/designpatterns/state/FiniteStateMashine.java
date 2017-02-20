package org.eclipse.scout.designpatterns.state;

public abstract class FiniteStateMashine {
	private StateOfFSM stateOfFSM;
	
	public void setStateOfFsm(StateOfFSM stateOfFSM){
		this.stateOfFSM = stateOfFSM;
	}
	
	public void coin(){
		stateOfFSM.coin(this);
	}
	
	public void pass(){
		stateOfFSM.pass(this);
	}
	
	protected abstract void lock();
	protected abstract void unlock();
	protected abstract void thankyou();
	protected abstract void alarmOn();
	protected abstract void alarmOff();
	protected abstract void reset();
}
