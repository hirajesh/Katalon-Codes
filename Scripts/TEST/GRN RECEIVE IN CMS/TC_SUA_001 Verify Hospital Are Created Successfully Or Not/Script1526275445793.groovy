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

WebUI.click(findTestObject('SUPER ADMIN/Page_KDMC/a_Admin Master'))

WebUI.setText(findTestObject('SUPER ADMIN/Page_Admin login/input_txtusername'), 'admin')

WebUI.setText(findTestObject('SUPER ADMIN/Page_Admin login/input_txtpassword'), 'admin123')

WebUI.delay(3)

WebUI.click(findTestObject('SUPER ADMIN/Page_Admin login/button_Sign in'))

WebUI.delay(15)

WebUI.click(findTestObject('SUPER ADMIN/Page_KDMC/a_Hospital Registration'))

WebUI.click(findTestObject('SUPER ADMIN/Page_KDMC/input_btnadd'))

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('SUPER ADMIN/Page_KDMC/select_--Select--'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('SUPER ADMIN/Page_KDMC/input_txtempid_1'), 'BE WELL HOSPITAL')

WebUI.setText(findTestObject('SUPER ADMIN/Page_KDMC/input_txtlastname'), 'bewell@gmail.com')

WebUI.setText(findTestObject('SUPER ADMIN/Page_KDMC/input_txtlastname_1'), '045454504545')

WebUI.setText(findTestObject('SUPER ADMIN/Page_KDMC/input_txtphone1'), '9878754120')

WebUI.setText(findTestObject('SUPER ADMIN/Page_KDMC/input_txtphone1_1'), 'NAGARAJ')

WebUI.setText(findTestObject('SUPER ADMIN/Page_KDMC/input_txtphone1_2'), 'SRT7899950')

WebUI.clearText(findTestObject('SUPER ADMIN/Page_KDMC/td_Country'))

WebUI.setText(findTestObject('SUPER ADMIN/Page_KDMC/input_txtphone1_3'), 'INDIA')

WebUI.setText(findTestObject('SUPER ADMIN/Page_KDMC/input_txtphone1_4'), 'm')

WebUI.sendKeys(findTestObject('SUPER ADMIN/Page_KDMC/input_txtphone1_4'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('SUPER ADMIN/Page_KDMC/input_txtphone1_5'), 'M')

WebUI.click(findTestObject('SUPER ADMIN/Page_KDMC/a_Mumbai'))

WebUI.setText(findTestObject('SUPER ADMIN/Page_KDMC/input_txtphone1_6'), '6565222')

WebUI.setText(findTestObject('SUPER ADMIN/Page_KDMC/textarea_add'), 'Kalyan,Shasthri Nagar,Mumbai')

WebUI.click(findTestObject('SUPER ADMIN/Page_KDMC/input_btnsave'))

WebUI.click(findTestObject('SUPER ADMIN/Page_KDMC/div_Hospital details inserted'))

AlertText=WebUI.getText(findTestObject('SUPER ADMIN/Page_KDMC/div_Hospital details inserted'))

WebUI.click(findTestObject('SUPER ADMIN/Page_KDMC/button_OK'))


//+++++++++++++ADMIN REGISRATION++++++++++++++++
//================================================

WebUI.click(findTestObject('SUPER ADMIN/Page_KDMC/a_Admin Registration_1'))

WebUI.delay(3)

WebUI.click(findTestObject('SUPER ADMIN/Page_KDMC/input_btnadd'))

WebUI.click(findTestObject('SUPER ADMIN/Page_KDMC/td'))

WebUI.setText(findTestObject('SUPER ADMIN/Page_KDMC/input_txtempid'), 'BWE1')

WebUI.setText(findTestObject('SUPER ADMIN/Page_KDMC/input_txtfirstname'), 'ARJUN')

WebUI.selectOptionByIndex(findTestObject('SUPER ADMIN/Page_KDMC/select_--Select--             _1'), 'Male', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('SUPER ADMIN/Page_KDMC/select_--Select--Bai Rukumini'), '25', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('SUPER ADMIN/Page_KDMC/select_--Select--Anaesthesiolo'), '10', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('SUPER ADMIN/Page_KDMC/select_--Select--             _2'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.rightClick(findTestObject('SUPER ADMIN/Page_KDMC/select_JanFebMarAprMay'))

WebUI.rightClick(findTestObject('SUPER ADMIN/Page_KDMC/select_20082009201020112012201'))

WebUI.click(findTestObject('SUPER ADMIN/Page_KDMC/a_2'))

WebUI.setText(findTestObject('SUPER ADMIN/Page_KDMC/input_txtadd1 (1)'), 'Sharthiri Nagar,Mumbai')

WebUI.setText(findTestObject('SUPER ADMIN/Page_KDMC/input_txtphone1_7'), '9878455454')

WebUI.setText(findTestObject('SUPER ADMIN/Page_KDMC/input_txtemail'), 'arjun@gmail.com')

WebUI.setText(findTestObject('SUPER ADMIN/Page_KDMC/input_txtemail_1'), 'arjun')

WebUI.setText(findTestObject('SUPER ADMIN/Page_KDMC/input_txtemail_2'), '123')

WebUI.setText(findTestObject('SUPER ADMIN/Page_KDMC/input_cpwd'), '123')

WebUI.click(findTestObject('SUPER ADMIN/Page_KDMC/input_btnsave'))

WebUI.getText(findTestObject('SUPER ADMIN/Page_KDMC/div_Employee details inserted'))

WebUI.delay(3)

WebUI.click(findTestObject('SUPER ADMIN/Page_KDMC/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('SUPER ADMIN/Page_KDMC/a_dropdown-toggle'))

WebUI.click(findTestObject('SUPER ADMIN/Page_KDMC/a_Sign out'))

WebUI.closeBrowser()

