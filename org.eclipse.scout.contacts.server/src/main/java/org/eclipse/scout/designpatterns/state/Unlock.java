package org.eclipse.scout.designpatterns.state;

public class Unlock implements StateOfFSM {

	@Override
	public void coin(FiniteStateMashine fsm) {
		fsm.thankyou();
	}

	@Override
	public void pass(FiniteStateMashine fsm) {
		fsm.lock();
		fsm.setStateOfFsm(StateOfFSM.lock);
	}

}
