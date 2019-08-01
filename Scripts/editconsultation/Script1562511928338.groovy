import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.Keys as Keys

/*
WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8090/eclinic/index.jsp')

WebUI.setText(findTestObject('Object Repository/editconsultation/input_MEDAS HIS_user_name'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/editconsultation/input_MEDAS HIS_user_password'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/editconsultation/a_Log In'))

WebUI.click(findTestObject('Object Repository/editconsultation/input_English_go'))

*/

WebUI.click(findTestObject('Object Repository/editconsultation/span_Front Desk'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/editconsultation/span_Registration'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/editconsultation/span_Registration List'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/editconsultation/input_Action_patient_name'), 'AUTO')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('editconsultation/input_Action_patient_name'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/editconsultation/img'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/editconsultation/select_SelectLocalResidentVisitor'), 'local', 
    true)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/editconsultation/input_Clinic File No_Button'))

WebUI.delay(3)

WebDriver driver = DriverFactory.getWebDriver()

'Getting the text from the alert and storing it in Variable'
String AlertText1 = driver.switchTo().alert().getText()

'Verifying the Actual and Expected text from Alert'
WebUI.verifyEqual(AlertText1, 'Updated')
WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/editconsultation/button_Cancel'))

WebUI.delay(3)



WebUI.click(findTestObject('Object Repository/editconsultation/img_1'))

WebUI.delay(3)


