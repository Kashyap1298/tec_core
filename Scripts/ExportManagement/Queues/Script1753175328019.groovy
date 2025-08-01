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

WebUI.setText(findTestObject('Object Repository/ExportManagement/Page_Risk Monitor - Log In/input_Email_Email'), 'kashyap.padhiyar@support.xcellence-it.com')

WebUI.setEncryptedText(findTestObject('Object Repository/ExportManagement/Page_Risk Monitor - Log In/input_Password_Password'), 
    'dm7VE3JXRq+8d40sWGbSgg==')

WebUI.click(findTestObject('Object Repository/ExportManagement/Page_Risk Monitor - Log In/button_Login'))

WebUI.click(findTestObject('Object Repository/ExportManagement/Page_TEC Connect/span_Export Management'))*/

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/ExportManagement/Page_TEC Connect/span_Queues'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Page_TEC Connect/input_Has Document_k-select-checkbox k-chec_bdcdac'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Page_TEC Connect/a_Re-Submit'))

WebUI.click(findTestObject('Object Repository/ExportManagement/Page_TEC Connect/a_Apply_fa fa-repeat btn-color box-refresh'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Page_TEC Connect/input_Has Document_k-select-checkbox k-chec_bdcdac'))

WebUI.scrollToElement(findTestObject('Object Repository/ExportManagement/Page_TEC Connect/input_Has Document_k-select-checkbox k-chec_bdcdac_1'), 
    0)

WebUI.click(findTestObject('Object Repository/ExportManagement/Page_TEC Connect/input_Has Document_k-select-checkbox k-chec_bdcdac_1'))

WebUI.click(findTestObject('Object Repository/ExportManagement/Page_TEC Connect/input_Has Document_k-select-checkbox k-chec_bdcdac_1_2'))

WebUI.click(findTestObject('Object Repository/ExportManagement/Page_TEC Connect/input_Has Document_k-select-checkbox k-chec_bdcdac_1_2_3'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ExportManagement/Page_TEC Connect/button_Re-Submit Selected'))

WebUI.acceptAlert()

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Page_TEC Connect/input_Re-Submit Selected_k-select-checkbox _26f2a5'))

WebUI.click(findTestObject('Object Repository/ExportManagement/Page_TEC Connect/button_Re-Submit Selected'))

WebUI.delay(1)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/ExportManagement/Page_TEC Connect/button_Or_k-button k-button-md k-rounded-md_b8e9d9'))

WebUI.delay(1)

WebUI.click(findTestObject('ExportManagement/Page_TEC Connect/firstdropdown'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Page_TEC Connect/span_Delayed'))

WebUI.delay(1)

WebUI.click(findTestObject('ExportManagement/Page_TEC Connect/seconddropdown'))

WebUI.delay(1)

WebUI.click(findTestObject('ExportManagement/Page_TEC Connect/span_Is equal to'))

WebUI.delay(1)

WebUI.click(findTestObject('ExportManagement/Page_TEC Connect/checkbox'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Page_TEC Connect/button_Apply'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 350)

//WebUI.scrollToElement(findTestObject('ExportManagement/Page_TEC Connect/scroll_to_delayed'), 2)
WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

//WebUI.scrollToElement(findTestObject('ExportManagement/Page_TEC Connect/button_Apply'), 1)
WebUI.delay(1)

WebUI.click(findTestObject('ExportManagement/Page_TEC Connect/Close'))

WebUI.delay(2)

WebUI.click(findTestObject('ExportManagement/Page_TEC Connect/button_Or_k-button k-button-md k-rounded-md_b8e9d9'))

WebUI.click(findTestObject('ExportManagement/Page_TEC Connect/firstdropdown'))

WebUI.delay(1)

WebUI.click(findTestObject('ExportManagement/Page_TEC Connect/span_Delayed'))

WebUI.delay(1)

WebUI.click(findTestObject('ExportManagement/Page_TEC Connect/seconddropdown'))

WebUI.delay(1)

WebUI.click(findTestObject('ExportManagement/Page_TEC Connect/span_Is equal to_1'))

WebUI.delay(1)

WebUI.click(findTestObject('ExportManagement/Page_TEC Connect/checkbox'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Page_TEC Connect/button_Apply'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 350)

//WebUI.scrollToElement(findTestObject('ExportManagement/Page_TEC Connect/scroll_to_delayed'), 2)
WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

//WebUI.scrollToElement(findTestObject('ExportManagement/Page_TEC Connect/button_Apply'), 2)
WebUI.delay(1)

WebUI.click(findTestObject('ExportManagement/Page_TEC Connect/Close'))

WebUI.delay(2)

WebUI.click(findTestObject('ExportManagement/Page_TEC Connect/button_Apply'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Page_TEC Connect/button_Or_k-button k-button-md k-rounded-md_b8e9d9'))

WebUI.delay(5)

WebUI.click(findTestObject('ExportManagement/Page_TEC Connect/firstdropdown'))

WebUI.delay(1)

WebUI.click(findTestObject('ExportManagement/Page_TEC Connect/span_Document Type'))

WebUI.delay(1)

WebUI.click(findTestObject('ExportManagement/Page_TEC Connect/seconddropdown'))

WebUI.delay(1)

WebUI.click(findTestObject('ExportManagement/Page_TEC Connect/span_Is equal to'))

WebUI.delay(1)

WebUI.executeJavaScript('\n    var numericWidget = document.querySelector("[data-role=\'numerictextbox\']");\n    if (numericWidget) {\n        var kendoWidget = $(numericWidget).data("kendoNumericTextBox");\n        if (kendoWidget) {\n            kendoWidget.value(15);\n            kendoWidget.trigger("change");\n        }\n    }\n', 
    null)

//WebUI.setText(findTestObject('ExportManagement/Page_TEC Connect/InputTextBox'), '15')
WebUI.delay(1)

WebUI.click(findTestObject('ExportManagement/Page_TEC Connect/button_Apply'))

WebUI.scrollToPosition(0, 350)

//WebUI.scrollToElement(findTestObject('ExportManagement/Page_TEC Connect/scroll_to_delayed'), 2)
WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

//WebUI.scrollToElement(findTestObject('ExportManagement/Page_TEC Connect/button_Apply'), 2)
WebUI.delay(5)

