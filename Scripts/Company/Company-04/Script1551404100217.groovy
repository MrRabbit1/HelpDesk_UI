import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Company/Company-04/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('Company/Company-04/Page_ODTS System/input_ODTS_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Company/Company-04/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('Company/Company-05/Page_ODTS System/a_Cng Ty'))

WebUI.click(findTestObject('Company/Company-04/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('Company/Company-04/Page_ODTS System/input'), 'anhtest')

WebUI.click(findTestObject('Company/Company-04/Page_ODTS System/button_Xem Hp ng_btn btn-warni'))

WebUI.waitForAlert(2)

WebUI.setText(findTestObject('Company/Company-04/Page_ODTS System/input_Tn Cng Ty_comNameEdit'), 'anhtest22')

WebUI.waitForAlert(2)

WebUI.setText(findTestObject('Company/Company-04/Page_ODTS System/input_M T_comDescriptionEdit'), 'hihi22')

WebUI.waitForAlert(2)

WebUI.setText(findTestObject('Company/Company-04/Page_ODTS System/input_im Bnh Chn()_editPercent'), '70')

WebUI.waitForAlert(2)

WebUI.setText(findTestObject('Company/Company-04/Page_ODTS System/input_Kinh Nghim()_editPercent'), '70')

WebUI.waitForAlert(2)

WebUI.setText(findTestObject('Company/Company-04/Page_ODTS System/input_ Thn Thuc()_editPercentF'), '70')

WebUI.waitForAlert(2)

String UDATE = new SimpleDateFormat('HH:mm dd/MM/yyyy').format(Calendar.getInstance().getTime())

//Lấy giá trị ngày cập nhật theo format dd/MM/yyyy
Writer writer = null

def fileNameCre = 'creDateCompany.txt'

def fileNameUp = 'upDateCompany.txt'

def workingDirectory = System.getProperty('user.dir')

def absoluteFilePathCre = workingDirectory + File.separator + fileNameCre

def absoluteFilePathUp = workingDirectory + File.separator + fileNameUp

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

WebUI.click(findTestObject('Company/Company-04/Page_ODTS System/button_Cp Nht'))

WebUI.click(findTestObject('Company/Company-04/Page_ODTS System/button_OK'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-04/Page_ODTS System/button_Xem Hp ng_btn btn-info'))

WebUI.waitForAlert(2)

WebUI.verifyElementText(findTestObject('Company/Company-04/Page_ODTS System/p_anhtest22'), 'anhtest22')

WebUI.verifyElementText(findTestObject('Company/Company-04/Page_ODTS System/p_hihi22'), 'hihi22')

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

WebUI.verifyElementText(findTestObject('Company/Company-04/Page_ODTS System/p_1458 21022019'), CDATE)

WebUI.verifyElementText(findTestObject('Company/Company-04/Page_ODTS System/p_1503 21022019'), UDATE)

WebUI.verifyElementText(findTestObject('Company/Company-04/Page_ODTS System/span_70'), '70')

WebUI.verifyElementText(findTestObject('Company/Company-04/Page_ODTS System/span_70_1'), '70')

WebUI.verifyElementText(findTestObject('Company/Company-04/Page_ODTS System/span_70_2'), '70')

WebUI.click(findTestObject('Company/Company-04/Page_ODTS System/button_ng'))

WebUI.closeBrowser()

