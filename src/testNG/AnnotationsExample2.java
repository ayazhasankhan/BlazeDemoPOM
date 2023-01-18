package testNG;

import org.testng.annotations.*;

public class AnnotationsExample2 {
	


@Test
public void atTest1() {
	System.out.println("@Test1");
}

@Test
public void atTest2() {
	System.out.println("@Test2");
}

@Test
public void atTest3() {
	System.out.println("@Test3");
}

@BeforeMethod
public void beforeMethod() {
	System.out.println("@BeforeMethod");
}

@AfterMethod
public void afterMethod() {
	System.out.println("@AfterMethod");
}

}
