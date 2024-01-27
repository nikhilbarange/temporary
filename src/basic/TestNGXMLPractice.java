package basic;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGXMLPractice {
	
//Right click on any package(desired package) and then go to testNG then go to convert to TestNG.
	
	@Test
	public void test() {
		System.out.println("test");
	}
	
	@Parameters ({"i","j"})
	@Test
	public void addition(int a,int b) {
		System.out.println(a+b);
	}
	
	@Parameters ({"k"})
	@Test
	public void test(String c) {
		System.out.println(c);
	}

}
