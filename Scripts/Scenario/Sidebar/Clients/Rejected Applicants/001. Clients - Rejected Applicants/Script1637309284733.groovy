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

String scenario = '001. Rejected Applicants'

int excelRow = 1

TestData dataTemplate = findTestData('Scenario/ScenarioRejectedApplicants')

String url = dataTemplate.getValue('url', excelRow)

String username = dataTemplate.getValue('username', excelRow)

String password = dataTemplate.getValue('password', excelRow)

String rememberMe = dataTemplate.getValue('rememberMe', excelRow)

String action = dataTemplate.getValue('action', excelRow)

String header = dataTemplate.getValue('header', excelRow)

WebUI.callTestCase(findTestCase('Page/Web/Log In'), [
	('scenario') : scenario,
	('url') : url,
	('username') : username,
	('password') : password,
	('rememberMe') : rememberMe,
	('action') : action])

WebUI.callTestCase(findTestCase('Page/Web/Homepage'), [
	('header') : header])

WebUI.callTestCase(findTestCase('Page/Web/Clients - Rejected Applicants'), [:])