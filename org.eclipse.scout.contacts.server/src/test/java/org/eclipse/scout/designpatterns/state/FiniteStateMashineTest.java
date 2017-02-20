package org.eclipse.scout.designpatterns.state;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FiniteStateMashineTest extends FiniteStateMashine {
	public String actions = "";
	FiniteStateMashine finiteStateMashine;
	
	@Before
	public void setup(){
		finiteStateMashine = this;
		finiteStateMashine.setStateOfFsm(StatesFSMImpl.LOCKED);
		actions = "";
	} 
	
	@Test
	public void testCoin_shouldUnlock() {
		finiteStateMashine.coin();
		assertEquals("U", actions);
	}

	@Test
	public void testCoinAndPass_shouldUnlockAndLock() {
		finiteStateMashine.coin();
		finiteStateMashine.pass();
		assertEquals("UL", actions);
	}
	
	@Test
	public void testTwoCoins_shouldUnlockAndThnakYou(){
		for(int i = 0 ; i < 5; i++){
			finiteStateMashine.coin();
		}
		finiteStateMashine.pass();
		assertEquals("UTTTTL", actions);
	}

	@Test
	public void giveCoin_swichOffAlarm(){
		finiteStateMashine.pass();
		finiteStateMashine.coin();
		
		assertEquals("NR", actions);
	}
	
	
	@Override
	protected void lock() {
		actions += "L";
	}

	@Override
	protected void unlock() {
		actions += "U";
	}

	@Override
	protected void thankyou() {
		actions += "T";
	}

	@Override
	protected void alarmOn() {
		actions += "N";
	}

	@Override
	protected void alarmOff() {
		actions += "F";
	}

	@Override
	protected void reset() {
		actions += "R";
	}

}
