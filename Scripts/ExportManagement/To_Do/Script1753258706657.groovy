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

WebUI.setText(findTestObject('Object Repository/ExportManagement/Todo/Page_Risk Monitor - Log In/input_Email_Email'), 'kashyap.padhiyar@support.xcellence-it.com')

WebUI.setEncryptedText(findTestObject('Object Repository/ExportManagement/Todo/Page_Risk Monitor - Log In/input_Password_Password'), 
    'dm7VE3JXRq+8d40sWGbSgg==')

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_Risk Monitor - Log In/button_Login'))

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_TEC Connect/span_Export Management'))*/

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_TEC Connect/span_To Do'))

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_TEC Connect/input_Has Document_k-select-checkbox k-chec_bdcdac'))

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_TEC Connect/a_Re-Submit'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_TEC Connect/input_Has Document_k-select-checkbox k-chec_bdcdac'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_TEC Connect/input_Has Document_k-select-checkbox k-chec_bdcdac_1'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_TEC Connect/input_Has Document_k-select-checkbox k-chec_bdcdac_1_2'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_TEC Connect/input_Has Document_k-select-checkbox k-chec_bdcdac_1_2_3'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_TEC Connect/button_Re-Submit Selected'))

WebUI.acceptAlert()

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_TEC Connect/input_Re-Submit Selected_k-select-checkbox _26f2a5'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_TEC Connect/button_Re-Submit Selected'))

WebUI.acceptAlert()

WebUI.scrollToPosition(350, 350)

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_TEC Connect/input_Has Document_k-select-checkbox k-chec_bdcdac_1_2_3_4'))

WebUI.delay(1)

WebUI.click(findTestObject('ExportManagement/Todo/Page_TEC Connect/a_Re-Submit_1'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_TEC Connect/input_Has Document_k-select-checkbox k-chec_bdcdac_1_2_3_4'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_TEC Connect/input_Has Document_k-select-checkbox k-chec_bdcdac_1_2_3_4_5'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_TEC Connect/input_Has Document_k-select-checkbox k-chec_bdcdac_1_2_3_4_5_6'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_TEC Connect/button_Re-Submit Selected_1'))

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_TEC Connect/input_Re-Submit Selected_k-select-checkbox _26f2a5_1'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_TEC Connect/button_Re-Submit Selected_1'))

WebUI.delay(1)

WebUI.acceptAlert()

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_TEC Connect/i_Details_fa fa-eye'))

WebUI.delay(3)

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_TEC Connect/td_View'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_TEC Connect/i_View_fa fa-eye'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_TEC Connect/svg'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_TEC Connect/button_View'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/ExportManagement/Todo/Page_TEC Connect/svg_1'))

WebUI.switchToWindowIndex(0)

