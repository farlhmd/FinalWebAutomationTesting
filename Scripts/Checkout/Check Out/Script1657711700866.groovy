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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kotakoki.wijaysali.my.id/')

WebUI.click(findTestObject('Object Repository/Page_Kotakoki  Welcome to my Website/span_Shop'))

WebUI.click(findTestObject('Object Repository/Page_Products  Kotakoki/img_New_attachment-woocommerce_thumbnail si_3f99c3'))

WebUI.click(findTestObject('Object Repository/Page_Album  Kotakoki/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Album  Kotakoki/div_1'))

WebUI.click(findTestObject('Object Repository/Page_Cart  Kotakoki/a_Proceed to checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/input__billing_first_name'), GlobalVariable.firstname)

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/input__billing_last_name'), GlobalVariable.lastname)

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/input_(optional)_billing_company'), 'Company')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/input__billing_address_1'), GlobalVariable.address)

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/input_(optional)_billing_address_2'), GlobalVariable.address)

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/input__billing_city'), GlobalVariable.city)

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/input__billing_postcode'), '13110')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/input__billing_phone'), GlobalVariable.phone)

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/input__billing_email'), GlobalVariable.email)

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Kotakoki/textarea_(optional)_order_comments'), 'This is Comment')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Kotakoki/button_Place order'))

WebUI.click(findTestObject('Object Repository/Page_Checkout woocommerce-xendit-504/button_Klik disini untuk simulasi pembayara_0d60dc'))

