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

WebUI.setText(findTestObject('Company/Company-10/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('Company/Company-10/Page_ODTS System/input_ODTS_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Company/Company-10/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('Company/Company-10/Page_ODTS System/a_Cng Ty'))

WebUI.click(findTestObject('Company/Company-10/Page_ODTS System/a_Xem Chi Nhnh'))

WebUI.click(findTestObject('Company/Company-10/Page_ODTS System/a_Xem Thit b'))

WebUI.click(findTestObject('Company/Company-10/Page_ODTS System/font_To Thit B'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-10/Page_ODTS System/span_--Chn loi thit b--'))

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Company/Company-10/Page_ODTS System/input_ng_select2-search__field'), 'Camera')

WebUI.waitForAlert(1)

WebUI.sendKeys(findTestObject('Company/Company-10/Page_ODTS System/input_ng_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Company/Company-10/Page_ODTS System/input_Tn Thit B_dvNameC'), 'anhtest')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Company/Company-10/Page_ODTS System/input_Code_dvCodeC'), 'hihi')

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-10/Page_ODTS System/input_Ngy Bo Hnh_dvGDateC'))

WebUI.click(findTestObject('Company/Company-10/Page_ODTS System/chonNgayBaoHanh'))

WebUI.click(findTestObject('Company/Company-10/Page_ODTS System/chonNgayBaoHanh2'))

WebUI.click(findTestObject('Company/Company-10/Page_ODTS System/td_1'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-10/Page_ODTS System/input_Hn Bo Hnh_dvGEndDateC'))

WebUI.click(findTestObject('Company/Company-10/Page_ODTS System/chonNgayBaoHanh'))

WebUI.click(findTestObject('Company/Company-10/Page_ODTS System/chonHanBaoHanh'))

WebUI.click(findTestObject('Company/Company-10/Page_ODTS System/td_1'))

WebUI.setText(findTestObject('Company/Company-10/Page_ODTS System/input_Ip_dvIpC'), '192.168.1.1')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Company/Company-10/Page_ODTS System/input_Port_dvPortC'), '443')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Company/Company-10/Page_ODTS System/input_Device Account_dvAccC'), 'anh')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Company/Company-10/Page_ODTS System/input_Device Password_dvPassC'), '123')

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-10/Page_ODTS System/input_Ngy Lp_dvSettingDateC'))

WebUI.click(findTestObject('Company/Company-10/Page_ODTS System/chonNgayBaoHanh'))

WebUI.click(findTestObject('Company/Company-10/Page_ODTS System/chonNgayBaoHanh2'))

WebUI.click(findTestObject('Company/Company-10/Page_ODTS System/td_20'))

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Company/Company-10/Page_ODTS System/input_Thng Tin_dvOtherC'), 'testdevice')

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-10/Page_ODTS System/button_To Mi'))

WebUI.click(findTestObject('Company/Company-10/Page_ODTS System/button_OK'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-10/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('Company/Company-10/Page_ODTS System/input'), 'anhtest')

WebUI.verifyElementText(findTestObject('Company/Company-10/Page_ODTS System/td_anhtest'), 'anhtest')

WebUI.verifyElementText(findTestObject('Company/Company-10/Page_ODTS System/td_hihi'), 'hihi')

WebUI.verifyElementText(findTestObject('Company/Company-10/Page_ODTS System/td_01022019'), '01/02/2019')

WebUI.verifyElementText(findTestObject('Company/Company-10/Page_ODTS System/td_01042019'), '05/04/2019')

WebUI.verifyElementText(findTestObject('Company/Company-10/Page_ODTS System/td_20022019'), '20/02/2019')

WebUI.closeBrowser()

