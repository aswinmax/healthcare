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

WebUI.setText(findTestObject('Object Repository/registrationlists/input_MEDAS HIS_user_name'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/registrationlists/input_MEDAS HIS_user_password'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/registrationlists/a_Log In'))

WebUI.click(findTestObject('Object Repository/registrationlists/span_Damas Medical Center'))

WebUI.click(findTestObject('Object Repository/registrationlists/li_Damas Medical Center'))

WebUI.click(findTestObject('Object Repository/registrationlists/input_English_go'))

*/

WebUI.click(findTestObject('Object Repository/registrationlists/span_Front Desk'))

WebUI.click(findTestObject('Object Repository/registrationlists/span_Registration'))

WebUI.click(findTestObject('Object Repository/registrationlists/span_Registration List'))

WebUI.setText(findTestObject('Object Repository/registrationlists/input_Action_op_number'), 'DMC01-035984')

WebUI.sendKeys(findTestObject('Object Repository/registrationlists/input_Action_op_number'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/registrationlists/input_Action_op_number'), '')

//WebUI.sendKeys(findTestObject('Object Repository/registrationlists/input_Action_op_number'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/registrationlists/input_Action_fromdate'), '01-01-2016')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/registrationlists/input_Action_todate'), '01-01-2019')

WebUI.delay(3)

//WebUI.sendKeys(findTestObject('Object Repository/registrationlists/input_Action_todate'), Keys.chord(Keys.ENTER))

//WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/registrationlists/input_Action_patient_name'), 'salama')

WebUI.sendKeys(findTestObject('Object Repository/registrationlists/input_Action_patient_name'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/registrationlists/input_Action_patient_name'), '')

WebUI.setText(findTestObject('Object Repository/registrationlists/input_Action_startDate'), '01-01-2017')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Object Repository/registrationlists/input_Action_startDate'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/registrationlists/input_Action_startDate'), '')

WebUI.delay(3)

//WebUI.sendKeys(findTestObject('Object Repository/registrationlists/input_Action_startDate'), Keys.chord(Keys.ENTER))

//WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/registrationlists/input_Action_emirates_id'), '111-1111-1111111-1')

WebUI.sendKeys(findTestObject('Object Repository/registrationlists/input_Action_emirates_id'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/registrationlists/input_Action_emirates_id'), '')

//WebUI.sendKeys(findTestObject('Object Repository/registrationlists/input_Action_emirates_id'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/registrationlists/input_Action_mobile'), '97150')

WebUI.sendKeys(findTestObject('Object Repository/registrationlists/input_Action_mobile'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

//WebUI.setText(findTestObject('Object Repository/registrationlists/input_Action_mobile'), '')

WebUI.click(findTestObject('Object Repository/registrationlists/img'))

