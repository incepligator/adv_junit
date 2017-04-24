package com.guffy.test;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@IncludeCategory({ Accounts.class, Billing.class })
@Suite.SuiteClasses({ UtilTestSuite.class })
public class AccountBillingTest {

}
