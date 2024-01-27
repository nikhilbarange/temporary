package testngpractice;

import org.testng.annotations.Test;

public class TestNGKeywords {
	
	@Test(priority = 1,invocationCount=2)
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test(priority =2,enabled =false)
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test(priority =3,timeOut=1000)
	public void test3() throws InterruptedException {
		Thread.sleep(1500);
		System.out.println("Test3");
	}
	
	@Test(priority =4,dependsOnMethods= {"test3"})
	public void test4() {
		System.out.println("Test4");
	}

}
