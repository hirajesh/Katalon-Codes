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

WebUI.click(findTestObject('store/Page_KDMC/a_Divisional Store'))

WebUI.setText(findTestObject('store/Page_Divisonal Store Login/input_txtusername'), 'ragu')

WebUI.setText(findTestObject('store/Page_Divisonal Store Login/input_txtpassword'), '123')

WebUI.click(findTestObject('store/Page_Divisonal Store Login/button_Sign in'))

WebUI.click(findTestObject('store/Page_Store/a_CMS'))

WebUI.click(findTestObject('store/Page_Store/a_Request Send'))

WebUI.selectOptionByValue(findTestObject('store/Page_Store/select_--Select--Schedule 1Inj'), '1', true)

WebUI.selectOptionByValue(findTestObject('store/Page_Store/select_--Select--Adernaline 0.'), '1', true)

WebUI.setText(findTestObject('store/Page_Store/input_txttreat'), '10')

WebUI.click(findTestObject('store/Page_Store/button_Add'))

WebUI.selectOptionByValue(findTestObject('store/Page_Store/select_--Select--'), 'Weekly/Monthly', true)

WebUI.click(findTestObject('store/Page_Store/input_btnsave'))

WebUI.click(findTestObject('store/Page_Store/font_PRNO050520189'))

WebUI.click(findTestObject('store/Page_Store/font_PRNO050520189'))

WebUI.rightClick(findTestObject('store/Page_Store/font_PRNO050520189'))

WebUI.click(findTestObject('store/Page_Store/button_OK'))

WebUI.click(findTestObject('store/Page_Store/a_dropdown-toggle'))

WebUI.click(findTestObject('store/Page_Store/a_Sign out'))

WebUI.click(findTestObject('store/Page_KDMC/a_CMS'))

WebUI.setText(findTestObject('store/Page_CMS login/input_txtusername'), 'bala')

WebUI.setText(findTestObject('store/Page_CMS login/input_txtpassword'), '123')

WebUI.click(findTestObject('store/Page_CMS login/button_Sign in'))

WebUI.click(findTestObject('store/Page_KDMC - CMS/a_Divisional Store'))

WebUI.click(findTestObject('store/Page_KDMC - CMS/a_Dispatch Items'))

WebUI.click(findTestObject('store/Page_KDMC - CMS/a_dropdown-toggle'))

WebUI.click(findTestObject('store/Page_KDMC - CMS/a_Sign out'))

WebUI.click(findTestObject('store/Page_KDMC/a_CMO'))

WebUI.setText(findTestObject('store/Page_CMO login/input_txtusername'), 'guru')

WebUI.setText(findTestObject('store/Page_CMO login/input_txtpassword'), '123')

WebUI.click(findTestObject('store/Page_CMO login/button_Sign in'))

WebUI.click(findTestObject('store/Page_KDMC - CMO/span_Department Wise Request'))

WebUI.click(findTestObject('store/Page_KDMC - CMO/a_CMS Request'))

WebUI.click(findTestObject('store/Page_KDMC - CMO/a_CMS Request'))

WebUI.click(findTestObject('store/Page_KDMC - CMO/span_Divisional Store Request'))

WebUI.click(findTestObject('store/Page_KDMC - CMO/input_PRNO050520189'))

WebUI.click(findTestObject('store/Page_KDMC - CMO/input_9'))

WebUI.selectOptionByValue(findTestObject('store/Page_KDMC - CMO/select_--Select--'), '1', true)

WebUI.click(findTestObject('store/Page_KDMC - CMO/input_btnupdate'))

WebUI.click(findTestObject('store/Page_KDMC - CMO/button_OK'))

WebUI.click(findTestObject('store/Page_KDMC - CMO/a_dropdown-toggle'))

WebUI.click(findTestObject('store/Page_KDMC - CMO/a_Sign out'))

WebUI.click(findTestObject('store/Page_KDMC/a_CMS'))

WebUI.setText(findTestObject('store/Page_CMS login/input_txtusername'), 'bala')

WebUI.setText(findTestObject('store/Page_CMS login/input_txtpassword'), '123')

WebUI.click(findTestObject('store/Page_CMS login/button_Sign in'))

WebUI.click(findTestObject('store/Page_KDMC - CMS/a_Divisional Store'))

WebUI.click(findTestObject('store/Page_KDMC - CMS/a_Request Approval'))

WebUI.click(findTestObject('store/Page_KDMC - CMS/a_Divisional Store'))

WebUI.click(findTestObject('store/Page_KDMC - CMS/a_Dispatch Items'))

WebUI.click(findTestObject('store/Page_KDMC - CMS/input_PRNO050520189'))

WebUI.selectOptionByValue(findTestObject('store/Page_KDMC - CMS/select_--Select--BA1271BA4110B'), 'BA1271', true)

WebUI.selectOptionByValue(findTestObject('store/Page_KDMC - CMS/select_--Select--BA1271BA4110B'), 'BA4110', true)

WebUI.selectOptionByValue(findTestObject('store/Page_KDMC - CMS/select_--Select--BA1271BA4110B'), 'BA430', true)

WebUI.selectOptionByValue(findTestObject('store/Page_KDMC - CMS/select_--Select--BA1271BA4110B'), 'BA9040', true)

WebUI.selectOptionByValue(findTestObject('store/Page_KDMC - CMS/select_--Select--BA1271BA4110B'), 'BA970', true)

WebUI.selectOptionByValue(findTestObject('store/Page_KDMC - CMS/select_--Select--BA1271BA4110B'), 'bami458', true)

WebUI.click(findTestObject('store/Page_KDMC - CMS/input_btndispatch'))

WebUI.click(findTestObject('store/Page_KDMC - CMS/button_OK'))

WebUI.click(findTestObject('store/Page_KDMC - CMS/a_dropdown-toggle'))

WebUI.click(findTestObject('store/Page_KDMC - CMS/a_Sign out'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.137.1/multihospital_new/')

WebUI.click(findTestObject('aa/Page_KDMC/a_CMS'))

WebUI.setText(findTestObject('aa/Page_CMS login/input_txtusername'), 'bala')

WebUI.setText(findTestObject('aa/Page_CMS login/input_txtpassword'), '123')

WebUI.sendKeys(findTestObject('aa/Page_CMS login/button_Sign in'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('aa/Page_KDMC - CMS/a_Divisional Store'))

WebUI.click(findTestObject('aa/Page_KDMC - CMS/a_Dispatch Items'))

WebUI.setText(findTestObject('aa/Page_KDMC - CMS/input'), '50')

WebUI.click(findTestObject('aa/Page_KDMC - CMS/td_text-center'))

WebUI.click(findTestObject('aa/Page_KDMC - CMS/input_PRNO0705201850'))

WebUI.click(findTestObject('aa/Page_KDMC - CMS/input_cancel'))

WebUI.closeBrowser()

