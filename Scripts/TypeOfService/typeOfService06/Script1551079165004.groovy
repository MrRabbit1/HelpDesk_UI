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

WebUI.setText(findTestObject('Object Repository/TypeOfService/TypeOfService06/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('Object Repository/TypeOfService/TypeOfService06/Page_ODTS System/input_ODTS_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService06/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService06/Page_ODTS System/a_Loi Dch V'))

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService06/Page_ODTS System/a_Xem Dch V'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService06/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('Object Repository/TypeOfService/TypeOfService06/Page_ODTS System/input'), 'anhtest')

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService06/Page_ODTS System/button_Xem Hng Dn_btn btn-info'))

WebUI.waitForAlert(1)

WebUI.verifyElementText(findTestObject('Object Repository/TypeOfService/TypeOfService06/Page_ODTS System/p_anhtest'), 'anhtest')

WebUI.verifyElementText(findTestObject('Object Repository/TypeOfService/TypeOfService06/Page_ODTS System/p_haha'), 'haha')

String CDATE = null, UDATE = null;
BufferedReader br = null;
try {
		br = new BufferedReader(new FileReader("C:\\Users\\pc\\Katalon Studio\\Helpdesk\\creDateService.txt"))
		String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				CDATE = sCurrentLine;
			}
			
		br = new BufferedReader(new FileReader("C:\\Users\\pc\\Katalon Studio\\Helpdesk\\upDateService.txt"))
		sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				UDATE = sCurrentLine;
			}
	} catch (IOException e) {
	
	} finally{
		br.close();
	}

WebUI.verifyElementText(findTestObject('Object Repository/TypeOfService/TypeOfService06/Page_ODTS System/p_1417 25022019'), CDATE)

WebUI.verifyElementText(findTestObject('Object Repository/TypeOfService/TypeOfService06/Page_ODTS System/p_1417 25022019_1'), UDATE)

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService06/Page_ODTS System/button_ng'))

WebUI.closeBrowser()

