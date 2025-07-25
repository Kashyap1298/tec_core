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
import com.kms.katalon.core.testobject.ObjectRepository as OR

/*WebUI.openBrowser('')

WebUI.navigateToUrl('https://localhost:4432/Identity/Account/Login?ReturnUrl=%2F')

WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_Risk Monitor - Log In/input_Email_Email'))

WebUI.setText(findTestObject('Object Repository/testimportcustomer/Page_Risk Monitor - Log In/input_Email_Email'), 'kashyap.padhiyar@support.xcellence-it.com')

WebUI.setEncryptedText(findTestObject('Object Repository/testimportcustomer/Page_Risk Monitor - Log In/input_Password_Password'), 
    'dm7VE3JXRq+8d40sWGbSgg==')

WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_Risk Monitor - Log In/button_Login'))*/
//WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/span_Import Management'))
WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/span_Import Customer'))

WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/a_Create New'))

WebUI.setText(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/input__Prophet21ID'), '1031')

WebUI.setText(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/input__CustNmbr'), '117')

WebUI.selectOptionByValue(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/select_-- Select Import Type --CSV'), 
    'CSV', true)

WebUI.setText(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/input__DefaultLocation'), '116')

WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full'))

WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_1'))

WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_1_2'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('ImportCustomer/Page_Risk Monitor/span_NO_k-switch-thumb k-rounded-full_1_2_3'), 3)

WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_1_2_3'))

WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_1_2_3_4'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('ImportCustomer/Page_Risk Monitor/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5'), 
    2)

WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6_7_8'))

WebUI.click(findTestObject('ImportCustomer/Page_Risk Monitor/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6_7_8_9'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('ImportCustomer/Page_Risk Monitor/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6_7_8_9_10'), 
    2)

WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6_7_8_9_10'))

WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6_7_8_9_10_11'))

WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6_7_8_9_10_11_12'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('ImportCustomer/Page_Risk Monitor/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6_7_8_9_10_11_12_13'), 
    3)

WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6_7_8_9_10_11_12_13'))

WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6_7_8_9_10_11_12_13_14'))

WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/input_YES_continue'))

WebUI.scrollToElement(findTestObject('ImportCustomer/Page_Risk Monitor/header_Customer Locations'), 3)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/button_Add Location'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/input_Customer Location_CustomerLocation'), 
    'customer location')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/input_TEC Location_TECLocation'), 'customer tec location')

WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/button_Add Watch Location'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/input_Watch Location_WatchLocation'), 
    'watchlocation')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/input_Notify Who_k-input-inner k-readonly'), 
    'test@gmail.com')

WebUI.delay(1)

WebUI.sendKeys(OR.findTestObject('Object Repository/ImportCustomer/Page_Risk Monitor/input_Notify Who_k-input-inner'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('ImportCustomer/Page_Risk Monitor/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('ImportCustomer/Page_Risk Monitor/button_Add Move Location'))

WebUI.delay(1)

WebUI.setText(findTestObject('ImportCustomer/Page_Risk Monitor/input_Move Location_MoveLocation'), 'location')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/testimportcustomer/Page_TEC Connect/button_Save'))

WebUI.delay(1)

