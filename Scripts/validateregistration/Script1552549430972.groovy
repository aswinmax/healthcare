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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8090/eclinic')

WebUI.setText(findTestObject('Components/logins/input_MEDAS HIS_user_name'), 'abc')

WebUI.setText(findTestObject('Components/logins/input_MEDAS HIS_user_password'), '123')

WebUI.click(findTestObject('Components/Buttons/login'))

WebUI.verifyTextPresent('Invalid User/Password', false)

WebUI.setText(findTestObject('Components/logins/input_MEDAS HIS_user_name'), 'Admin')

WebUI.setText(findTestObject('Components/logins/input_MEDAS HIS_user_password'), '12345')

WebUI.click(findTestObject('Components/Buttons/login'))

WebUI.click(findTestObject('Components/Buttons/go'))

WebUI.click(findTestObject('validateregistration/Page_eClinicUserAdministrator/span_Front Desk'))

WebUI.click(findTestObject('validateregistration/Page_eClinicUserAdministrator/span_Registration'))

WebUI.delay(3)

WebUI.click(findTestObject('Components/Buttons/save'))

WebDriver driver = DriverFactory.getWebDriver()

'Getting the text from the alert and storing it in Variable'
String AlertText1 = driver.switchTo().alert().getText()

'Verifying the Actual and Expected text from Alert'
WebUI.verifyEqual(AlertText1, 'Please enter the Name')

WebUI.delay(2)

WebUI.dismissAlert()

WebUI.delay(2)

WebUI.setText(findTestObject('validateregistration/Page_eClinicUserAdministrator/input__patient_name'), '1-QA-Auto')

WebUI.click(findTestObject('Components/Buttons/save'))

//WebDriver driver = DriverFactory.getWebDriver()
'Getting the text from the alert and storing it in Variable'
String AlertText2 = driver.switchTo().alert().getText()

'Verifying the Actual and Expected text from Alert'
WebUI.verifyEqual(AlertText2, 'Please enter the age')

WebUI.delay(2)

WebUI.dismissAlert()

WebUI.delay(2)

//WebUI.click(findTestObject('validateregistration/Page_eClinicUserAdministrator/td_'))
WebUI.setText(findTestObject('validateregistration/Page_eClinicUserAdministrator/input_Yrs_patient_age'), '23')

WebUI.click(findTestObject('Components/Buttons/save'))

//WebDriver driver = DriverFactory.getWebDriver()
'Getting the text from the alert and storing it in Variable'
String AlertText3 = driver.switchTo().alert().getText()

'Verifying the Actual and Expected text from Alert'
WebUI.verifyEqual(AlertText3, 'Please enter the Gender')

WebUI.delay(2)

WebUI.dismissAlert()

WebUI.delay(2)

WebUI.click(findTestObject('validateregistration/Page_eClinicUserAdministrator/td_'))

WebUI.selectOptionByValue(findTestObject('validateregistration/Page_eClinicUserAdministrator/select_SelectMaleFemale'), 
    'Male', true)

WebUI.click(findTestObject('Components/Buttons/save'))

//WebDriver driver = DriverFactory.getWebDriver()
'Getting the text from the alert and storing it in Variable'
String AlertText4 = driver.switchTo().alert().getText()

'Verifying the Actual and Expected text from Alert'
WebUI.verifyEqual(AlertText4, 'Please enter the Residence Id')

WebUI.delay(2)

WebUI.dismissAlert()

WebUI.delay(2)

WebUI.setText(findTestObject('validateregistration/Page_eClinicUserAdministrator/input__emirates_id'), '111-1111-1111111-1')

WebUI.click(findTestObject('Components/Buttons/save'))

WebUI.delay(2)

//WebDriver driver = DriverFactory.getWebDriver()
'Getting the text from the alert and storing it in Variable'
String AlertText6 = driver.switchTo().alert().getText()

'Verifying the Actual and Expected text from Alert'
WebUI.verifyEqual(AlertText6, 'Please Enter Other Identification ID:')

WebUI.delay(2)

WebUI.dismissAlert()

WebUI.delay(2)

WebUI.setText(findTestObject('validateregistration/Page_eClinicUserAdministrator/input_Other Id'), '23568952')

WebUI.click(findTestObject('Components/Buttons/save'))

//WebDriver driver = DriverFactory.getWebDriver()
'Getting the text from the alert and storing it in Variable'
String AlertText7 = driver.switchTo().alert().getText()

'Verifying the Actual and Expected text from Alert'
WebUI.verifyEqual(AlertText7, 'Please select the Nationality')

WebUI.delay(2)

WebUI.dismissAlert()

WebUI.delay(2)

//WebUI.click(findTestObject('validateregistration/Page_eClinicUserAdministrator/select_SelectAfgh'))
WebUI.scrollToPosition(50, 60)

WebUI.selectOptionByValue(findTestObject('validateregistration/Page_eClinicUserAdministrator/select_SelectAfgh'), '2', true)

WebUI.click(findTestObject('Components/Buttons/save'))

//WebDriver driver = DriverFactory.getWebDriver()
'Getting the text from the alert and storing it in Variable'
String AlertText5 = driver.switchTo().alert().getText()

'Verifying the Actual and Expected text from Alert'
WebUI.verifyEqual(AlertText5, 'Please enter the Mobile number')

WebUI.delay(2)

WebUI.dismissAlert()

WebUI.delay(2)

WebUI.setText(findTestObject('validateregistration/Page_eClinicUserAdministrator/input__mobile'), '235652')

WebUI.click(findTestObject('Components/Buttons/save'))

//WebDriver driver = DriverFactory.getWebDriver()
'Getting the text from the alert and storing it in Variable'
String AlertText8 = driver.switchTo().alert().getText()

'Verifying the Actual and Expected text from Alert'
WebUI.verifyEqual(AlertText8, 'Please select Department')

WebUI.delay(2)

WebUI.dismissAlert()

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('validateregistration/Page_eClinicUserAdministrator/select_SelectDental'), '7', 
    true)

WebUI.click(findTestObject('Components/Buttons/save'))

//WebDriver driver = DriverFactory.getWebDriver()
'Getting the text from the alert and storing it in Variable'
String AlertText9 = driver.switchTo().alert().getText()

'Verifying the Actual and Expected text from Alert'
WebUI.verifyEqual(AlertText9, 'Please select Doctor')

WebUI.delay(2)

WebUI.dismissAlert()

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('validateregistration/Page_eClinicUserAdministrator/select_Select Absahani'), '8', 
    true)

//WebUI.click(findTestObject('validateregistration/Page_eClinicUserAdministrator/input__savebut'))
WebUI.click(findTestObject('validateregistration/Page_eClinicUserAdministrator/span_No'))

WebUI.click(findTestObject('validateregistration/Page_eClinicUserAdministrator/li_Yes'))

WebUI.click(findTestObject('Components/Buttons/save'))

//WebDriver driver = DriverFactory.getWebDriver()
'Getting the text from the alert and storing it in Variable'
String AlertText10 = driver.switchTo().alert().getText()

'Verifying the Actual and Expected text from Alert'
WebUI.verifyEqual(AlertText10, 'Please select Insurance Provider')

WebUI.delay(2)

WebUI.dismissAlert()

WebUI.delay(2)

WebUI.click(findTestObject('validateregistration/Page_eClinicUserAdministrator/span_----Select----'))

WebUI.click(findTestObject('validateregistration/Page_eClinicUserAdministrator/li_ALMADALLAH'))

WebUI.click(findTestObject('Components/Buttons/save'))

WebUI.delay(2)

WebUI.closeBrowser()

