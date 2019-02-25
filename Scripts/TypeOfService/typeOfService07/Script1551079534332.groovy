import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://helpdesk.wisky.vn/')

WebUI.setText(findTestObject('Object Repository/TypeOfService/TypeOfService07/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('Object Repository/TypeOfService/TypeOfService07/Page_ODTS System/input_ODTS_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService07/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService06/Page_ODTS System/a_Loi Dch V'))

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService07/Page_ODTS System/a_Xem Dch V'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService07/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('Object Repository/TypeOfService/TypeOfService07/Page_ODTS System/input'), 'anhtest')

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService07/Page_ODTS System/button_Xem Hng Dn_btn btn-warn'))

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Object Repository/TypeOfService/TypeOfService07/Page_ODTS System/input_Tn Dch V_siNameE'), 
    'anhtest22')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Object Repository/TypeOfService/TypeOfService07/Page_ODTS System/input_M T Dch V_siDescriptionE'), 
    'haha22')

def UDATE = new SimpleDateFormat('HH:mm dd/MM/yyyy').format(Calendar.getInstance().getTime())

Writer writer = null;

try {
	writer = new BufferedWriter(new OutputStreamWriter(
		new FileOutputStream("C:\\Users\\pc\\Katalon Studio\\Helpdesk\\upDateService.txt"), "utf-8"));
	writer.print("");
	writer.write(UDATE);
} catch (IOException ex) {
	// Report
} finally {
   try {writer.close();} catch (Exception ex) {/*ignore*/}
}

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService07/Page_ODTS System/button_Cp Nht'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService07/Page_ODTS System/button_OK'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService07/Page_ODTS System/button_Xem Hng Dn_btn btn-info'))

WebUI.waitForAlert(1)

WebUI.verifyElementText(findTestObject('Object Repository/TypeOfService/TypeOfService07/Page_ODTS System/p_anhtest22'), 'anhtest22')

WebUI.verifyElementText(findTestObject('Object Repository/TypeOfService/TypeOfService07/Page_ODTS System/p_haha22'), 'haha22')

String CDATE = null;
BufferedReader br = null;
try {
		br = new BufferedReader(new FileReader("C:\\Users\\pc\\Katalon Studio\\Helpdesk\\creDateService.txt"))
		String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				CDATE = sCurrentLine;
			}
	} catch (IOException e) {
	
	} finally{
		br.close();
	}

WebUI.verifyElementText(findTestObject('Object Repository/TypeOfService/TypeOfService07/Page_ODTS System/p_1417 25022019'), CDATE)

WebUI.verifyElementText(findTestObject('Object Repository/TypeOfService/TypeOfService07/Page_ODTS System/p_1424 25022019'), UDATE)

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService07/Page_ODTS System/button_ng'))

WebUI.closeBrowser()

