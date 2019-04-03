import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Object Repository/AccountSystem/AccountSystem-03/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('Object Repository/AccountSystem/AccountSystem-03/Page_ODTS System/input_ODTS_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/AccountSystem/AccountSystem-03/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('Object Repository/AccountSystem/AccountSystem-03/Page_ODTS System/a_H Thng Ti Khon'))

WebUI.click(findTestObject('Object Repository/AccountSystem/AccountSystem-03/Page_ODTS System/fieldSearch2'))

WebUI.setText(findTestObject('Object Repository/AccountSystem/AccountSystem-03/Page_ODTS System/input'), 'admin anhtest')

WebUI.click(findTestObject('Object Repository/AccountSystem/AccountSystem-03/Page_ODTS System/button_anhtest_btn btn-warning'))

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Object Repository/AccountSystem/AccountSystem-03/Page_ODTS System/input_Tn ng Nhp_accNameEdit'), 
    'anhtest22')

WebUI.waitForAlert(1)

def UDATE = new SimpleDateFormat('HH:mm dd/MM/yyyy').format(Calendar.getInstance().getTime())

//Lấy giá trị ngày cập nhật theo format dd/MM/yyyy
Writer writer = null

def fileNameCre = 'creDateAccountSystem.txt'

def fileNameUp = 'upDateAccountSystem.txt'

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

WebUI.click(findTestObject('Object Repository/AccountSystem/AccountSystem-03/Page_ODTS System/button_Cp Nht'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/AccountSystem/AccountSystem-03/Page_ODTS System/button_OK'))

WebUI.click(findTestObject('Object Repository/AccountSystem/AccountSystem-03/Page_ODTS System/button_anhtest22_btn btn-info'))

WebUI.waitForAlert(1)

WebUI.verifyElementText(findTestObject('Object Repository/AccountSystem/AccountSystem-03/Page_ODTS System/p_Admin'), 'Admin')

WebUI.verifyElementText(findTestObject('Object Repository/AccountSystem/AccountSystem-03/Page_ODTS System/p_anhtest22'), 
    'anhtest22')

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

WebUI.verifyElementText(findTestObject('Object Repository/AccountSystem/AccountSystem-03/Page_ODTS System/p_1118 01032019'), 
    CDATE)

WebUI.verifyElementText(findTestObject('Object Repository/AccountSystem/AccountSystem-03/Page_ODTS System/p_1124 01032019'), 
    UDATE)

WebUI.click(findTestObject('Object Repository/AccountSystem/AccountSystem-03/Page_ODTS System/button_ng'))

WebUI.closeBrowser()

