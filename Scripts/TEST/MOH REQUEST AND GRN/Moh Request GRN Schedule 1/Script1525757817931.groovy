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
import org.junit.After as After
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.137.1/multihospital_new/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC/a_CMS'))

WebUI.setText(findTestObject('MOH AND GRN/Page_CMS login/input_txtusername'), 'bala')

WebUI.setText(findTestObject('MOH AND GRN/Page_CMS login/input_txtpassword'), '123')

WebUI.delay(3)

WebUI.click(findTestObject('MOH AND GRN/Page_CMS login/button_Sign in'))

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC - CMS/a_Request to MOH'))

WebUI.selectOptionByIndex(findTestObject('MOH AND GRN/Page_KDMC - CMS/select_--Select--'), '2', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('MOH AND GRN/Page_KDMC - CMS/select_--Select--Schedule 1Inj'), '1', FailureHandling.STOP_ON_FAILURE)

selectedoptions = WebUI.getNumberOfTotalOption(findTestObject('MOH AND GRN/Page_KDMC - CMS/select_--Select--Adernaline 0.'))

for (int j = 1; j <=selectedoptions-1; j++) {
    WebUI.selectOptionByIndex(findTestObject('MOH AND GRN/Page_KDMC - CMS/select_--Select--Schedule 1Inj'), '1', FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByIndex(findTestObject('MOH AND GRN/Page_KDMC - CMS/select_--Select--Adernaline 0.'), j, FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('MOH AND GRN/Page_KDMC - CMS/input_txttreat'), '5000')

    WebUI.click(findTestObject('MOH AND GRN/Page_KDMC - CMS/button_Add'))
}

WebUI.scrollToElement(findTestObject('MOH AND GRN/Page_KDMC - CMS/input_btnsave'), 20)

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC - CMS/input_btnsave'))

WebUI.delay(3)

/*Request=WebUI.getText(findTestObject('MOH AND GRN/Page_KDMC - CMS/div_ Request Send To MOH Store'))
System.out.println("Length OF The Medicine " +Request)*/
Request1 = WebUI.getText(findTestObject('MOH AND GRN/Page_KDMC - CMS/font_PRNO0505201876'))

System.out.println('Length OF The Medicine ' + Request1)

RequestNUmber = Request1.split('/')[2].trim()

System.out.println('ID IS ' + RequestNUmber)

WebUI.delay(3)

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC - CMS/button_OK'))

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC - CMS/a_dropdown-toggle'))

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC - CMS/a_Sign out'))

WebUI.delay(4)

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC/a_Admin Master'))

WebUI.setText(findTestObject('MOH AND GRN/Page_Admin login/input_txtusername'), 'admin')

WebUI.setText(findTestObject('MOH AND GRN/Page_Admin login/input_txtpassword'), 'admin123')

WebUI.delay(3)

WebUI.click(findTestObject('MOH AND GRN/Page_Admin login/button_Sign in'))

WebUI.delay(20)

WebUI.scrollToPosition(200, 200)

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC/a_CMS_1'))

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC/a_Request List'))

TestObject RequestNumberId = WebUI.modifyObjectProperty(findTestObject('MOH AND GRN/Page_KDMC - CMS/input_PO0032'), 'xpath','equals', ('//*[@id =' + RequestNUmber) + ']', true)

WebUI.click(RequestNumberId)

/*TestObject to = WebUI.modifyObjectProperty(findTestObject('Dynamic.Objs/Page_AdvisorWeb Login/img_login'), 'xpath', 'equals', '//*[@id = 'login']"+changedValue', true)
 WebUI.click(to)*/

WebUI.delay(3)

WebUI.selectOptionByIndex(findTestObject('MOH AND GRN/Page_KDMC/select_--Select--'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC/input_btnupdate'))

WebUI.delay(3)

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC/button_OK'))

WebUI.delay(3)

WebUI.scrollToPosition(200, 200)

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC/a_CMS_2'))

WebUI.delay(2)

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC/a_Generate P.O'))

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('MOH AND GRN/Page_KDMC/select_--Select--PRNO040520183'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('MOH AND GRN/Page_KDMC/select_--Select--Hamen Chandra'), '7', FailureHandling.STOP_ON_FAILURE)

PONumber = WebUI.getText(findTestObject('MOH AND GRN/Page_KDMC/input_lblpono')).trim()
PONumber1 = WebUI.getAttribute(findTestObject('MOH AND GRN/Page_KDMC/input_lblpono'),'value').trim()
System.out.println('PO NUMBER :' +PONumber)
System.out.println('PO NUMBER :' +PONumber1)


WebUI.click(findTestObject('MOH AND GRN/Page_KDMC/input_chkrem'))

WebUI.scrollToElement(findTestObject('MOH AND GRN/Page_KDMC/input_btnreturn'), 20)

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC/input_btnreturn'))

WebUI.delay(3)

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC/button_Yes'))

WebUI.delay(3)

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC/a_dropdown-toggle'))

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC/a_Sign out'))

WebUI.delay(4)

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC/a_CMS'))

WebUI.setText(findTestObject('MOH AND GRN/Page_CMS login/input_txtusername'), 'bala')

WebUI.setText(findTestObject('MOH AND GRN/Page_CMS login/input_txtpassword'), '123')

WebUI.delay(3)

WebUI.click(findTestObject('MOH AND GRN/Page_CMS login/button_Sign in'))

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC - CMS/a_CMS Details'))

WebUI.delay(2)

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC - CMS/a_Goods Receive'))
WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('MOH AND GRN/Page_KDMC - CMS/select_--Select--PO0032PO0031P'),PONumber1, false)

WebUI.setText(findTestObject('MOH AND GRN/Page_KDMC - CMS/input_txtgrnno'), 'INV' + RandomInt(2, 100, 999))

WebUI.selectOptionByIndex(findTestObject('MOH AND GRN/Page_KDMC - CMS/select_--Select--PERUMAL PHARM'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MOH AND GRN/Page_KDMC - CMS/input_txtgrnno_1'), '15000')

WebUI.setText(findTestObject('MOH AND GRN/Page_KDMC - CMS/input_txtgrnno_2'), '500')

WebUI.setText(findTestObject('MOH AND GRN/Page_KDMC - CMS/input_txtgrnno_3'), 'CH' + RandomInt(3, 10, 999))

WebUI.scrollToPosition(200, 200)

GrnLength=WebUI.getNumberOfTotalOption(findTestObject('MOH AND GRN/Page_KDMC - CMS/select_--Select--Amikacin -500'))
System.out.println("Length OF The Medicine " +GrnLength)
int s=1
for (int t=1;t<GrnLength;t++)
{
WebUI.selectOptionByIndex(findTestObject('MOH AND GRN/Page_KDMC - CMS/select_--Select--Amikacin -500'), t, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MOH AND GRN/Page_KDMC - CMS/input_txtqty'), '5000')

WebUI.selectOptionByIndex(findTestObject('MOH AND GRN/Page_KDMC - CMS/select_--Select--No Tax0'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MOH AND GRN/Page_KDMC - CMS/input_txtmrp'), '' + RandomInt(4, 15, 45))

WebUI.setText(findTestObject('MOH AND GRN/Page_KDMC - CMS/input_txtdeal'), '' + RandomInt(5, 1, 12))

WebUI.setText(findTestObject('MOH AND GRN/Page_KDMC - CMS/input_txtbatchno'), 'BA' + RandomInt(1, 10, 999))

WebUI.rightClick(findTestObject('GRN/Page_KDMC - CMS/input_txtexpdate'))

WebUI.selectOptionByIndex(findTestObject('GRN/Page_KDMC - CMS/select_20182019202020212022202'), s, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('GRN/Page_KDMC - CMS/select_JanFebMarAprMayJunJulAu'), s, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC - CMS/a_12'))

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC - CMS/input_btnadd'))
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
WebUI.scrollToElement(findTestObject('MOH AND GRN/Page_KDMC - CMS/input_btnSubmit'),20)

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC - CMS/input_btnSubmit'))

WebUI.delay(3)

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC - CMS/button_OK'))

WebUI.delay(2)

/*WebUI.click(findTestObject('MOH AND GRN/Page_KDMC - CMS/a_CMS Details'))

WebUI.delay(2)

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC - CMS/a_Receiving Details'))

WebUI.delay(2)

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC - CMS/input_PO0032'))

WebUI.scrollToElement(findTestObject('MOH AND GRN/Page_KDMC - CMS/button_Close'),20)

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC - CMS/button_Close'))
*/
WebUI.delay(3)

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC - CMS/a_dropdown-toggle'))

WebUI.click(findTestObject('MOH AND GRN/Page_KDMC - CMS/a_Sign out'))

WebUI.closeBrowser()

 //Batch
//Invoice
//Challan
//MRP
//Selling Price

def RandomInt(def id, def min, def max) {
    switch (id) {
        case 1:
            return Math.floor(Math.random() * ((max - min) + 1)) + min
            
            break
        case 2:
            return Math.floor(Math.random() * ((max - min) + 1)) + min
            
            break
        case 3:
            return Math.floor(Math.random() * ((max - min) + 1)) + min
            
            break
        case 4:
            return Math.floor(Math.random() * ((max - min) + 1)) + min
            
            break
        case 5:
            return Math.floor(Math.random() * ((max - min) + 1)) + min
            
            break
    }
}

