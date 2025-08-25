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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.common.WebUiCommonHelper as Helper
import java.util.Arrays as Arrays

/*WebUI.openBrowser('')

WebUI.navigateToUrl('https://localhost:4432/Identity/Account/Login?ReturnUrl=%2F')

WebUI.setText(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_Risk Monitor - Log In/input_Email_Email'), 
    'kashyap.padhiyar@support.xcellence-it.com')

WebUI.setEncryptedText(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_Risk Monitor - Log In/input_Password_Password'), 
    'dm7VE3JXRq+8d40sWGbSgg==')

WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_Risk Monitor - Log In/button_Login'))*/
WebUI.click(findTestObject('ExportManagement/Export_Customer/Page_TEC Connect/span_Export Management'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/span_Export Customer'))

WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/a_Create New'))

WebUI.setText(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/input__Prophet21ID'), 
    '36987')

WebUI.setText(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/input__CustNmbr'), '654321')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/input__k-input-inner k-readonly'))

WebUI.delay(3)

//WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/span_CSV_1'))
// 2. Execute JavaScript to select all <option> values in the hidden <select>
String jsKendo = '\n  var dropdown = $(\'#ExportTypesList\').data(\'kendoMultiSelect\');\n  if (dropdown) {\n    dropdown.value([\'1\',\'2\',\'3\',\'4\']);  // Select all values by ID\n    dropdown.trigger(\'change\');\n  }\n'

WebUI.executeJavaScript(jsKendo, null)

/*
WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/span_CSV'))

WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/input__k-input-inner k-readonly'))

WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/span_PDF'))

WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/input__k-input-inner k-readonly'))

WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/span_Excel'))

WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/input__k-input-inner k-readonly'))

WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/li_XML'))*/
WebUI.delay(1)

// Fill the delay fields
WebUI.setText(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/input_Uses Delay_UsesDelay'), 
    '5')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/input_Delay Amount_DelayAmount'), 
    '10')

// Step 1: Click the dropdown to expand it
WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/Dropdown_delay_export'))

// Step 2: Wait for option "DAFFRON" to be visible
TestObject daffronOption = new TestObject('dynamicOption')

daffronOption.addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, '//ul[contains(@id,\'DelayedExportType_listbox\')]//li[normalize-space()=\'DAFFRON\']')

WebUI.waitForElementVisible(daffronOption, 10)

// Step 3: Click the DAFFRON option using JavaScript (bypasses Kendo UI overlay issues)
WebElement element = Helper.findWebElement(daffronOption, 10)

WebUI.executeJavaScript('arguments[0].click();', Arrays.asList(element))

/*WebUI.setText(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/input_Uses Delay_UsesDelay'), '5') 14-08-25

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/input_Delay Amount_DelayAmount'), 
    '10')

// Click the dropdown
WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/Dropdown_delay_export'))

WebUI.delay(1)

// Wait for options to appear
//WebUI.waitForElementVisible(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/Dropdown_delay_export_option_SEDC'), 5)
// Select SEDC option
WebUI.click(findTestObject('ExportManagement/Export_Customer/Page_TEC Connect/Dropdown_delay_export_option_SEDC')) 14-08-25*/
/*WebUI.click(findTestObject('ExportManagement/Export_Customer/Page_TEC Connect/Dropdown_delay_export'))

WebUI.click(findTestObject('ExportManagement/Export_Customer/Page_TEC Connect/Page_TEC Connect/li_NISC_WS_PO_k-list-item k-hover'), 
    FailureHandling.STOP_ON_FAILURE)*/
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_1'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/input__NotificationEmails'), 
    'test@gmail.com')

WebUI.scrollToPosition(400, 370)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/input_External Username_ExternalUserName'), 
    'test@123')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/input_External Password_ExternalPassword'), 
    'D7Y+m3IaFBbsNDk26VHqfg==')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/input_External Endpoint_ExternalEndPoint'), 
    'test')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/input_SEDC DB Name_SEDCDatabaseName'), 
    'testdb')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/input_TEC Error Emails_TECErrorEmails'), 
    'testerror@gmail.com')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/input_TEC Process Emails_TECProcessEmails'), 
    'testprocess@gmail.com')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_1_2'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_1_2_3'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_1_2_3_4'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6_7'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/input_QR Code String_QRCodeString'), 
    'test1232456')

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('ExportManagement/Export_Customer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6_7_8'), 
    1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6_7_8'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/input_PO RegEx_PORegularExpression'), 
    'testregex')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/span_NO_k-switch-thumb k-rounded-full_1_2_3_4_5_6_7_8_9'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/input_NISC ENT ID_NISC_ENT_ID'), 
    'testentid123')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/input_NISC COMP ID_NISC_COMP_ID'), 
    '127')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/input_NISC Barcode User_NISC_BARCODE_USER'), 
    '1234')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/input_PO Export Customer ID_POExportCustomerID'), 
    '127')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/textarea_Export Specific Notification_Expor_c4e8e8'), 
    'testexportcustomer')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/ExportManagement/Export_Customer/Page_TEC Connect/input_Export Specific Notification_btn btn-primary'))

