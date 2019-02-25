import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://helpdesk.wisky.vn/')

WebUI.setText(findTestObject('Object Repository/TypeOfService/TypeOfService05/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('Object Repository/TypeOfService/TypeOfService05/Page_ODTS System/input_ODTS_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService05/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService05/Page_ODTS System/a_Loi Dch V'))

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService05/Page_ODTS System/a_Xem Dch V'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService05/Page_ODTS System/button_To Dch V'))

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Object Repository/TypeOfService/TypeOfService05/Page_ODTS System/input_Tn Dch V_siNameC'), 
    'anhtest')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Object Repository/TypeOfService/TypeOfService05/Page_ODTS System/input_M T Dch V_siDescriptionC'), 
    'haha')

def CDATE = new SimpleDateFormat('HH:mm dd/MM/yyyy').format(Calendar.getInstance().getTime())

Writer writer = null, writer2 = null

try {
	writer = new BufferedWriter(new OutputStreamWriter(
		  new FileOutputStream("C:\\Users\\pc\\Katalon Studio\\Helpdesk\\creDateService.txt"), "utf-8"));
	writer.write(CDATE);
	
	writer2 = new BufferedWriter(new OutputStreamWriter(
		new FileOutputStream("C:\\Users\\pc\\Katalon Studio\\Helpdesk\\upDateService.txt"), "utf-8"));
	writer2.write(CDATE);
} catch (IOException ex) {
	// Report
} finally {
   try {writer.close();writer2.close()} catch (Exception ex) {/*ignore*/}
}


WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService05/Page_ODTS System/button_To Mi'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService05/Page_ODTS System/button_OK'))

WebUI.click(findTestObject('Object Repository/TypeOfService/TypeOfService05/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('Object Repository/TypeOfService/TypeOfService05/Page_ODTS System/input'), 'anhtest')

WebUI.verifyElementText(findTestObject('Object Repository/TypeOfService/TypeOfService05/Page_ODTS System/td_anhtest'), 'anhtest')

WebUI.verifyElementText(findTestObject('Object Repository/TypeOfService/TypeOfService05/Page_ODTS System/td_haha'), 'haha')

WebUI.verifyElementText(findTestObject('Object Repository/TypeOfService/TypeOfService05/Page_ODTS System/td_1340 25022019'), CDATE)

WebUI.closeBrowser()

