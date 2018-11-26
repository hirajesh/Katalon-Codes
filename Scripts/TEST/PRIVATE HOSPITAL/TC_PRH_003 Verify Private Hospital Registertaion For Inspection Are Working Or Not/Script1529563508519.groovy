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

WebUI.navigateToUrl('http://182.18.161.229/Multihospital_New/Privatehoslogin.aspx')

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.setText(findTestObject('Private Data Entry/Page_Private Hospital login/input_txtusername'), 'ganga')

WebUI.setText(findTestObject('Private Data Entry/Page_Private Hospital login/input_txtpassword'), '123')

WebUI.delay(2)

WebUI.click(findTestObject('Private Data Entry/Page_Private Hospital login/button_Sign in'))

/*WebUI.click(findTestObject('Private Data Entry/Page_KDMC - Masters/input_btnupdate'))

WebUI.click(findTestObject('Private Data Entry/Page_KDMC - Masters/button_Yes'))

WebUI.switchToWindowTitle('BillDesk - All Your Payments. Single Location')

WebUI.click(findTestObject('Private Data Entry/Page_BillDesk - All Your Payments./a_Cancel'))

WebUI.switchToWindowTitle('KDMC - Masters')

WebUI.click(findTestObject('Private Data Entry/Page_KDMC - Masters/a_dropdown-toggle'))

WebUI.click(findTestObject('Private Data Entry/Page_KDMC - Masters/a_Sign out'))

WebUI.setText(findTestObject('Private Data Entry/Page_Private Hospital login/input_txtusername'), 'ganga')

WebUI.setText(findTestObject('Private Data Entry/Page_Private Hospital login/input_txtpassword'), '123')

WebUI.sendKeys(findTestObject('Private Data Entry/Page_Private Hospital login/input_txtpassword'), Keys.chord(Keys.ENTER))
*/

WebUI.delay(2)

WebUI.click(findTestObject('Private Data Entry/Page_KDMC - Masters/input_btnadd'))

WebUI.selectOptionByValue(findTestObject('Private Data Entry/Page_KDMC - Masters/select_--Select--SURESH NURSIN'), '11', 
    true)

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtappname'), 'GANGA')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txttellno'), '798797451131313')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtaddress'), 'SMS STREET TRICHY')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtnational'), 'INDIAN')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtsuit'), 'Good')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtnameother'), 'Ganga Nursing Home')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtplace'), 'Trichy')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtarrangement'), 'Immunization Are Given')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtkitchen'), 'Floor Space Of Kitchen ')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtdetails'), 'Convenience For patient 2')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtstorage'), 'Stoarge Food')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtwhether'), 'permises used in connecti')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtnoofbed'), '50')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtotherpat'), '50')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtnursingstaff'), 'Yes Accomtade')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtunregistered'), 'Midwife')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtnationality'), 'Indian')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtapplicant'), 'yes conducted')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtdateofexpiry'), '5/5/2018')

WebUI.delay(2)

TestObject date=new TestObject()
date=WebUI.modifyObjectProperty(date, 'xpath', 'equals', ('//*[@id="txtgrndate"]'), true)
WebUI.scrollToElement(date,20)
date=WebUI.click(date)

WebUI.delay(2)

TestObject number=new TestObject()
number=WebUI.modifyObjectProperty(number, 'xpath', 'equals', ('//*[@id="ui-datepicker-div"]/table/tbody/tr[3]/td[4]/a'), true)
number=WebUI.click(number)

WebUI.delay(2)

TestObject photo=new TestObject()
photo=WebUI.modifyObjectProperty(photo, 'xpath', 'equals', ('//*[@id="txtsignature"]'), true)
//photo=WebUI.sendKeys(findTestObject(photo), 'C:\\Users\\Quality Analyst\\Downloads\\KDMC\\Signatures\\1.png')
WebUI.uploadFile(findTestObject('input_browse'),'C:\\Users\\Quality Analyst\\Downloads\\KDMC\\Signatures\\1.png')
WebUI.scrollToElement(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtowner'),20)

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtowner'), 'Ganga')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txthosowner'), 'Ganga')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtownership'), 'Ganga')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtphno'), '0433326131312')

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Private Data Entry/Page_KDMC - Masters/select_--Select--'), '1', true)

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtarea'), '1500')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtnobed'), '50')

WebUI.delay(3)

TestObject bed = new TestObject()

bed = WebUI.modifyObjectProperty(bed, 'xpath', 'equals', ('//*[@id = "txtroomdetail"]'), true)

bed=WebUI.click(bed, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtnobed_1'), 'General')

WebUI.delay(2)

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtnobed_2'), '50')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtroomdetail'), 'Special')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtareaandwidth'), '1500')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtothers'), 'No')

WebUI.click(findTestObject('Private Data Entry/Page_KDMC - Masters/input_btnrowadd'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtage'), 20)

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtdoc'), 'RAGU')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtqual'), 'MBBS')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtage'), '31')

WebUI.click(findTestObject('Private Data Entry/Page_KDMC - Masters/div_Stamp of M.M.C.Registratio'))

WebUI.scrollToElement(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtregnum'),20)

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtregnum'), '846046468786476546')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtdoct'), 20)

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtdoct'), 'Raja')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtspl'), 'General Medicine')

WebUI.click(findTestObject('Private Data Entry/Page_KDMC - Masters/div_Qualification'))

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtqual_1'), 'MBBS')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtage_1'), '30')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtmaha'), '978797654354654')

WebUI.click(findTestObject('Private Data Entry/Page_KDMC - Masters/input_btnrowadd_1'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtage2'), 20)

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtdoct1'), 'Guru')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtspl1'), 'General Surgery')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtqual2'), 'MBBS')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtage2'), '29')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtmaha1'), '987987061543543')

WebUI.click(findTestObject('Private Data Entry/Page_KDMC - Masters/input_btnrowadd_2'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtdoct2'), 20)

WebUI.delay(2)

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtdoct2'), 'General')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtspl2'), 'RAM')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtqual3'), 'mbbs')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtage3'), '29')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtmaha2'), '98789716645')

WebUI.click(findTestObject('Private Data Entry/Page_KDMC - Masters/input_btnrowadd_3'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtdoct3'), 20)

WebUI.delay(2)

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtdoct3'), 'Nithya')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtqual4'), 'bsc nursing')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtage4'), '26')

WebUI.click(findTestObject('Private Data Entry/Page_KDMC - Masters/div_Registration No from Mahar'))

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtmaha3'), '9879878464654654')

WebUI.click(findTestObject('Private Data Entry/Page_KDMC - Masters/input_btnrowadd_4'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtdoct4'), 20)

WebUI.delay(2)

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtdoct4'), 'Not Rendered')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtqual5'), '50')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtage5'), 'Fifty')

WebUI.setText(findTestObject('Private Data Entry/Page_KDMC - Masters/input_txtmaha4'), '55')

WebUI.click(findTestObject('Private Data Entry/Page_KDMC - Masters/input_btnrowadd_5'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Private Data Entry/Page_KDMC - Masters/input_ctl00ContentPlaceHolder1'),20)

WebUI.click(findTestObject('Private Data Entry/Page_KDMC - Masters/input_ctl00ContentPlaceHolder1'))

WebUI.delay(3)

WebUI.click(findTestObject('Private Data Entry/Page_KDMC - Masters/a_dropdown-toggle'))

WebUI.click(findTestObject('Private Data Entry/Page_KDMC - Masters/a_Sign out'))

WebUI.closeBrowser()

