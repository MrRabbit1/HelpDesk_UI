import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://helpdesk.wisky.vn/')

WebUI.setText(findTestObject('Object Repository/TypeOfService/TypeOfService10/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('Object Repository/TypeOfService/TypeOfService10/Page_ODTS System/input_ODTS_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService10/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService09/Page_ODTS System/a_Loi Dch V'))

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService10/Page_ODTS System/a_Xem Dch V'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService10/Page_ODTS System/a_Xem Hng Dn'))

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService10/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('Object Repository/TypeOfService/TypeOfService10/Page_ODTS System/input'), 'anhtest')

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService10/Page_ODTS System/button_anhtest_btn btn-warning'))

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Object Repository/TypeOfService/TypeOfService10/Page_ODTS System/input_Ni dung hng dn_siGuideli'), 
    'anhtest22')

def UDATE = new SimpleDateFormat('dd/MM/yyyy').format(Calendar.getInstance().getTime())

Writer writer = null;

try {
	writer = new BufferedWriter(new OutputStreamWriter(
		new FileOutputStream("C:\\Users\\pc\\Katalon Studio\\Helpdesk\\upDateGuide.txt"), "utf-8"));
	writer.print("");
	writer.write(UDATE);
} catch (IOException ex) {
	// Report
} finally {
   try {writer.close();} catch (Exception ex) {/*ignore*/}
}

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService10/Page_ODTS System/button_Cp Nht'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService10/Page_ODTS System/button_OK'))

WebUI.verifyElementText(findTestObject('Object Repository/TypeOfService/TypeOfService10/Page_ODTS System/td_anhtest22'), 'anhtest22')

String CDATE = null;
BufferedReader br = null;
try {
		br = new BufferedReader(new FileReader("C:\\Users\\pc\\Katalon Studio\\Helpdesk\\creDateGuide.txt"))
		String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				CDATE = sCurrentLine;
			}
	} catch (IOException e) {
	
	} finally{
		br.close();
	}

WebUI.verifyElementText(findTestObject('Object Repository/TypeOfService/TypeOfService10/Page_ODTS System/td_25022019'), CDATE)

WebUI.verifyElementText(findTestObject('Object Repository/TypeOfService/TypeOfService10/Page_ODTS System/td_25022019'), UDATE)

WebUI.closeBrowser()
