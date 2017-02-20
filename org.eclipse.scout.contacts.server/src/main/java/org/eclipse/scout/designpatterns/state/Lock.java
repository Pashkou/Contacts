package org.eclipse.scout.designpatterns.state;

public class Lock implements StateOfFSM{

	@Override
	public void coin(FiniteStateMashine fsm) {
		fsm.unlock();	
		fsm.setStateOfFsm(StateOfFSM.unlock);
	}

	@Override
	public void pass(FiniteStateMashine fsm) {
		fsm.alarm();
	}

}
