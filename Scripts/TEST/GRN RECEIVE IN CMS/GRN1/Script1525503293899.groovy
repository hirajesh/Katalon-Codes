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

WebUI.navigateToUrl('http://122.165.236.133/MultiHospital/')

WebUI.click(findTestObject('GRN1/Page_KDMC/a_CMS'))

WebUI.setText(findTestObject('GRN1/Page_CMS login/input_txtusername'), 'vino2')

WebUI.setText(findTestObject('GRN1/Page_CMS login/input_txtpassword'), '123')

WebUI.delay(3)

WebUI.click(findTestObject('GRN1/Page_CMS login/button_Sign in'))

WebUI.click(findTestObject('GRN1/Page_KDMC - CMS/a_CMS Details'))

WebUI.click(findTestObject('GRN1/Page_KDMC - CMS/a_Goods Receive'))

WebUI.selectOptionByValue(findTestObject('GRN1/Page_KDMC - CMS/select_--Select--PO0030PO0029P'), '28', true)

WebUI.setText(findTestObject('GRN1/Page_KDMC - CMS/input_txtgrnno'), 'inv4101')

WebUI.selectOptionByValue(findTestObject('GRN1/Page_KDMC - CMS/select_--Select--Pharma Medici'), '11', true)

WebUI.setText(findTestObject('GRN1/Page_KDMC - CMS/input_txtgrnno_1'), '500')

WebUI.setText(findTestObject('GRN1/Page_KDMC - CMS/input_txtgrnno_2'), '50')

WebUI.setText(findTestObject('GRN1/Page_KDMC - CMS/input_txtgrnno_3'), 'c4540')

WebUI.selectOptionByValue(findTestObject('GRN1/Page_KDMC - CMS/select_--Select--PO0030PO0029P'), '29', true)

WebUI.selectOptionByValue(findTestObject('GRN1/Page_KDMC - CMS/select_--Select--PERUMAL PHARM'), '19', true)

WebUI.scrollToElement(findTestObject('GRN1/Page_KDMC - CMS/input_btnadd'),20)

WebUI.selectOptionByIndex(findTestObject('GRN1/Page_KDMC - CMS/select_--Select--Automatic x-r'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('GRN1/Page_KDMC - CMS/input_txtqty'), '5000')

WebUI.selectOptionByValue(findTestObject('GRN1/Page_KDMC - CMS/select_--Select--No Tax0'), '26', true)

WebUI.setText(findTestObject('GRN1/Page_KDMC - CMS/input_txtmrp'), '5')

WebUI.setText(findTestObject('GRN1/Page_KDMC - CMS/input_txtdeal'), '2')

WebUI.setText(findTestObject('GRN1/Page_KDMC - CMS/input_txtbatchno'), 'fd152')

WebUI.click(findTestObject('GRN1/Page_KDMC - CMS/a_7'))

WebUI.click(findTestObject('GRN1/Page_KDMC - CMS/input_btnadd'))

WebUI.click(findTestObject('GRN1/Page_KDMC - CMS/input_btnSubmit'))

WebUI.click(findTestObject('GRN1/Page_KDMC - CMS/button_OK'))

WebUI.click(findTestObject('GRN1/Page_KDMC - CMS/a_dropdown-toggle'))

WebUI.click(findTestObject('GRN1/Page_KDMC - CMS/a_Sign out'))

WebUI.closeBrowser()

