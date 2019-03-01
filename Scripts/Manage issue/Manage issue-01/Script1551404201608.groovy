import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.logging.KeywordLogger

WebUI.openBrowser('')

WebUI.navigateToUrl('http://helpdesk.wisky.vn/')

WebUI.setText(findTestObject('Manage issue/Manage issue-01/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.waitForAlert(2)

WebUI.setEncryptedText(findTestObject('Manage issue/Manage issue-01/Page_ODTS System/input_ODTS_password'), 'aeHFOx8jV/A=')

WebUI.waitForAlert(2)

WebUI.click(findTestObject('Manage issue/Manage issue-01/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('Manage issue/Manage issue-01/Page_ODTS System/createissues'))

String totalBranch0 = WebUI.getText(findTestObject('Manage issue/Manage issue-01/Page_ODTS System/totalBranchInCreateIssue'))

KeywordLogger log = new KeywordLogger()

log.logInfo(totalBranch0)

/*int one = totalBranch0.indexOf('--Chọn chi nhánh--') + 18

int two = totalBranch0.lastIndexOf('--Chọn chi nhánh--')

String totalBranch1 = totalBranch0.substring(one, two)*/

/*KeywordLogger log = new KeywordLogger()

log.logInfo(totalBranch1)*/

