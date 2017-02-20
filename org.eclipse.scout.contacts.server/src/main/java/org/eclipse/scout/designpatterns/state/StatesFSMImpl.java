package org.eclipse.scout.designpatterns.state;

public enum StatesFSMImpl implements StateOfFSM {
	LOCKED {

		@Override
		public void coin(FiniteStateMashine fsm) {
			fsm.unlock();	
			fsm.setStateOfFsm(StatesFSMImpl.UNLOCKED);
		}

		@Override
		public void pass(FiniteStateMashine fsm) {
			fsm.alarmOn();
			fsm.setStateOfFsm(StatesFSMImpl.ALARMED);
		}

		@Override
		public void reset(FiniteStateMashine fsm) {
			fsm.alarmOff();
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
			fsm.setStateOfFsm(StatesFSMImpl.LOCKED);
		}

		@Override
		public void reset(FiniteStateMashine fsm) {
			fsm.lock();
			fsm.alarmOff();
			fsm.setStateOfFsm(StatesFSMImpl.LOCKED);
		}
		
	},
	
	ALARMED{

		@Override
		public void coin(FiniteStateMashine fsm) {
			fsm.reset();
			fsm.setStateOfFsm(StatesFSMImpl.LOCKED);
		}

		@Override
		public void pass(FiniteStateMashine fsm) {
		}

		@Override
		public void reset(FiniteStateMashine fsm) {
			fsm.lock();
			fsm.alarmOff();
			fsm.setStateOfFsm(StatesFSMImpl.LOCKED);
		}
		
	}

}
