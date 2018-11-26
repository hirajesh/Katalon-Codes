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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://182.18.161.229/Multihospital_New/Splashscreen.aspx?log=0')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Patient Registration/Page_KDMC/a_Reception'))

//Login
//==========
WebUI.setText(findTestObject('Object Repository/Patient Registration/Page_KDMC/input_txtusername'), 'amirtha')

WebUI.setEncryptedText(findTestObject('Object Repository/Patient Registration/Page_KDMC/input_txtpassword'), 'tzH6RvlfSTg=')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Patient Registration/Page_KDMC/button_Sign in'))

WebUI.delay(3)

//Dashboard
//=============
WebUI.click(findTestObject('Object Repository/Patient Registration/Page_KDMC/a_Patient Registration'))

WebUI.delay(2)


//Patient Registration
//=====================
WebUI.doubleClick(findTestObject('Object Repository/Patient Registration/Page_KDMC/div_modal-backdrop fade in'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Patient Registration/Page_KDMC/input_txtName'), 'ManokarSing')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Patient Registration/Page_KDMC/select_--Select--'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Patient Registration/Page_KDMC/input_txtAge'), '25')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Patient Registration/Page_KDMC/select_--Select--             _1'), 
    '1', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Patient Registration/Page_KDMC/input_txtPhone'), '9887789879')

WebUI.selectOptionByIndex(findTestObject('Object Repository/Patient Registration/Page_KDMC/select_--Select--             _2'), 
    '2', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Patient Registration/Page_KDMC/textarea_Address'), 'Kalyan')

WebUI.delay(2)

TestObject Upload=new TestObject()

WebUI.modifyObjectProperty(Upload, 'xpath', 'equals',("//*[@id='filUpload']"),true)

WebUI.setText(Upload, "C:\\Users\\Quality Analyst\\Downloads\\KDMC\\men\\21.jpg")

WebUI.click(findTestObject('Object Repository/Patient Registration/Page_KDMC/input_btnsubmit'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Patient Registration/Page_KDMC/button_OK'))

//Signout
//=========
WebUI.click(findTestObject('Object Repository/Patient Registration/Page_KDMC/a_dropdown-toggle'))

WebUI.click(findTestObject('Object Repository/Patient Registration/Page_KDMC/a_Sign out'))

WebUI.closeBrowser()