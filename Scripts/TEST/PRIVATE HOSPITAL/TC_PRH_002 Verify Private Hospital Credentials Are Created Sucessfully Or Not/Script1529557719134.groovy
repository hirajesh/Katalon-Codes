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

WebUI.navigateToUrl('http://182.18.161.229/Multihospital_New/Splashscreen.aspx?log=0')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Private Hospital/Page_KDMC/a_Admin Master'))

WebUI.setText(findTestObject('Private Hospital/Page_Admin login/input_txtusername'), 'admin')

WebUI.setText(findTestObject('Private Hospital/Page_Admin login/input_txtpassword'), 'admin123')

WebUI.delay(3)

WebUI.click(findTestObject('Private Hospital/Page_Admin login/button_Sign in'))

WebUI.delay(5)

WebUI.click(findTestObject('Private Hospital/Page_KDMC/a_Private Hospital'))

WebUI.delay(2)

WebUI.click(findTestObject('Private Hospital/Page_KDMC/a_Private Hospital Registratio'))

WebUI.delay(2)

WebUI.setText(findTestObject('Private Hospital/Page_KDMC/input'), 'ssm')

WebUI.delay(2)

WebUI.click(findTestObject('Private Hospital/Page_KDMC/input_btn btn-primary'))

WebUI.delay(2)

WebUI.setText(findTestObject('Private Hospital/Page_KDMC/input_txtusername'), 'mmani')

WebUI.setText(findTestObject('Private Hospital/Page_KDMC/input_txtpass'), '12345')

WebUI.setText(findTestObject('Private Hospital/Page_KDMC/input_txtpass1'), '12345')

WebUI.click(findTestObject('Private Hospital/Page_KDMC/input_btnupdate'))

WebUI.delay(3)

WebUI.click(findTestObject('Private Hospital/Page_KDMC/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('Private Hospital/Page_KDMC/a_dropdown-toggle'))

WebUI.click(findTestObject('Private Hospital/Page_KDMC/a_Sign out'))

WebUI.closeBrowser()

