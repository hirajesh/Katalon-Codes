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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

System.out.println("Verify Schedule 1 STORE Request Are Working Successfully Or Not")

WebUI.navigateToUrl('http://192.168.137.1/multihospital_new/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Store Request Schedule 1/Page_KDMC/a_Divisional Store'))

WebUI.setText(findTestObject('Store Request Schedule 1/Page_Divisonal Store Login/input_txtusername'), 'ragu')

WebUI.setText(findTestObject('Store Request Schedule 1/Page_Divisonal Store Login/input_txtpassword'), '123')

WebUI.delay(3)

WebUI.click(findTestObject('Store Request Schedule 1/Page_Divisonal Store Login/button_Sign in'))

WebUI.delay(3)

WebUI.click(findTestObject('Store Request Schedule 1/Page_Store/a_CMS'))

WebUI.delay(2)

WebUI.click(findTestObject('Store Request Schedule 1/Page_Store/a_Request Send'))

WebUI.selectOptionByIndex(findTestObject('Store Request Schedule 1/Page_Store/select_--Select--'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Store Request Schedule 1/Page_Store/select_--Select--Schedule 1Inj'), '9', FailureHandling.STOP_ON_FAILURE)

SelectedOptions = WebUI.getNumberOfTotalOption(findTestObject('Store Request Schedule 1/Page_Store/select_--Select--Adernaline 0.'))

for (int y = 1; y <5  ; y++) {
    WebUI.selectOptionByIndex(findTestObject('Store Request Schedule 1/Page_Store/select_--Select--Schedule 1Inj'), '9', 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(1)

    WebUI.selectOptionByIndex(findTestObject('Store Request Schedule 1/Page_Store/select_--Select--Adernaline 0.'), y, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Store Request Schedule 1/Page_Store/input_txttreat'), '100')

    WebUI.click(findTestObject('Store Request Schedule 1/Page_Store/button_Add'))
}

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Store Request Schedule 1/Page_Store/input_btnsave'), 20)

WebUI.click(findTestObject('Store Request Schedule 1/Page_Store/input_btnsave'))

WebUI.delay(4)

Cms_RequestNumber = WebUI.getText(findTestObject('Store Request Schedule 1/Page_Store/font_PRNO050520189'))

CR = Cms_RequestNumber.trim()

System.out.println('RQ :' + Cms_RequestNumber)

RequestNumberID = Cms_RequestNumber.split('/')[2].trim()

System.out.println('RQ ID :' + RequestNumberID)

WebUI.delay(3)

TestObject ok = WebUI.click(findTestObject('Store Request Schedule 1/Page_Store/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('Store Request Schedule 1/Page_Store/a_dropdown-toggle'))

WebUI.click(findTestObject('Store Request Schedule 1/Page_Store/a_Sign out'))

WebUI.delay(3)

//CMO APPROVAL
WebUI.click(findTestObject('Store Request Schedule 1/Page_KDMC/a_CMO'))

WebUI.setText(findTestObject('Store Request Schedule 1/Page_CMO login/input_txtusername'), 'guru')

WebUI.setText(findTestObject('Store Request Schedule 1/Page_CMO login/input_txtpassword'), '123')

WebUI.delay(3)

WebUI.click(findTestObject('Store Request Schedule 1/Page_CMO login/button_Sign in'))

WebUI.delay(2)

WebUI.click(findTestObject('Store Request Schedule 1/Page_KDMC - CMO/span_Department Wise Request'))

WebUI.click(findTestObject('Store Request Schedule 1/Page_KDMC - CMO/a_CMS Request'))

WebUI.click(findTestObject('Store Request Schedule 1/Page_KDMC - CMO/a_CMS Request'))

WebUI.click(findTestObject('Store Request Schedule 1/Page_KDMC - CMO/span_Divisional Store Request'))

WebUI.delay(2)

TestObject approval = WebUI.modifyObjectProperty(findTestObject('Store Request Schedule 1/Page_KDMC - CMO/input_PRNO050520189'), 
    'xpath', 'equals', ('//*[@id=' + RequestNumberID) + ']', true)

//WebUI.scrollToElement(findTestObject(approval), 20)
WebUI.click(approval)

WebUI.delay(2)

//WebUI.click(findTestObject('Store Request Schedule 1/Page_KDMC - CMO/input_9'))
WebUI.selectOptionByIndex(findTestObject('Store Request Schedule 1/Page_KDMC - CMO/select_--Select--'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Store Request Schedule 1/Page_KDMC - CMO/input_btnupdate'))

WebUI.delay(2)

WebUI.click(findTestObject('Store Request Schedule 1/Page_KDMC - CMO/button_OK'))

WebUI.delay(2)

WebUI.click(findTestObject('Store Request Schedule 1/Page_KDMC - CMO/a_dropdown-toggle'))

WebUI.click(findTestObject('Store Request Schedule 1/Page_KDMC - CMO/a_Sign out'))

WebUI.delay(3)

//CMS DISPATH ITEMS
WebUI.click(findTestObject('store Request Schedule 1/Page_KDMC/a_CMS'))

WebUI.setText(findTestObject('store Request Schedule 1/Page_CMS login/input_txtusername'), 'bala')

WebUI.setText(findTestObject('store Request Schedule 1/Page_CMS login/input_txtpassword'), '123')

WebUI.delay(3)

WebUI.click(findTestObject('store Request Schedule 1/Page_CMS login/button_Sign in'))

WebUI.delay(2)

WebUI.click(findTestObject('store Request Schedule 1/Page_KDMC - CMS/a_Divisional Store'))

WebUI.delay(2)

WebUI.click(findTestObject('store Request Schedule 1/Page_KDMC - CMS/a_Dispatch Items'))

WebUI.setText(findTestObject('store Request Schedule 1/Page_KDMC - CMS/input'), Cms_RequestNumber)

WebUI.click(findTestObject('store Request Schedule 1/Page_KDMC - CMS/td_text-center'))

//TestObject ID = WebUI.modifyObjectProperty(findTestObject('store Request Schedule 1/Page_KDMC - CMS/input_PRNO050520189'),'xpath', 'equals','//*[@id =' +CR+ ']', true)
//WebUI.click(ID)
WebUI.delay(2)

for (int row = 0; row <5 - 1; row++) {
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

        Rqty = 10000

        WebUI.delay(2)

        System.out.println('BatchQty : ' + batchqty)

        System.out.println('RQty : ' + Rqty)

        if (String.valueOf(batchqty) >= String.valueOf(Rqty)) {
            break
        } else {
            System.out.println('Batchqty Is Less Than Rqty')
        }
    }
}

/*//WebUI.selectOptionByIndex(findTestObject('store Request Schedule 1/Page_KDMC - CMS/select_--Select--BA1271BA4110B'), '1')
TestObject selectbatch=WebUI.modifyObjectProperty(findTestObject('store Request Schedule 1/Page_KDMC - CMS/select_--Select--BA1271BA4110B'), 'xpath', 'equals', '//*[@id=fldvendor0]', true)
//WebUI.selectOptionByIndex(findTestObject('store Request Schedule 1/Page_KDMC - CMS/select_--Select--BA1271BA4110B'), '1', FailureHandling.STOP_ON_FAILURE)
	WebUI.delay(2)
	WebUI.click(selectbatch)*/
WebUI.click(findTestObject('store Request Schedule 1/Page_KDMC - CMS/input_btndispatch'))

WebUI.delay(3)

WebUI.click(findTestObject('store Request Schedule 1/Page_KDMC - CMS/button_OK'))

WebUI.click(findTestObject('store Request Schedule 1/Page_KDMC - CMS/a_dropdown-toggle'))

WebUI.click(findTestObject('store Request Schedule 1/Page_KDMC - CMS/a_Sign out'))

WebUI.delay(3)

WebUI.click(findTestObject('Store Request Schedule 1/Page_KDMC/a_Divisional Store'))

WebUI.setText(findTestObject('Store Request Schedule 1/Page_Divisonal Store Login/input_txtusername'), 'ragu')

WebUI.setText(findTestObject('Store Request Schedule 1/Page_Divisonal Store Login/input_txtpassword'), '123')

WebUI.delay(3)

WebUI.click(findTestObject('Store Request Schedule 1/Page_Divisonal Store Login/button_Sign in'))

WebUI.delay(3)

WebUI.click(findTestObject('Store Request Schedule 1/Page_Store/a_CMS'))

WebUI.delay(2)

WebUI.click(findTestObject('Store Request Schedule 1/Page_Store/a_Receiving Goods'))

WebUI.setText(findTestObject('Store Request Schedule 1/Page_Store/input'), CR)

WebUI.click(findTestObject('Store Request Schedule 1/Page_Store/input_btn btn-primary'))

WebUI.delay(2)

WebUI.click(findTestObject('Store Request Schedule 1/Page_Store/input_chkrem'))

WebUI.scrollToElement(findTestObject('Store Request Schedule 1/Page_Store/input_btchkroqadd'),20)

WebUI.click(findTestObject('Store Request Schedule 1/Page_Store/input_btchkroqadd'))

WebUI.delay(2)

WebUI.refresh()

//WebUI.sendKeys(findTestObject('Store Request Schedule 1/Page_Store/button_OK1'), Keys.chord(Keys.ESCAPE))

WebUI.delay(3)

WebUI.click(findTestObject('Store Request Schedule 1/Page_Store/a_dropdown-toggle'))

WebUI.click(findTestObject('Store Request Schedule 1/Page_Store/a_Sign out'))

WebUI.closeBrowser()

System.out.println("Schedule 1 STORE Request Are Working Successfully")

