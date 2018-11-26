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

WebUI.navigateToUrl('http://122.165.236.133/MultiHospital/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('GRN/Page_KDMC/a_CMS'))

WebUI.setText(findTestObject('GRN/Page_CMS login/input_txtusername'), 'vino2')

WebUI.setText(findTestObject('GRN/Page_CMS login/input_txtpassword'), '123')

WebUI.delay(3)

int y=2

WebUI.click(findTestObject('GRN/Page_CMS login/button_Sign in'))

WebUI.click(findTestObject('GRN/Page_KDMC - CMS/a_CMS Details'))

WebUI.click(findTestObject('GRN/Page_KDMC - CMS/a_Goods Receive'))

WebUI.delay(15)

//WebUI.selectOptionByIndex(findTestObject('GRN/Page_KDMC - CMS/select_--Select--PO0030PO0029P'), '18', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('GRN/Page_KDMC - CMS/select_--Select--PERUMAL PHARM'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('GRN/Page_KDMC - CMS/input_txtgrnno'), '5000')

WebUI.setText(findTestObject('GRN/Page_KDMC - CMS/input_txtgrnno_1'), '50')

WebUI.setText(findTestObject('GRN/Page_KDMC - CMS/input_txtgrnno_2'), 'CHA'+getRandomInt(3, 10, 99))

WebUI.setText(findTestObject('GRN/Page_KDMC - CMS/input_txtgrnno_3'), 'INV'+getRandomInt(2, 100,999))

WebUI.scrollToPosition(200, 200)

GrnLength=WebUI.getNumberOfTotalOption(findTestObject('GRN/Page_KDMC - CMS/select_--Select--Automatic x-r'))
System.out.println("Length OF The Medicine " +GrnLength)
int s=1
for (int t=1;t<GrnLength;t++) 
{

WebUI.selectOptionByIndex(findTestObject('GRN/Page_KDMC - CMS/select_--Select--Automatic x-r'), t, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('GRN/Page_KDMC - CMS/input_txtqty'),'200')

WebUI.selectOptionByIndex(findTestObject('GRN/Page_KDMC - CMS/select_--Select--No Tax0'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('GRN/Page_KDMC - CMS/input_txtmrp'),''+getRandomInt(4, 15, 45))

WebUI.setText(findTestObject('GRN/Page_KDMC - CMS/input_txtdeal'),''+getRandomInt(5, 1, 12))

WebUI.setText(findTestObject('GRN/Page_KDMC - CMS/input_txtbatchno'), 'BA'+getRandomInt(1,10, 999))

WebUI.rightClick(findTestObject('GRN/Page_KDMC - CMS/input_txtexpdate'))

WebUI.selectOptionByIndex(findTestObject('GRN/Page_KDMC - CMS/select_20182019202020212022202'), s, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('GRN/Page_KDMC - CMS/select_JanFebMarAprMayJunJulAu'), s, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('GRN/Page_KDMC - CMS/a_10'))

WebUI.click(findTestObject('GRN/Page_KDMC - CMS/input_btnadd'))

if (s==10)
{
 s=1
}
else
{ 
s++;
}
WebUI.delay(1)
}
WebUI.scrollToElement(findTestObject('GRN/Page_KDMC - CMS/input_btnSubmit'),20)

WebUI.delay(3)
WebUI.click(findTestObject('GRN/Page_KDMC - CMS/input_btnSubmit'))

WebUI.click(findTestObject('GRN/Page_KDMC - CMS/button_OK'))

WebUI.click(findTestObject('GRN/Page_KDMC - CMS/a_dropdown-toggle'))

WebUI.click(findTestObject('GRN/Page_KDMC - CMS/a_Sign out'))

WebUI.closeBrowser()

def getRandomInt(id,min, max) 
{ 
	switch(id)
	{
		//Batch
		case 1:
		
		return Math.floor(Math.random() * (max - min + 1)) + min;
		break
		//Invoice
		case 2:
		
		return Math.floor(Math.random() * (max - min + 1)) + min;
		break
		
		//Challan
		case 3:
		
		return Math.floor(Math.random() * (max - min + 1)) + min;
		break
		
		//MRP
		case 4:
		
		return Math.floor(Math.random() * (max - min + 1)) + min;
		break
		
		//Selling Price
		case 5:
		
		return Math.floor(Math.random() * (max - min + 1)) + min;
		break
	}
	
	
}


