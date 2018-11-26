import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.137.1/multihospital_new/HDSplashscreen.aspx')

WebUI.maximizeWindow()

WebUI.click(findTestObject('HealthpostToCms/Page_KDMC/a_Healthpost Store'))

WebUI.setText(findTestObject('HealthpostToCms/Page_HealthPost Store Login/input_txtusername'), 'raguram')

WebUI.setText(findTestObject('HealthpostToCms/Page_HealthPost Store Login/input_txtpassword'), '123')

WebUI.delay(3)

WebUI.click(findTestObject('HealthpostToCms/Page_HealthPost Store Login/button_Sign in'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('HealthpostToCms/Page_HealthPost Store/a_CMS'),20)

WebUI.click(findTestObject('HealthpostToCms/Page_HealthPost Store/a_CMS'))

WebUI.click(findTestObject('HealthpostToCms/Page_HealthPost Store/a_Request Send'))

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('HealthpostToCms/Page_HealthPost Store/select_--Select--'), '2', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('HealthpostToCms/Page_HealthPost Store/select_--Select--Schedule 1Inj'), '11',
	FailureHandling.STOP_ON_FAILURE)

medicineslength=WebUI.getNumberOfTotalOption(findTestObject('HealthpostToCms/Page_HealthPost Store/select_--Select--Adernaline 0.'))

