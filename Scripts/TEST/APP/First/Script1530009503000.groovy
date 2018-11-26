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

/*Mobile.startApplication('C:\\Users\\Quality Analyst\\Desktop\\Modydoctor\\KDMC_V2 (25-06-2018).apk', true)

Mobile.clearText(findTestObject('m/android.widget.EditText0 - 182.18.161.2291234'), 0)

Mobile.setText(findTestObject('m/android.widget.EditText0 (1)'), '192.168.137.55:1234', 0)

Mobile.tap(findTestObject('m/android.widget.Button1 - SAVE (1)'), 0)

Mobile.tap(findTestObject('m/android.widget.Button1 - Go (1)'), 0)

Mobile.closeApplication()*/
//Mobile.startApplication('C:\\Users\\Quality Analyst\\Desktop\\Modydoctor\\KDMC_V2 (25-06-2018).apk', true)

Mobile.clearText(findTestObject('RT/android.widget.EditText0 - 182.18.161.2291234'), 0)

Mobile.setText(findTestObject('RT/android.widget.EditText0'), '192.168.137.55:1234', 0)

Mobile.tap(findTestObject('RT/android.widget.Button1 - SAVE'), 0)

Mobile.tap(findTestObject('RT/android.widget.Button1 - Go'), 0)

Mobile.setText(findTestObject('RT/android.widget.EditText1'), '123', 0)

Mobile.setText(findTestObject('RT/android.widget.EditText0 (1)'), 'hari', 0)

Mobile.tap(findTestObject('RT/android.widget.Button0 - Login'), 0)

Mobile.tap(findTestObject('RT/android.widget.TextView1 - PatientRegistration'), 0)

Mobile.setText(findTestObject('RT/android.widget.EditText0 (2)'), 'DANYA', 0)

Mobile.setText(findTestObject('RT/android.widget.EditText1 (1)'), '15', 0)

Mobile.tap(findTestObject('RT/android.widget.TextView6 - Select'), 0)

Mobile.tap(findTestObject('RT/android.widget.TextView1 - Male'), 0)

Mobile.setText(findTestObject('RT/android.widget.EditText2'), 'india', 0)

Mobile.setText(findTestObject('RT/android.widget.EditText3'), 'Mumbai', 0)

Mobile.setText(findTestObject('RT/android.widget.EditText4'), 'Kalyan', 0)

Mobile.tap(findTestObject('RT/android.view.View2'), 0)

Mobile.tap(findTestObject('RT/android.view.View3'), 0)

Mobile.setText(findTestObject('RT/android.widget.EditText5'), '9879898790', 0)

Mobile.setText(findTestObject('RT/android.widget.EditText6'), 'Kalyan', 0)

Mobile.tap(findTestObject('RT/android.widget.Button1 - Submit'), 0)

Mobile.closeApplication()

