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

System.out.println("Verify Schedule 12 Inpatient Request Are Working Successfully Or Not")

WebUI.navigateToUrl('http://192.168.137.1/multihospital_new/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Inpatient Request/Page_KDMC/a_In Patient'))

WebUI.setText(findTestObject('Inpatient Request/Page_INPATIENT LOGIN/input_txtusername'), 'brintha')

WebUI.setText(findTestObject('Inpatient Request/Page_INPATIENT LOGIN/input_txtpassword'), '123')

WebUI.delay(3)

WebUI.click(findTestObject('Inpatient Request/Page_INPATIENT LOGIN/button_Sign in'))

WebUI.delay(3)

WebUI.scrollToPosition(300, 300)

WebUI.delay(2)

//WebUI.click(findTestObject('Inpatient Request/Page_KDMC/a_Store Request'))
//WebUI.click(findTestObject('Inpatient Request/Page_KDMC/a_Stock List'))
//WebUI.click(findTestObject('Inpatient Request/Page_KDMC/a_Store Request_1'))
//WebUI.delay(3)
WebUI.navigateToUrl('http://192.168.137.1/Multihospital_New/StoresRequest.aspx')

//WebUI.click(findTestObject('Inpatient Request/Page_KDMC/a_Medicine Request'))
WebUI.delay(3)

WebUI.refresh()

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('Inpatient Request/Page_KDMC/select_--Select--ChildrensGene'), '3', FailureHandling.STOP_ON_FAILURE)

Inpatient_RequestNumber = WebUI.getAttribute(findTestObject('Inpatient Request/Page_KDMC/input_txtno'), 'value')

RequestNo = (Inpatient_RequestNumber.split('/')[2])

System.out.println('RqID : ' + RequestNo)

WebUI.selectOptionByIndex(findTestObject('Inpatient Request/Page_KDMC/select_--Select--Schedule 5Dru'), '3', FailureHandling.STOP_ON_FAILURE)

selectedoptions = WebUI.getNumberOfTotalOption(findTestObject('Inpatient Request/Page_KDMC/select_--Select--Alcohol Rub i'))

