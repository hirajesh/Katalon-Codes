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

WebUI.navigateToUrl('http://122.165.236.133/chmwebf/#!')

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/CHMOBJECT/Page_CHMS/input__txtlip'), '122.165.236.133')

WebUI.setText(findTestObject('Object Repository/CHMOBJECT/Page_CHMS/input__txtlname'), 'administrator')

WebUI.setEncryptedText(findTestObject('Object Repository/CHMOBJECT/Page_CHMS/input__txtlpwd'), 'beLGBvhKelN4XmhHqYTDVg==')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/CHMOBJECT/Page_CHMS/button_LOGIN'))

/*TestObject login=new TestObject();

login=WebUI.modifyObjectProperty(login, "xpath", equals, "//*[@id='btnlogin']", true);

WebUI.click(login)*/

WebUI.delay(9)

WebUI.click(findTestObject('Object Repository/CHMOBJECT/Page_CHM/span_Sites'))

WebUI.delay(2)
for(int m=1;m<=5;m++)
{

for(int p=1;p<=250;p++)
{

WebUI.setText(findTestObject('Object Repository/CHMOBJECT/Page_CHM/input__txtsitename'), 'SITE'+m+'20'+p)

WebUI.setText(findTestObject('Object Repository/CHMOBJECT/Page_CHM/input__txtsitecode'), '000'+p)

WebUI.setText(findTestObject('Object Repository/CHMOBJECT/Page_CHM/input__txtsiteip'), '192.168.1'+m+'8.'+p)

WebUI.setText(findTestObject('Object Repository/CHMOBJECT/Page_CHM/input__txtsiteurl'), 'http://192.168.1'+m+'8.'+p+':8081/VmChm')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/CHMOBJECT/Page_CHM/button_Save'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/CHMOBJECT/Page_CHM/button_OK'))

WebUI.delay(2)

}

}
WebUI.click(findTestObject('Object Repository/CHMOBJECT/Page_CHM/img_Logout_rounded-circle'))

WebUI.click(findTestObject('Object Repository/CHMOBJECT/Page_CHM/a_Logout'))

WebUI.closeBrowser()

