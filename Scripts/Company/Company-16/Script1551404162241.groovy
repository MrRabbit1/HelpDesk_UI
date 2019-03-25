import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat
import java.time.temporal.ChronoUnit

import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://helpdesk.wisky.vn/')

WebUI.setText(findTestObject('Company/Company-16/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('Company/Company-16/Page_ODTS System/input_ODTS_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Company/Company-16/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('Company/Company-16/Page_ODTS System/a_Cng Ty'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-16/Page_ODTS System/a_Xem Hp ng'))

WebUI.click(findTestObject('Company/Company-16/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('Company/Company-16/Page_ODTS System/input'), '25/04/2019')

WebUI.click(findTestObject('Company/Company-16/Page_ODTS System/button_Cn Hn Hp ng_btn btn-war'))

WebUI.waitForAlert(2)

WebUI.setText(findTestObject('Company/Company-16/Page_ODTS System/input_M T Hp ng_conNameE'), 'anhtest22')

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-16/Page_ODTS System/ul_WIFI'))

WebUI.setText(findTestObject('Company/Company-16/Page_ODTS System/input__select2-search__field'), 'camera')

WebUI.sendKeys(findTestObject('Company/Company-16/Page_ODTS System/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-16/Page_ODTS System/input_Ngy Bt u_conStartDateE'))

WebUI.click(findTestObject('Company/Company-16/Page_ODTS System/th_February 2019'))

WebUI.click(findTestObject('Company/Company-16/Page_ODTS System/span_Feb'))

WebUI.click(findTestObject('Company/Company-16/Page_ODTS System/td_10'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-16/Page_ODTS System/input_Ngy Kt Thc_conEndDateE'))

WebUI.click(findTestObject('Company/Company-16/Page_ODTS System/th_February 2019'))

WebUI.click(findTestObject('Company/Company-16/Page_ODTS System/span_Apr'))

WebUI.click(findTestObject('Company/Company-16/Page_ODTS System/td_30'))

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Company/Company-16/Page_ODTS System/input_Gi Hp ng_conPriceE'), '20022')

def LASTEDIT = new SimpleDateFormat('dd/MM/yyyy').format(Calendar.getInstance().getTime())
//Lấy giá trị ngày cập nhật theo format dd/MM/yyyy

Writer writer = null;

try {
	writer = new BufferedWriter(new OutputStreamWriter(
		  new FileOutputStream("C:\\Users\\pc\\HelpdeskAutomation\\creDateContract.txt"), "utf-8"));
	writer.write(LASTEDIT);
	//Lưu giá trị ngày cập nhật vào file
} catch (IOException ex) {
	// Report
} finally {
   try {writer.close();} catch (Exception ex) {/*ignore*/}
}


WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-16/Page_ODTS System/button_Cp Nht'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-16/Page_ODTS System/button_OK'))

WebUI.click(findTestObject('Company/Company-16/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('Company/Company-16/Page_ODTS System/input'), '30/04/2019')

WebUI.click(findTestObject('Company/Company-16/Page_ODTS System/button_Cn Hn Hp ng_btn btn-inf'))

WebUI.waitForAlert(1)

WebUI.verifyElementText(findTestObject('Company/Company-16/Page_ODTS System/p_Passio'), 'Passio')

def EXPIREDDATE = WebUI.getText(findTestObject('Company/Company-16/Page_ODTS System/p_30042019'))
//Lấy giá trị ngày hết hạn hợp đồng

def DATE = new SimpleDateFormat('dd/MM/yyyy').format(Calendar.getInstance().getTime())
//Lấy giá trị ngày hôm  nay theo format dd/MM/yyyy

def DATE1 = new SimpleDateFormat('dd/MM/yyyy').parse(DATE)
def EXPIREDDATE1 = new SimpleDateFormat('dd/MM/yyyy').parse(EXPIREDDATE)
def DATE2 = new SimpleDateFormat('yyyy/MM/dd').format(DATE1)
def EXPIREDDATE2 = new SimpleDateFormat('yyyy/MM/dd').format(EXPIREDDATE1)
//Chuyển đổi format ngày để so sánh

if (EXPIREDDATE2.compareTo(DATE2) >= 0) //So sánh ngày hết hạn hợp đồng và ngày hôm nay
{
	WebUI.verifyElementText(findTestObject('Company/Company-16/Page_ODTS System/p_Cn Hn Hp ng'), 'Còn Hạn Hợp Đồng')
} else {
	WebUI.verifyElementText(findTestObject('Company/Company-16/Page_ODTS System/p_Cn Hn Hp ng'), 'Hợp đồng hết hạn')
}

WebUI.verifyElementText(findTestObject('Company/Company-16/Page_ODTS System/p_10022019'), '10/02/2019')

WebUI.verifyElementText(findTestObject('Company/Company-16/Page_ODTS System/p_30042019'), '30/04/2019')

WebUI.verifyElementText(findTestObject('Company/Company-16/Page_ODTS System/td_1'), '1')

WebUI.verifyElementText(findTestObject('Company/Company-16/Page_ODTS System/td_WIFI'), 'Wifi Marketing')

WebUI.verifyElementText(findTestObject('Company/Company-16/Page_ODTS System/td_2'), '2')

WebUI.verifyElementText(findTestObject('Company/Company-16/Page_ODTS System/td_CAMERA'), 'Camera')

WebUI.verifyElementText(findTestObject('Company/Company-16/Page_ODTS System/p_anhtest22'), 'anhtest22')

def date1 = new SimpleDateFormat('dd/MM/yyyy').parse(EXPIREDDATE)
//Chuyển đổi ngày hết hạn hợp đồng từ kiểu String thành Date

def date2 = new SimpleDateFormat('dd/MM/yyyy').parse(DATE)
//Chuyển đồi ngày hôm nay từ kiểu String thành Date

def between = ChronoUnit.DAYS.between(date2.toInstant(), date1.toInstant())
//Tính khoảng cách giữa 2 ngày

if (between > 0){
	WebUI.verifyElementText(findTestObject('Company/Company-16/Page_ODTS System/p_Cn 66 ngy'), 'Còn ' + between + ' ngày')
} else if (between == 0) {
	WebUI.verifyElementText(findTestObject('Company/Company-16/Page_ODTS System/p_Cn 66 ngy'), 'Chỉ còn trong hôm nay')
} else if (between < 0 ) {
	WebUI.verifyElementText(findTestObject('Company/Company-16/Page_ODTS System/p_Cn 66 ngy'), 'Hết hạn')
}
//So sánh giá trị

WebUI.verifyElementText(findTestObject('Company/Company-16/Page_ODTS System/p_20022 VN'), '20022 VNĐ')

String LASTEDITFROMFILE = null;
BufferedReader br = null;
try {
		br = new BufferedReader(new FileReader("C:\\Users\\pc\\HelpdeskAutomation\\creDateContract.txt"))
		String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				LASTEDITFROMFILE = sCurrentLine;
			}
		//Lấy giá trị ngày cập nhật từ file
	} catch (IOException e) {
	
	} finally{
		br.close();
	}

WebUI.verifyElementText(findTestObject('Company/Company-16/Page_ODTS System/p_23022019'), LASTEDITFROMFILE)

WebUI.click(findTestObject('Company/Company-16/Page_ODTS System/button_ng'))

WebUI.closeBrowser()

