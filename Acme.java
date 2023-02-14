package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Acme {
public static void main(String[] args) {
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://acme-test.uipath.com/login");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	System.out.println(driver.getTitle());
	driver.findElement(By.linkText("Log Out")).click();
	driver.close();
}
}
