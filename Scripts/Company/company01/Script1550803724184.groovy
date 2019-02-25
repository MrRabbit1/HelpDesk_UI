import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://helpdesk.wisky.vn/')

WebUI.setText(findTestObject('Company/company01/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.waitForAlert(2)

WebUI.setEncryptedText(findTestObject('Company/company01/Page_ODTS System/input_ODTS_password'), 'aeHFOx8jV/A=')

WebUI.waitForAlert(2)

WebUI.click(findTestObject('Company/company01/Page_ODTS System/button_ng Nhp'))

WebUI.waitForAlert(2)

WebUI.click(findTestObject('Company/company01/Page_ODTS System/span_Cng Ty'))

WebUI.waitForAlert(2)

WebUI.click(findTestObject('Company/company01/Page_ODTS System/button_To Cng Ty'))

WebUI.waitForAlert(2)

WebUI.setText(findTestObject('Company/company01/Page_ODTS System/input_Tn Cng Ty_comNameCreate'), 'anhtest')

WebUI.waitForAlert(2)

WebUI.setText(findTestObject('Company/company01/Page_ODTS System/input_M T_comDescriptionCreate'), 'hihi')

WebUI.waitForAlert(2)

WebUI.setText(findTestObject('Company/company01/Page_ODTS System/input_im Bnh Chn()_comPercentF'), '50')

WebUI.waitForAlert(2)

WebUI.setText(findTestObject('Company/company01/Page_ODTS System/input_Kinh Nghim()_comPercentF'), '12')

WebUI.waitForAlert(2)

WebUI.setText(findTestObject('Company/company01/Page_ODTS System/input_ Thn Thuc()_comPercentFo'), '65')

WebUI.waitForAlert(2)

WebUI.setText(findTestObject('Company/company01/Page_ODTS System/input_Kinh Nghim()_comPercentF'), '15')

WebUI.waitForAlert(2)

WebUI.click(findTestObject('Company/company01/Page_ODTS System/button_To Mi'))

WebUI.waitForAlert(2)

def CDATE = new SimpleDateFormat('dd/MM/yyyy').format(Calendar.getInstance().getTime())

String DATE = new SimpleDateFormat('HH:mm dd/MM/yyyy').format(Calendar.getInstance().getTime())

Writer writer = null, writer2 = null;

try {
    writer = new BufferedWriter(new OutputStreamWriter(
          new FileOutputStream("C:\\Users\\pc\\Katalon Studio\\Helpdesk\\creDateCompany.txt"), "utf-8"));
    writer.write(DATE);
	
	writer2 = new BufferedWriter(new OutputStreamWriter(
		new FileOutputStream("C:\\Users\\pc\\Katalon Studio\\Helpdesk\\upDateCompany.txt"), "utf-8"));
	writer2.write(DATE);
} catch (IOException ex) {
    // Report
} finally {
   try {writer.close();,writer2.close()} catch (Exception ex) {/*ignore*/}
}

WebUI.click(findTestObject('Company/company01/Page_ODTS System/button_OK'))

WebUI.waitForAlert(2)

WebUI.click(findTestObject('Company/company01/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('Company/company01/Page_ODTS System/input'), 'anhtest')

WebUI.verifyElementText(findTestObject('Company/company01/Page_ODTS System/td_anhtest'), 'anhtest')

WebUI.verifyElementText(findTestObject('Company/company01/Page_ODTS System/td_hihi'), 'hihi')

WebUI.verifyElementText(findTestObject('Company/company01/Page_ODTS System/td_21022019'), CDATE)

WebUI.closeBrowser()