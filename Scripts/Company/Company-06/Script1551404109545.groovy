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

WebUI.setText(findTestObject('Company/Company-06/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('Company/Company-06/Page_ODTS System/input_ODTS_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Company/Company-06/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('Company/Company-06/Page_ODTS System/a_Cng Ty'))

WebUI.click(findTestObject('Company/Company-06/Page_ODTS System/a_Xem Chi Nhnh'))

WebUI.click(findTestObject('Company/Company-06/Page_ODTS System/font_To Chi Nhnh'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-06/Page_ODTS System/span_--Chn ti khon--'))

WebUI.setText(findTestObject('Company/Company-06/Page_ODTS System/input_ng_select2-search__field'), '14021')

WebUI.waitForAlert(1)

WebUI.sendKeys(findTestObject('Company/Company-06/Page_ODTS System/input_ng_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Company/Company-06/Page_ODTS System/input_Tn Chi Nhnh_ee'), 'anhtest')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Company/Company-06/Page_ODTS System/input_Tn Qun L Chi Nhnh_yy'), 'anh')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Company/Company-06/Page_ODTS System/input_a Ch_rr'), 'hihi')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Company/Company-06/Page_ODTS System/input_S in Thoi_tt'), '0123456789')

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-06/Page_ODTS System/button_To Mi'))

WebUI.click(findTestObject('Company/Company-06/Page_ODTS System/button_OK'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-06/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('Company/Company-06/Page_ODTS System/input'), 'anhtest')

WebUI.verifyElementText(findTestObject('Company/Company-06/Page_ODTS System/td_Passio'), 'Passio')

WebUI.verifyElementText(findTestObject('Company/Company-06/Page_ODTS System/td_anhtest'), 'anhtest')

WebUI.verifyElementText(findTestObject('Company/Company-06/Page_ODTS System/td_hihi'), 'hihi')

WebUI.closeBrowser()

