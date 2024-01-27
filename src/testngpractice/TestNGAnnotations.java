package testngpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	@Test
	public void test3() {
		System.out.println("test3");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
	}

}
