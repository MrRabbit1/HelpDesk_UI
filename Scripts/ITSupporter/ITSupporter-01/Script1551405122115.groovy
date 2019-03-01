import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://helpdesk.wisky.vn/')

WebUI.setText(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/input_ODTS_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/a_Nhn Vin K Thut'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/button_To Nhn Vin'))

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/input_Tn ng Nhp_userNameC'), 
    'anhtest')

WebUI.waitForAlert(1)

WebUI.setEncryptedText(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/input_Mt Khu_passC'), 
    'aeHFOx8jV/A=')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/input_H V Tn_nameC'), 'nva')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/input_S in Thoi_phoneC'), '1234567890')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/input_Email_emailC'), 'anh.nguyen@wisky.vn')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/input_a Ch Thng Tr_addressC'), 
    'Q12')

WebUI.waitForAlert(1)

def CDATE = new SimpleDateFormat('HH:mm dd/MM/yyyy').format(Calendar.getInstance().getTime())
//Lấy giá trị ngày tạo theo format HH:mm dd/MM/yyyy

Writer writer = null, writer2 = null

try {
	writer = new BufferedWriter(new OutputStreamWriter(
		  new FileOutputStream("C:\\Users\\pc\\HelpdeskAutomation\\creDateITSupporter.txt"), "utf-8"));
	writer.write(CDATE);
	//Lưu giá trị ngày tạo vào file
	
	writer2 = new BufferedWriter(new OutputStreamWriter(
		new FileOutputStream("C:\\Users\\pc\\HelpdeskAutomation\\upDateITSupporter.txt"), "utf-8"));
	writer2.write(CDATE);
	//Lưu giá trị ngày cập nhật là ngày tạo vào file
} catch (IOException ex) {
	// Report
} finally {
   try {writer.close();writer2.close()} catch (Exception ex) {}
}

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/button_To Mi'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/button_OK'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/input'), 'nva anhtest')

WebUI.verifyElementText(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/td_nva'), 'nva')

WebUI.verifyElementText(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/td_anhtest'), 'anhtest')

WebUI.verifyElementText(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/td_1234567890'), '1234567890')

WebUI.verifyElementText(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/td_Online'), 'Online')

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/a_H Thng Ti Khon'))

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/fieldSearch2'))

WebUI.setText(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/input2'), 'itsupporter anhtest')

WebUI.verifyElementText(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/role'), 'ITSupporter')

WebUI.verifyElementText(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/name'), 'anhtest')

WebUI.verifyElementText(findTestObject('Object Repository/ITSupporter/ITSupporter-01/Page_ODTS System/creDate'), CDATE)

WebUI.closeBrowser()

