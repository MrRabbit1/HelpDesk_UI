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

WebUI.setText(findTestObject('Company/company08/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('Company/company08/Page_ODTS System/input_ODTS_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Company/company08/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('Company/company08/Page_ODTS System/a_Xem Chi Nhnh'))

WebUI.click(findTestObject('Company/company07/Page_ODTS System/span_Cng Ty'))

WebUI.click(findTestObject('Company/company08/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('Company/company08/Page_ODTS System/input'), 'anhtest')

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/company08/Page_ODTS System/button_Xem Thit b_btn btn-warn'))

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Company/company08/Page_ODTS System/input_Tn Chi Nhnh_e'), 'anhtest22')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Company/company08/Page_ODTS System/input_Tn Qun L Chi Nhnh_y'), 'anh22')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Company/company08/Page_ODTS System/input_a Ch_r'), 'hihi22')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Company/company08/Page_ODTS System/input_S in Thoi_t'), '0123456722')

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/company08/Page_ODTS System/button_Cp Nht'))

WebUI.click(findTestObject('Company/company08/Page_ODTS System/button_OK'))

WebUI.click(findTestObject('Company/company08/Page_ODTS System/button_Xem Thit b_btn btn-info'))

WebUI.verifyElementText(findTestObject('Company/company08/Page_ODTS System/p_Passio'), 'Passio')

WebUI.verifyElementText(findTestObject('Company/company08/Page_ODTS System/p_anhtest22'), 'anhtest22')

WebUI.verifyElementText(findTestObject('Company/company08/Page_ODTS System/p_anh22'), 'anh22')

WebUI.verifyElementText(findTestObject('Company/company08/Page_ODTS System/p_14021'), '14021')

WebUI.verifyElementText(findTestObject('Company/company08/Page_ODTS System/p_hihi22'), 'hihi22')

WebUI.verifyElementText(findTestObject('Company/company08/Page_ODTS System/p_0123456722'), '0123456722')

WebUI.click(findTestObject('Company/company08/Page_ODTS System/button_ng'))

WebUI.closeBrowser()

