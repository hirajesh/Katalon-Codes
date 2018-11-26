import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://122.165.236.133/MultiPharmacy/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Divisonal Store Login/input_Divisional Store Login_t'), 'nivetha')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Divisonal Store Login/input_Divisional Store Login_t_1'), 
    'HeCM15nHKBI=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Divisonal Store Login/input_Divisional Store Login_t_2'), 
    'lnBUteI2ioQ=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Divisonal Store Login/input_Divisional Store Login_t_3'), 
    'tzH6RvlfSTg=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Divisonal Store Login/input_Divisional Store Login_t_4'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Page_Divisonal Store Login/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Store/a_Pharmacy Request'))

WebUI.click(findTestObject('Object Repository/Page_Store/a_Request Item Pharmacy'))

WebUI.setText(findTestObject('Object Repository/Page_Store/input'), '4')

TestObject ID = WebUI.modifyObjectProperty(findTestObject('Page_KDMC - CMO/input_1'), 'xpath', 'equals', ('//*[@id=' + 4) + 
    ']', true)

WebUI.click(ID)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Store/select_--Select--Albendazole (1)'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

SelectedOptions =WebUI.getNumberOfTotalOption(findTestObject('Object Repository/Page_Store/select_--Select--Albendazole (1)'), '1', FailureHandling.STOP_ON_FAILURE)

//SelectedOptions = WebUI.getNumberOfTotalOption(findTestObject('Object Repository/issuethemed/Page_Store/select_--Select--Albendazole'))
WebUI.delay(2)

for (int y = 1; y < SelectedOptions; y++) {
    WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Store/select_--Select--Albendazole'), '1', FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2)

    WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Store/select_--Select--BA6410'), '1', FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(1)

    WebUI.setText(findTestObject('Object Repository/Page_Store/input__txtqty'), '100')

    WebUI.click(findTestObject('Object Repository/Page_Store/button_Add'))

    WebUI.delay(1)
}

WebUI.click(findTestObject('Object Repository/Page_Store/input_Total Quantity_btnSubmit'))

WebUI.click(findTestObject('Object Repository/Page_Store/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Store/a__dropdown-toggle'))

WebUI.click(findTestObject('Object Repository/Page_Store/a_Sign out'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://122.165.236.133/MultiPharmacy/')

WebUI.setText(findTestObject('Object Repository/Page_Divisonal Store Login/input_Divisional Store Login_t'), 'nivetha')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Divisonal Store Login/input_Divisional Store Login_t_5'), 
    'HeCM15nHKBI=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Divisonal Store Login/input_Divisional Store Login_t_6'), 
    'lnBUteI2ioQ=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Divisonal Store Login/input_Divisional Store Login_t_7'), 
    'tzH6RvlfSTg=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Divisonal Store Login/input_Divisional Store Login_t_8'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Page_Divisonal Store Login/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Store/a_Pharmacy Request'))

WebUI.click(findTestObject('Object Repository/Page_Store/a_Request Item Pharmacy'))

WebUI.setText(findTestObject('Object Repository/Page_Store/input'), '4')

WebUI.click(findTestObject('Object Repository/Page_Store/input_Pharmacy_4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Store/select_--Select--Albendazole (1)'), '79', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Store/select_--Select--BA6410'), 'undefined', true)

WebUI.setText(findTestObject('Object Repository/Page_Store/input__txtqty'), '100')

WebUI.click(findTestObject('Object Repository/Page_Store/button_Add'))

WebUI.click(findTestObject('Object Repository/Page_Store/input_Total Quantity_btnSubmit'))

WebUI.click(findTestObject('Object Repository/Page_Store/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Store/a__dropdown-toggle'))

WebUI.click(findTestObject('Object Repository/Page_Store/a_Sign out'))

WebUI.closeBrowser()

