package org.eclipse.scout.contacts.server.person;

import org.eclipse.scout.contacts.shared.person.IScoutService;
import org.eclipse.scout.contacts.shared.person.ScoutTablePageData;
import org.eclipse.scout.rt.shared.services.common.jdbc.SearchFilter;

public class ScoutService implements IScoutService {

	@Override
	public ScoutTablePageData getScoutTableData(SearchFilter filter) {
		ScoutTablePageData pageData = new ScoutTablePageData();
		// TODO [Sergei] fill pageData.
		return pageData;
	}
}
