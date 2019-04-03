import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('TypeOfService/Type of service-09/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('TypeOfService/Type of service-09/Page_ODTS System/input_ODTS_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('TypeOfService/Type of service-09/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('TypeOfService/Type of service-09/Page_ODTS System/a_Loi Dch V'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('TypeOfService/Type of service-09/Page_ODTS System/a_Xem Dch V'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('TypeOfService/Type of service-09/Page_ODTS System/a_Xem Hng Dn'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('TypeOfService/Type of service-09/Page_ODTS System/font_To Hng Dn'))

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('TypeOfService/Type of service-09/Page_ODTS System/input_Ni dung hng dn_siGuideli'), 'anhtest')

def CDATE = new SimpleDateFormat('dd/MM/yyyy').format(Calendar.getInstance().getTime())

//Lấy giá trị ngày tạo theo format dd/MM/yyyy
Writer writer = null

Writer writer2 = null

def fileNameCre = 'creDateGuide.txt'

def fileNameUp = 'upDateGuide.txt'

def workingDirectory = System.getProperty('user.dir')

def absoluteFilePathCre = (workingDirectory + File.separator) + fileNameCre

def absoluteFilePathUp = (workingDirectory + File.separator) + fileNameUp

try {
    writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absoluteFilePathCre), 
    'utf-8'))

    writer.write(CDATE)

    //Lưu giá trị ngày tạo vào file
    writer2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absoluteFilePathUp), 
    'utf-8'))

    writer2.write(CDATE //Lưu giá trị ngày cập nhật vào file
        )
}
catch (IOException ex) {
    // Report
} 
finally { 
    try {
        writer.close()

        writer2.close()
    }
    catch (Exception ex) {
        /*ignore*/ 
    } 
}

WebUI.waitForAlert(1)

WebUI.click(findTestObject('TypeOfService/Type of service-09/Page_ODTS System/button_To Mi'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('TypeOfService/Type of service-09/Page_ODTS System/button_OK'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('TypeOfService/Type of service-09/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('TypeOfService/Type of service-09/Page_ODTS System/input'), 'anhtest')

WebUI.waitForAlert(1)

WebUI.verifyElementText(findTestObject('TypeOfService/Type of service-09/Page_ODTS System/td_anhtest'), 'anhtest')

WebUI.verifyElementText(findTestObject('TypeOfService/Type of service-09/Page_ODTS System/td_25022019'), CDATE)

WebUI.verifyElementText(findTestObject('TypeOfService/Type of service-09/Page_ODTS System/td_25022019'), CDATE)

WebUI.closeBrowser()

