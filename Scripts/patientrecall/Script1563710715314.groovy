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
import org.openqa.selenium.Keys as Keys

/*
WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8090/eclinic/index.jsp')

WebUI.setText(findTestObject('Object Repository/patientrecall/input_MEDAS HIS_user_name'), 'admin')

WebUI.setText(findTestObject('Object Repository/patientrecall/input_MEDAS HIS_user_password'), '12345')

WebUI.click(findTestObject('Object Repository/patientrecall/a_Log In'))

WebUI.click(findTestObject('Object Repository/patientrecall/input_English_go'))

WebUI.delay(3)
*/

WebUI.click(findTestObject('Object Repository/patientrecall/span_Front Desk'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/patientrecall/span_Appointment'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/patientrecall/span_Patient Recall'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/patientrecall/input_Action_op_number'), 'DMC01-000043')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Object Repository/resourceappointmentsearch/input_Action_op_number'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/patientrecall/img'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/patientrecall/input_Date_appoint_date'), '02-12-2019')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Object Repository/patientrecall/input_Date_appoint_date'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.refresh()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/patientrecall/div_100 PM'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/patientrecall/textarea_Remarks_appoint_purpose'), 'remark')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/patientrecall/input_Send SMS_needsms'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/patientrecall/input_Send SMS_appsave'))

WebUI.delay(3)

//WebUI.click(findTestObject('Object Repository/resourceappointment/img_1'))

//WebUI.delay(3)

//WebUI.click(findTestObject('Object Repository/resourceappointment/img'))
//WebUI.delay(3)
//WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/patientrecall/img_1'))

WebUI.delay(3)

WebUI.closeBrowser()

