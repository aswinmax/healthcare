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

/*
WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8090/eclinic/')

WebUI.delay(5)

WebUI.setText(findTestObject('Components/logins/input_MEDAS HIS_user_name'), username)

WebUI.setText(findTestObject('Components/logins/input_MEDAS HIS_user_password'), password)

WebUI.click(findTestObject('Components/Buttons/login'))

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/officeselection'))

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/selectoffice'))

WebUI.click(findTestObject('Components/Buttons/go'))

*/
WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/Frontdesktab'))

WebUI.delay(3)

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/registrationTab'))

WebUI.delay(3)

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/ReferralSelectionClick'))

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/ReferralSelected'))

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/ConsultationSelectionClick'))

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/ConsultationSelected'))

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/AlreadyGenerated'))

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/PatientName'), patientname)

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/DOB'), '11111985')

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/GenderClick'))

WebUI.selectOptionByValue(findTestObject('cashregister/Page_eClinicUserAdministrator/GenderSelected'), 'Male', true)

WebUI.selectOptionByValue(findTestObject('cashregister/Page_eClinicUserAdministrator/VisaTypeSelected'), 'resident', true)

WebUI.selectOptionByValue(findTestObject('cashregister/Page_eClinicUserAdministrator/Mobile1Ext'), '97155', true)

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/MobilenumInserted'), mobile)

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/Mobile2ExtClick'))

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/Mobile2ExtSelected'))

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/Mobile2Inserted'), '5841201214')

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/CityClick'))

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/CitySelected'))

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/EmailInserted'), 'we@qq.com')

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/FathernameInserted'), 'dad')

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/DesignationInserted'), 'qa')

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/SourceClick'))

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/SourceSelected'))

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/SourceInserted'), 'source tested')

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/EmergencyNameInserted'), '4578124512')

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/RelationInserted'), 'fath')

WebUI.selectOptionByValue(findTestObject('cashregister/Page_eClinicUserAdministrator/DepartmentSelected'), '7', false)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('cashregister/Page_eClinicUserAdministrator/DoctorSelected'), '8', false)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('cashregister/Page_eClinicUserAdministrator/NationalitySelected'), '2', false)

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/EmiratesIDInserted'), residenceid, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('cashregister/Page_eClinicUserAdministrator/OtherIDClick'), '3', false)

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/OtherIDInserted'), '230232421')

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/TelephoneClick'))

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/TelephoneSelected'))

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/TelephoneInserted'), '231789512')

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/PostalCodeInserted'), '235687451')

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/MothernameInserted'), 'mom')

//WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/span_Select (2)'), FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/MaritalStatusDisplay'), FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/span_Select (2)'), FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/EngishDisplay'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/EmergencyNumInserted'), '125658748')

WebUI.selectOptionByValue(findTestObject('cashregister/Page_eClinicUserAdministrator/RegistrationtypeSelected'), 'Normal', 
    false)

WebUI.delay(2)

WebUI.click(findTestObject('Components/Buttons/save'))

WebUI.delay(5)

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/RegistrationlistTab'))

WebUI.delay(3)

