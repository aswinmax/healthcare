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

WebUI.navigateToUrl('http://localhost:8090/eclinic/index.jsp')

WebUI.setText(findTestObject('Object Repository/patientvisit/input_MEDAS HIS_user_name'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/patientvisit/input_MEDAS HIS_user_password'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/patientvisit/a_Log In'))

WebUI.click(findTestObject('Object Repository/patientvisit/input_English_go'))

WebUI.click(findTestObject('Object Repository/patientvisit/span_Front Desk'))

WebUI.click(findTestObject('Object Repository/patientvisit/span_Registration'))

WebUI.click(findTestObject('Object Repository/patientvisit/span_Registration List'))

WebUI.setText(findTestObject('Object Repository/patientvisit/input_Action_patient_name'), 'AUTO')

WebUI.click(findTestObject('Object Repository/patientvisit/img'))

WebUI.selectOptionByValue(findTestObject('Object Repository/patientvisit/select_dept'), '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/patientvisit/select_doctor'), '3', true)

WebUI.click(findTestObject('Object Repository/patientvisit/input__savebut'))

WebUI.click(findTestObject('Object Repository/patientvisit/img_1'))

WebUI.closeBrowser()

