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

/*WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8090/eclinic/index.jsp')

WebUI.setText(findTestObject('Object Repository/resourceappointment/input_MEDAS HIS_user_name'), 'admin')

WebUI.setText(findTestObject('Object Repository/resourceappointment/input_MEDAS HIS_user_password'), '12345')

WebUI.click(findTestObject('Object Repository/resourceappointment/a_Log In'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/resourceappointment/input_English_go'))

WebUI.delay(2)
*/

WebUI.click(findTestObject('Object Repository/resourceappointment/span_Front Desk'))

WebUI.click(findTestObject('Object Repository/resourceappointment/span_Appointment'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/resourceappointment/input_Date_appoint_date'), '30-12-2019')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/resourceappointment/pagebody'))

WebUI.delay(3)

//WebUI.sendKeys(findTestObject('Object Repository/resourceappointment/input_Date_appoint_date'), Keys.chord(Keys.ENTER))
//WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/resourceappointment/div_1000 AM'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/resourceappointment/select_doctor'), '3-6', true)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/resourceappointment/select_procedure'), 'Procedure', true)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/resourceappointment/select_value'), '2', true)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/resourceappointment/input_Name_appoint_name'), 'QAAuto_2')

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/resourceappointment/select_mob code'), '97152', true)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/resourceappointment/input__mobileno'), '253210121')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/resourceappointment/textarea_Remarks_appoint_purpose'), 'remark1')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/resourceappointment/input_Send SMS_needsms'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/resourceappointment/input_Send SMS_appsave'))

WebUI.delay(5)

/*
WebUI.click(findTestObject('Object Repository/resourceappointment/img'))

WebUI.click(findTestObject('Object Repository/resourceappointment/span_Front Desk'))

WebUI.click(findTestObject('Object Repository/resourceappointment/span_Appointment'))

WebUI.setText(findTestObject('Object Repository/resourceappointment/input_Date_appoint_date'), '30-12-2019')
*/
WebUI.click(findTestObject('Object Repository/resourceappointment/Remark'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/resourceappointment/Call Status'), '4', true)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/resourceappointment/input_Call Status_Save'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/resourceappointment/img_1'))

WebUI.delay(3)

//WebUI.click(findTestObject('Object Repository/resourceappointment/img'))
//WebUI.delay(3)
WebUI.acceptAlert()

WebUI.delay(3)

//WebUI.closeBrowser()

