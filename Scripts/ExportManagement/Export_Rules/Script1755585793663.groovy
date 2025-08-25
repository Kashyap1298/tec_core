import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

/*WebUI.openBrowser('')

WebUI.navigateToUrl('https://localhost:4432/Identity/Account/Login?ReturnUrl=%2F')

WebUI.setText(findTestObject('Object Repository/ExportManagement/RulesExport/Page_Risk Monitor - Log In/input_Email_Email'), 
    'kashyap.padhiyar@support.xcellence-it.com')

WebUI.setEncryptedText(findTestObject('Object Repository/ExportManagement/RulesExport/Page_Risk Monitor - Log In/input_Password_Password'), 
    'dm7VE3JXRq+8d40sWGbSgg==')

WebUI.click(findTestObject('Object Repository/ExportManagement/RulesExport/Page_Risk Monitor - Log In/button_Password_mr-2 btn btn-info btn-block_f237ae'))*/
WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/span_account_box_title_1'))

WebUI.click(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/span_Export Management_title'))

WebUI.click(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/td_Edit_k-table-td'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/a_Environment Settings_create-rule-btn'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/select__EvaluationTypeId'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/select__EvaluationTypeId'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/select__EvaluationTypeId'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/span__k-input-value-text'))

WebUI.click(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/span_Select export type_k-list-item-text'))

WebUI.setText(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/input__PropertyName'), 'test')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/textarea__ExportRule'), 'test')

WebUI.setText(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/input__ResultWhenTrue'), 'test')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/input_Result When False_ResultWhenFalse'), 
    'test')

WebUI.click(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/span_Off_k-switch-thumb k-rounded-full'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/span_Off_k-switch-thumb k-rounded-full_1'))

WebUI.click(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/div_Evaluate False Result_col-md-6 form-group'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/input_Rule Order_RuleOrder'), 
    '2')

WebUI.click(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/button_Rule Order_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/td_Export Type_k-table-td'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/select__EvaluationTypeId'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/span__k-input-value-text_1'))

WebUI.delay(2)

WebUI.click(findTestObject('ExportManagement/RulesExport/Page_TEC Connect/span_JUST_DELAYED_k-list-item-text'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/input__PropertyName'))

WebUI.setText(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/textarea__ExportRule_1'), 
    'test')

WebUI.setText(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/input__ResultWhenTrue'), '4237')

WebUI.click(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/input__ResultWhenTrue'))

WebUI.setText(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/input_Result When False_ResultWhenFalse'), 
    '10')

WebUI.click(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/span_Off_k-switch-thumb k-rounded-full'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/input_Rule Order_RuleOrder'), 
    '10')

WebUI.click(findTestObject('Object Repository/ExportManagement/RulesExport/Page_TEC Connect/button_Rule Order_btn btn-primary'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 950)

