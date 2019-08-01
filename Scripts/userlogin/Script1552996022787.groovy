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

WebUI.navigateToUrl('http://localhost:8090/eclinic/')

WebUI.delay(5)

WebUI.setText(findTestObject('Components/logins/input_MEDAS HIS_user_name'), 'Admin')

WebUI.setText(findTestObject('Components/logins/input_MEDAS HIS_user_password'), '12345')

WebUI.click(findTestObject('Components/Buttons/login'))

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/officeselection'))

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/selectoffice'))

WebUI.click(findTestObject('Components/Buttons/go'))

