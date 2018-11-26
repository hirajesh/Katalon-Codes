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

WebUI.click(findTestObject('dd/Page_KDMC/div_CMS'))

WebUI.click(findTestObject('dd/Page_KDMC/a_CMS'))

WebUI.setText(findTestObject('dd/Page_CMS login/input_txtusername'), 'bala')

WebUI.setText(findTestObject('dd/Page_CMS login/input_txtpassword'), '123')

WebUI.sendKeys(findTestObject('dd/Page_CMS login/input_txtpassword'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('dd/Page_KDMC - CMS/a_CMS Details'))

WebUI.click(findTestObject('dd/Page_KDMC - CMS/a_Goods Receive'))

WebUI.selectOptionByValue(findTestObject('dd/Page_KDMC - CMS/select_--Select--PO0030PO0028P'), '30', true)

WebUI.selectOptionByValue(findTestObject('dd/Page_KDMC - CMS/select_--Select--PERUMAL PHARM'), '19', true)

WebUI.click(findTestObject('dd/Page_KDMC - CMS/td_--Select--Albumin kit (Auto'))

WebUI.selectOptionByValue(findTestObject('dd/Page_KDMC - CMS/select_--Select--Albumin kit ('), '233', true)

WebUI.rightClick(findTestObject('dd/Page_KDMC - CMS/input_txtqty'))

WebUI.delay(4)

RESULT=WebUI.getText(findTestObject('dd/Page_KDMC - CMS/input_txtqty'))
RESULT1=WebUI.getText(findTestObject('dd/Page_KDMC - CMS/input_txtqty'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)
System.out.println("Result Text" +RESULT1)
WebUI.setText(findTestObject('dd/Page_KDMC - CMS/input_txtqty_1'),''+RESULT)

WebUI.click(findTestObject('dd/Page_KDMC - CMS/button_OK'))

WebUI.closeBrowser()

