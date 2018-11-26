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
import com.sun.jna.Structure.FFIType.size_t
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

System.out.println("Verify Schedule 9 Pharmacy Request Are Working Successfully Or Not")

//WebUI.navigateToUrl('http://182.18.161.229/multihospital_new')

WebUI.navigateToUrl('http://192.168.137.1/multihospital_new/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('PharmacyRequest/Page_KDMC/a_Pharmacy'))

WebUI.setText(findTestObject('PharmacyRequest/Page_Pharmacy login/input_txtusername'), 'raja')

WebUI.setText(findTestObject('PharmacyRequest/Page_Pharmacy login/input_txtpassword'), '123')

WebUI.delay(3)

WebUI.click(findTestObject('PharmacyRequest/Page_Pharmacy login/button_Sign in'))

WebUI.delay(3)

WebUI.click(findTestObject('PharmacyRequest/Page_KDMC - Pharmacy/a_Inventory'))

WebUI.delay(2)

WebUI.click(findTestObject('PharmacyRequest/Page_KDMC-Pharmacy/a_Store Request'))

WebUI.delay(1)

WebUI.click(findTestObject('PharmacyRequest/Page_KDMC-Pharmacy/a_Medicine Request'))

WebUI.selectOptionByIndex(findTestObject('PharmacyRequest/Page_KDMC-Pharmacy/select_--Select--Schedule 1Inj'), '9', FailureHandling.STOP_ON_FAILURE)

MedicineLength=WebUI.getNumberOfTotalOption(findTestObject('PharmacyRequest/Page_KDMC-Pharmacy/select_--Select--Albendazole'))

for(int l=1;l<=MedicineLength-1;l++)
{

WebUI.selectOptionByIndex(findTestObject('PharmacyRequest/Page_KDMC-Pharmacy/select_--Select--Schedule 1Inj'), '9', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('PharmacyRequest/Page_KDMC-Pharmacy/select_--Select--Albendazole'), l, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('PharmacyRequest/Page_KDMC-Pharmacy/input_txttreat'), '10')

WebUI.click(findTestObject('PharmacyRequest/Page_KDMC-Pharmacy/button_Add'))



}

RN1 = WebUI.getAttribute(findTestObject('PharmacyRequest/Page_KDMC-Pharmacy/input_txtno'), 'value')

System.out.println(RN1)

RID = (RN1.split('/')[2])

WebUI.scrollToElement(findTestObject('PharmacyRequest/Page_KDMC-Pharmacy/input_btnsave'), 20)

WebUI.click(findTestObject('PharmacyRequest/Page_KDMC-Pharmacy/input_btnsave'))

WebUI.delay(3)

//WebUI.rightClick(findTestObject('PharmacyRequest/Page_KDMC-Pharmacy/div_Request Sent Successfully'))
WebUI.click(findTestObject('PharmacyRequest/Page_KDMC-Pharmacy/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('PharmacyRequest/Page_KDMC-Pharmacy/a_Back to Pharmacy'))

WebUI.delay(3)

WebUI.click(findTestObject('PharmacyRequest/Page_KDMC - Pharmacy/a_dropdown-toggle'))

WebUI.click(findTestObject('PharmacyRequest/Page_KDMC - Pharmacy/a_Sign out'))

WebUI.delay(3)

//    CMO
//============

WebUI.click(findTestObject('PharmacyRequest/Page_KDMC/a_CMO'))

WebUI.setText(findTestObject('PharmacyRequest/Page_CMO login/input_txtusername'), 'guru')

WebUI.setText(findTestObject('PharmacyRequest/Page_CMO login/input_txtpassword'), '123')

WebUI.delay(3)

WebUI.click(findTestObject('PharmacyRequest/Page_CMO login/button_Sign in'))

WebUI.click(findTestObject('PharmacyRequest/Page_KDMC - CMO/a_Department Wise Request'))


WebUI.selectOptionByIndex(findTestObject('PharmacyRequest/Page_KDMC - CMO/select_--ALL--'), '2', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('PharmacyRequest/Page_KDMC - CMO/select_--ALL--                _1'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PharmacyRequest/Page_KDMC - CMO/input_btnsearch'))

TestObject ID = WebUI.modifyObjectProperty(findTestObject('PharmacyRequest/Page_KDMC - CMO/input_2'), 'xpath', 'equals', 
    ('//*[@id=' + RID) + ']', true)

WebUI.click(ID)

WebUI.delay(3)

//TestObject ID = WebUI.modifyObjectProperty(findTestObject('store Request Schedule 1/Page_KDMC - CMS/input_PRNO050520189'),'xpath', equals('//*[@id =' + CR) + ']', true)
WebUI.selectOptionByIndex(findTestObject('PharmacyRequest/Page_KDMC - CMO/select_--Select--'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PharmacyRequest/Page_KDMC - CMO/input_btnupdate'))

WebUI.delay(3)

WebUI.click(findTestObject('PharmacyRequest/Page_KDMC - CMO/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('PharmacyRequest/Page_KDMC - CMO/a_dropdown-toggle'))

WebUI.click(findTestObject('PharmacyRequest/Page_KDMC - CMO/a_Sign out'))

WebUI.delay(3)

//DIVISIONAL STORE LOGIN
//=======================

WebUI.click(findTestObject('PharmacyRequest/Page_KDMC/a_Divisional Store'))

WebUI.setText(findTestObject('PharmacyRequest/Page_Divisonal Store Login/input_txtusername'), 'ragu')

WebUI.setText(findTestObject('PharmacyRequest/Page_Divisonal Store Login/input_txtpassword'), '123')

WebUI.delay(3)

WebUI.click(findTestObject('PharmacyRequest/Page_Divisonal Store Login/button_Sign in'))

WebUI.delay(3)

WebUI.click(findTestObject('PharmacyRequest/Page_Store/a_Pharmacy Request'))

WebUI.click(findTestObject('PharmacyRequest/Page_Store/a_Request Item Pharmacy'))

WebUI.delay(2)

WebUI.setText(findTestObject('PharmacyRequest/Page_Store/input'), RN1)

WebUI.delay(2)

TestObject ChooseRequest = WebUI.modifyObjectProperty(findTestObject('PharmacyRequest/Page_Store/input_2'), 'xpath', 'equals', 
    ('//*[@id=' + RID) + ']', true)

WebUI.click(ChooseRequest)

WebUI.delay(2)

selectedoptions=WebUI.getNumberOfTotalOption(findTestObject('PharmacyRequest/Page_Store/select_--Select--Amlodepin -5'))

for(int a=1;a<=selectedoptions-1;a++)
{

WebUI.selectOptionByIndex(findTestObject('PharmacyRequest/Page_Store/select_--Select--Amlodepin -5'), a, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

//boolean outofstock=WebUI.check(findTestObject('PharmacyRequest/Page_Store/button_OK1'))

/*if (WebUI.(findTestObject('PharmacyRequest/Page_Store/button_OK1'))==false)
 {
	
 }
 else
 {
	 WebUI.click(findTestObject('PharmacyRequest/Page_Store/button_OK1'))
 }
*/

RequestedQty=WebUI.getAttribute(findTestObject('PharmacyRequest/Page_Store/input_txttotal'),"value")
System.out.println("Requested QTY : "+RequestedQty)

BatchNumber=WebUI.getNumberOfTotalOption(findTestObject('PharmacyRequest/Page_Store/select_--Select--BA50'))

for(int g=1;g<=BatchNumber-1;g++)
{
WebUI.selectOptionByIndex(findTestObject('PharmacyRequest/Page_Store/select_--Select--BA50'), g, FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)
StockQty=WebUI.getAttribute(findTestObject('PharmacyRequest/Page_Store/input_txtprice'),"value")
System.out.println("Stock QTY : "+StockQty)
WebUI.delay(1)

if(Integer.valueOf(StockQty)>=Integer.valueOf(RequestedQty))
{
	WebUI.setText(findTestObject('PharmacyRequest/Page_Store/input_txtqty'), '10')
	
	WebUI.click(findTestObject('PharmacyRequest/Page_Store/button_Add'))
	break;
}
else
{
	System.out.println("Stock Is Less Than Requested Qty")
}

}
}

WebUI.scrollToElement(findTestObject('PharmacyRequest/Page_Store/input_btnSubmit'),20)

WebUI.click(findTestObject('PharmacyRequest/Page_Store/input_btnSubmit'))


WebUI.delay(3)

WebUI.click(findTestObject('PharmacyRequest/Page_Store/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('PharmacyRequest/Page_Store/a_dropdown-toggle'))

WebUI.click(findTestObject('PharmacyRequest/Page_Store/a_Sign out'))

WebUI.closeBrowser()

System.out.println("Schedule 9 Pharmacy Request Are Working Successfully")
















/*WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.137.1/multihospital_new/')

WebUI.click(findTestObject('Request11/Page_KDMC/a_Pharmacy'))

WebUI.setText(findTestObject('Request11/Page_Pharmacy login/input_txtusername'), 'raja')

WebUI.click(findTestObject('Request11/Page_Pharmacy login/div_Secure keyboard input is e'))

WebUI.setText(findTestObject('Request11/Page_Pharmacy login/input_txtpassword'), '123')

WebUI.click(findTestObject('Request11/Page_Pharmacy login/button_Sign in'))

WebUI.click(findTestObject('Request11/Page_KDMC - Pharmacy/a_Inventory'))

WebUI.click(findTestObject('Request11/Page_KDMC-Pharmacy/a_Store Request'))

WebUI.click(findTestObject('Request11/Page_KDMC-Pharmacy/a_Medicine Request'))

WebUI.selectOptionByValue(findTestObject('Request11/Page_KDMC-Pharmacy/select_--Select--Schedule 1Inj'), '2', true)

WebUI.selectOptionByValue(findTestObject('Request11/Page_KDMC-Pharmacy/select_--Select--Albendazole'), '79', true)

WebUI.setText(findTestObject('Request11/Page_KDMC-Pharmacy/input_txttreat'), '20')

WebUI.click(findTestObject('Request11/Page_KDMC-Pharmacy/button_Add'))

WebUI.click(findTestObject('Request11/Page_KDMC-Pharmacy/input_btnsave'))

WebUI.click(findTestObject('Request11/Page_KDMC-Pharmacy/button_OK'))

WebUI.click(findTestObject('Request11/Page_KDMC-Pharmacy/a_Back to Pharmacy'))

WebUI.click(findTestObject('Request11/Page_KDMC - Pharmacy/a_dropdown-toggle'))

WebUI.click(findTestObject('Request11/Page_KDMC - Pharmacy/a_Sign out'))

WebUI.click(findTestObject('Request11/Page_KDMC/a_CMO'))

WebUI.setText(findTestObject('Request11/Page_CMO login/input_txtusername'), 'guru')

WebUI.setText(findTestObject('Request11/Page_CMO login/input_txtpassword'), '123')

WebUI.click(findTestObject('Request11/Page_CMO login/button_Sign in'))

WebUI.click(findTestObject('Request11/Page_KDMC - CMO/a_Department Wise Request'))

WebUI.click(findTestObject('Request11/Page_KDMC - CMO/input_21'))

WebUI.selectOptionByIndex(findTestObject('Request11/Page_KDMC - CMO/select_--Select--'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Request11/Page_KDMC - CMO/input_btnupdate'))

WebUI.click(findTestObject('Request11/Page_KDMC - CMO/button_OK'))

WebUI.click(findTestObject('Request11/Page_KDMC - CMO/a_dropdown-toggle'))

WebUI.click(findTestObject('Request11/Page_KDMC - CMO/a_Sign out'))

WebUI.click(findTestObject('Request11/Page_KDMC/a_Divisional Store'))

WebUI.setText(findTestObject('Request11/Page_Divisonal Store Login/input_txtusername'), 'ragu')

WebUI.setText(findTestObject('Request11/Page_Divisonal Store Login/input_txtpassword'), '123')

WebUI.click(findTestObject('Request11/Page_Divisonal Store Login/button_Sign in'))

WebUI.click(findTestObject('Request11/Page_Store/a_Pharmacy Request'))

WebUI.click(findTestObject('Request11/Page_Store/a_Request Item Pharmacy'))

WebUI.click(findTestObject('Request11/Page_Store/input_21'))

WebUI.selectOptionByIndex(findTestObject('Request11/Page_Store/select_--Select--Amlodepin -5'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Request11/Page_Store/select_--Select--BA50'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Request11/Page_Store/input_txtqty'), '10')

WebUI.click(findTestObject('Request11/Page_Store/button_Add'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Request11/Page_Store/input_btnSubmit'), 20)

WebUI.click(findTestObject('Request11/Page_Store/input_btnSubmit'))

WebUI.delay(3)

WebUI.click(findTestObject('Request11/Page_Store/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('Request11/Page_Store/a_dropdown-toggle'))

WebUI.click(findTestObject('Request11/Page_Store/a_Sign out'))

WebUI.closeBrowser()

WebUI.delay(3)

WebUI.click(findTestObject('PharmacyRequest/Page_Store/button_OK'))

WebUI.click(findTestObject('PharmacyRequest/Page_KDMC - CMS/a_dropdown-toggle'))

WebUI.click(findTestObject('PharmacyRequest/Page_KDMC - CMS/a_Sign out'))

*/