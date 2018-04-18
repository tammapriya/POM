package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC_DeleteLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC_DeleteLead";
		testDescription="login to LeafTaps";
		testNodes="Leads";
		category="Smoke";
		authors="Chandu";
		browserName="chrome";
		dataSheetName="TC006";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String vName,String phonenumber,String id,String error) {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		//.clickLogOut();	
		.clickCrmsfa()
		.clickLeads()
		.clickFindLead()
		.clickOnPhone()
		.enterphnumToFindlead(phonenumber)
		.clickEleFindLeadButton()
		.clickEleFirstResult()
		.clickDeleteLead()
		.clickFindLead()
		.enterIdToFindlead(id)
		.clickEleFindLeadButton()
		.verifyErrorMsg();


	}

}
