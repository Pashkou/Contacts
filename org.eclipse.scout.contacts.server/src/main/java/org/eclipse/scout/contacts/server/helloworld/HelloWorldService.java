package org.eclipse.scout.contacts.server.helloworld;

import org.eclipse.scout.contacts.server.ServerSession;
import org.eclipse.scout.contacts.shared.helloworld.HelloWorldFormData;
import org.eclipse.scout.contacts.shared.helloworld.IHelloWorldService;

/**
 * <h3>{@link HelloWorldService}</h3>
 *
 * @author Sergei
 */
public class HelloWorldService implements IHelloWorldService {

	@Override
	public HelloWorldFormData load(HelloWorldFormData input) {
		StringBuilder msg = new StringBuilder();
		msg.append("Hello ").append(ServerSession.get().getUserId()).append('!');
		input.getMessage().setValue(msg.toString());
		return input;
	}
}
