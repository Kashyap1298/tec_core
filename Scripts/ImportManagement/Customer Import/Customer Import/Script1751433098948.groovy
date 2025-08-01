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
import org.openqa.selenium.Keys
import com.kms.katalon.core.testobject.ObjectRepository as OR

/*WebUI.openBrowser('')

WebUI.navigateToUrl('https://localhost:4432/Identity/Account/Login?ReturnUrl=%2F')

WebUI.setText(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor - Log In/input_Email_Email'), 'kashyap.padhiyar@support.xcellence-it.com')

WebUI.setEncryptedText(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor - Log In/input_Password_Password'), 
    'dm7VE3JXRq+8d40sWGbSgg==')

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor - Log In/button_Login'))*/
WebUI.delay(10)
//WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/span_Import Management'))

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/span_Import Customer'))

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/a_Create New'))

//WebUI.setText(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/input_Prophet21ID_Prophet21ID'), '57')
// Define the TestObject for the input field
TestObject prophet21IdInput = findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/input_Prophet21ID_Prophet21ID')

// Get the current value of the input field
String currentValue = WebUI.getAttribute(prophet21IdInput, 'value')

// Default ID if nothing is found
int newId = 111

// Check if value is not empty and is a valid integer
if (currentValue && currentValue.isInteger()) {
    newId = (currentValue.toInteger() + 1)
}

// Set the incremented value
WebUI.setText(prophet21IdInput, newId.toString())

WebUI.setText(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/input_Customer Number_CustNmbr'), '101')

WebUI.selectOptionByValue(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/select_-- Select Import Type --CSV'), 
    'CSV', true)

WebUI.setText(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/input_Default Location_DefaultLocation'), 
    'testlocation')

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/input_Default Location_DefaultLocation'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/span_NO_k-switch-thumb k-rounded-full'))

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/span_NO_k-switch-thumb k-rounded-full_1'))

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/span_NO_k-switch-thumb k-rounded-full_1_2'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('ImportCustomer/Page_Risk Monitor/ScrollAutoLineNumber_label'), 5)

WebUI.click(findTestObject('ImportCustomer/Page_Risk Monitor/span_NO_k-switch-thumb k-rounded-full_1_2_3'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/span_NO_k-switch-thumb k-rounded-full_1_2_3_4'))

WebUI.delay(2)

WebUI.delay(2)

WebUI.click(findTestObject('ImportCustomer/Page_Risk Monitor/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6'))

WebUI.delay(2)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6_7'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6_7_8'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6_7_8_9'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6_7_8_9_10'), 
    5)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6_7_8_9_10'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6_7_8_9_10_11'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6_7_8_9_10_11_12'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6_7_8_9_10_11_12_13'), 
    5)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6_7_8_9_10_11_12_13'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6_7_8_9_10_11_12_13_14'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/input_YES_continue'))

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('ImportCustomer/Page_Risk Monitor/button_Add Location'), 10)

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/button_Add Location'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/input_Customer Location_CustomerLocation'), 
    'TestCustomerLocation')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/input_TEC Location_TECLocation'), 'TestCustomerLocation')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/button_Save'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('ImportCustomer/Page_Risk Monitor/button_Add Watch Location'), 5)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/button_Add Watch Location'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/div_Watch Location'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/input_Watch Location_WatchLocation'), 'TestWatchLocation')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/input_Notify Who_k-input-inner'), 'test@gmail.com')

WebUI.sendKeys(
	OR.findTestObject("Object Repository/ImportCustomer/Page_Risk Monitor/input_Notify Who_k-input-inner"),
	Keys.chord(Keys.ENTER)
)




//WebUI.sendKeys(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/input_Notify Who_k-input-inner'), Keys.ENTER)

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/button_Save'))

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/button_Add Move Location'))

WebUI.setText(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/input_Move Location_MoveLocation'), 'testmovelocation')

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/input_Move Location_MoveLocation'))

WebUI.click(findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/button_Save'))

