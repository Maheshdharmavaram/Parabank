package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC001_Parabank_Register extends BaseClass {
	@Test(dataProvider="registerdata")
	public void registration(String Mahesh,String Mahi,String siddipet,String siddipet1, String TS, String zip, String phone, String ssn, String maheshmahi, String pwd) {

}
	@Test
	public void registration() {
		//Registration page
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@name='customer.firstName']")).sendKeys("Mahesh");
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Mahi");
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("siddipet");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Siddipet1");
		driver.findElement(By.id("customer.address.state")).sendKeys("TS");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("502103");
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("8186835676");
		driver.findElement(By.id("customer.ssn")).sendKeys("ssn");
		driver.findElement(By.id("customer.username")).sendKeys("maheshmahi");
		driver.findElement(By.id("customer.password")).sendKeys("123456");
		driver.findElement(By.id("repeatedPassword")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		Assert.assertTrue(false);//it will fail
	}
		@DataProvider(name="registerdata")
		public String[][] regData(){
			String[][] data= {
					{"Mahesh","mahi","siddipet","siddipet","Telangana","502103","9186835676","ssn","maheshmahi","123456"}
			};
			return data;
	
	
	}

}
