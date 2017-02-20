package org.eclipse.scout.designpatterns.state;

public interface StateOfFSM {
	public void coin(FiniteStateMashine fsm);
	public void pass(FiniteStateMashine fsm);
	
	public static Lock lock = new Lock();
	public static Unlock unlock = new Unlock();
										
}
