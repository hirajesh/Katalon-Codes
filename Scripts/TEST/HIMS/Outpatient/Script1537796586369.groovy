import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.junit.Assert.*

import org.junit.After
import org.junit.Test
import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.ExcelData
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.sun.jna.StringArray

import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

/*WebUI.navigateToUrl('http://182.18.161.229/CHMSrev/home/index.html')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/OUTPATIENT/Page_Chennai Hospitals HIMS/img__u530_img'))

WebUI.switchToWindowTitle('HIMS')*/
WebUI.navigateToUrl('http://182.18.161.229/CHMSREV/Account/Login?Role=Doctor')

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/input_Doctor Sign In_Email'), 'rajesh')

WebUI.setEncryptedText(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/input_Doctor Sign In_Password'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/button_Sign In'))

StringArray patientame=["Mr.GUNAL","Mr.RAJARAM","Mr.RAHUL","Mr.DHANA","Mr.MOHAN","Mr.Ganakumar","Mr.SamburGanesh"]

//ExcelData pdata = findTestData('PatientData')

/*for(int i=0;i<=pdata;i++)
{
*/
//System.out.println("name "+patientame.SIZE)
//System.out.println("names "+patientame.getValue(patientame, i) )

WebUI.click(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/span_Clinical info'))

WebUI.setText(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/input__PatientDetails.PatientN'), "Mr.DHANA")

//WebUI.setText(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/input__PatientDetails.PatientN'), pdata.getValue("PatientData", i))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/input__PatientDetails.PatientN'), Keys.chord(Keys.ARROW_DOWN))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/input__PatientDetails.PatientN'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.scrollToPosition(200, 200)

WebUI.delay(2)

TestObject past=new TestObject()

past=WebUI.modifyObjectProperty(past, "xpath", "equals", "//*[@id='form1']/div[1]/div/div/div[4]/ul/li[1]/a", true)

WebUI.click(past)

WebUI.delay(2)

clickxpath("//*[@id='tab_1']/div/div/div[2]/table/tbody/tr[1]/td[1]/div/label[1]/div/ins")
 
clickxpath("//*[@id='tab_1']/div/div/div[2]/table/tbody/tr[1]/td[3]/div/label[1]/div/ins")

clickxpath("//*[@id='tab_1']/div/div/div[2]/table/tbody/tr[2]/td[3]/div/label[1]/div/ins") 

clickxpath("//*[@id='tab_1']/div/div/div[2]/table/tbody/tr[3]/td[5]/div/label[1]/div/ins")

clickxpath("//*[@id='tab_1']/div/div/div[2]/table/tbody/tr[3]/td[1]/div/label[1]/div/ins")


//   PERSONAL HISTORY
//======================

clickxpath("//*[@id='form1']/div[1]/div/div/div[4]/ul/li[2]/a")
clickxpath("//*[@id='tab_2']/div/div/div/div[1]/div/div/div[1]/ins")
clickxpath("//*[@id='tab_2']/div/div/div/div[2]/div/div/div[2]/ins")

//   HABITITUAL HISTORY
//======================

clickxpath("//*[@id='form1']/div[1]/div/div/div[4]/ul/li[3]/a")
clickxpath("//*[@id='tab_3']/div/div/div[2]/label[2]/div/ins")
clickxpath("//*[@id='tab_3']/div/div/div[2]/div/ins")


//   MEDICATION HISTORY
//======================

clickxpath("//*[@id='form1']/div[1]/div/div/div[4]/ul/li[4]/a")

sendxpath("//*[@id='tab_4']/div/div[1]/div[1]/div/span/span[1]/span", Keys.chord(Keys.ENTER))

WebUI.delay(2)

sendxpath("//*[@id='tab_4']/div/div[1]/div[1]/div/span/span[1]/span","Pencil")

WebUI.delay(2)

sendxpath("//*[@id='tab_4']/div/div[1]/div[1]/div/span/span[1]/span", Keys.chord(Keys.ARROW_DOWN))

sendxpath("//*[@id='tab_4']/div/div[1]/div[1]/div/span/span[1]/span", Keys.chord(Keys.ENTER))

WebUI.delay(2)

clickxpath("//*[@id='txtmedican']")

sendxpath("//*[@id='txtmedican']","Avil")

WebUI.delay(2)
 
sendxpath("//*[@id='txtmedican']", Keys.chord(Keys.ARROW_DOWN))
 
WebUI.delay(2)

sendxpath("//*[@id='txtmedican']", Keys.chord(Keys.ARROW_DOWN))
 
sendxpath("//*[@id='txtmedican']", Keys.chord(Keys.ENTER))
 
WebUI.delay(2)

clickxpath("//*[@id='tab_4']/div/div[1]/div[3]/div/span/span[1]/span")

WebUI.delay(2)

sendxpath("//*[@id='tab_4']/div/div[1]/div[3]/div/span/span[1]/span", Keys.chord(Keys.ARROW_DOWN))

WebUI.delay(1)

sendxpath("//*[@id='tab_4']/div/div[1]/div[3]/div/span/span[1]/span", Keys.chord(Keys.ARROW_DOWN))

WebUI.delay(1)

sendxpath("//*[@id='tab_4']/div/div[1]/div[3]/div/span/span[1]/span", Keys.chord(Keys.ARROW_DOWN))

WebUI.delay(1)

sendxpath("//*[@id='tab_4']/div/div[1]/div[3]/div/span/span[1]/span", Keys.chord(Keys.ENTER))

WebUI.delay(1)

clickxpath("//*[@id='tab_4']/div/div[1]/div[4]/div/span/span[1]/span")

WebUI.delay(1)

sendxpath("//*[@id='tab_4']/div/div[1]/div[4]/div/span/span[1]/span","1")

WebUI.delay(1)

sendxpath("//*[@id='tab_4']/div/div[1]/div[4]/div/span/span[1]/span", Keys.chord(Keys.ARROW_UP))

WebUI.delay(1)

sendxpath("//*[@id='tab_4']/div/div[1]/div[4]/div/span/span[1]/span", Keys.chord(Keys.ARROW_DOWN))

WebUI.delay(2)
 
sendxpath("//*[@id='tab_4']/div/div[1]/div[4]/div/span/span[1]/span", Keys.chord(Keys.ENTER))

sendxpath("//*[@id='tab_4']/div/div[1]/div[4]/div/span/span[1]/span", Keys.chord(Keys.ESCAPE))

WebUI.delay(2)

WebUI.scrollToPosition(200, 200)

clickxpath("//*[@id='post_data']")

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/button_Submit'))

WebUI.click(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/button_Close'))


//        CASE NOTES
//=========================

sendxpath("//*[@id='form1']/div[1]/div/div/div[4]/div[1]/div/span/span[1]/span/ul/li/input", "fever")

WebUI.delay(2)

sendxpath("//*[@id='form1']/div[1]/div/div/div[4]/div[1]/div/span/span[1]/span/ul/li/input", Keys.chord(Keys.ENTER))

WebUI.delay(2)

sendxpath("//*[@id='form1']/div[1]/div/div/div[4]/div[2]/div/span/span[1]/span/ul/li/input", "Malaria")
 
 WebUI.delay(2)
 
 sendxpath("//*[@id='form1']/div[1]/div/div/div[4]/div[2]/div/span/span[1]/span/ul/li/input", Keys.chord(Keys.ENTER))
 
 WebUI.delay(2)

WebUI.scrollToPosition(200, 200)
 
WebUI.setText(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/input_Weight(Kg)_Weight'), '65')

WebUI.setText(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/input_Height(Cms)_Height'), '165')

WebUI.setText(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/input_Temperature(F)_Temperatu'), '102')

WebUI.setText(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/input_SPO2_SPO2'), '95')

WebUI.click(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/div_Blood Pressure (Systolic)'))

WebUI.setText(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/input_Blood Pressure (Systolic'), '135')

WebUI.setText(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/input_Blood Pressure (Diastoli'), '85')

WebUI.setText(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/input_Heart Rate_HeartRate'), '74')

WebUI.setText(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/input_Saturation_Saturation'), '85')

WebUI.setText(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/input_FBS_FBS'), '30')

WebUI.setText(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/input_PPBS_PPBS'), '40')

WebUI.setText(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/input_RBS_RBS'), '50')

WebUI.delay(3)

WebUI.scrollToPosition(0000000, 0000000)

WebUI.click(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/button_Submit'))

WebUI.click(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/button_Close'))

WebUI.delay(3)


//   INVESTIGATION
//====================

WebUI.scrollToPosition(200, 200)



//     BIO-CHEMISTRY
//=======================

clickxpath("//*[@id='form1']/div[1]/div[2]/div[1]/div[5]/ul/li[2]/a")

WebUI.delay(1)

//clickxpath("//*[@id='tab_10']/div/div[1]/div/div[1]/div/div[1]/div/button")

WebUI.delay(1)

clickxpath("//*[@id='tab_10']/div/div[1]/div/div[1]/div/div[2]/div/span/span[1]/span/ul")

WebUI.delay(1)

sendxpath("//*[@id='tab_10']/div/div[1]/div/div[1]/div/div[2]/div/span/span[1]/span/ul/li/input", "Glucose")

WebUI.delay(1)

sendxpath("//*[@id='tab_10']/div/div[1]/div/div[1]/div/div[2]/div/span/span[1]/span/ul/li/input", Keys.chord(Keys.ARROW_DOWN))

WebUI.delay(1)

sendxpath("//*[@id='tab_10']/div/div[1]/div/div[1]/div/div[2]/div/span/span[1]/span/ul/li/input",Keys.chord(Keys.ENTER))

WebUI.delay(2)

//     HAMETOLOGY
//=======================



clickxpath("//*[@id='form1']/div[1]/div[2]/div[1]/div[5]/ul/li[3]/a")

WebUI.delay(1)

//clickxpath("//*[@id='tab_12']/div/div[1]/div/div[1]/div/div[1]/div/button")

WebUI.delay(1)

clickxpath("//*[@id='tab_12']/div/div[1]/div/div[1]/div/div[2]/div/span/span[1]/span/ul/li/input")

WebUI.delay(1)

sendxpath("//*[@id='tab_12']/div/div[1]/div/div[1]/div/div[2]/div/span/span[1]/span/ul/li/input","com")

WebUI.delay(1)

sendxpath("//*[@id='tab_12']/div/div[1]/div/div[1]/div/div[2]/div/span/span[1]/span/ul/li/input",Keys.chord(Keys.ENTER))

WebUI.delay(2)

//     MICRO-BIOLOGY
//=======================

clickxpath("//*[@id='form1']/div[1]/div[2]/div[1]/div[5]/ul/li[4]/a")

WebUI.delay(1)

//clickxpath("//*[@id='tab_14']/div/div[1]/div/div[1]/div/div[1]/div/button")

WebUI.delay(1)

clickxpath("//*[@id='tab_14']/div/div[1]/div/div[1]/div/div[2]/div/span/span[1]/span/ul/li/input")

WebUI.delay(1)

sendxpath("//*[@id='tab_14']/div/div[1]/div/div[1]/div/div[2]/div/span/span[1]/span/ul/li/input","blood")

WebUI.delay(1)

sendxpath("//*[@id='tab_14']/div/div[1]/div/div[1]/div/div[2]/div/span/span[1]/span/ul/li/input",Keys.chord(Keys.ENTER))

WebUI.delay(2)


//     RADIOLOGY
//=======================


// X-RAY
//===========

clickxpath("//*[@id='form1']/div[1]/div[2]/div[1]/div[5]/ul/li[5]/a")

WebUI.delay(1)

clickxpath("//*[@id='tab27']/div/div[1]/div[1]/div/div[1]/div/button")

WebUI.delay(1)

sendxpath("//*[@id='tab27']/div/div[1]/div[1]/div/div[2]/div[1]/span/span[1]/span/ul/li/input", "ab")

WebUI.delay(1)

sendxpath("//*[@id='tab27']/div/div[1]/div[1]/div/div[2]/div[1]/span/span[1]/span/ul/li/input",Keys.chord(Keys.ENTER))

WebUI.delay(2)


// ULTRA-SOUND
//==============
 
 clickxpath("//*[@id='tab27']/div/div[1]/div[2]/div/div[1]/div/button")
 
 WebUI.delay(1)
 
 clickxpath("//*[@id='tab27']/div/div[1]/div[2]/div/div[2]/div[1]/label[2]/div/ins")
  
 WebUI.delay(1)
 
 clickxpath("//*[@id='tab27']/div/div[1]/div[2]/div/div[1]/div/button")
 
 WebUI.delay(2)

 // ECHO-CARDIOGRAM
 //==================
 
 clickxpath("//*[@id='tab27']/div/div[1]/div[3]/div/div[1]/div/button")
  
  WebUI.delay(1)
  
  clickxpath("//*[@id='tab27']/div/div[1]/div[3]/div/div[2]/div[1]/label[2]/div/ins")
  
  WebUI.delay(1)
  
  clickxpath("//*[@id='tab27']/div/div[1]/div[3]/div/div[2]/div[1]/div[1]/div/div[2]/ins")
  
  WebUI.delay(1)
  
  clickxpath("//*[@id='tab27']/div/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/div[2]/ins")
  
  WebUI.delay(1)
  
  clickxpath("//*[@id='tab27']/div/div[1]/div[3]/div/div[1]/div/button")
  
  WebUI.delay(2)

 
WebUI.scrollToPosition(0000000, 0000000)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/button_Submit'))

WebUI.click(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/button_Download PDF'))

WebUI.delay(2)

clickxpath("//*[@id='modalPopup']/div/div/div[2]/p/button[2]")

WebUI.delay(2)


//     PRESCRIPTION
//=======================

WebUI.scrollToPosition(300, 300)

WebUI.setText(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/input_Action_MedicineNameValue'), 'Paracetamol ')

WebUI.setText(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/input_Action_DosageNameValue'), '500 mg')

WebUI.selectOptionByValue(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/select_OneTime - A dayTwoTime'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/select_OneTime - A dayTwoTime'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/select_Before-FoodAfter-FoodWi'), 'After-Food', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/select_1 day2 days3 days4 days'), '2', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/select_1 day2 days3 days4 days'), '3', 
    true)

WebUI.click(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/input_Action_post_data'))

WebUI.delay(2)

WebUI.scrollToPosition(300, 300)

WebUI.setText(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/input_Action_MedicineNameValue'), 'DOMPERON ')

WebUI.setText(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/input_Action_DosageNameValue'), '5 mg')

WebUI.selectOptionByValue(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/select_OneTime - A dayTwoTime'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/select_OneTime - A dayTwoTime'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/select_Before-FoodAfter-FoodWi'), 'After-Food',
	true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/select_1 day2 days3 days4 days'), '2',
	true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/select_1 day2 days3 days4 days'), '3',
	true)

WebUI.click(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/input_Action_post_data'))


WebUI.scrollToPosition(0000000, 0000000)

WebUI.click(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/button_Submit'))

WebUI.click(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/button_Download PDF'))

clickxpath("//*[@id='modalPopup']/div/div/div[2]/p[1]/button[2]")

//}
WebUI.click(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/span_Rajesh'))

WebUI.click(findTestObject('Object Repository/OUTPATIENT/Page_HIMS/a_Sign out'))

WebUI.closeBrowser()



def clickxpath(String xpaths)
{
	TestObject Clickxpaths=new TestObject()
	
	Clickxpaths=WebUI.modifyObjectProperty(Clickxpaths, "xpath", "equals", xpaths, true)
	
	WebUI.click(Clickxpaths)
}

def sendxpath(String xpaths,String Send)
{
	TestObject sendxpath=new TestObject()
	
	sendxpath=WebUI.modifyObjectProperty(sendxpath, "xpath", "equals", xpaths, true)
	
	WebUI.sendKeys(sendxpath, Send)
}




