import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import java.time.temporal.ChronoUnit as ChronoUnit
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://helpdesk.wisky.vn/')

WebUI.setText(findTestObject('Object Repository/Company/company15/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('Object Repository/Company/company15/Page_ODTS System/input_ODTS_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Company/company15/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('Object Repository/Company/company15/Page_ODTS System/a_Cng Ty'))

WebUI.click(findTestObject('Object Repository/Company/company15/Page_ODTS System/a_Xem Hp ng'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/Company/company15/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('Object Repository/Company/company15/Page_ODTS System/input'), '25/04/2019')

WebUI.click(findTestObject('Object Repository/Company/company15/Page_ODTS System/button_Cn Hn Hp ng_btn btn-inf'))

WebUI.waitForAlert(2)

WebUI.verifyElementText(findTestObject('Object Repository/Company/company15/Page_ODTS System/p_Passio'), 'Passio')

def EXPIREDDATE = WebUI.getText(findTestObject('Object Repository/Company/company15/Page_ODTS System/p_25042019'))

def DATE = new SimpleDateFormat('dd/MM/yyyy').format(Calendar.getInstance().getTime())

if (EXPIREDDATE.compareTo(DATE) >= 0) {
    WebUI.verifyElementText(findTestObject('Object Repository/Company/company15/Page_ODTS System/p_Cn Hn Hp ng'), 'Còn Hạn Hợp Đồng')
} else {
    WebUI.verifyElementText(findTestObject('Object Repository/Company/company15/Page_ODTS System/p_Cn Hn Hp ng'), 'Hợp đồng hết hạn')
}

WebUI.verifyElementText(findTestObject('Object Repository/Company/company15/Page_ODTS System/p_05022019'), '05/02/2019')

WebUI.verifyElementText(findTestObject('Object Repository/Company/company15/Page_ODTS System/p_25042019'), '25/04/2019')

WebUI.verifyElementText(findTestObject('Object Repository/Company/company15/Page_ODTS System/td_1'), '1')

WebUI.verifyElementText(findTestObject('Object Repository/Company/company15/Page_ODTS System/td_WIFI'), 'WIFI')

WebUI.verifyElementText(findTestObject('Object Repository/Company/company15/Page_ODTS System/p_anhtest'), 'anhtest')

def date1 = new SimpleDateFormat('dd/MM/yyyy').parse(EXPIREDDATE)

def date2 = new SimpleDateFormat('dd/MM/yyyy').parse(DATE)

def between = ChronoUnit.DAYS.between(date2.toInstant(), date1.toInstant())

if (between > 0) {
    WebUI.verifyElementText(findTestObject('Object Repository/Company/company15/Page_ODTS System/p_Cn 62 ngy'), ('Còn ' + 
        between) + ' ngày')
} else if (between == 0) {
    WebUI.verifyElementText(findTestObject('Object Repository/Company/company15/Page_ODTS System/p_Cn 62 ngy'), 'Chỉ còn trong hôm nay')
} else if (between < 0) {
    WebUI.verifyElementText(findTestObject('Object Repository/Company/company15/Page_ODTS System/p_Cn 62 ngy'), 'Hết hạn')
}

WebUI.verifyElementText(findTestObject('Object Repository/Company/company15/Page_ODTS System/p_200 VN'), '200 VNĐ')

String CDATE = null

BufferedReader br = null

try {
    br = new BufferedReader(new FileReader('C:\\Users\\pc\\Katalon Studio\\Helpdesk\\creDateContract.txt'))

    String sCurrentLine

    while ((sCurrentLine = br.readLine()) != null) {
        CDATE = sCurrentLine
    }
}
catch (IOException e) {
} 
finally { 
    br.close()
}

WebUI.verifyElementText(findTestObject('Object Repository/Company/company15/Page_ODTS System/p_22022019'), CDATE)

WebUI.click(findTestObject('Object Repository/Company/company15/Page_ODTS System/button_ng'))

WebUI.closeBrowser()

