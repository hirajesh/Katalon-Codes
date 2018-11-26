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


System.out.println("Verify Schedule 3 Emergency  Request Are Working Successfully Or Not")

WebUI.navigateToUrl('http://192.168.137.1/Multihospital_New/EmergencyLogin.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Emergency/Page_Emergency login/input_txtusername'), 'nivetha')

WebUI.setText(findTestObject('Emergency/Page_Emergency login/input_txtpassword'), '123')

WebUI.delay(3)

WebUI.click(findTestObject('Emergency/Page_Emergency login/button_Sign in'))

WebUI.delay(3)

WebUI.click(findTestObject('Emergency/Page_KDMC - Emergency/a_Store Request'))

WebUI.delay(2)

WebUI.click(findTestObject('Emergency/Page_KDMC - Emergency/a_Medicine Request'))

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Emergency/Page_KDMC - Emergency/select_--Select--Schedule 1Inj'), '2', FailureHandling.STOP_ON_FAILURE)

seletedoptions = WebUI.getNumberOfTotalOption(findTestObject('Emergency/Page_KDMC - Emergency/select_--Select--Adernaline 0.'))

for (int u = 1; u <seletedoptions-1; u++) {
    WebUI.selectOptionByIndex(findTestObject('Emergency/Page_KDMC - Emergency/select_--Select--Schedule 1Inj'), '2', FailureHandling.STOP_ON_FAILURE)


	
    WebUI.selectOptionByIndex(findTestObject('Emergency/Page_KDMC - Emergency/select_--Select--Adernaline 0.'), u, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Emergency/Page_KDMC - Emergency/input_txttreat'), '50')


	
    WebUI.click(findTestObject('Emergency/Page_KDMC - Emergency/button_Add'))
}

WebUI.scrollToElement(findTestObject('Emergency/Page_KDMC - Emergency/input_btnsave'), 20)

WebUI.click(findTestObject('Emergency/Page_KDMC - Emergency/input_btnsave'))

WebUI.delay(3)

RequestNumber = WebUI.getText(findTestObject('Emergency/Page_KDMC - Emergency/font_ERNO100520183'))

Rno = (RequestNumber.split('/')[2])

System.out.println(Rno)

WebUI.click(findTestObject('Emergency/Page_KDMC - Emergency/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('Emergency/Page_KDMC - Emergency/a_dropdown-toggle'))

WebUI.click(findTestObject('Emergency/Page_KDMC - Emergency/a_Sign out'))

WebUI.delay(3)

//++++++++++++++CMO login+++++++++++++++++++++++++++++++++++++
//===================================================================
WebUI.click(findTestObject('Emergency/Page_KDMC/a_CMO'))

WebUI.setText(findTestObject('Emergency/Page_CMO login/input_txtusername'), 'guru')

WebUI.setText(findTestObject('Emergency/Page_CMO login/input_txtpassword'), '123')

WebUI.delay(3)

WebUI.click(findTestObject('Emergency/Page_CMO login/button_Sign in'))

WebUI.delay(2)

WebUI.click(findTestObject('Emergency/Page_KDMC - CMO/a_Department Wise Request'))

WebUI.selectOptionByIndex(findTestObject('Emergency/Page_KDMC - CMO/select_--ALL--'), '7', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Emergency/Page_KDMC - CMO/select_--ALL--                _1'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Emergency/Page_KDMC - CMO/input_btnsearch'))

TestObject ID = WebUI.modifyObjectProperty(findTestObject('Emergency/Page_KDMC - CMO/input_3'), 'xpath', 'equals',
	('//*[@id=' + Rno) + ']', true)

WebUI.click(ID)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Emergency/Page_KDMC - CMO/select_--Select--'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Emergency/Page_KDMC - CMO/input_btnupdate'))

WebUI.delay(2)

WebUI.click(findTestObject('Emergency/Page_KDMC - CMO/button_OK'))

WebUI.delay(2)

WebUI.click(findTestObject('Emergency/Page_KDMC - CMO/a_dropdown-toggle'))

WebUI.click(findTestObject('Emergency/Page_KDMC - CMO/a_Sign out'))

//++++++++++++++DIVISIONAL STORE LOGIN+++++++++++++++++++++++++++++++++++++
//============================================================================
WebUI.delay(3)

WebUI.click(findTestObject('Emergency/Page_KDMC/a_Divisional Store'))

WebUI.setText(findTestObject('Emergency/Page_Divisonal Store Login/input_txtusername'), 'ragu')

WebUI.setText(findTestObject('Emergency/Page_Divisonal Store Login/input_txtpassword'), '123')

WebUI.delay(3)

WebUI.click(findTestObject('Emergency/Page_Divisonal Store Login/button_Sign in'))

WebUI.delay(2)

WebUI.click(findTestObject('Emergency/Page_Store/a_Emergency Request'))

WebUI.click(findTestObject('Emergency/Page_Store/a_Request Item Emergency'))

WebUI.setText(findTestObject('Emergency/Page_Store/input'),Rno)

TestObject ChooseRequest = WebUI.modifyObjectProperty(findTestObject('Emergency/Page_Store/input_3'), 'xpath', 'equals',
	('//*[@id=' + Rno) + ']', true)

WebUI.click(ChooseRequest)

WebUI.delay(2)

selectedoptions1=WebUI.getNumberOfTotalOption(findTestObject('Emergency/Page_Store/select_--Select--Amikacin -500'))

System.out.println("Soptions : "+selectedoptions1)

for(int a=1;a<=selectedoptions1-1;a++)
{

WebUI.selectOptionByIndex(findTestObject('Emergency/Page_Store/select_--Select--Amikacin -500'), a , FailureHandling.STOP_ON_FAILURE)
WebUI.delay(2)
RequestedQty=WebUI.getAttribute(findTestObject('Emergency/Page_Store/input_txttotal'),"value")
System.out.println("Requested QTY : "+RequestedQty)

BatchNumber=WebUI.getNumberOfTotalOption(findTestObject('Emergency/Page_Store/select_--Select--BA1150BA4110'))

for(int g=1;g<=BatchNumber-1;g++)
{

WebUI.selectOptionByIndex(findTestObject('Emergency/Page_Store/select_--Select--BA1150BA4110'), g, FailureHandling.STOP_ON_FAILURE)
WebUI.delay(2)
try
{
	  StockQty=WebUI.getAttribute(findTestObject('Emergency/Page_Store/input_txtprice'),"value")
	  System.out.println("Stock QTY : "+StockQty)
	  WebUI.delay(2)
	  
	  if(Integer.valueOf(StockQty)>=Integer.valueOf(RequestedQty))
	  {
		  WebUI.delay(1)
		  WebUI.setText(findTestObject('Emergency/Page_Store/input_txtqty'), '50')
		  
		  WebUI.click(findTestObject('Emergency/Page_Store/button_Add'))
		  break;
	  }
	  else
	  {
		  System.out.println("Stock Is Less Than Requested Qty")
	  }
}
 
catch (Exception e)
{
WebUI.click(findTestObject('Emergency/Page_Store/button_OK'))
continue
}
}
}

WebUI.scrollToElement(findTestObject('Emergency/Page_Store/input_btnSubmit'),20)

WebUI.click(findTestObject('Emergency/Page_Store/input_btnSubmit'))
WebUI.delay(3)


WebUI.delay(3)

WebUI.click(findTestObject('Emergency/Page_Store/a_dropdown-toggle'))

WebUI.click(findTestObject('Emergency/Page_Store/a_Sign out'))

WebUI.closeBrowser()

System.out.println("Schedule 3 Emergency Request Are Working Successfully")

