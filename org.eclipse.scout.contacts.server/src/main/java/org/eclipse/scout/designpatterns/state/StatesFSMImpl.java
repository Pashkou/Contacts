package org.eclipse.scout.designpatterns.state;

public enum StatesFSMImpl implements StateOfFSM {
	LOCKED {

		@Override
		public void coin(FiniteStateMashine fsm) {
			fsm.unlock();	
			fsm.setStateOfFsm(StatesFSMImpl.unlock);
		}

		@Override
		public void pass(FiniteStateMashine fsm) {
			fsm.alarm();
		}
	},
	
	UNLOCKED{

		@Override
		public void coin(FiniteStateMashine fsm) {
			fsm.thankyou();
		}

		@Override
		public void pass(FiniteStateMashine fsm) {
			fsm.lock();
			fsm.setStateOfFsm(StatesFSMImpl.lock);
		}
		
	}

}
