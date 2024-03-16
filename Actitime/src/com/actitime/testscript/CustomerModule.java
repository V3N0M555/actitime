package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test
public void createCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
//	String customerName = f.readDataFromExcel("CreateCustomer", 1, 2);
//	String description=f.readDataFromExcel("CreateCustomer", 1, 3);
//	HomePage h=new HomePage(driver);
//	h.getTaskTab().click();
//	TaskListPage t=new TaskListPage(driver);
//	t.getAddNewBtn().click();
//	t.getNewCustomerBtn().click();
//	t.getCustomerNameTbx().sendKeys(customerName);
//	t.getCustomerDescTbx().sendKeys(description);
//	t.getDropdownBtn().click();
//	t.getOurCompanyOpt().click();
//	t.getCreateCustomerBtn().click();
//	String actualText = t.getCreatedCustomerHeader().getText();
//	SoftAssert s=new SoftAssert();
//	s.assertEquals(actualText, customerName);
//	s.assertAll();
//	t.getSearchCusTbx().sendKeys(customerName);
//	driver.findElement(By.xpath("//span[text()='"+customerName+"']/../..//div[@class='editButton available']")).click();Thread.sleep(2000);
//	t.getActionsBtn().click();
//	t.getDeleteBtn().click();
//	t.getDeletePermanentlyBtn().click();
	}
}
