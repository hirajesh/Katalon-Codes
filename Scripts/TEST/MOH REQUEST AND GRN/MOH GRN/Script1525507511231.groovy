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

WebUI.navigateToUrl('http://192.168.137.1/multihospital_new/CMSLogin.aspx')

WebUI.setText(findTestObject('sample moh/Page_CMS login/input_txtusername'), 'bala')

WebUI.setText(findTestObject('sample moh/Page_CMS login/input_txtpassword'), '123')

WebUI.click(findTestObject('sample moh/Page_CMS login/button_Sign in'))

WebUI.click(findTestObject('sample moh/Page_KDMC - CMS/a_Request to MOH'))

WebUI.selectOptionByValue(findTestObject('sample moh/Page_KDMC - CMS/select_--Select--Schedule 1Inj'), '1', true)

WebUI.selectOptionByValue(findTestObject('sample moh/Page_KDMC - CMS/select_--Select--Adernaline 0.'), '30', true)

WebUI.setText(findTestObject('sample moh/Page_KDMC - CMS/input_txttreat'), '50')

WebUI.click(findTestObject('sample moh/Page_KDMC - CMS/button_Add'))

WebUI.click(findTestObject('sample moh/Page_KDMC - CMS/input_btnsave'))

WebUI.click(findTestObject('sample moh/Page_KDMC - CMS/button_OK'))

WebUI.selectOptionByValue(findTestObject('sample moh/Page_KDMC - CMS/select_--Select--'), 'Weekly/Monthly', true)

WebUI.click(findTestObject('sample moh/Page_KDMC - CMS/input_btnsave'))

WebUI.click(findTestObject('sample moh/Page_KDMC - CMS/div_ Request Send To MOH Store'))

WebUI.doubleClick(findTestObject('sample moh/Page_KDMC - CMS/font_PRNO0505201876'))

WebUI.click(findTestObject('sample moh/Page_KDMC - CMS/font_PRNO0505201876'))

WebUI.click(findTestObject('sample moh/Page_KDMC - CMS/font_PRNO0505201876'))

WebUI.click(findTestObject('sample moh/Page_KDMC - CMS/button_OK'))

WebUI.click(findTestObject('sample moh/Page_KDMC - CMS/span_pfnamer'))

WebUI.click(findTestObject('sample moh/Page_KDMC - CMS/a_Sign out'))

WebUI.click(findTestObject('sample moh/Page_KDMC/a_Admin Master'))

WebUI.setText(findTestObject('sample moh/Page_Admin login/input_txtusername'), 'admin')

WebUI.setText(findTestObject('sample moh/Page_Admin login/input_txtpassword'), 'admin123')

WebUI.click(findTestObject('sample moh/Page_Admin login/button_Sign in'))

WebUI.click(findTestObject('sample moh/Page_KDMC/a_CMS'))

WebUI.click(findTestObject('sample moh/Page_KDMC/a_Request List'))

WebUI.click(findTestObject('sample moh/Page_KDMC/input_76'))

WebUI.selectOptionByValue(findTestObject('sample moh/Page_KDMC/select_--Select--'), '1', true)

WebUI.click(findTestObject('sample moh/Page_KDMC/input_btnupdate'))

WebUI.click(findTestObject('sample moh/Page_KDMC/button_OK'))

WebUI.click(findTestObject('sample moh/Page_KDMC/a_dropdown-toggle'))

WebUI.click(findTestObject('sample moh/Page_KDMC/a_Sign out'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.137.1/multihospital_new/')

WebUI.click(findTestObject('sample/Page_KDMC/a_Admin Master'))

WebUI.setText(findTestObject('sample/Page_Admin login/input_txtusername'), 'admin')

WebUI.setText(findTestObject('sample/Page_Admin login/input_txtpassword'), 'admin123')

WebUI.click(findTestObject('sample/Page_Admin login/button_Sign in'))

WebUI.click(findTestObject('sample/Page_KDMC/a_CMS'))

WebUI.click(findTestObject('sample/Page_KDMC/a_Generate P.O'))

WebUI.rightClick(findTestObject('sample/Page_KDMC/input_lblpono'))

WebUI.closeBrowser()
