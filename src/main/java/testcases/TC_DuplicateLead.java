package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC_DuplicateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC_DuplicateLead";
		testDescription="login to LeafTaps";
		testNodes="Leads";
		category="Smoke";
		authors="Chandu";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String vName,String fname) {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		//.clickLogOut();	
		.clickCrmsfa()
		.clickLeads()
		.clickFindLead()
		.enterFNameToFindlead(fname)
		
		.clickEleFindLeadButton()
		.clickEleFirstResult()
		.clickDuplicateLead()
		.clickDuplicateCreateLead();
		
		}

}
