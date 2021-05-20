package com.Testng_project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_annotations {
@BeforeSuite
private void setProperty() {
	System.out.println("set property");

}@BeforeTest
private void browserlaunch() {
	System.out.println("browser launch");

} 
@BeforeClass
private void url() {
	System.out.println("urls");

}@BeforeMethod
private void login() {
	System.out.println("login");

}@Test
private void laptop() {
	System.out.println("laptop");

}@Test
private void mobile() {
	System.out.println("mobile");

}@Test
private void refridgerator() {
	System.out.println("fridge");

}@AfterMethod
private void logout() {
    System.out.println("log out");

}@AfterClass
private void verifyhomepage() {
	System.out.println("verify home page");

}@AfterTest
private void close() {
    System.out.println("close");

}
@AfterSuite
private void deleteAllcookies() {
	System.out.println("cookies delete");

}
}
