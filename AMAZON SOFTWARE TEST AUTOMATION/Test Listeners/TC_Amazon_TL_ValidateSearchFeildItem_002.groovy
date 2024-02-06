import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class TC_Amazon_TL_ValidateSearchFeildItem_002 {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
	def sampleBeforeTestCase() {
		
		WebUI.setText(findTestObject('TL_Amazon_TestCaseValidation_OR/Amazon_TL_ValidateSearchFeildItem_OR/input_Email or mobile phone number_email'),
			'sagarkumarmolli@gmail.com')
		
		WebUI.click(findTestObject('TL_Amazon_TestCaseValidation_OR/Amazon_TL_ValidateSearchFeildItem_OR/input_Enter your email or mobile phone number_continue'))
		
		WebUI.setText(findTestObject('TL_Amazon_TestCaseValidation_OR/Amazon_TL_ValidateSearchFeildItem_OR/input_Forgot your password_password'),
			'Sagar123@')
		
		WebUI.click(findTestObject('TL_Amazon_TestCaseValidation_OR/Amazon_TL_ValidateSearchFeildItem_OR/input_Enter your password_signInSubmit'))
		
	//	println testCaseContext.getTestCaseId()
	//	println testCaseContext.getTestCaseVariables()		
	}

	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	def sampleAfterTestCase() {
		
		WebUI.mouseOver(findTestObject('TL_Amazon_TestCaseValidation_OR/Amazon_TL_ValidateSearchFeildItem_OR/span_Account  Lists'))
		
		WebUI.click(findTestObject('TL_Amazon_TestCaseValidation_OR/Amazon_TL_ValidateSearchFeildItem_OR/span_Sign Out'))
		
		
	//	println testCaseContext.getTestCaseId()
	//	println testCaseContext.getTestCaseStatus()		
	}

	/**
	 * Executes before every test suite starts.
	 * @param testSuiteContext: related information of the executed test suite.
	 	
	@BeforeTestSuite
	def sampleBeforeTestSuite(TestSuiteContext testSuiteContext) {
		println testSuiteContext.getTestSuiteId()
	}   
	
	/**
	 * Executes after every test suite ends.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	 /*
	@AfterTestSuite
	def sampleAfterTestSuite(TestSuiteContext testSuiteContext) {
		println testSuiteContext.getTestSuiteId()
	}   */
}