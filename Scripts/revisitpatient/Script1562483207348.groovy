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
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

/*
WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8090/eclinic/index.jsp')

WebUI.setText(findTestObject('Object Repository/revisitpatient/input_MEDAS HIS_user_name'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/revisitpatient/input_MEDAS HIS_user_password'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/revisitpatient/a_Log In'))

WebUI.click(findTestObject('Object Repository/revisitpatient/span_Damas Medical Center'))

WebUI.click(findTestObject('Object Repository/revisitpatient/li_Damas Medical Center'))

WebUI.click(findTestObject('Object Repository/revisitpatient/input_English_go'))

*/

WebUI.click(findTestObject('Object Repository/revisitpatient/span_Front Desk'))

WebUI.click(findTestObject('Object Repository/revisitpatient/span_Registration'))

WebUI.click(findTestObject('Object Repository/revisitpatient/span_Patient Revisit'))

WebUI.setText(findTestObject('Object Repository/revisitpatient/input_MR No_opno'), 'DMC01-035984')

WebUI.sendKeys(findTestObject('revisitpatient/input_MR No_opno'), Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.selectOptionByValue(findTestObject('Object Repository/revisitpatient/select_department'), '6', true)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/revisitpatient/select_doctor'), '2', true)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/revisitpatient/input__savebut'))

WebUI.delay(10)

WebDriver driver = DriverFactory.getWebDriver()

String AlertText = driver.switchTo().alert().getText()

WebUI.verifyEqual(AlertText, 'Patient Already Visited This Doctor Today. Do you want to continue ?')

WebUI.delay(5)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/revisitpatient/img'))


