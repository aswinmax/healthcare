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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8090/eclinic/index.jsp')

WebUI.delay(5)

WebUI.setText(findTestObject('Components/logins/input_MEDAS HIS_user_name'), username)

WebUI.setText(findTestObject('Components/logins/input_MEDAS HIS_user_password'), password)

WebUI.click(findTestObject('Components/Buttons/login'))

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/officeselection'))

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/selectoffice'))

WebUI.click(findTestObject('Components/Buttons/go'))

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

WebUI.delay(2)

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/DOB'), '11111985')

WebUI.delay(1)

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/GenderClick'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('cashregister/Page_eClinicUserAdministrator/GenderSelected'), 'Male', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('cashregister/Page_eClinicUserAdministrator/VisaTypeSelected'), 'resident', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('cashregister/Page_eClinicUserAdministrator/Mobile1Ext'), '97155', true)

WebUI.delay(1)

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/MobilenumInserted'), mobile)

WebUI.delay(1)

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/Mobile2ExtClick'))

WebUI.delay(1)

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/Mobile2ExtSelected'))

WebUI.delay(1)

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/Mobile2Inserted'), '5841201214')

WebUI.delay(1)

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/CityClick'))

WebUI.delay(1)

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/CitySelected'))

WebUI.delay(1)

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/EmailInserted'), 'we@qq.com')

WebUI.delay(1)

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/FathernameInserted'), 'dad')

WebUI.delay(1)

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/DesignationInserted'), 'qa')

WebUI.delay(1)

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/SourceClick'))

WebUI.delay(1)

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/SourceSelected'))

WebUI.delay(1)

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/SourceInserted'), 'source tested')

WebUI.delay(1)

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/EmergencyNameInserted'), '4578124512')

WebUI.delay(1)

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/RelationInserted'), 'fath')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('cashregister/Page_eClinicUserAdministrator/DepartmentSelected'), '6', false)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('cashregister/Page_eClinicUserAdministrator/DoctorSelected'), '3', false)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('cashregister/Page_eClinicUserAdministrator/NationalitySelected'), '2', false)

WebUI.delay(1)

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/EmiratesIDInserted'), residenceid, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('cashregister/Page_eClinicUserAdministrator/OtherIDClick'), '3', false)

WebUI.delay(1)

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/OtherIDInserted'), '230232421')

WebUI.delay(1)

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/TelephoneClick'))

WebUI.delay(1)

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/TelephoneSelected'))

WebUI.delay(1)

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/TelephoneInserted'), '231789512')

WebUI.delay(1)

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/PostalCodeInserted'), '235687451')

WebUI.delay(1)

WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/MothernameInserted'), 'mom')

//WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/span_Select (2)'), FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/MaritalStatusDisplay'), FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/span_Select (2)'), FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/EngishDisplay'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/EmergencyNumInserted'), '125658748')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('cashregister/Page_eClinicUserAdministrator/RegistrationtypeSelected'), 'Normal', 
    false)

WebUI.delay(1)

WebUI.click(findTestObject('insregistration/span_No'))

WebUI.delay(1)

//WebUI.setText(findTestObject('cashregister/Page_eClinicUserAdministrator/li_Yes1'), 'Yes')
//WebUI.selectOptionByValue(findTestObject('insregistration/li_Yes'), '1', false)
//WebUI.click(findTestObject('insregistration/li_Yes'))
WebUI.selectOptionByValue(findTestObject('cashregister/Page_eClinicUserAdministrator/li_Yes1'), 'Yes', false)

WebUI.delay(1)

WebUI.click(findTestObject('insregistration/span_----Select----'))

WebUI.delay(1)

WebUI.click(findTestObject('insurance/li_ALMADALLAH'))

WebUI.delay(1)

WebUI.click(findTestObject('insurance/Insurar_Span'))

WebUI.delay(1)

WebUI.click(findTestObject('insurance/li_AL MADALLAH'))

//WebUI.click(findTestObject('insregistration/li_AL MADALLAH'))
WebUI.delay(1)

WebUI.click(findTestObject('insurance/network_span'))

WebUI.click(findTestObject('insurance/li_GN'))

WebUI.delay(1)

WebUI.setText(findTestObject('insurance/input__card_no'), '589564124')

WebUI.delay(1)

WebUI.setText(findTestObject('insregistration/input_Cert No_cert_no'), '8956412')

WebUI.delay(1)

WebUI.setText(findTestObject('insregistration/input_Dependents No'), '55')

WebUI.delay(1)

WebUI.setText(findTestObject('insregistration/input_Card No_ex_card_no'), '1212121')

WebUI.delay(1)

WebUI.setText(findTestObject('insregistration/input_Policy No_policy_number'), '2323232')

WebUI.delay(1)

WebUI.setText(findTestObject('insregistration/input_Claim No_claim_no'), '313131')

WebUI.delay(1)

/*
WebUI.click(findTestObject('insregistration/span_Consultation_getdeductible'))
WebUI.delay(2)

WebUI.setText(findTestObject('insregistration/input_Consultation_deductible'), '30')
WebUI.delay(2)

WebUI.setText(findTestObject('insregistration/input_For AllFor Each_copay_percent'), '10')
WebUI.delay(2)

WebUI.setText(findTestObject('insregistration/input_For AllFor Each_copay_percentrad'), '10')
WebUI.delay(2)

WebUI.setText(findTestObject('insregistration/input_For AllFor Each_copay_percenttrt'), '10')
WebUI.delay(2)

WebUI.setText(findTestObject('insregistration/input_For AllFor Each_copay_medicine'), '10')
WebUI.delay(2)

WebUI.setText(findTestObject('insregistration/input_For AllFor Each_copay_percentdental'), '10')
WebUI.delay(2)

WebUI.setText(findTestObject('insregistration/input_Maternity_copay_maternity'), '20')
WebUI.delay(2)

WebUI.setText(findTestObject('insregistration/input_AED_invoice_max_liability'), '25000')
WebUI.delay(2)

WebUI.setText(findTestObject('insregistration/input_AED_preapp_limit'), '15000')
WebUI.delay(2)

WebUI.setText(findTestObject('insregistration/input_AED_invoice_max_deduct'), '10000')
WebUI.delay(2)

WebUI.setText(findTestObject('insregistration/input__copay_patient'), '10')
WebUI.delay(5)

*/
WebUI.click(findTestObject('Components/Buttons/save'))

WebUI.delay(5)

WebUI.click(findTestObject('cashregister/Page_eClinicUserAdministrator/RegistrationlistTab'))

WebUI.click(findTestObject('Components/Buttons/logout'))

WebUI.closeBrowser()

