package com.guffy.util;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.guffy.test.Accounts;
import com.guffy.test.Billing;

public class MathUtilTest {

	MathUtil util = new MathUtil();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		System.out.println("Set up before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tear down after class ");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown\n");
	}

	@Category({ Accounts.class, Billing.class })
	@Test
	public void testAdd() {
		System.out.println("testAdd");

		MathUtil util = new MathUtil();

		int result = util.add(5, 10);
		assertEquals(15, result);

		result = util.add(5, -10);
		assertEquals(-5, result);

		result = util.add(-5, 10);
		assertEquals(5, result);

		result = util.add(-5, -10);
		assertEquals(-15, result);

	}

	@Category({ Accounts.class, Billing.class })
	@Test
	public void testSub() {
		System.out.println("testSub");

		int result = util.sub(10, 5);
		assertEquals(5, result);

		result = util.sub(10, -5);
		assertEquals(15, result);

		result = util.sub(-10, 5);
		assertEquals(-15, result);

		result = util.sub(-10, -5);
		assertEquals(-5, result);

	}

	@Category({ Accounts.class })
	@Test
	public void testMul() {
		System.out.println("testMul");

		int result = util.mul(5, 10);
		assertEquals(50, result);

		result = util.mul(5, -10);
		assertEquals(-50, result);

		result = util.mul(-5, 10);
		assertEquals(-50, result);

		result = util.mul(-5, -10);
		assertEquals(50, result);
	}

	@Category({ Billing.class })
	@Test(timeout = 5000)
	public void testDiv() throws InterruptedException {
		System.out.println("testDiv");
		int result = util.div(10, 2);

		TimeUnit.SECONDS.sleep(2);

		// Thread.sleep(1000);

		assertEquals(5, result);

		result = util.div(-10, 2);
		assertEquals(-5, result);

		result = util.div(10, -2);
		assertEquals(-5, result);

		result = util.div(-10, -2);
		assertEquals(5, result);

	}

	@Category({ Accounts.class })
	@Test(expected = ArithmeticException.class)
	public void testDivZero() {
		System.out.println("testDiv");
		util.div(10, 0);

	}

}
