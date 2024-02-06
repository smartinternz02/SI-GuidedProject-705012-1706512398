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

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.click(findTestObject('Object Repository/AmazonPages/Amazon_PaymentOptions_OR/span_Account  Lists'))

WebUI.setText(findTestObject('Object Repository/AmazonPages/Amazon_PaymentOptions_OR/input_email'), 'sagarkumarmolli@gmail.com')

WebUI.click(findTestObject('Object Repository/AmazonPages/Amazon_PaymentOptions_OR/inputcontinue'))

WebUI.setEncryptedText(findTestObject('Object Repository/AmazonPages/Amazon_PaymentOptions_OR/input_password'), 'UzqFrP2yZheNfSdwKeJwgA==')

WebUI.click(findTestObject('Object Repository/AmazonPages/Amazon_PaymentOptions_OR/inputsignInSubmit'))

WebUI.click(findTestObject('Object Repository/AmazonPages/Amazon_PaymentOptions_OR/i_hm-icon nav-sprite'))

WebUI.click(findTestObject('Object Repository/AmazonPages/Amazon_PaymentOptions_OR/a_Your Account'))

WebUI.click(findTestObject('Object Repository/AmazonPages/Amazon_PaymentOptions_OR/span_View all transactions, manage payment _3fb06e'))

WebUI.closeBrowser()

