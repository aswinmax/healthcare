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

WebUI.setText(findTestObject('Object Repository/searchbills/input_MEDAS HIS_user_name'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/searchbills/input_MEDAS HIS_user_password'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/searchbills/a_Log In'))

WebUI.click(findTestObject('Object Repository/searchbills/input_English_go'))

WebUI.click(findTestObject('Object Repository/searchbills/span_Cashier'))

WebUI.click(findTestObject('Object Repository/searchbills/span_OP Billing'))

WebUI.setText(findTestObject('Object Repository/searchbills/input_Action_fromdate'), '01-01-2019')

WebUI.setText(findTestObject('Object Repository/searchbills/input_Action_todate'), '28-07-2019')

WebUI.setText(findTestObject('Object Repository/searchbills/input_Action_op_number'), '')

WebUI.setText(findTestObject('Object Repository/searchbills/input_Action_patient_name'), 'auto')

WebUI.click(findTestObject('Object Repository/searchbills/span_Select an Option'))

WebUI.click(findTestObject('Object Repository/searchbills/li_Dr. Adel Ahmed Al Aswad'))

WebUI.setText(findTestObject('Object Repository/searchbills/select-insurar'), 'adnic')

WebUI.click(findTestObject('Object Repository/searchbills/a_Select'))

WebUI.click(findTestObject('Object Repository/searchbills/li_Pending'))

WebUI.click(findTestObject('Object Repository/searchbills/b'))

WebUI.click(findTestObject('Object Repository/searchbills/li_Select'))

WebUI.click(findTestObject('Object Repository/searchbills/span_Select'))

WebUI.click(findTestObject('Object Repository/searchbills/li_Pending'))

WebUI.click(findTestObject('Object Repository/searchbills/img'))

WebUI.closeBrowser()