for (int i = 1; i <selectedoptions; i++) {
    WebUI.selectOptionByIndex(findTestObject('Inpatient Request/Page_KDMC/select_--Select--Schedule 5Dru'), '3', FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByIndex(findTestObject('Inpatient Request/Page_KDMC/select_--Select--Alcohol Rub i'), i, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Inpatient Request/Page_KDMC/input_txttreat'), '5')

    WebUI.click(findTestObject('Inpatient Request/Page_KDMC/button_Add'))
}

WebUI.scrollToElement(findTestObject('Inpatient Request/Page_KDMC/input_btnsave'), 20)

WebUI.click(findTestObject('Inpatient Request/Page_KDMC/input_btnsave'))

WebUI.delay(3)

WebUI.click(findTestObject('Inpatient Request/Page_KDMC/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('Inpatient Request/Page_KDMC/a_dropdown-toggle'))

WebUI.click(findTestObject('Inpatient Request/Page_KDMC/a_Sign out'))

WebUI.delay(3)

//CMO LOGIN
//==============
WebUI.click(findTestObject('Inpatient Request/Page_KDMC/a_CMO'))

WebUI.setText(findTestObject('Inpatient Request/Page_CMO login/input_txtusername'), 'guru')

WebUI.setText(findTestObject('Inpatient Request/Page_CMO login/input_txtpassword'), '123')

WebUI.delay(3)

WebUI.click(findTestObject('Inpatient Request/Page_CMO login/button_Sign in'))

WebUI.delay(3)

WebUI.click(findTestObject('Inpatient Request/Page_KDMC - CMO/a_Department Wise Request'))

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Inpatient Request/Page_KDMC - CMO/select_--ALL--'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Inpatient Request/Page_KDMC - CMO/select_--ALL--                _1'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Inpatient Request/Page_KDMC - CMO/input_btnsearch'))

WebUI.delay(2)

TestObject ID = WebUI.modifyObjectProperty(findTestObject('Inpatient Request/Page_KDMC - CMO/input_1'), 'xpath', 'equals', 
    ('//*[@id=' + RequestNo) + ']', true)

WebUI.click(ID)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Inpatient Request/Page_KDMC - CMO/select_--Select--'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Inpatient Request/Page_KDMC - CMO/input_btnupdate'))

WebUI.delay(2)

WebUI.click(findTestObject('Inpatient Request/Page_KDMC - CMO/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('Inpatient Request/Page_KDMC - CMO/a_dropdown-toggle'))

WebUI.click(findTestObject('Inpatient Request/Page_KDMC - CMO/a_Sign out'))

WebUI.delay(3)

WebUI.click(findTestObject('Inpatient Request/Page_KDMC/a_Divisional Store'))

WebUI.setText(findTestObject('Inpatient Request/Page_Divisonal Store Login/input_txtusername'), 'ragu')

WebUI.setText(findTestObject('Inpatient Request/Page_Divisonal Store Login/input_txtpassword'), '123')

WebUI.delay(3)

WebUI.click(findTestObject('Inpatient Request/Page_Divisonal Store Login/button_Sign in'))

WebUI.delay(3)

WebUI.click(findTestObject('Inpatient Request/Page_Store/a_Inpatient Request'))

WebUI.click(findTestObject('Inpatient Request/Page_Store/a_Request Item Inpatient'))

WebUI.setText(findTestObject('Inpatient Request/Page_Store/input'), Inpatient_RequestNumber)

TestObject InpID = WebUI.modifyObjectProperty(findTestObject('Inpatient Request/Page_Store/input_1'), 'xpath', 'equals', 
    ('//*[@id=' + RequestNo) + ']', true)

WebUI.click(InpID)

medicine = WebUI.getNumberOfTotalOption(findTestObject('Inpatient Request/Page_Store/select_--Select--Alcohol Rub i'))

for (int j = 1; j <=medicine-1; j++) {
	
    WebUI.selectOptionByIndex(findTestObject('Inpatient Request/Page_Store/select_--Select--Alcohol Rub i'), j, FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2)

    RequestedQty = WebUI.getAttribute(findTestObject('Inpatient Request/Page_Store/input_txttotal'), "value")

    System.out.println('RequestedQty IS : ' + RequestedQty)

    BatchNo = WebUI.getNumberOfTotalOption(findTestObject('Inpatient Request/Page_Store/select_--Select--BA2910'))

    for (int k = 1; k <=BatchNo-1 ; k++) {
        WebUI.selectOptionByIndex(findTestObject('Inpatient Request/Page_Store/select_--Select--BA2910'), k, FailureHandling.STOP_ON_FAILURE)

        WebUI.delay(2)

        StockQty = WebUI.getAttribute(findTestObject('Inpatient Request/Page_Store/input_txtprice'), "value")

        System.out.println('StockQty IS : ' + StockQty)
		
		if(Integer.valueOf(StockQty)>Integer.valueOf(RequestedQty))
		{
		WebUI.delay(1)
		
		WebUI.setText(findTestObject('Inpatient Request/Page_Store/input_txtqty'), '5')
		
		WebUI.click(findTestObject('Inpatient Request/Page_Store/button_Add'))
		break;
		}
else
	 {
		 System.out.println("Stock Is Less Than Requested Qty")
        }
    }
}

//WebUI.rightClick(findTestObject('Inpatient Request/Page_Store/input_btnCancel'))
WebUI.scrollToElement(findTestObject('Inpatient Request/Page_Store/input_btnSubmit'), 20)

WebUI.click(findTestObject('Inpatient Request/Page_Store/input_btnSubmit'))

WebUI.delay(3)

WebUI.click(findTestObject('Inpatient Request/Page_Store/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('Inpatient Request/Page_Store/a_dropdown-toggle'))

WebUI.click(findTestObject('Inpatient Request/Page_Store/a_Sign out'))

WebUI.closeBrowser()

System.out.println("Schedule 12 Inpatient Request Are Working Successfully")