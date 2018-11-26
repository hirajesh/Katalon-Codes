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

WebUI.click(findTestObject('HealthpostToStore/Page_KDMC/a_Healthpost Store'))

WebUI.setText(findTestObject('HealthpostToStore/Page_HealthPost Store Login/input_txtusername'), 'raguram')

WebUI.setText(findTestObject('HealthpostToStore/Page_HealthPost Store Login/input_txtpassword'), '123')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('HealthpostToStore/Page_HealthPost Store Login/input_txtpassword'), Keys.chord(Keys.ENTER))


WebUI.delay(3)

WebUI.click(findTestObject('HealthpostToStore/Page_HealthPost Store/a_Request to Store'))

WebUI.delay(1)

WebUI.click(findTestObject('HealthpostToStore/Page_HealthPost Store/a_Medicine Request'))

WebUI.delay(1)

WebUI.selectOptionByIndex(findTestObject('HealthpostToStore/Page_HealthPost Store/select_--Select--Schedule 1Inj'), '11', FailureHandling.STOP_ON_FAILURE)

medicineslength = WebUI.getNumberOfTotalOption(findTestObject('HealthpostToStore/Page_HealthPost Store/select_--Select--Adernaline 0.'))

for (int e = 1; e <= (medicineslength - 1); e++) {
    WebUI.selectOptionByIndex(findTestObject('HealthpostToStore/Page_HealthPost Store/select_--Select--Schedule 1Inj'), '11', FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByIndex(findTestObject('HealthpostToStore/Page_HealthPost Store/select_--Select--Adernaline 0.'), e, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('HealthpostToStore/Page_HealthPost Store/input_txttreat'), '10')

    WebUI.click(findTestObject('HealthpostToStore/Page_HealthPost Store/button_Add'))
}

WebUI.scrollToElement(findTestObject('HealthpostToStore/Page_HealthPost Store/input_btnsave'), 20)

WebUI.click(findTestObject('HealthpostToStore/Page_HealthPost Store/input_btnsave'))

WebUI.delay(3)

RN1 = WebUI.getText(findTestObject('HealthpostToStore/Page_HealthPost Store/font_HPRNO180520187'))

System.out.println(RN1)

RID = (RN1.split('/')[2])

WebUI.click(findTestObject('HealthpostToStore/Page_HealthPost Store/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('HealthpostToStore/Page_HealthPost Store/a_dropdown-toggle'))

WebUI.click(findTestObject('HealthpostToStore/Page_HealthPost Store/a_Sign out'))

WebUI.delay(3)

//+++++++++++++++++++++++++++CMO LOGIN+++++++++++++++++++++++++++++++++++++++++++
//===================================================================================
WebUI.navigateToUrl('http://192.168.137.1/multihospital_new/')

WebUI.click(findTestObject('HealthpostToStore/Page_KDMC/a_CMO'))

WebUI.setText(findTestObject('HealthpostToStore/Page_CMO login/input_txtusername'), 'guru')

WebUI.setText(findTestObject('HealthpostToStore/Page_CMO login/input_txtpassword'), '123')

WebUI.delay(3)

WebUI.click(findTestObject('HealthpostToStore/Page_CMO login/button_Sign in'))

WebUI.click(findTestObject('HealthpostToStore/Page_KDMC - CMO/a_Department Wise Request'))

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('HealthpostToStore/Page_KDMC - CMO/select_--ALL--'), '5', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HealthpostToStore/Page_KDMC - CMO/input_btnsearch'))

WebUI.selectOptionByIndex(findTestObject('HealthpostToStore/Page_KDMC - CMO/select_--ALL--                _1'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HealthpostToStore/Page_KDMC - CMO/input_btnsearch'))

TestObject ID = WebUI.modifyObjectProperty(findTestObject('lab/Page_KDMC - CMO/input_1'), 'xpath', 'equals', ('//*[@id=' + 
    RID) + ']', true)

WebUI.click(ID)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('HealthpostToStore/Page_KDMC - CMO/select_--Select--'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HealthpostToStore/Page_KDMC - CMO/input_btnupdate'))

WebUI.delay(2)

WebUI.click(findTestObject('HealthpostToStore/Page_KDMC - CMO/button_OK'))

WebUI.delay(2)

WebUI.click(findTestObject('HealthpostToStore/Page_KDMC - CMO/a_dropdown-toggle'))

WebUI.click(findTestObject('HealthpostToStore/Page_KDMC - CMO/a_Sign out'))

WebUI.delay(3)

//+++++++++++++++++++++++++++STORE LOGIN+++++++++++++++++++++++++++++++++++++++++++
//===================================================================================
WebUI.click(findTestObject('HealthpostToStore/Page_KDMC/a_Divisional Store'))

WebUI.setText(findTestObject('HealthpostToStore/Page_Divisonal Store Login/input_txtusername'), 'ragu')

WebUI.setText(findTestObject('HealthpostToStore/Page_Divisonal Store Login/input_txtpassword'), '123')

WebUI.delay(3)

WebUI.click(findTestObject('HealthpostToStore/Page_Divisonal Store Login/button_Sign in'))

WebUI.delay(3)

WebUI.click(findTestObject('HealthpostToStore/Page_Store/a_Health Post Request'))

WebUI.click(findTestObject('HealthpostToStore/Page_Store/a_Request Item HealthPost'))

TestObject ChooseRequest = WebUI.modifyObjectProperty(findTestObject('lab/Page_Store/input_1'), 'xpath', 'equals', ('//*[@id=' + 
    RID) + ']', true)

WebUI.click(ChooseRequest)

selectedoptions = WebUI.getNumberOfTotalOption(findTestObject('HealthpostToStore/Page_Store/select_--Select--Adernaline 0.'))

for (int a = 1; a <= (selectedoptions - 1); a++) {
    WebUI.selectOptionByIndex(findTestObject('HealthpostToStore/Page_Store/select_--Select--Adernaline 0.'), a, FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2)

    RequestedQty = WebUI.getAttribute(findTestObject('HealthpostToStore/Page_Store/input_txttotal'), 'value')

    System.out.println('Requested QTY : ' + RequestedQty)

    BatchNumber = WebUI.getNumberOfTotalOption(findTestObject('HealthpostToStore/Page_Store/select_--Select--BA1170BA2376B'))

    for (int g = 1; g <= (BatchNumber - 1); g++) {
        WebUI.selectOptionByIndex(findTestObject('HealthpostToStore/Page_Store/select_--Select--BA1170BA2376B'), g, FailureHandling.STOP_ON_FAILURE)

        try {
            StockQty = WebUI.getAttribute(findTestObject('HealthpostToStore/Page_Store/input_txtprice'), 'value')

            System.out.println('Stock QTY : ' + StockQty)

            WebUI.delay(2)

            if (String.valueOf(StockQty) >= String.valueOf(RequestedQty)) {
                WebUI.setText(findTestObject('HealthpostToStore/Page_Store/input_txtqty'), '10')

                WebUI.click(findTestObject('HealthpostToStore/Page_Store/button_Add'))

                break
            } else {
                System.out.println('Stock Is Less Than Requested Qty')
            }
        }
        catch (Exception e) {
            WebUI.click(findTestObject('HealthpostToStore/Page_Store/button_OK'))

            continue
        } 
    }
}

WebUI.scrollToElement(findTestObject('HealthpostToStore/Page_Store/input_btnSubmit'), 20)

WebUI.click(findTestObject('HealthpostToStore/Page_Store/input_btnSubmit'))

WebUI.delay(3)

WebUI.click(findTestObject('HealthpostToStore/Page_Store/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('HealthpostToStore/Page_Store/a_dropdown-toggle'))

WebUI.click(findTestObject('HealthpostToStore/Page_Store/a_Sign out'))

WebUI.closeBrowser()

