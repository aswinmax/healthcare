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

WebUI.setText(findTestObject('Object Repository/resourceappointmentsearch/input_MEDAS HIS_user_name'), 'admin')

WebUI.setText(findTestObject('Object Repository/resourceappointmentsearch/input_MEDAS HIS_user_password'), '12345')

WebUI.click(findTestObject('Object Repository/resourceappointmentsearch/a_Log In'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/resourceappointmentsearch/input_English_go'))

WebUI.delay(5)
*/

WebUI.click(findTestObject('Object Repository/resourceappointmentsearch/span_Front Desk'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/resourceappointmentsearch/span_Appointment'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/resourceappointmentsearch/span_Resource Appointment Search'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/resourceappointmentsearch/input_Action_appoint_date'), '07-01-2019')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Object Repository/resourceappointmentsearch/input_Action_appoint_date'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/resourceappointmentsearch/input_Action_appoint_date'), '')

WebUI.delay(5)

//WebUI.sendKeys(findTestObject('Object Repository/resourceappointmentsearch/input_Action_appoint_date'), Keys.chord(Keys.ENTER))
//WebUI.delay(3)
WebUI.setText(findTestObject('Object Repository/resourceappointmentsearch/input_Action_op_number'), 'DMC01-004724')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Object Repository/resourceappointmentsearch/input_Action_op_number'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/resourceappointmentsearch/input_Action_op_number'), '')

WebUI.delay(5)

//WebUI.sendKeys(findTestObject('Object Repositoryresourceappointmentsearch/input_Action_op_number'), Keys.chord(Keys.ENTER))
//WebUI.delay(3)
WebUI.setText(findTestObject('Object Repository/resourceappointmentsearch/input_Action_mobile'), '9444')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Object Repository/resourceappointmentsearch/input_Action_mobile'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/resourceappointmentsearch/input_Action_mobile'), '')

WebUI.delay(5)

//WebUI.sendKeys(findTestObject('Object Repositoryresourceappointmentsearch/input_Action_mobile'), Keys.chord(Keys.ENTER))
//WebUI.delay(3)
WebUI.setText(findTestObject('Object Repository/resourceappointmentsearch/input_Action_patient_name'), 'obaid')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Object Repository/resourceappointmentsearch/input_Action_patient_name'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/resourceappointmentsearch/input_Action_patient_name'), '')

WebUI.delay(5)

//WebUI.sendKeys(findTestObject('Object Repository/resourceappointmentsearch/input_Action_patient_name'), Keys.chord(Keys.ENTER))
//WebUI.delay(3)
WebUI.setText(findTestObject('Object Repository/resourceappointmentsearch/input_Action_rdoctor_name'), '16')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Object Repository/resourceappointmentsearch/input_Action_rdoctor_name'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/resourceappointmentsearch/input_Action_rdoctor_name'), '')

WebUI.delay(5)

//WebUI.sendKeys(findTestObject('Object Repository/resourceappointmentsearch/input_Action_rdoctor_name'), Keys.chord(Keys.ENTER))
//WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/resourceappointmentsearch/span_Select an Option'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/resourceappointmentsearch/li_Dr. Adel Ahmed Al Aswa'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/resourceappointmentsearch/span_----All--'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/resourceappointmentsearch/li_Booked'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/resourceappointmentsearch/img'))

WebUI.delay(5)

//WebUI.closeBrowser()

