package com.guffy.test;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.guffy.util.MathUtilTest;
import com.guffy.util.NameUtilTest;

@RunWith(Categories.class)
@IncludeCategory(Billing.class)
@Suite.SuiteClasses({ NameUtilTest.class, MathUtilTest.class })
public class BillingTest {

}
