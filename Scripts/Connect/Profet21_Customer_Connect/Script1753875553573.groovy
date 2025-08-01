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

WebUI.setText(findTestObject('Object Repository/Connect/Prophet21Customers/Page_Risk Monitor - Log In/input_Email_Email'), 
    'kashyap.padhiyar@support.xcellence-it.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Connect/Prophet21Customers/Page_Risk Monitor - Log In/input_Password_Password'), 
    'dm7VE3JXRq+8d40sWGbSgg==')

WebUI.click(findTestObject('Object Repository/Connect/Prophet21Customers/Page_Risk Monitor - Log In/button_Login'))*/
WebUI.click(findTestObject('Object Repository/Connect/Prophet21Customers/Page_TEC Connect/span_Connect'))

WebUI.click(findTestObject('Object Repository/Connect/Prophet21Customers/Page_TEC Connect/span_Prophet21 Customer'))

WebUI.click(findTestObject('Object Repository/Connect/Prophet21Customers/Page_TEC Connect/button_Edit'))

WebUI.setText(findTestObject('Object Repository/Connect/Prophet21Customers/Page_TEC Connect/input__TECID'), 'Connect1')

WebUI.setText(findTestObject('Object Repository/Connect/Prophet21Customers/Page_TEC Connect/input__CustomerName'), 'ChetanBhai')

WebUI.click(findTestObject('Object Repository/Connect/Prophet21Customers/Page_TEC Connect/span_YES_k-switch-thumb k-rounded-full'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Connect/Prophet21Customers/Page_TEC Connect/span_YES_k-switch-thumb k-rounded-full'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Connect/Prophet21Customers/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full'))

//WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/Connect/Prophet21Customers/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full'))
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Connect/Prophet21Customers/Page_TEC Connect/span_YES_k-switch-thumb k-rounded-full_1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Connect/Prophet21Customers/Page_TEC Connect/span_NO'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Connect/Prophet21Customers/Page_TEC Connect/span_YES_k-switch-thumb k-rounded-full_1_2'))

//WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/Connect/Prophet21Customers/Page_TEC Connect/span_YESNO'))
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Connect/Prophet21Customers/Page_TEC Connect/input_YES_btn btn-primary'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Connect/Prophet21Customers/Page_TEC Connect/button_Create'))

WebUI.setText(findTestObject('Object Repository/Connect/Prophet21Customers/Page_TEC Connect/input__TECID'), 'tec002345')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Connect/Prophet21Customers/Page_TEC Connect/input__CustomerName'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Connect/Prophet21Customers/Page_TEC Connect/div_Prophet21ID                            _1b3965'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Connect/Prophet21Customers/Page_TEC Connect/input__CustomerName'), 'paid service')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Connect/Prophet21Customers/Page_TEC Connect/span_YES_k-switch-thumb k-rounded-full'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Connect/Prophet21Customers/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Connect/Prophet21Customers/Page_TEC Connect/span_YES_k-switch-thumb k-rounded-full_1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Connect/Prophet21Customers/Page_TEC Connect/span_YES_k-switch-thumb k-rounded-full_1_2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Connect/Prophet21Customers/Page_TEC Connect/input_YES_btn btn-primary_1'))

