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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Calendar as Calendar
import com.kms.katalon.core.logging.KeywordLogger

WebUI.openBrowser('')

WebUI.navigateToUrl('http://helpdesk.wisky.vn/')

WebUI.setText(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/username'), 'admin01')

WebUI.waitForAlert(2)

WebUI.setEncryptedText(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/password'), 'aeHFOx8jV/A=')

WebUI.waitForAlert(2)

WebUI.click(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/button_ng Nhp'))

WebUI.waitForAlert(2)

WebUI.click(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/createissues'))

WebUI.waitForAlert(2)

WebUI.click(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/span_--Chn chi nhnh--'))

WebUI.waitForAlert(2)

WebUI.setText(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/input_ng_select2-search__field'), 'Pass')

WebUI.waitForAlert(2)

WebUI.sendKeys(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/input_ng_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.waitForAlert(2)

WebUI.click(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/span_--Chn danh mc--'))

WebUI.waitForAlert(2)

WebUI.setText(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/input_ng_select2-search__field'), 'Ca')

WebUI.waitForAlert(2)

WebUI.sendKeys(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/input_ng_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.waitForAlert(2)

WebUI.click(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/span_--Chn hin tng--'))

WebUI.waitForAlert(2)

WebUI.setText(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/input_ng_select2-search__field'), 'Ca')

WebUI.waitForAlert(2)

WebUI.sendKeys(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/input_ng_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.waitForAlert(2)

WebUI.click(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/DoUuTien'))

WebUI.waitForAlert(2)

WebUI.setText(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/DoUuTien'), 'Tr')

WebUI.waitForAlert(2)

WebUI.sendKeys(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/DoUuTien'), Keys.chord(Keys.ENTER))

WebUI.waitForAlert(2)

WebUI.click(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/MoTaHienTuong'))

WebUI.waitForAlert(2)

WebUI.setText(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/MoTaHienTuong'), 'anhtest')

WebUI.waitForAlert(2)

WebUI.sendKeys(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/MoTaHienTuong'), Keys.chord(Keys.ENTER))

WebUI.waitForAlert(2)

def CDATE = new SimpleDateFormat('HH:mm dd/MM/yyyy').format(Calendar.getInstance().getTime())

WebUI.click(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/createsuccess'))

WebUI.waitForAlert(2)

WebUI.verifyElementText(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/issueName'), 'Passio 47 TCV - Camera không hiện màu')

WebUI.verifyElementText(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/issueTime'), CDATE)

WebUI.verifyElementText(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/issueCreateBy'), 'Passio 47 TCV')

WebUI.verifyElementText(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/issuePriority'), 'anhtest')

WebUI.verifyElementText(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/issueStatus'), 'Tạo mới')

WebUI.verifyElementText(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/issueITSupporterHandle'), '')

WebUI.click(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/clickViewDetail'))

WebUI.verifyElementText(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/branchName'), 'Passio 47 TCV')

WebUI.verifyElementText(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/branchAddress'), '47 Trần Cao Vân')

WebUI.verifyElementText(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/branchOwner'), 'a')

WebUI.verifyElementText(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/branchService'), 'Passio 47 TCV - Camera không hiện màu')

WebUI.verifyElementText(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/branchPhone'), '0966167423')

WebUI.verifyElementText(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/branchPhenomena'), 'Camera không hiện màu')

WebUI.verifyElementText(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/branchStatus'), 'Tạo mới')

WebUI.verifyElementText(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/branchPhiority'), 'Trung bình')

WebUI.verifyElementText(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/branchCreDate'), CDATE)

WebUI.verifyElementText(findTestObject('Manage issue/Manage issue-07/Page_ODTS System/branchDesIssue'), 'aaaa')

WebUI.closeBrowser()
