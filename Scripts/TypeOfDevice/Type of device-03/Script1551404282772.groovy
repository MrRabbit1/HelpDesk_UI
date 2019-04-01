import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://helpdesk.unicode.edu.vn/')

WebUI.setText(findTestObject('TypeOfDevice/Type of device-03/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('TypeOfDevice/Type of device-03/Page_ODTS System/input_ODTS_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('TypeOfDevice/Type of device-03/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('TypeOfDevice/Type of device-03/Page_ODTS System/a_Loi Thit B'))

WebUI.click(findTestObject('TypeOfDevice/Type of device-03/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('TypeOfDevice/Type of device-03/Page_ODTS System/input'), 'anhtest')

WebUI.click(findTestObject('TypeOfDevice/Type of device-03/Page_ODTS System/button_hihi_btn btn-warning fa'))

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('TypeOfDevice/Type of device-03/Page_ODTS System/input_Tn Loi Thit B_dtNameCrea'), 'anhtest22')

WebUI.waitForAlert(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/TypeOfDevice/Type of device-03/Page_ODTS System/select_--Chn Loi Dch V--WIFICA'), 
    '52', true)

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('TypeOfDevice/Type of device-03/Page_ODTS System/input_M T Loi Thit B_dtDescrip'), 'hihi22')

WebUI.waitForAlert(1)

def UDATE = new SimpleDateFormat('dd/MM/yyyy').format(Calendar.getInstance().getTime())

//Lấy giá trị ngày cập nhật theo format dd/MM/yyyy
Writer writer = null

try {
    writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream('C:\\Users\\pc\\HelpdeskAutomation\\upDateTypeOfDevice.txt'), 
    'utf-8'))

    writer.write(UDATE) //Lưu giá trị ngày cập nhật vào file
}
catch (IOException ex) {
    // Report
} 
finally { 
    try {
        writer.close()
    }
    catch (Exception ex) {
        /*ignore*/ 
    } 
}

WebUI.click(findTestObject('TypeOfDevice/Type of device-03/Page_ODTS System/button_Cp Nht'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('TypeOfDevice/Type of device-03/Page_ODTS System/button_OK'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('TypeOfDevice/Type of device-03/Page_ODTS System/button_hihi22_btn btn-info fa'))

WebUI.waitForAlert(1)

WebUI.verifyElementText(findTestObject('TypeOfDevice/Type of device-03/Page_ODTS System/p_anhtest22'), 'anhtest22')

WebUI.verifyElementText(findTestObject('TypeOfDevice/Type of device-03/Page_ODTS System/p_WIFI'), 'Wifi Marketing')

WebUI.verifyElementText(findTestObject('TypeOfDevice/Type of device-03/Page_ODTS System/p_hihi22'), 'hihi22')

String CDATE = null

BufferedReader br = null

try {
    br = new BufferedReader(new FileReader('C:\\Users\\pc\\HelpdeskAutomation\\creDateTypeOfDevice.txt'))

    String sCurrentLine

    while ((sCurrentLine = br.readLine()) != null) {
        CDATE = sCurrentLine
    } //Lấy giá trị ngày tạo từ file
}
catch (IOException e) {
} 
finally { 
    br.close()
}

WebUI.verifyElementText(findTestObject('TypeOfDevice/Type of device-03/Page_ODTS System/p_25022019'), CDATE)

WebUI.verifyElementText(findTestObject('TypeOfDevice/Type of device-03/Page_ODTS System/p_25022019_1'), UDATE)

WebUI.click(findTestObject('TypeOfDevice/Type of device-03/Page_ODTS System/button_ng'))

WebUI.closeBrowser()

