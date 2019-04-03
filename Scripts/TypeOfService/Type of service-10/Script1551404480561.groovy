import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('TypeOfService/Type of service-10/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('TypeOfService/Type of service-10/Page_ODTS System/input_ODTS_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('TypeOfService/Type of service-10/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('TypeOfService/Type of service-09/Page_ODTS System/a_Loi Dch V'))

WebUI.click(findTestObject('TypeOfService/Type of service-10/Page_ODTS System/a_Xem Dch V'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('TypeOfService/Type of service-10/Page_ODTS System/a_Xem Hng Dn'))

WebUI.click(findTestObject('TypeOfService/Type of service-10/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('TypeOfService/Type of service-10/Page_ODTS System/input'), 'anhtest')

WebUI.waitForAlert(1)

WebUI.click(findTestObject('TypeOfService/Type of service-10/Page_ODTS System/button_anhtest_btn btn-warning'))

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('TypeOfService/Type of service-10/Page_ODTS System/input_Ni dung hng dn_siGuideli'), 'anhtest22')

def UDATE = new SimpleDateFormat('dd/MM/yyyy').format(Calendar.getInstance().getTime())

//Lấy giá trị ngày cập nhật theo format dd/MM/yyyy
Writer writer = null

def fileNameCre = 'creDateGuide.txt'

def fileNameUp = 'upDateGuide.txt'

def workingDirectory = System.getProperty('user.dir')

def absoluteFilePathCre = (workingDirectory + File.separator) + fileNameCre

def absoluteFilePathUp = (workingDirectory + File.separator) + fileNameUp

try {
    writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absoluteFilePathUp), 
    'utf-8'))

    writer.write(UDATE //Lưu giá trị ngày cập nhật vào file
        )
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

WebUI.click(findTestObject('TypeOfService/Type of service-10/Page_ODTS System/button_Cp Nht'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('TypeOfService/Type of service-10/Page_ODTS System/button_OK'))

WebUI.verifyElementText(findTestObject('TypeOfService/Type of service-10/Page_ODTS System/td_anhtest22'), 'anhtest22')

String CDATE = null

BufferedReader br = null

try {
    br = new BufferedReader(new FileReader(absoluteFilePathCre))

    String sCurrentLine

    while ((sCurrentLine = br.readLine()) != null) {
        CDATE = sCurrentLine //Lấy giá trị ngày tạo từ file
    }
}
catch (IOException e) {
} 
finally { 
    br.close()
}

WebUI.verifyElementText(findTestObject('TypeOfService/Type of service-10/Page_ODTS System/td_25022019'), CDATE)

WebUI.verifyElementText(findTestObject('TypeOfService/Type of service-10/Page_ODTS System/td_25022019'), UDATE)

WebUI.closeBrowser()

