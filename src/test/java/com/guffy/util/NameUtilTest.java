package com.guffy.util;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.guffy.test.Accounts;
import com.guffy.test.Billing;

import static org.hamcrest.CoreMatchers.*;

public class NameUtilTest {

	private NameUtil nameutil = new NameUtil();

	@Category({ Accounts.class, Billing.class })

	@Test
	public void testGetFormattedName() {

		String result = nameutil.getFormattedName("Shrawan", "Shrestha");
		// assertEquals("Shrawan Shrestha", result);
		assertThat(result, allOf(containsString("Shrawan"), containsString("Shrestha")));

	}

	@Category({ Accounts.class })
	@Test
	public void testGetFormattedNameFirstnameNull() {

		String result = nameutil.getFormattedName(null, "Shrestha");
		assertThat(result, containsString("Shrestha"));
	}

	@Category({ Accounts.class, Billing.class })
	@Test
	public void testGetFormattedNameLastNameNull() {

		String result = nameutil.getFormattedName("Shrawan", null);
		assertThat(result, anything("z"));
	}

	@Category({ Billing.class })
	@Test
	public void testGetFormattedNameBoth() {

		String result = nameutil.getFormattedName(null, null);
		assertEquals("", result);
	}

}
