import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('TypeOfService/Type of service-01/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('TypeOfService/Type of service-01/Page_ODTS System/input_ODTS_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('TypeOfService/Type of service-01/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('TypeOfService/Type of service-01/Page_ODTS System/a_Loi Dch V'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('TypeOfService/Type of service-01/Page_ODTS System/button_To Loi Dch V'))

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('TypeOfService/Type of service-01/Page_ODTS System/input_Tn Dch V_stsNameCreate'), 'anhtest')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('TypeOfService/Type of service-01/Page_ODTS System/input_M T_sisDescriptionCreate'), 'hihi')

def CDATE = new SimpleDateFormat('dd/MM/yyyy').format(Calendar.getInstance().getTime())

//Lấy ngày tạo theo format dd/MM/yyyy
Writer writer = null

Writer writer2 = null

def fileNameCre = 'creDateTypeOfService.txt'

def fileNameUp = 'upDateTypeOfService.txt'

def workingDirectory = System.getProperty('user.dir')

def absoluteFilePathCre = (workingDirectory + File.separator) + fileNameCre

def absoluteFilePathUp = (workingDirectory + File.separator) + fileNameUp

try {
    writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absoluteFilePathCre), 
    'utf-8'))

    writer.write(CDATE)

    //Lưu ngày tạo vào file
    writer2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absoluteFilePathUp), 
    'utf-8'))

    writer2.write(CDATE //Lưu ngày cập nhật là ngày tạo vào file
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

WebUI.click(findTestObject('TypeOfService/Type of service-01/Page_ODTS System/button_To Mi'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('TypeOfService/Type of service-01/Page_ODTS System/button_OK'))

WebUI.click(findTestObject('TypeOfService/Type of service-01/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('TypeOfService/Type of service-01/Page_ODTS System/input'), 'anhtest')

WebUI.verifyElementText(findTestObject('TypeOfService/Type of service-01/Page_ODTS System/td_anhtest'), 'anhtest')

WebUI.verifyElementText(findTestObject('TypeOfService/Type of service-01/Page_ODTS System/td_hihi'), 'hihi')

WebUI.verifyElementText(findTestObject('TypeOfService/Type of service-01/Page_ODTS System/td_25022019'), CDATE)

WebUI.closeBrowser()

