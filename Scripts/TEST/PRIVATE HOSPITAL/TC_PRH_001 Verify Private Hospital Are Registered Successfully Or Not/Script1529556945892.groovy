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

WebUI.navigateToUrl('http://182.18.161.229/Multihospital_New/Privatehossignup.aspx')

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.setText(findTestObject('Private Hospital/Page_Private Hospital Regsistration/input_txthosname'), 'BALA NURSING HOME')

WebUI.setText(findTestObject('Private Hospital/Page_Private Hospital Regsistration/input_txtclinicnum'), '046658059501243')

WebUI.setText(findTestObject('Private Hospital/Page_Private Hospital Regsistration/input_txtname'), 'MANI')

WebUI.setText(findTestObject('Private Hospital/Page_Private Hospital Regsistration/input_txtcontact'), '7887844010')

WebUI.setText(findTestObject('Private Hospital/Page_Private Hospital Regsistration/input_txtmail'), 'ssm@gmail.com')

WebUI.setText(findTestObject('Private Hospital/Page_Private Hospital Regsistration/input_txtfax'), '789870640649521')


WebUI.setText(findTestObject('Private Hospital/Page_Private Hospital Regsistration/input_txtcountry'), 'i')

WebUI.click(findTestObject('Private Hospital/Page_Private Hospital Regsistration/a_INDIA'))

WebUI.setText(findTestObject('Private Hospital/Page_Private Hospital Regsistration/input_txtstate'), 'T')

WebUI.click(findTestObject('Private Hospital/Page_Private Hospital Regsistration/a_TAMIL NADU'))

WebUI.setText(findTestObject('Private Hospital/Page_Private Hospital Regsistration/input_txtcity'), 'Trichy')

WebUI.setText(findTestObject('Private Hospital/Page_Private Hospital Regsistration/input_txtpincode'), '622100')

WebUI.setText(findTestObject('Private Hospital/Page_Private Hospital Regsistration/input_txtaddress'), 'GG STREET TRICHY')

WebUI.delay(2)

WebUI.click(findTestObject('Private Hospital/Page_Private Hospital Regsistration/a_Register'))

WebUI.delay(3)

WebUI.click(findTestObject('Private Hospital/Page_Private Hospital Regsistration/button_Ok'))

WebUI.closeBrowser()

