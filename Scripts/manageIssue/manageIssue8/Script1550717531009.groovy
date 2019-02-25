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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://helpdesk.wisky.vn/')

WebUI.setText(findTestObject('Object Repository/manageIssue/manageIssue8/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('Object Repository/manageIssue/manageIssue8/Page_ODTS System/input_ODTS_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/manageIssue/manageIssue8/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('Object Repository/manageIssue/manageIssue8/Page_ODTS System/a_To mi_btn btn-warning fa fa-'))

WebUI.click(findTestObject('Object Repository/manageIssue/manageIssue8/Page_ODTS System/label_Ch nhn vin x l'))

WebUI.click(findTestObject('Object Repository/manageIssue/manageIssue8/Page_ODTS System/label_Cao'))

WebUI.setText(findTestObject('Object Repository/manageIssue/manageIssue8/Page_ODTS System/textarea_M T hin tng_DescripE'), 
    'aaaahihi\n')

WebUI.click(findTestObject('Object Repository/manageIssue/manageIssue8/Page_ODTS System/button_Cp nht'))

String issueName = WebUI.getText(findTestObject('Object Repository/manageIssue/manageIssue8/Page_ODTS System/issueName'))

String issueTime = WebUI.getText(findTestObject('Object Repository/manageIssue/manageIssue8/Page_ODTS System/issueTime'))

String issueCreBy = WebUI.getText(findTestObject('Object Repository/manageIssue/manageIssue8/Page_ODTS System/issueCreBy'))

WebUI.click(findTestObject('Object Repository/manageIssue/manageIssue8/Page_ODTS System/a_S c ang v ch x l'))

WebUI.verifyElementText(findTestObject('Object Repository/manageIssue/manageIssue8/Page_ODTS System/td_Passio 47 TCV - Camera khng'), issueName)

WebUI.verifyElementText(findTestObject('Object Repository/manageIssue/manageIssue8/Page_ODTS System/td_1713 20022019'), issueTime)

WebUI.verifyElementText(findTestObject('Object Repository/manageIssue/manageIssue8/Page_ODTS System/td_Passio 47 TCV'), issueCreBy)

WebUI.verifyElementText(findTestObject('Object Repository/manageIssue/manageIssue8/Page_ODTS System/span_Cao'), 'Cao')

WebUI.verifyElementText(findTestObject('Object Repository/manageIssue/manageIssue8/Page_ODTS System/span_Ch nhn vin x l'), 'Chờ nhân viên xử lý')

WebUI.closeBrowser()

