package org.eclipse.scout.contacts.client.contact;

import java.util.List;

import org.eclipse.scout.contacts.shared.Icons;
import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutline;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.shared.TEXTS;

/**
 * <h3>{@link ContactOutline}</h3>
 *
 * @author Sergei
 */
@Order(1000)
public class ContactOutline extends AbstractOutline {

	@Override
	protected void execCreateChildPages(List<IPage<?>> pageList) {
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Contacts");
	}

	@Override
	protected String getConfiguredIconId() {
		return Icons.Category;
	}
}