package com.dataDriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utilites.Xls_Reader;

public class dataDrivernTest {
	public static void main(String arg[]) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\DOMINATORS\\Java\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.get("https://signup.ebay.com/pa/crte?usage=2943");

		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\User\\Desktop\\DOMINATORS\\Java\\srcMain\\com\\testData\\HalfEbayTestData.xlsx");

		String FirstName = reader.getCellData("RegTestData", "FirstName", 2);
		System.out.println(FirstName);

		String LastName = reader.getCellData("RegTestData", "LastName", 2);
		System.out.println(LastName);

		String Adress1 = reader.getCellData("RegTestData", "Adress1", 2);
		System.out.println(Adress1);

		String Address2 = reader.getCellData("RegTestData", "Address2", 2);
		System.out.println(Address2);

		String City = reader.getCellData("RegTestData", "City", 2);
		System.out.println(City);

		String State = reader.getCellData("RegTestData", "State", 2);
		System.out.println(State);

		String Zipcode = reader.getCellData("RegTestData", "Zipcode", 2);
		System.out.println(Zipcode);

		String EmailAddress = reader.getCellData("RegTestData", "EmailAddress", 2);
		System.out.println(EmailAddress);

		driver.findElement(
				By.xpath("/html/body/div[2]/div[3]/div[3]/div[2]/div/div/form/div[1]/span/span[1]/span/input"))
				.sendKeys(FirstName);

		driver.findElement(
				By.xpath("/html/body/div[2]/div[3]/div[3]/div[2]/div/div/form/div[2]/span/span[1]/span/input"))
				.sendKeys(LastName);

		driver.findElement(
				By.xpath("/html/body/div[2]/div[3]/div[3]/div[2]/div/div/form/div[3]/div/span[1]/span[1]/span/input"))
				.sendKeys(EmailAddress);

		driver.findElement(
				By.xpath("/html/body/div[2]/div[3]/div[3]/div[2]/div/div/form/div[4]/span/span[1]/span/input"))
				.sendKeys(Adress1);

	}
}
