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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

if (header == 'Regency' || header == 'Province' || header == 'Country' || header == 'Bank' || header == 'Email Template' || header == 'Gerai' || header == 'Escrow Account' || header == 'Payment Trail') {
	WebUI.click(findTestObject('Object Repository/Web/Homepage/Dropdown - Entities'))
	if (header == 'Regency') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Entities Regency'))
	} else if (header == 'Province') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Entities Province'))
	} else if (header == 'Country') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Entities Country'))
	} else if (header == 'Bank') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Entities Bank'))
	} else if (header == 'Email Template') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Entities Email Template'))
	} else if (header == 'Gerai') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Entities Gerai'))
	} else if (header == 'Escrow Account') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Entities Escrow Account'))
	} else if (header == 'Payment Trail') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Entities Payment Trail'))
	}
	
} else if (header == 'Gateway' || header == 'Users app' || header == 'Users backoffice' || header == 'Metrics' || header == 'Health' || header == 'Configuration' || header == 'Audits' || header == 'Logs' || header == 'API') {
	WebUI.click(findTestObject('Object Repository/Web/Homepage/Dropdown - Administration'))
	if (header == 'Gateway') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Administration Gateway'))
	} else if (header == 'Users app') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Administration Users App'))
	} else if (header == 'Users backoffice') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Administration User Backoffice'))
	} else if (header == 'Metrics') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Administration Metrics'))
	}   else if (header == 'Health') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Administration Health'))
	}   else if (header == 'Configuration') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Administration Configuration'))
	}   else if (header == 'Audits') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Administration Audits'))
	}   else if (header == 'Logs') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Administration Logs'))
	}   else if (header == 'API') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Administration API'))
	}
} else if (header == 'Inggris' || header == 'Bahasa Indonesia') {
	WebUI.click(findTestObject('Object Repository/Web/Homepage/Dropdown - Language'))
	if (header == 'Inggris') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Language Inggris'))
	} else if (header == 'Bahasa Indonesia') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Language Bahasa Indonesia'))
	}
} else if (header == 'Settings' || header == 'Password' || header == 'Sign Out') {
	WebUI.click(findTestObject('Object Repository/Web/Homepage/Dropdown - Account'))
	if (header == 'Settings') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Account Settings'))
	} else if (header == 'Password') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Account Password'))
	} else if (header == 'Sign Out') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Account Sign Out'))
	}
}

