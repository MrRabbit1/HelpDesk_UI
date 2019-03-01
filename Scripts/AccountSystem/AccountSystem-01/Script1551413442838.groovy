import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat

import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://helpdesk.wisky.vn/')

WebUI.setText(findTestObject('Object Repository/AccountSystem/AccountSystem-01/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('Object Repository/AccountSystem/AccountSystem-01/Page_ODTS System/input_ODTS_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/AccountSystem/AccountSystem-01/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('Object Repository/AccountSystem/AccountSystem-01/Page_ODTS System/a_H Thng Ti Khon'))

WebUI.click(findTestObject('Object Repository/AccountSystem/AccountSystem-01/Page_ODTS System/button_To Ti Khon'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/AccountSystem/AccountSystem-01/Page_ODTS System/span_--Chn quyn ti khon--'))

WebUI.setText(findTestObject('Object Repository/AccountSystem/AccountSystem-01/Page_ODTS System/input_ng_select2-search__field'), 
    'Admin')

WebUI.sendKeys(findTestObject('Object Repository/AccountSystem/AccountSystem-01/Page_ODTS System/input_ng_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Object Repository/AccountSystem/AccountSystem-01/Page_ODTS System/input_Tn ng Nhp_accNameCreate'), 
    'anhtest')

WebUI.waitForAlert(1)

WebUI.setEncryptedText(findTestObject('Object Repository/AccountSystem/AccountSystem-01/Page_ODTS System/input_Mt Khu_accPassCreate'), 
    'aeHFOx8jV/A=')

WebUI.waitForAlert(1)

def CDATE = new SimpleDateFormat('HH:mm dd/MM/yyyy').format(Calendar.getInstance().getTime())
//Lấy giá trị ngày tạo theo format HH:mm dd/MM/yyyy

Writer writer = null, writer2 = null

try {
	writer = new BufferedWriter(new OutputStreamWriter(
		  new FileOutputStream("C:\\Users\\pc\\HelpdeskAutomation\\creDateAccountSystem.txt"), "utf-8"));
	writer.write(CDATE);
	//Lưu giá trị ngày tạo vào file
	
	writer2 = new BufferedWriter(new OutputStreamWriter(
		new FileOutputStream("C:\\Users\\pc\\HelpdeskAutomation\\upDateAccountSystem.txt"), "utf-8"));
	writer2.write(CDATE);
	//Lưu giá trị ngày cập nhật là ngày tạo vào file
} catch (IOException ex) {
	// Report
} finally {
   try {writer.close();writer2.close()} catch (Exception ex) {}
}

WebUI.click(findTestObject('Object Repository/AccountSystem/AccountSystem-01/Page_ODTS System/button_To Mi'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/AccountSystem/AccountSystem-01/Page_ODTS System/button_OK'))

WebUI.click(findTestObject('Object Repository/AccountSystem/AccountSystem-01/Page_ODTS System/fieldSearch2'))

WebUI.setText(findTestObject('Object Repository/AccountSystem/AccountSystem-01/Page_ODTS System/input'), 'admin anhtest')

WebUI.verifyElementText(findTestObject('Object Repository/AccountSystem/AccountSystem-01/Page_ODTS System/td_Admin'), 'Admin')

WebUI.verifyElementText(findTestObject('Object Repository/AccountSystem/AccountSystem-01/Page_ODTS System/td_anhtest'), 'anhtest')

WebUI.verifyElementText(findTestObject('Object Repository/AccountSystem/AccountSystem-01/Page_ODTS System/td_1109 01032019'), CDATE)

WebUI.closeBrowser()

