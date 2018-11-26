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

WebUI.navigateToUrl('http://192.168.137.1/multihospital_new/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Schedule4/Page_KDMC/a_CMS'))

WebUI.setText(findTestObject('Schedule4/Page_CMS login/input_txtusername'), 'bala')

WebUI.setText(findTestObject('Schedule4/Page_CMS login/input_txtpassword'), '123')

WebUI.delay(4)

WebUI.click(findTestObject('Schedule4/Page_CMS login/button_Sign in'))

WebUI.click(findTestObject('Schedule4/Page_KDMC - CMS/a_Request to MOH'))

WebUI.selectOptionByValue(findTestObject('Schedule4/Page_KDMC - CMS/select_--Select--'), 'Weekly/Monthly', true)

WebUI.selectOptionByValue(findTestObject('Schedule4/Page_KDMC - CMS/select_--Select--Schedule 1Inj'), '4', true)

Selectedoptions=WebUI.getNumberOfTotalOption(findTestObject('Schedule4/Page_KDMC - CMS/select_--Select--Automatic x-r'))

for(int j=1;j<=Selectedoptions-1;j++)
{
WebUI.selectOptionByValue(findTestObject('Schedule4/Page_KDMC - CMS/select_--Select--Schedule 1Inj'), '4', true)

WebUI.selectOptionByIndex(findTestObject('Schedule4/Page_KDMC - CMS/select_--Select--Automatic x-r'), j, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Schedule4/Page_KDMC - CMS/input_txttreat'), '5000')

WebUI.click(findTestObject('Schedule4/Page_KDMC - CMS/button_Add'))
}

WebUI.scrollToElement(findTestObject('Schedule4/Page_KDMC - CMS/input_btnsave'), 20)

WebUI.click(findTestObject('Schedule4/Page_KDMC - CMS/input_btnsave'))

WebUI.waitForElementPresent(findTestObject('Schedule4/Page_KDMC - CMS/button_OK'), 20)

WebUI.click(findTestObject('Schedule4/Page_KDMC - CMS/button_OK'))

WebUI.delay(3)
WebUI.click(findTestObject('Schedule4/Page_KDMC - CMS/a_dropdown-toggle'))
WebUI.delay(3)
WebUI.click(findTestObject('Schedule4/Page_KDMC - CMS/a_Sign out'))

WebUI.closeBrowser()

