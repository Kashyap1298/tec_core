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

WebUI.click(findTestObject('Object Repository/Edit_import_custome_Audit_log/Page_Risk Monitor - Log In/input_Email_Email'))

WebUI.setText(findTestObject('Object Repository/Edit_import_custome_Audit_log/Page_Risk Monitor - Log In/input_Email_Email'), 
    'kashyap.padhiyar@support.xcellence-it.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Edit_import_custome_Audit_log/Page_Risk Monitor - Log In/input_Password_Password'), 
    'dm7VE3JXRq+8d40sWGbSgg==')

WebUI.click(findTestObject('Object Repository/Edit_import_custome_Audit_log/Page_Risk Monitor - Log In/button_Password_mr-2 btn btn-info btn-block_f237ae'))
*/
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/span_Import Management'))
WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/span_Import Customer'))

WebUI.delay(1)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit_import_custome_Audit_log/Page_TEC Connect/a_Edit_btn btn-danger'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit_import_custome_Audit_log/Page_TEC Connect/input__btn btn-danger'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit_import_custome_Audit_log/Page_TEC Connect/a_true_btn btn-primary'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit_import_custome_Audit_log/Page_TEC Connect/div_Environment Settings_card-body'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Edit_import_custome_Audit_log/Page_TEC Connect/input__DefaultLocation'), 
    '20005')

WebUI.click(findTestObject('Object Repository/Edit_import_custome_Audit_log/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit_import_custome_Audit_log/Page_TEC Connect/span_YES_k-switch-thumb k-rounded-full'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('Object Repository/Edit_import_custome_Audit_log/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_1'))

WebUI.scrollToElement(findTestObject('Edit_import_custome_Audit_log/Page_TEC Connect/span_No Used Parts_k-switch-track k-rounded-full'), 
    3)

WebUI.scrollToPosition(0, 700)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit_import_custome_Audit_log/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_2'))

WebUI.click(findTestObject('Object Repository/Edit_import_custome_Audit_log/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_3'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit_import_custome_Audit_log/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_4'))

WebUI.click(findTestObject('Object Repository/Edit_import_custome_Audit_log/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_5'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit_import_custome_Audit_log/Page_TEC Connect/input_NO_continue'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit_import_custome_Audit_log/Page_TEC Connect/button_Delete_btnaudit'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit_import_custome_Audit_log/Page_TEC Connect/span_Click Here for Audit Log_k-button-text'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit_import_custome_Audit_log/Page_TEC Connect/svg'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit_import_custome_Audit_log/Page_TEC Connect/td'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Edit_import_custome_Audit_log/Page_TEC Connect/td_1'))

WebUI.scrollToElement(findTestObject('Edit_import_custome_Audit_log/Page_TEC Connect/td_UpdatedBy_wd-break'), 0)

WebUI.delay(1)

