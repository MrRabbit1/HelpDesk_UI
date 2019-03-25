import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://helpdesk.wisky.vn/')

WebUI.setText(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/input_ODTS_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/a_Nhn Vin K Thut'))

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/input'), 'nva anhtest')

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/button_Online_btn btn-warning'))

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/input_Tn ng Nhp_userNameE'), 
    'anhtest22')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/input_H V Tn_nameE'), 'nva22')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/input_S in Thoi_phoneE'), '1234567822')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/input_Email_emailE'), 'anh.nguyen@wisky.vn22')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/input_a Ch Thng Tr_addressE'), 
    'Q1222')

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/button_Ty Chnh Kinh Nghim'))

WebUI.waitForAlert(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/select_CAMERAPOSSOFTWAREEMAILI'), '2', true)

WebUI.setText(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/input_Thi Gian lm Vic_monthExp'), 
    '22')

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/button_Lu'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/button_OK'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/button_Ty Chnh Kinh Nghim'))

WebUI.waitForAlert(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/select_CAMERAPOSSOFTWAREEMAILI'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/input_Thi Gian lm Vic_monthExp'), 
    '11')

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/button_Lu'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/button_OK'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/button_Ty Chnh Kinh Nghim'))

WebUI.waitForAlert(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/select_CAMERAPOSSOFTWAREEMAILI'), 
    '15', true)

WebUI.setText(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/input_Thi Gian lm Vic_monthExp'), 
    '33')

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/button_Lu'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/button_OK'))

WebUI.waitForAlert(1)

def UDATE = new SimpleDateFormat('HH:mm dd/MM/yyyy').format(Calendar.getInstance().getTime())
//Lấy giá trị ngày cập nhật theo format dd/MM/yyyy

Writer writer = null;

try {
	writer = new BufferedWriter(new OutputStreamWriter(
		new FileOutputStream("C:\\Users\\pc\\HelpdeskAutomation\\upDateITSupporter.txt"), "utf-8"));
	writer.write(UDATE);
	//Lưu giá trị ngày cập nhật vào file
} catch (IOException ex) {
	// Report
} finally {
   try {writer.close();} catch (Exception ex) {/*ignore*/}
}

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/button_Cp Nht'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/button_OK'))

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/button_Online_btn btn-info fa'))

WebUI.waitForAlert(1)

WebUI.verifyElementText(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/p_nva22'), 'nva22')

WebUI.verifyElementText(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/p_1234567822'), '1234567822')

WebUI.verifyElementText(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/p_anhtest22'), 'anhtest22')

WebUI.verifyElementText(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/p_anh.nguyenwisky.vn22'), 'anh.nguyen@wisky.vn22')

WebUI.verifyElementText(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/p_Q1222'), 'Q1222')

WebUI.verifyElementText(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/p_CAMERA 22 thng  POS 11 thng'), 'Camera, 22 tháng | Pos, 11 tháng | Email, 33 tháng |')

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/button_ng'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/a_H Thng Ti Khon'))

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/fieldSearch2'))

WebUI.setText(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/input'), 'itsupporter anhtest22')

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/button_anhtest22_btn btn-info'))

WebUI.waitForAlert(1)

WebUI.verifyElementText(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/p_ITSupporter'), 'ITSupporter')

WebUI.verifyElementText(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/p_anhtest22_1'), 'anhtest22')

String CDATE = null;
BufferedReader br = null;
try {
		br = new BufferedReader(new FileReader("C:\\Users\\pc\\HelpdeskAutomation\\creDateITSupporter.txt"))
		String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				CDATE = sCurrentLine;
			}
		//Lấy giá trị ngày tạo từ file
	} catch (IOException e) {
	
	} finally{
		br.close();
	}
	
WebUI.verifyElementText(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/p_0923 01032019'), CDATE)

WebUI.verifyElementText(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/p_0943 01032019'), UDATE)

WebUI.click(findTestObject('Object Repository/ITSupporter/ITSupporter-03/Page_ODTS System/button_ng'))

WebUI.closeBrowser()

