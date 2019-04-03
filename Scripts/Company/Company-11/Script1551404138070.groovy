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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Company/Company-11/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('Company/Company-11/Page_ODTS System/input_ODTS_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Company/Company-11/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('Company/Company-11/Page_ODTS System/a_Cng Ty'))

WebUI.click(findTestObject('Company/Company-11/Page_ODTS System/a_Xem Chi Nhnh'))

WebUI.click(findTestObject('Company/Company-11/Page_ODTS System/a_Xem Thit b'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-11/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('Company/Company-11/Page_ODTS System/input'), 'anhtest')

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-11/Page_ODTS System/button_hihi_btn btn-info fa fa'))

WebUI.waitForAlert(1)

WebUI.verifyElementText(findTestObject('Company/Company-11/Page_ODTS System/p_anhtest'), 'anhtest')

WebUI.verifyElementText(findTestObject('Company/Company-11/Page_ODTS System/p_Wifi'), 'Camera')

WebUI.verifyElementText(findTestObject('Company/Company-11/Page_ODTS System/p_hihi'), 'hihi')

WebUI.verifyElementText(findTestObject('Company/Company-11/Page_ODTS System/p_01022019'), '01/02/2019')

WebUI.verifyElementText(findTestObject('Company/Company-11/Page_ODTS System/p_05042019'), '05/04/2019')

WebUI.verifyElementText(findTestObject('Company/Company-11/Page_ODTS System/p_192.168.1.1'), '192.168.1.1')

WebUI.verifyElementText(findTestObject('Company/Company-11/Page_ODTS System/p_443'), '443')

WebUI.verifyElementText(findTestObject('Company/Company-11/Page_ODTS System/p_anh'), 'anh')

WebUI.verifyElementText(findTestObject('Company/Company-11/Page_ODTS System/p_123'), '123')

WebUI.verifyElementText(findTestObject('Company/Company-11/Page_ODTS System/p_20022019'), '20/02/2019')

WebUI.verifyElementText(findTestObject('Company/Company-11/Page_ODTS System/lastEdit'), '')

WebUI.verifyElementText(findTestObject('Company/Company-11/Page_ODTS System/p_testdevice'), 'testdevice')

WebUI.click(findTestObject('Company/Company-11/Page_ODTS System/button_ng'))

WebUI.closeBrowser()

