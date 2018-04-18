package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC_MergeLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC_MergeLead";
		testDescription="login to LeafTaps";
		testNodes="Leads";
		category="Smoke";
		authors="chandu";
		browserName="chrome";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void mergeLead(String uName,String pwd,String vName,String fid1,String fid2,String msg) {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		//.clickLogOut();	
		.clickCrmsfa()
		.clickLeads()
		.clickMergeLead()
		.clickImg1()
		.enterIdToFindlead(fid1)
		.clickEleFindLeadButton()
		.clickEleFirstResultWithNoSnap()
		.clickImg2()
		.enterIdToFindlead(fid2)
		.clickEleFindLeadButton()
	    .clickEleFirstResultWithNoSnap()
		.clickMergeButton()
		.clickFindLead()
		.enterIdToFindlead(fid1)
		.clickEleFindLeadButton()
		.verifyErrorMsg();
}

}
