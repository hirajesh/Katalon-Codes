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
import com.kms.katalon.core.testdata.ExcelData as ExcelData
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

WebUI.navigateToUrl('http://182.18.161.229/CHMSREV/Account/Login?Role=Reception')

WebUI.maximizeWindow()

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/input_Email (1) (1) (1)'), 'neelaveni')

WebUI.setEncryptedText(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/input_Password (1) (1) (1)'), 'tzH6RvlfSTg=')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/button_Sign In (1) (1) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/span_Consultation'))

Exceldata = findTestData('datafile')

for (def indexx : (1..Exceldata.getRowNumbers() - 1)) {
    WebUI.setText(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/input_PatientDetails.PatientNa'), Exceldata.getValue(
            'Patient name', indexx))

    //WebUI.click(findTestObject('Object Repository/HIMS/Page_HIMS/input_PatientDetails.PatientNa'))
    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/input_PatientDetails.PatientNa'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/input_PatientDetails.PatientNa'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/input_DoctorName'), 'Rajesh')

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/input_DoctorName'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/input_DoctorName'), Keys.chord(Keys.ARROW_DOWN))

    WebUI.sendKeys(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/input_DoctorName'), Keys.chord(Keys.ENTER))

    WebUI.delay(2)

    WebUI.scrollToPosition(200, 200)

    TestObject fee = new TestObject()

    fee = WebUI.modifyObjectProperty(fee, 'xpath', 'equals', '//*[@id=\'ConsultationFee\']', true)

    WebUI.clearText(fee)

    WebUI.delay(2)

    WebUI.sendKeys(fee, '100')
	
	WebUI.click(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/button_Submit'))
	
	WebUI.delay(3)
	
	WebUI.click(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/button_Close'))


    WebUI.delay(2)
}

WebUI.click(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/a_Neelaveni'))

WebUI.click(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/a_Sign out'))


/*WebUI.openBrowser('')

WebUI.navigateToUrl('http://182.18.161.229/CHMSrev/home/index.html')

WebUI.click(findTestObject('Object Repository/HIMSOBJECT/Page_Chennai Hospitals HIMS/img__u738_img'))

WebUI.switchToWindowTitle('')

WebUI.setText(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/input_Reception Sign In_Email'), 'neelaveni')

WebUI.setEncryptedText(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/input_Reception Sign In_Passwo'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/button_Sign In'))

WebUI.click(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/span_Consultation'))

WebUI.setText(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/input__PatientDetails.PatientN'), 'Mr.RAJARAM')

WebUI.setText(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/input__DoctorName'), 'Rajesh')

WebUI.setText(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/input_Consultation Fee_Consult'), '100')

WebUI.setText(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/body_Fever'), '<div id="katalon" style="top: 103px;"><div id="katalon-rec_elementInfoDiv" style="display: none;">Fever</div><div id="katalon-rec_elementInfoDiv" style="display: block;"><br></div><div id="katalon-rec_elementInfoDiv" style="display: block;"><br></div><div id="katalon-rec_elementInfoDiv" style="display: block;"><br></div><div id="katalon-rec_elementInfoDiv" style="display: block;"><br></div></div>')

WebUI.click(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/button_Submit'))

WebUI.click(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/button_Close'))

WebUI.click(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/a_Neelaveni'))

WebUI.click(findTestObject('Object Repository/HIMSOBJECT/Page_HIMS/a_Sign out'))

WebUI.closeBrowser()*/

