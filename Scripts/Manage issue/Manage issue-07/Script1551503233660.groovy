import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat

import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://helpdesk.wisky.vn/')

WebUI.setText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/input_ODTS_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/a_To s c'))

WebUI.waitForAlert(2)

WebUI.click(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/span_--Chn chi nhnh--'))

WebUI.setText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/input_ng_select2-search__field'), 
    'Passio 47 TCV')

WebUI.sendKeys(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/input_ng_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/span_--Chn danh mc--'))

WebUI.setText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/input_ng_select2-search__field'), 
    'CAMERA')

WebUI.sendKeys(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/input_ng_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/span_--Chn hin tng--'))

WebUI.setText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/input_ng_select2-search__field'), 
    'Camera')

WebUI.sendKeys(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/input_ng_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/span_--Chn  u tin--'))

WebUI.setText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/input_ng_select2-search__field'), 
    'Cao')

WebUI.sendKeys(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/input_ng_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/ul_Thit B_select2-selection__r'))

WebUI.setText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/input_Thit B_select2-search__f'), 
    'Camera HikVision')

WebUI.sendKeys(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/input_Thit B_select2-search__f'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/ul_test'))

WebUI.setText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/input__select2-search__field'), 
    'Camera Y996')

WebUI.sendKeys(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/input__select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/nguyennhan'), 'do not know')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/solution'), 'repair win')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/textarea_M T hin tng_DescripC'), 
    'hihi')

WebUI.waitForAlert(1)

def CDATE0 = new SimpleDateFormat('HH:mm dd/MM/yyyy').format(Calendar.getInstance().getTime())
//Lấy giá trị ngày tạo theo format dd/MM/yyyy

Writer writer = null, writer2 = null

try {
	writer = new BufferedWriter(new OutputStreamWriter(
		  new FileOutputStream("C:\\Users\\pc\\HelpdeskAutomation\\creDateIssue.txt"), "utf-8"));
	writer.write(CDATE0);
	//Lưu giá trị ngày tạo vào file
	
	writer2 = new BufferedWriter(new OutputStreamWriter(
		new FileOutputStream("C:\\Users\\pc\\HelpdeskAutomation\\upDateIssue.txt"), "utf-8"));
	writer2.write(CDATE0);
	//Lưu giá trị ngày cập nhật là ngày tạo vào file
} catch (IOException ex) {
	// Report
} finally {
   try {writer.close();writer2.close()} catch (Exception ex) {/*ignore*/}
}

WebUI.click(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/button_To Mi'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/button_OK'))

WebUI.waitForAlert(1)

WebUI.verifyElementText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/td_Passio 47 TCV - Camera khng'), 'Passio 47 TCV - Camera không hiện màu')

WebUI.verifyElementText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/td_1205 02032019'), CDATE0)

WebUI.verifyElementText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/td_Passio 47 TCV'), 'Passio 47 TCV')

WebUI.verifyElementText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/td_Thp'), 'Cao')

WebUI.verifyElementText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/span_To mi'), 'Tạo mới')

WebUI.verifyElementText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/td_To mi_text-center'), '')

WebUI.click(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/button_To mi_btn btn-info fa f'))

WebUI.waitForAlert(1)

WebUI.verifyElementText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/p_Passio 47 TCV'), 'Passio 47 TCV')

WebUI.verifyElementText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/p_47 Trn Cao Vn'), '47 Trần Cao Vân')

WebUI.verifyElementText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/p_a'), 'Passio 47 TCV')

WebUI.verifyElementText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/p_Passio 47 TCV_1'), 'Passio 47 TCV - Camera không hiện màu')

WebUI.verifyElementText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/p_0966167423'), '0966167423')

WebUI.verifyElementText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/p_Camera khng hin mu'), 'Camera không hiện màu')

WebUI.verifyElementText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/p_To mi'), 'Tạo mới')

WebUI.verifyElementText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/p_Thp'), 'Cao')

String CDATE = null, UDATE = null;
BufferedReader br = null;
try {
		br = new BufferedReader(new FileReader("C:\\Users\\pc\\HelpdeskAutomation\\creDateIssue.txt"))
		String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				CDATE = sCurrentLine;
			}
		//Lấy giá trị ngày tạo từ file
			
		br = new BufferedReader(new FileReader("C:\\Users\\pc\\HelpdeskAutomation\\upDateIssue.txt"))
		sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				UDATE = sCurrentLine;
			}
		//Lấy giá trị ngày cập nhật từ file
	} catch (IOException e) {
	
	} finally{
		br.close();
	}

WebUI.verifyElementText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/p_1205 02032019'), CDATE)

WebUI.verifyElementText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/updateDate'), UDATE)

WebUI.verifyElementText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/nguyennhandetail'), 'do not know')

WebUI.verifyElementText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/solutiondetatil'), 'repair win')

WebUI.verifyElementText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/p_hihi'), 'hihi')

WebUI.verifyElementText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/td_C12203'), 'C12203')

WebUI.verifyElementText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/td_Camera HikVision'), 'Camera HikVision')

WebUI.verifyElementText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/td_C236CFC'), 'C236CFC')

WebUI.verifyElementText(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/td_Camera Y996'), 'Camera Y996')

WebUI.click(findTestObject('Object Repository/Manage issue/Manage issue-07/Page_ODTS System/button_Close'))

WebUI.closeBrowser()

