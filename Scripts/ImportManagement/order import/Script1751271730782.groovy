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

WebUI.setText(findTestObject('Object Repository/EXAMPLE/Page_Risk Monitor - Log In/input_Email_Email'), 'kashyap.padhiyar@support.xcellence-it.com')

WebUI.setEncryptedText(findTestObject('Object Repository/EXAMPLE/Page_Risk Monitor - Log In/input_Password_Password'), 'dm7VE3JXRq+8d40sWGbSgg==')

WebUI.click(findTestObject('Object Repository/EXAMPLE/Page_Risk Monitor - Log In/button_Password_mr-2 btn btn-info btn-block_f237ae'))*/
WebUI.click(findTestObject('Object Repository/EXAMPLE/Page_TEC Connect/span_account_box_title'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EXAMPLE/Page_TEC Connect/span_Import Management_title'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EXAMPLE/Page_TEC Connect/span_Select Customer_k-input-value-text'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EXAMPLE/Page_TEC Connect/input_Auto Updates_k-input-inner'), 'LPT004')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/EXAMPLE/Page_TEC Connect/input_Auto Updates_k-input-inner'), Keys.chord(
        Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EXAMPLE/Page_TEC Connect/span_Select Location_k-input-value-text'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EXAMPLE/Page_TEC Connect/input_No data found_k-input-inner'), 'ASD11')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/EXAMPLE/Page_TEC Connect/input_No data found_k-input-inner'), Keys.chord(
        Keys.ENTER))

WebUI.delay(1)

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

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/EXAMPLE/Page_TEC Connect/span_Import Management_title'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EXAMPLE/Page_TEC Connect/span_Select Customer_k-input-value-text'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EXAMPLE/Page_TEC Connect/input_Auto Updates_k-input-inner'), 'LPT004')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/EXAMPLE/Page_TEC Connect/input_Auto Updates_k-input-inner'), Keys.chord(
        Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/EXAMPLE/Page_TEC Connect/span_Select Location_k-input-value-text'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/EXAMPLE/Page_TEC Connect/input_No data found_k-input-inner'), 'ASD11')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/EXAMPLE/Page_TEC Connect/input_No data found_k-input-inner'), Keys.chord(
        Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('order import/Page_Risk Monitor/button_Process'))

WebUI.delay(5)

WebUI.acceptAlert()

WebUI.delay(5)

