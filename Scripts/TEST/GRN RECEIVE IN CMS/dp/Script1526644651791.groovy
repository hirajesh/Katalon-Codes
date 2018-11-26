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

import com.kms.katalon.core.testdata.ExcelData
import com.kms.katalon.core.testdata.InternalData


WebUI.openBrowser('')

WebUI.navigateToUrl('http://182.18.161.229/multihospital_new')

//WebUI.navigateToUrl('http://192.168.137.1/multihospital_new/')

WebUI.click(findTestObject('CM/Page_KDMC/a_CMO'))

WebUI.maximizeWindow()

WebUI.delay(3)

 Exceldata = findTestData("New Test Data")

WebUI.delay(3)

for (def index : (1..Exceldata.getRowNumbers() - 1)) 
{

WebUI.setText(findTestObject('CM/Page_CMO login/input_txtusername'),Exceldata.getValue("Username", index))

WebUI.setText(findTestObject('CM/Page_CMO login/input_txtpassword'),Exceldata.getValue("Password", index))

WebUI.delay(3)

}

WebUI.sendKeys(findTestObject('CM/Page_CMO login/input_txtpassword'), Keys.chord(Keys.ENTER))

WebUI.refresh()

WebUI.delay(3)

WebUI.click(findTestObject('CM/Page_KDMC - CMO/a_CMS Request'))

WebUI.click(findTestObject('CM/Page_KDMC - CMO/a_Dispensary Store Request'))

WebUI.click(findTestObject('CM/Page_KDMC - CMO/input_192'))

WebUI.selectOptionByValue(findTestObject('CM/Page_KDMC - CMO/select_--Select--'), '1', true)

WebUI.click(findTestObject('CM/Page_KDMC - CMO/input_btnupdate'))

WebUI.click(findTestObject('CM/Page_KDMC - CMO/button_OK'))

WebUI.click(findTestObject('CM/Page_KDMC - CMO/a_dropdown-toggle'))

WebUI.click(findTestObject('CM/Page_KDMC - CMO/a_Sign out'))

WebUI.closeBrowser()

