package com.guffy.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.guffy.util.MathUtilTest;
import com.guffy.util.NameUtilTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ NameUtilTest.class, MathUtilTest.class })
public class UtilTestSuite {

}
