import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat

import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://helpdesk.wisky.vn/')

WebUI.setText(findTestObject('TypeOfDevice/Type of device-01/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('TypeOfDevice/Type of device-01/Page_ODTS System/input_ODTS_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('TypeOfDevice/Type of device-01/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('TypeOfDevice/Type of device-01/Page_ODTS System/a_Loi Thit B'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('TypeOfDevice/Type of device-01/Page_ODTS System/font_To Loi Thit B'))

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('TypeOfDevice/Type of device-01/Page_ODTS System/input_Tn Loi Thit B_dtNameCrea'), 'anhtest')

WebUI.waitForAlert(1)

WebUI.click(findTestObject('TypeOfDevice/Type of device-01/Page_ODTS System/span_--Chn Loi Dch V--'))

WebUI.setText(findTestObject('TypeOfDevice/Type of device-01/Page_ODTS System/input_ng_select2-search__field'), 'CAMERA')

WebUI.sendKeys(findTestObject('TypeOfDevice/Type of device-01/Page_ODTS System/input_ng_select2-search__field'), Keys.chord(
        Keys.ENTER))

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('TypeOfDevice/Type of device-01/Page_ODTS System/input_M T Loi Thit B_dtDescrip'), 'hihi')

def CDATE = new SimpleDateFormat('dd/MM/yyyy').format(Calendar.getInstance().getTime())
//Lấy giá trị ngày tạo theo format dd/MM/yyyy

Writer writer = null, writer2 = null

try {
	writer = new BufferedWriter(new OutputStreamWriter(
		  new FileOutputStream("C:\\Users\\pc\\HelpdeskAutomation\\creDateTypeOfDevice.txt"), "utf-8"));
	writer.write(CDATE);
	//Lưu giá trị ngày tạo vào file
	
	writer2 = new BufferedWriter(new OutputStreamWriter(
		new FileOutputStream("C:\\Users\\pc\\HelpdeskAutomation\\upDateTypeOfDevice.txt"), "utf-8"));
    writer2.write(CDATE);
	//Lưu giá trị ngày cập nhật là ngày tạo vào file
} catch (IOException ex) {
	// Report
} finally {
   try {writer.close();writer2.close()} catch (Exception ex) {/*ignore*/}
}

WebUI.waitForAlert(1)

WebUI.click(findTestObject('TypeOfDevice/Type of device-01/Page_ODTS System/button_To Mi'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('TypeOfDevice/Type of device-01/Page_ODTS System/button_OK'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('TypeOfDevice/Type of device-01/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('TypeOfDevice/Type of device-01/Page_ODTS System/input'), 'anhtest')

WebUI.verifyElementText(findTestObject('TypeOfDevice/Type of device-01/Page_ODTS System/td_anhtest'), 'anhtest')

WebUI.verifyElementText(findTestObject('TypeOfDevice/Type of device-01/Page_ODTS System/td_CAMERA'), 'CAMERA')

WebUI.verifyElementText(findTestObject('TypeOfDevice/Type of device-01/Page_ODTS System/td_hihi'), 'hihi')

WebUI.verifyElementText(findTestObject('TypeOfDevice/Type of device-01/Page_ODTS System/td_25022019'), CDATE)

WebUI.closeBrowser()

