import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://helpdesk.unicode.edu.vn/')

WebUI.setText(findTestObject('Company/Company-03/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('Company/Company-03/Page_ODTS System/input_ODTS_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Company/Company-03/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('Company/Company-03/Page_ODTS System/clickCompanyMenu'))

WebUI.click(findTestObject('Company/Company-03/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('Company/Company-03/Page_ODTS System/input'), 'anhtest')

WebUI.waitForAlert(2)

WebUI.click(findTestObject('Company/Company-03/Page_ODTS System/button_Xem Hp ng_btn btn-info'))

WebUI.waitForAlert(2)

WebUI.verifyElementText(findTestObject('Company/Company-03/Page_ODTS System/anhtest'), 'anhtest')

WebUI.verifyElementText(findTestObject('Company/Company-03/Page_ODTS System/p_hihi'), 'hihi')

String CDATE = null

String UDATE = null

BufferedReader br = null

try {
    br = new BufferedReader(new FileReader('C:\\Users\\pc\\HelpdeskAutomation\\creDateCompany.txt'))

    String sCurrentLine

    while ((sCurrentLine = br.readLine()) != null) {
        CDATE = sCurrentLine
    }
    
    //Lấy giá trị ngày tạo từ file
    br = new BufferedReader(new FileReader('C:\\Users\\pc\\HelpdeskAutomation\\upDateCompany.txt'))

    sCurrentLine

    while ((sCurrentLine = br.readLine()) != null) {
        UDATE = sCurrentLine
    } //Lấy giá trị ngày cập nhật từ file
}
catch (IOException e) {
} 
finally { 
    br.close()
}

WebUI.verifyElementText(findTestObject('Company/Company-03/Page_ODTS System/p_1031 21022019'), CDATE)

WebUI.verifyElementText(findTestObject('Company/Company-03/Page_ODTS System/p_1031 21022019_1'), UDATE)

WebUI.verifyElementText(findTestObject('Company/Company-03/Page_ODTS System/span_50'), '50')

WebUI.verifyElementText(findTestObject('Company/Company-03/Page_ODTS System/span_15'), '15')

WebUI.verifyElementText(findTestObject('Company/Company-03/Page_ODTS System/span_65'), '65')

WebUI.click(findTestObject('Company/Company-03/Page_ODTS System/button_ng'))

WebUI.closeBrowser()

