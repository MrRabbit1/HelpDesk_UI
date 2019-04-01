import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://helpdesk.unicode.edu.vn/')

WebUI.setText(findTestObject('TypeOfService/Type of service-03/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('TypeOfService/Type of service-03/Page_ODTS System/input_ODTS_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('TypeOfService/Type of service-03/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('TypeOfService/Type of service-03/Page_ODTS System/a_Loi Dch V'))

WebUI.click(findTestObject('TypeOfService/Type of service-03/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('TypeOfService/Type of service-03/Page_ODTS System/input'), 'anhtest')

WebUI.click(findTestObject('TypeOfService/Type of service-03/Page_ODTS System/button_Xem Dch V_btn btn-warni'))

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('TypeOfService/Type of service-03/Page_ODTS System/input_Tn Loi Dch V_stsNameEdit'), 'anhtest22')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('TypeOfService/Type of service-03/Page_ODTS System/input_M T_stsDescriptionEdit'), 'hihi22')

def UDATE = new SimpleDateFormat('dd/MM/yyyy').format(Calendar.getInstance().getTime())

//Lấy giá trị ngày cập nhật theo format dd/MM/yyyy
Writer writer = null

try {
    writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream('C:\\Users\\pc\\HelpdeskAutomation\\upDateTypeOfService.txt'), 
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

WebUI.waitForAlert(1)

WebUI.click(findTestObject('TypeOfService/Type of service-03/Page_ODTS System/button_Cp Nht'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('TypeOfService/Type of service-03/Page_ODTS System/button_OK'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('TypeOfService/Type of service-03/Page_ODTS System/button_Xem Dch V_btn btn-info'))

WebUI.waitForAlert(1)

WebUI.verifyElementText(findTestObject('TypeOfService/Type of service-03/Page_ODTS System/p_anhtest22'), 'anhtest22')

WebUI.verifyElementText(findTestObject('TypeOfService/Type of service-03/Page_ODTS System/p_hihi22'), 'hihi22')

String CDATE = null

BufferedReader br = null

try {
    br = new BufferedReader(new FileReader('C:\\Users\\pc\\HelpdeskAutomation\\creDateTypeOfService.txt'))

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

WebUI.verifyElementText(findTestObject('TypeOfService/Type of service-03/Page_ODTS System/p_25022019'), CDATE)

WebUI.verifyElementText(findTestObject('TypeOfService/Type of service-03/Page_ODTS System/p_25022019_1'), UDATE)

WebUI.click(findTestObject('TypeOfService/Type of service-03/Page_ODTS System/button_ng'))

WebUI.closeBrowser()

