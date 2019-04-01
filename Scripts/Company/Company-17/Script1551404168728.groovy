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

WebUI.navigateToUrl('http://helpdesk.unicode.edu.vn/')

WebUI.setText(findTestObject('Company/Company-17/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('Company/Company-17/Page_ODTS System/input_ODTS_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Company/Company-17/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('Company/Company-17/Page_ODTS System/a_Cng Ty'))

WebUI.click(findTestObject('Company/Company-17/Page_ODTS System/a_Xem Hp ng'))

WebUI.click(findTestObject('Company/Company-17/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('Company/Company-17/Page_ODTS System/input'), '30/04/2019')

WebUI.click(findTestObject('Company/Company-17/Page_ODTS System/button_Cn Hn Hp ng_btn btn-dan'))

WebUI.click(findTestObject('Company/Company-17/Page_ODTS System/button_Chp Nhn Xa'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-17/Page_ODTS System/button_OK'))

WebUI.waitForAlert(1)

WebUI.verifyElementVisible(findTestObject('Company/Company-17/Page_ODTS System/td_Khng c d liu ph hp'))

PrintWriter writer2 = new PrintWriter('C:\\Users\\pc\\HelpdeskAutomation\\creDateContract.txt')

writer2.print('')

writer2.close()

//Xóa ngày cập nhật và ngày tạo
WebUI.closeBrowser()

