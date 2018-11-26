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
import org.eclipse.persistence.internal.oxm.record.json.JSONParser.pair_return as pair_return
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://182.18.161.229/CHMSREV/Account/Login?Role=Reception')

WebUI.maximizeWindow()

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/HIMS/Page_HIMS/input_Email (1) (1) (1)'), 'neelaveni')

WebUI.setEncryptedText(findTestObject('Object Repository/HIMS/Page_HIMS/input_Password (1) (1) (1)'), 'tzH6RvlfSTg=')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/HIMS/Page_HIMS/button_Sign In (1) (1) (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/HIMS/Page_HIMS/span_Patient Registration (1) (1)'))

WebUI.delay(3)

Exceldata = findTestData('datafile')

for (def indexx : (1..Exceldata.getRowNumbers() - 1)) {
    WebUI.setText(findTestObject('Object Repository/HIMS/Page_HIMS/input_PatientName (1) (1) (1)'), Exceldata.getValue('Patient name', 
            indexx))

    WebUI.selectOptionByValue(findTestObject('Object Repository/HIMS/Page_HIMS/select_SelectMaleFeMaleTransge (1) (1) (1)'), 
        Exceldata.getValue('Gender', indexx), false)

    WebUI.click(findTestObject('Object Repository/HIMS/Page_HIMS/span_Select (1) (1) (1)'))

    WebUI.delay(2)

    TestObject marital = new TestObject()

    marital = WebUI.modifyObjectProperty(marital, 'xpath', 'equals', '/html/body/span[4]/span/span[1]/input', true)

    WebUI.sendKeys(marital, Exceldata.getValue('Marital Status', indexx))

    WebUI.sendKeys(marital, Keys.chord(Keys.ENTER))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Object Repository/HIMS/Page_HIMS/input_FatherSpousName (1) (1) (1)'), Exceldata.getValue(
            'Father Name', indexx))

    //WebUI.click(findTestObject('Object Repository/HIMS/Page_HIMS/span_Select_1 (1) (1)'))
    //WebUI.click(findTestObject('Object Repository/HIMS/Page_HIMS/li_O Positive (1) (1)'))
    WebUI.delay(2)

    TestObject dateoptions = new TestObject()

    dateoptions = WebUI.modifyObjectProperty(dateoptions, 'xpath', 'equals', '//*[@id=\'datetimepicker1\']', true)

    WebUI.click(dateoptions)

    WebUI.sendKeys(dateoptions, Exceldata.getValue('DOB', indexx) //MM/DD/YY
        )

    //DATE PICKER CHOOSE MANUALLY
    /*WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Object Repository/HIMS/Page_HIMS/select_JanFebMarAprMayJunJulAu (1) (1)'), '2', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('Object Repository/HIMS/Page_HIMS/select_19081909191019111912191 (1) (1)'), '85', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/HIMS/Page_HIMS/a_14 (1) (1)'))*/
    WebUI.delay(2)

    WebUI.setText(findTestObject('Object Repository/HIMS/Page_HIMS/input_Caste (1) (1) (1)'), 'BC')

    WebUI.setText(findTestObject('Object Repository/HIMS/Page_HIMS/input_Income (1) (1) (1)'), '25000')

    WebUI.setText(findTestObject('Object Repository/HIMS/Page_HIMS/input_Occupation (1) (1) (1)'), 'BE')

    WebUI.setText(findTestObject('Object Repository/HIMS/Page_HIMS/input_Address1 (1) (1) (1)'), Exceldata.getValue('Address', 
            indexx))

    WebUI.setText(findTestObject('Object Repository/HIMS/Page_HIMS/input_Address2 (1) (1) (1)'), Exceldata.getValue('Address', 
            indexx))

    WebUI.setText(findTestObject('Object Repository/HIMS/Page_HIMS/input_Country (1) (1) (1)'), Exceldata.getValue('Country', 
            indexx))

    WebUI.setText(findTestObject('Object Repository/HIMS/Page_HIMS/input_State (1) (1) (1)'), Exceldata.getValue('State', 
            indexx))

    WebUI.setText(findTestObject('Object Repository/HIMS/Page_HIMS/input_City (1) (1) (1)'), Exceldata.getValue('City', 
            indexx))

    WebUI.setText(findTestObject('Object Repository/HIMS/Page_HIMS/input_Pincode (1) (1) (1)'), Exceldata.getValue('Pincode', 
            indexx))

    String Mail = Exceldata.getValue('Patient name', indexx).toString().trim()

	String Email=Mail.trim().toLowerCase().toString()+"@gmail.com"
	
	System.out.println(Email)
	
    WebUI.setText(findTestObject('Object Repository/HIMS/Page_HIMS/input_Email_1 (1) (1) (1)'),Email)

    TestObject mobile = new TestObject()

    mobile = WebUI.modifyObjectProperty(mobile, 'id', 'equals', 'mobileno', true)

    WebUI.sendKeys(mobile, Exceldata.getValue('Mnumber', indexx))

    WebUI.setText(findTestObject('Object Repository/HIMS/Page_HIMS/input_CareTaker (1) (1) (1)'), 'GuruKumar')

    WebUI.scrollToPosition(200, 200)

    WebUI.setText(findTestObject('Object Repository/HIMS/Page_HIMS/input_Relationship (1) (1) (1)'), 'FATHER')

    WebUI.selectOptionByIndex(findTestObject('Object Repository/HIMS/Page_HIMS/select_SelectYesNo (1) (1) (1)'), '1', FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByIndex(findTestObject('Object Repository/HIMS/Page_HIMS/select_SelectCare TakerSelf (1) (1) (1)'), 
        '1', FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2)

    /*

//DONATE BLOOD/EYE 
// ==================>Not Working

TestObject Dblood= new TestObject()

Dblood=WebUI.modifyObjectProperty(Dblood, 'xapth', 'equals', "//*[@id='DonateBlood']", true)

WebUI.click(Dblood)

TestObject Deyes= new TestObject()

Deyes=WebUI.modifyObjectProperty(Deyes, 'xapth', 'equals', "//*[@id='DonateEyes']", true)

WebUI.click(Deyes)*/
    /*
//SMS ALERT 
//===============>Not Working

WebUI.click(findTestObject('Object Repository/HIMS/Page_HIMS/button_Set SMS Alert (1) (1)'))


WebUI.delay(2)

TestObject sms= new TestObject()

sms=WebUI.modifyObjectProperty(sms, 'xapth', 'equals', "//*[@id='tblMedical']/tbody[1]/tr[2]/td[1]/div/ins", true)

WebUI.click(sms)*/
    /*WebUI.click(findTestObject('Object Repository/HIMS/Page_HIMS/ins_iCheck-helper (1) (1)'))

WebUI.click(findTestObject('Object Repository/HIMS/Page_HIMS/ins_iCheck-helper_1 (1) (1)'))

WebUI.click(findTestObject('Object Repository/HIMS/Page_HIMS/ins_iCheck-helper_2 (1) (1)'))

WebUI.click(findTestObject('Object Repository/HIMS/Page_HIMS/input_btnok (1) (1)'))

WebUI.click(findTestObject('Object Repository/HIMS/Page_HIMS/ins_iCheck-helper_3 (1) (1)'))

WebUI.click(findTestObject('Object Repository/HIMS/Page_HIMS/ins_iCheck-helper_3 (1) (1)'))
*/
    WebUI.setText(findTestObject('Object Repository/HIMS/Page_HIMS/input_ReferredDoctorName (1) (1) (1)'), 'Rajesh')

    WebUI.setText(findTestObject('Object Repository/HIMS/Page_HIMS/input_PolicyName (1) (1) (1)'), 'JEEVAN SURAKSHA')

    WebUI.setText(findTestObject('Object Repository/HIMS/Page_HIMS/input_NameoftheInsuranceCompan (1) (1) (1)'), 'LIC')

    WebUI.setText(findTestObject('Object Repository/HIMS/Page_HIMS/input_AmountInsured (1) (1) (1)'), '350000')

    WebUI.setText(findTestObject('Object Repository/HIMS/Page_HIMS/input_ValidTill (1) (1) (1)'), '2020')

    WebUI.setText(findTestObject('Object Repository/HIMS/Page_HIMS/input_AuthorisedHospitals (1) (1) (1)'), 'BSR HOSPITALS')

    WebUI.setText(findTestObject('Object Repository/HIMS/Page_HIMS/input_AadharCardNo (1) (1) (1)'), Exceldata.getValue(
            'Aadhar', indexx))

    TestObject uploadimage = new TestObject()

    uploadimage = WebUI.modifyObjectProperty(uploadimage, 'xpath', 'equals', '//*[@id=\'imgupload\']', true)

    if (Exceldata.getValue('Gender', indexx).equalsIgnoreCase('FeMale')) {
        WebUI.sendKeys(uploadimage, ('C:\\Users\\Quality Analyst\\Downloads\\KDMC\\Girls\\' + indexx) + '.jpg')
    } else {
        WebUI.sendKeys(uploadimage, ('C:\\Users\\Quality Analyst\\Downloads\\KDMC\\men\\' + indexx) + '.jpg')
    }
    
    WebUI.click(findTestObject('Object Repository/HIMS/Page_HIMS/button_Submit (1) (1) (1)'))

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/HIMS/Page_HIMS/p_Patient registered Successfu (1) (1) (1)'))

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/HIMS/Page_HIMS/button_Close (1) (1) (1)'))
}

WebUI.click(findTestObject('Object Repository/HIMS/Page_HIMS/span_Neelaveni (1) (1) (1)'))

WebUI.click(findTestObject('Object Repository/HIMS/Page_HIMS/a_Sign out (1) (1) (1)'))

WebUI.closeBrowser()





