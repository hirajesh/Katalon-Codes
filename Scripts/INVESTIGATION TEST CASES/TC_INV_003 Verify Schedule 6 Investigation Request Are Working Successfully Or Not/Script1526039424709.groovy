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

//WebUI.navigateToUrl('http://192.168.137.1/multihospital_new/')

WebUI.navigateToUrl('http://122.165.236.133/MultiHospital/Splashscreen.aspx')

System.out.println(" Verify Schedule 6 Investigation Request Are Working Successfully Or Not")

WebUI.maximizeWindow()

WebUI.click(findTestObject('lab/Page_KDMC/a_Investigation'))

WebUI.setText(findTestObject('lab/Page_Investigation login/input_txtusername'), 'brsraja')

WebUI.setText(findTestObject('lab/Page_Investigation login/input_txtpassword'), 'raja123')

WebUI.delay(3)

WebUI.click(findTestObject('lab/Page_Investigation login/button_Sign in'))

WebUI.click(findTestObject('lab/Page_KDMC/a_Store Request'))

WebUI.delay(2)

WebUI.click(findTestObject('lab/Page_KDMC/a_Medicine Request'))

WebUI.selectOptionByIndex(findTestObject('lab/Page_KDMC/select_--Select--Schedule 4X-r'), '3', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

medicineslength=WebUI.getNumberOfTotalOption(findTestObject('lab/Page_KDMC/select_--Select--Automatic x-r'))

for(int e=1;e<medicineslength;e++)
{

WebUI.selectOptionByIndex(findTestObject('lab/Page_KDMC/select_--Select--Schedule 4X-r'), '3', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

try {
	WebUI.selectOptionByIndex(findTestObject('lab/Page_KDMC/select_--Select--Automatic x-r'), e, FailureHandling.STOP_ON_FAILURE)
} catch (Exception e1) {
	WebUI.selectOptionByIndex(findTestObject('lab/Page_KDMC/select_--Select--Automatic x-r'), e, FailureHandling.STOP_ON_FAILURE)
}


WebUI.setText(findTestObject('lab/Page_KDMC/input_txttreat'), '15')

WebUI.delay(1)

WebUI.click(findTestObject('lab/Page_KDMC/button_Add'))
}

RN1 = WebUI.getAttribute(findTestObject('lab/Page_KDMC/input_txtno'), 'value')

System.out.println(RN1)

RID = (RN1.split('/')[2])

WebUI.scrollToElement(findTestObject('lab/Page_KDMC/input_btnsave'),20)

WebUI.click(findTestObject('lab/Page_KDMC/input_btnsave'))

WebUI.delay(3)

WebUI.click(findTestObject('lab/Page_KDMC/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('lab/Page_KDMC/a_dropdown-toggle'))

WebUI.click(findTestObject('lab/Page_KDMC/a_Sign out'))

WebUI.delay(3)

//CMO LOGIN
//=================

WebUI.click(findTestObject('lab/Page_KDMC/a_CMO'))

WebUI.setText(findTestObject('lab/Page_CMO login/input_txtusername'), 'brsjana')

WebUI.setText(findTestObject('lab/Page_CMO login/input_txtpassword'), 'jana123')

WebUI.delay(3)

WebUI.click(findTestObject('lab/Page_CMO login/button_Sign in'))

WebUI.click(findTestObject('lab/Page_KDMC - CMO/span_Department Wise Request'))

//WebUI.click(findTestObject('lab/Page_KDMC - CMO/input_1'))

WebUI.selectOptionByIndex(findTestObject('lab/Page_KDMC - CMO/select_--ALL--'), '4', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('lab/Page_KDMC - CMO/select_--ALL--                _1'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('lab/Page_KDMC - CMO/input_btnsearch'))

TestObject ID = WebUI.modifyObjectProperty(findTestObject('lab/Page_KDMC - CMO/input_1'), 'xpath', 'equals',
	('//*[@id=' + RID) + ']', true)

WebUI.click(ID)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('lab/Page_KDMC - CMO/select_--Select--'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('lab/Page_KDMC - CMO/input_btnupdate'))

WebUI.delay(2)

WebUI.click(findTestObject('lab/Page_KDMC - CMO/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('lab/Page_KDMC - CMO/a_dropdown-toggle'))

WebUI.click(findTestObject('lab/Page_KDMC - CMO/a_Sign out'))

WebUI.delay(3)

//DIVISIONAL STORE LOGIN
//========================

WebUI.click(findTestObject('lab/Page_KDMC/a_Divisional Store'))

WebUI.setText(findTestObject('lab/Page_Divisonal Store Login/input_txtusername'), 'brsnavas')

WebUI.setText(findTestObject('lab/Page_Divisonal Store Login/input_txtpassword'), 'navas123')

WebUI.delay(3)

WebUI.click(findTestObject('lab/Page_Divisonal Store Login/button_Sign in'))

WebUI.delay(3)

WebUI.click(findTestObject('lab/Page_Store/a_Lab Request'))

WebUI.delay(3)

WebUI.click(findTestObject('lab/Page_Store/a_Request Item Lab'))

TestObject ChooseRequest = WebUI.modifyObjectProperty(findTestObject('lab/Page_Store/input_1'), 'xpath', 'equals',
	('//*[@id=' + RID) + ']', true)

WebUI.click(ChooseRequest)

WebUI.delay(2)

selectedoptions=WebUI.getNumberOfTotalOption(findTestObject('lab/Page_Store/select_--Select--E.C.G. Jelly'))

for(int a=1;a<=selectedoptions-1;a++)
{
WebUI.selectOptionByIndex(findTestObject('lab/Page_Store/select_--Select--E.C.G. Jelly'), a , FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

RequestedQty=WebUI.getAttribute(findTestObject('lab/Page_Store/input_txttotal'),"value")
System.out.println("Requested QTY : "+RequestedQty)

BatchNumber=WebUI.getNumberOfTotalOption(findTestObject('lab/Page_Store/select_--Select--BA50'))

for(int g=1;g<=BatchNumber-1;g++)
{
WebUI.selectOptionByIndex(findTestObject('lab/Page_Store/select_--Select--BA50'), g, FailureHandling.STOP_ON_FAILURE)
WebUI.delay(2)
try 
{
	  StockQty=WebUI.getAttribute(findTestObject('lab/Page_Store/input_txtprice'),"value")
	  System.out.println("Stock QTY : "+StockQty)
	  WebUI.delay(1)
	  
	  if(Integer.valueOf(StockQty)>=Integer.valueOf(RequestedQty))
	  {
		  WebUI.setText(findTestObject('lab/Page_Store/input_txtqty'), '15')
		  
		  WebUI.click(findTestObject('lab/Page_Store/button_Add'))
		  break;
	  }
	  else
	  {
		  System.out.println("Stock Is Less Than Requested Qty")
	  }
}
 
catch (Exception e) 
{
WebUI.click(findTestObject('lab/Page_Store/button_OK'))
continue
}
}
}

WebUI.scrollToElement(findTestObject('lab/Page_Store/input_btnSubmit'),20)

WebUI.click(findTestObject('lab/Page_Store/input_btnSubmit'))

WebUI.delay(3)

WebUI.click(findTestObject('lab/Page_Store/button_OK'))


WebUI.delay(3)

WebUI.click(findTestObject('lab/Page_Store/a_dropdown-toggle'))

WebUI.click(findTestObject('lab/Page_Store/a_Sign out'))

WebUI.closeBrowser()

System.out.println("Schedule 6 Investigation Request Are Working Successfully")
