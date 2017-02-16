package org.eclipse.scout.contacts.client.common;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountryLookupCallTest {

	@Test
	public void execCreateLookupRows_shouldReturnNotNull() {
		CountryLookupCall call = new CountryLookupCall();
		assertNotNull(call.execCreateLookupRows());
	}

	@Test
	public void execCreateLookupRows_shouldReturnNotEmptyList() {
		CountryLookupCall call = new CountryLookupCall();
		assertNotEquals(0,call.execCreateLookupRows().size());
	}

}
