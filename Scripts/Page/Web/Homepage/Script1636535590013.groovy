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
} else if (header == 'Applicants' || header == 'Rejected Applicants' || header == 'On Validation Applicants' || header == 'Investors' || header == 'Suspended Investors' || header == 'Investor Update') {
	WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Clients'))
	if (header == 'Applicants') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Clients Applicants'))
	} else if (header == 'Rejected Applicants') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Clients Rejected Applicants'))
	} else if (header == 'On Validation Applicants') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Clients On Validation Applicants'))
	} else if (header == 'Investors') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Clients Investors'))
	} else if (header == 'Suspended Investors') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Clients Suspended Investors'))
	} else if (header == 'Investor Update') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Clients Investor Update'))
	}
} else if (header == 'Orders' || header == 'Rejected Orders' || header == 'Outstanding Orders' || header == 'Batch Orders' || header == 'Disbursement' || header == 'Redemp Reconciliation' || header == 'List of Portfolios' || header == 'NAB Correction') {
	WebUI.focus(findTestObject('Object Repository/Web/Homepage/Button - Order'))
	if (header == 'Orders') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Order Orders'))
	} else if (header == 'Rejected Orders') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Order Rejected Orders'))
	} else if (header == 'Outstanding Orders') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Order Outstanding Orders'))
	} else if (header == 'Batch Orders') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Order Batch Orders'))
	} else if (header == 'Disbursement') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Order Disbursement'))
	} else if (header == 'Redemp Reconciliation') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Order Redemp Reconciliation'))
	} else if (header == 'List of Portfolios') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Order List of Portfolios'))
	} else if (header == 'NAB Correction') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Order NAB Correction'))
	}
} else if (header == 'Transactions') {
	WebUI.focus(findTestObject('Object Repository/Web/Homepage/Button - Transaction'))
	if (header == 'Transactions') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Transaction Transactions'))
	}
} else if (header == 'Investment Managers' || header == 'Mutual Funds' || header == 'Mutual Funds Protected' || header == 'Custodian Banks' || header == 'Mutual Fund Update' || header == 'Custodian Bank Update' || header == 'NAV - Return' || header == 'Update Data Mutual Fund') {
	WebUI.focus(findTestObject('Object Repository/Web/Homepage/Button - Products'))
	if (header == 'Investment Managers') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Product Investment Managers'))
	} else if (header == 'Mutual Funds') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Mutual Funds'))
	} else if (header == 'Mutual Funds Protected') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Mutual Funds Protected'))
	} else if (header == 'Custodian Banks') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Custodian Banks'))
	} else if (header == 'Mutual Fund Update') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Mutual Fund Update'))
	} else if (header == 'Custodian Bank Update') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Custodian Bank Update'))
	} else if (header == 'NAV - Return') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Product NAV - Return'))
	} else if (header == 'Update Data Mutual Fund') {
		WebUI.click(findTestObject('Object Repository/Web/Homepage/Button - Product Update Data Mutual Fund'))
	}
}




