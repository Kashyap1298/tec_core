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

WebUI.navigateToUrl('https://localhost:4432/Identity/Account/Login?ReturnUrl=%2FIdentity%2FAccount%2FLogOff')

WebUI.setText(findTestObject('Object Repository/order import/Page_Risk Monitor - Log In/input_Email_Email'), 'kashyap.padhiyar@support.xcellence-it.com')

WebUI.setEncryptedText(findTestObject('Object Repository/order import/Page_Risk Monitor - Log In/input_Password_Password'), 
    'dm7VE3JXRq+8d40sWGbSgg==')

WebUI.click(findTestObject('Object Repository/order import/Page_Risk Monitor - Log In/button_Login'))*/
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/order import/Page_Risk Monitor/span_Import Management'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/order import/Page_Risk Monitor/span_Order Import'))

WebUI.delay(2)

WebUI.click(findTestObject('order import/Page_Risk Monitor/span_Select Customer'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/order import/Page_Risk Monitor/li_SPA01'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/order import/Page_Risk Monitor/span_Select Location'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/order import/Page_Risk Monitor/span_203'))

WebUI.delay(2)

/*WebUI.click(findTestObject('Object Repository/order import/Page_Risk Monitor/input_file'))

WebUI.click(findTestObject('Object Repository/order import/Page_Risk Monitor/div_Select files.Drop files here to upload'))

WebUI.click(findTestObject('Object Repository/order import/Page_Risk Monitor/button_Upload'))*/
// Locate the actual <input type="file"> element
// Replace this object path with the actual file input TestObject
TestObject fileInput = findTestObject('Object Repository/order import/Page_Risk Monitor/input_file')

// Provide the full path to the file you want to upload
String filePath = 'C:\\Users\\kashyap.padhiyar\\Desktop\\sumit_test.csv'

// Upload the file
WebUI.uploadFile(fileInput, filePath)

// Then click the Upload button (if needed)
WebUI.click(findTestObject('order import/Page_Risk Monitor/button_Upload'))

WebUI.delay(5)

WebUI.click(findTestObject('order import/Page_Risk Monitor/button_View'))

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('order import/Page_Risk Monitor/Typed_Order_Lines'), 5)

WebUI.delay(5)

WebUI.back()

WebUI.delay(2)

WebUI.refresh()

WebUI.click(findTestObject('order import/Page_Risk Monitor/span_Select Customer'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/order import/Page_Risk Monitor/li_SPA01'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/order import/Page_Risk Monitor/span_Select Location'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/order import/Page_Risk Monitor/span_203'))

WebUI.delay(2)

WebUI.click(findTestObject('order import/Page_Risk Monitor/button_Process'))

WebUI.delay(5)

WebUI.acceptAlert()

WebUI.delay(5)

