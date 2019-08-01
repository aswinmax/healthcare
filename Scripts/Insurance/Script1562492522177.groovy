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

WebUI.setText(findTestObject('Object Repository/insurance/input_MEDAS HIS_user_name'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/insurance/input_MEDAS HIS_user_password'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/insurance/a_Log In'))

WebUI.click(findTestObject('Object Repository/insurance/input_English_go'))

WebUI.click(findTestObject('Object Repository/insurance/span_Front Desk'))

WebUI.click(findTestObject('Object Repository/insurance/span_Registration'))

WebUI.setText(findTestObject('Object Repository/insurance/input__patient_name'), 'QA-Check')

WebUI.selectOptionByValue(findTestObject('Object Repository/insurance/select-recruitement'), 'Normal', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/insurance/select_dept'), '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/insurance/select_doctor'), '3', true)

WebUI.click(findTestObject('Object Repository/insurance/span_No'))

WebUI.click(findTestObject('Object Repository/insurance/li_Yes'))

WebUI.click(findTestObject('Object Repository/insurance/span_----Select----'))

WebUI.click(findTestObject('Object Repository/insurance/li_ALMADALLAH'))

WebUI.click(findTestObject('Object Repository/insurance/span_----Select----'))

WebUI.click(findTestObject('Object Repository/insurance/li_AL MADALLAH'))

WebUI.click(findTestObject('Object Repository/insurance/span_----Select----'))

WebUI.click(findTestObject('Object Repository/insurance/li_GN'))

WebUI.setText(findTestObject('Object Repository/insurance/input__card_no'), '8745896251')

WebUI.setText(findTestObject('Object Repository/insurance/input_Effective From_icard_effective'), '20-05-2017')

WebUI.setText(findTestObject('Object Repository/insurance/input__icard_expiry'), '10-06-2030')

WebUI.setText(findTestObject('Object Repository/insurance/input_Cert No_cert_no'), '2103210102')

WebUI.setText(findTestObject('Object Repository/insurance/select_depends'), '5')

WebUI.setText(findTestObject('Object Repository/insurance/input_Card No_ex_card_no'), '8956231241')

WebUI.setText(findTestObject('Object Repository/insurance/input_Policy No_policy_number'), '8936201021')

WebUI.setText(findTestObject('Object Repository/insurance/input_Claim No_claim_no'), '1201478501')

WebUI.click(findTestObject('Object Repository/insurance/img'))

WebUI.closeBrowser()

