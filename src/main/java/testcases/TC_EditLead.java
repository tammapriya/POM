package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC_EditLead";
		testDescription="login to LeafTaps";
		testNodes="Leads";
		category="Smoke";
		authors="chandu";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String vName,String FFname,String companyname,String cname) {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		//.clickLogOut();	
		.clickCrmsfa()
		.clickLeads()
		.clickFindLead()
		.enterFNameToFindlead(FFname)
		.clickEleFindLeadButton()
		.clickEleFirstResult()
		.verifyTitleViewLead()
		.clickEditLead()
		.EditCompanyName(companyname)
		.clickUpdateLeadbutton()
		.verifyCompanyName(cname);
		
	}

}