for(int e=1;e<=medicineslength-1;e++)
{
	
WebUI.selectOptionByIndex(findTestObject('HealthpostToCms/Page_HealthPost Store/select_--Select--Schedule 1Inj'), 11, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.selectOptionByIndex(findTestObject('HealthpostToCms/Page_HealthPost Store/select_--Select--Adernaline 0.'), e, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('HealthpostToCms/Page_HealthPost Store/input_txttreat'), '100')

WebUI.click(findTestObject('HealthpostToCms/Page_HealthPost Store/button_Add'))

WebUI.delay(2)

}

WebUI.scrollToElement(findTestObject('HealthpostToCms/Page_HealthPost Store/input_btnsave'),20)

WebUI.click(findTestObject('HealthpostToCms/Page_HealthPost Store/input_btnsave'))

WebUI.delay(3)

RN1 = WebUI.getText(findTestObject('HealthpostToCms/Page_HealthPost Store/font_PRNO18052018174'))

System.out.println(RN1)

RID = (RN1.split('/')[2])

WebUI.click(findTestObject('HealthpostToCms/Page_HealthPost Store/button_OK'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('HealthpostToCms/Page_HealthPost Store/a_dropdown-toggle'),20)

WebUI.click(findTestObject('HealthpostToCms/Page_HealthPost Store/a_dropdown-toggle'))

WebUI.click(findTestObject('HealthpostToCms/Page_HealthPost Store/a_Sign out'))

WebUI.delay(3)


//++++++++++++++++++++CMO LOGIN+++++++++++++++++++++++++++++++++++++++++
//===========================================================================

WebUI.navigateToUrl('http://192.168.137.1/multihospital_new/')

WebUI.click(findTestObject('HealthpostToCms/Page_KDMC/a_CMO'))

WebUI.setText(findTestObject('HealthpostToCms/Page_CMO login/input_txtusername'), 'guru')

WebUI.setText(findTestObject('HealthpostToCms/Page_CMO login/input_txtpassword'), '123')

WebUI.delay(3)

WebUI.click(findTestObject('HealthpostToCms/Page_CMO login/button_Sign in'))

WebUI.delay(3)

WebUI.click(findTestObject('HealthpostToCms/Page_KDMC - CMO/a_CMS Request'))

WebUI.delay(2)

WebUI.click(findTestObject('HealthpostToCms/Page_KDMC - CMO/a_Healthpost Store Request'))

WebUI.selectOptionByIndex(findTestObject('HealthpostToCms/Page_KDMC - CMO/select_--ALL--'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HealthpostToCms/Page_KDMC - CMO/input_btnsearch'))

TestObject ID = WebUI.modifyObjectProperty(findTestObject('lab/Page_KDMC - CMO/input_1'), 'xpath', 'equals',
	('//*[@id=' + RID) + ']', true)

WebUI.click(ID)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('HealthpostToCms/Page_KDMC - CMO/select_--Select--'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HealthpostToCms/Page_KDMC - CMO/input_btnupdate'))

WebUI.delay(2)

WebUI.click(findTestObject('HealthpostToCms/Page_KDMC - CMO/button_OK'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('HealthpostToCms/Page_KDMC - CMO/a_dropdown-toggle'),20)

WebUI.click(findTestObject('HealthpostToCms/Page_KDMC - CMO/a_dropdown-toggle'))

WebUI.click(findTestObject('HealthpostToCms/Page_KDMC - CMO/a_Sign out'))

WebUI.delay(3)


//++++++++++++++++++++CMS LOGIN+++++++++++++++++++++++++++++++++++++++++
//===========================================================================

WebUI.click(findTestObject('HealthpostToCms/Page_KDMC/a_CMS'))

WebUI.setText(findTestObject('HealthpostToCms/Page_CMS login/input_txtusername'), 'bala')

WebUI.setText(findTestObject('HealthpostToCms/Page_CMS login/input_txtpassword'), '123')

WebUI.delay(3)

WebUI.click(findTestObject('HealthpostToCms/Page_CMS login/button_Sign in'))

WebUI.delay(3)

WebUI.click(findTestObject('HealthpostToCms/Page_KDMC - CMS/a_Divisional Store'))

WebUI.delay(2)

WebUI.click(findTestObject('HealthpostToCms/Page_KDMC - CMS/a_Dispatch Items'))

WebUI.delay(2)

WebUI.setText(findTestObject('HealthpostToCms/Page_KDMC - CMS/input'), RN1)

WebUI.click(findTestObject('HealthpostToCms/Page_KDMC - CMS/input_PRNO18052018174'))

WebUI.delay(3)

System.out.println("Length : " +medicineslength)

for (int row = 0; row <medicineslength - 1; row++) {
	/*
//REQUESTED QTY IN CMS
//==========================
TestObject RequestedQty = new TestObject()

RequestedQty = WebUI.modifyObjectProperty(RequestedQty, 'xpath', 'equals', ('//*[@id="itemdetails1"]/tbody/tr[' +row) + ']/td[4]',
	true)

Rqty = WebUI.getText(RequestedQty)

System.out.println("Rqty : "+Rqty)*/
	//LENGTH OF BATCH NUMBER QTY IN CMS
	//==================================
	TestObject batchlength = new TestObject()

	batchlength = WebUI.modifyObjectProperty(batchlength, 'xpath', 'equals', ('//*[@id = "fldvendor' + row) + '"]', true)

	batchsize = WebUI.getNumberOfTotalOption(batchlength)

	System.out.println('BatchSize : ' + batchsize)

	for (int n = 1; n <= (batchsize - 1); n++) {
		//CHOOSE BATCH NUMBER QTY IN CMS
		//================================
		TestObject product = new TestObject()

		product = WebUI.modifyObjectProperty(product, 'xpath', 'equals', ('//*[@id = "fldvendor' + row) + '"]', true)

		WebUI.selectOptionByIndex(product, n, FailureHandling.STOP_ON_FAILURE)

		//BATCH QTY IN CMS
		//==========================
		TestObject batch = new TestObject()

		batch = WebUI.modifyObjectProperty(batch, 'xpath', 'equals', ('//*[@id = "txtbthqty' + row) + '"]', true)

		batchqty = WebUI.getAttribute(batch, 'value').trim()

		Rqty = 100

		WebUI.delay(2)

		System.out.println('BatchQty : ' + batchqty)

		System.out.println('RQty : ' + Rqty)

		if (Integer.valueOf(batchqty) >= Integer.valueOf(Rqty)) {
			break
		} else {
			System.out.println('Batchqty Is Less Than Rqty')
		}
	}
}

WebUI.delay(2)

WebUI.click(findTestObject('HealthpostToCms/Page_KDMC - CMS/input_btndispatch'))

WebUI.delay(3)

WebUI.click(findTestObject('HealthpostToCms/Page_KDMC - CMS/button_OK'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('HealthpostToCms/Page_KDMC - CMS/a_dropdown-toggle'),20)

WebUI.click(findTestObject('HealthpostToCms/Page_KDMC - CMS/a_dropdown-toggle'))

WebUI.click(findTestObject('HealthpostToCms/Page_KDMC - CMS/a_Sign out'))

WebUI.delay(3)

//++++++++++++++++++++HEALTHPOST LOGIN+++++++++++++++++++++++++++++++++++++++++
//===========================================================================

WebUI.navigateToUrl('http://192.168.137.1/multihospital_new/HDSplashscreen.aspx')

WebUI.click(findTestObject('HealthpostToCms/Page_KDMC/a_Healthpost Store'))

WebUI.setText(findTestObject('HealthpostToCms/Page_HealthPost Store Login/input_txtusername'), 'raguram')

WebUI.setText(findTestObject('HealthpostToCms/Page_HealthPost Store Login/input_txtpassword'), '123')

WebUI.delay(3)

WebUI.click(findTestObject('HealthpostToCms/Page_HealthPost Store Login/button_Sign in'))

WebUI.delay(3)

WebUI.click(findTestObject('HealthpostToCms/Page_HealthPost Store/a_CMS'))

WebUI.delay(2)

WebUI.click(findTestObject('HealthpostToCms/Page_HealthPost Store/a_Receiving Goods'))

WebUI.setText(findTestObject('HealthpostToCms/Page_HealthPost Store/input'), RN1)

WebUI.click(findTestObject('HealthpostToCms/Page_HealthPost Store/input_PRNO18052018174'))

WebUI.delay(2)

WebUI.click(findTestObject('HealthpostToCms/Page_HealthPost Store/input_chkrem'))

WebUI.scrollToElement(findTestObject('HealthpostToCms/Page_HealthPost Store/input_btchkroqadd'),20)

WebUI.click(findTestObject('HealthpostToCms/Page_HealthPost Store/input_btchkroqadd'))

WebUI.delay(2)

WebUI.refresh()

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('HealthpostToCms/Page_HealthPost Store/a_dropdown-toggle'),20)

WebUI.click(findTestObject('HealthpostToCms/Page_HealthPost Store/a_dropdown-toggle'))

WebUI.click(findTestObject('HealthpostToCms/Page_HealthPost Store/a_Sign out'))

WebUI.closeBrowser()

