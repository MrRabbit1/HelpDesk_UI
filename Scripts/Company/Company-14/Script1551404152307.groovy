import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Company/Company-14/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('Company/Company-14/Page_ODTS System/input_ODTS_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Company/Company-14/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('Company/Company-14/Page_ODTS System/a_Cng Ty'))

WebUI.click(findTestObject('Company/Company-14/Page_ODTS System/a_Xem Hp ng'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-14/Page_ODTS System/button_To Hp ng'))

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Company/Company-14/Page_ODTS System/input_M T Hp ng_conNameCreate'), 'anhtest')

WebUI.click(findTestObject('Company/Company-14/Page_ODTS System/ul_Dch V ng K_select2-selectio'))

WebUI.setText(findTestObject('Company/Company-14/Page_ODTS System/input_Dch V ng K_select2-searc'), 'WIFI')

WebUI.sendKeys(findTestObject('Company/Company-14/Page_ODTS System/input_Dch V ng K_select2-searc'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Company/Company-14/Page_ODTS System/input_Ngy Bt u_createDate'))

WebUI.click(findTestObject('Company/Company-14/Page_ODTS System/th_February 2019'))

WebUI.click(findTestObject('Company/Company-14/Page_ODTS System/span_Feb'))

WebUI.click(findTestObject('Company/Company-14/Page_ODTS System/td_5'))

WebUI.click(findTestObject('Company/Company-14/Page_ODTS System/input_Ngy Kt Thc_endDate'))

WebUI.click(findTestObject('Company/Company-14/Page_ODTS System/th_February 2019'))

WebUI.click(findTestObject('Company/Company-14/Page_ODTS System/span_Apr'))

WebUI.click(findTestObject('Company/Company-14/Page_ODTS System/td_25'))

WebUI.setText(findTestObject('Company/Company-14/Page_ODTS System/input_Gi Hp ng_price'), '200')

WebUI.click(findTestObject('Company/Company-14/Page_ODTS System/button_To Mi'))

def CDATE = new SimpleDateFormat('dd/MM/yyyy').format(Calendar.getInstance().getTime())

//Lấy giá trị ngày tạo theo format dd/MM/yyyy
Writer writer = null

def fileNameCre = 'creDateContract.txt'

def workingDirectory = System.getProperty('user.dir')

def absoluteFilePathCre = workingDirectory + File.separator + fileNameCre

try {
    writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absoluteFilePathCre), 
    'utf-8'))

    writer.write(CDATE //Lưu giá trị ngày tạo vào file
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

WebUI.click(findTestObject('Company/Company-14/Page_ODTS System/button_OK'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-14/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('Company/Company-14/Page_ODTS System/input'), '25/04/2019')

WebUI.verifyElementText(findTestObject('Company/Company-14/Page_ODTS System/td_Passio'), 'Passio')

WebUI.verifyElementText(findTestObject('Company/Company-14/Page_ODTS System/td_05022019'), '05/02/2019')

WebUI.verifyElementText(findTestObject('Company/Company-14/Page_ODTS System/td_25042019'), '25/04/2019')

WebUI.verifyElementText(findTestObject('Company/Company-14/Page_ODTS System/td_200'), '200')

def EXPIREDDATE = WebUI.getText(findTestObject('Company/Company-14/Page_ODTS System/td_25042019'))

//Lấy giá trị ngày hết hạn hợp đồng
def CDATE1 = new SimpleDateFormat('dd/MM/yyyy').parse(CDATE)

def EXPIREDDATE1 = new SimpleDateFormat('dd/MM/yyyy').parse(EXPIREDDATE)

def CDATE2 = new SimpleDateFormat('yyyy/MM/dd').format(CDATE1)

def EXPIREDDATE2 = new SimpleDateFormat('yyyy/MM/dd').format(EXPIREDDATE1)

//Chuyển đổi format ngày để so sánh
if (EXPIREDDATE2.compareTo(CDATE2) >= 0) //So sánh ngày hết hạn hợp đồng và ngày hôm nay
{
    WebUI.verifyElementText(findTestObject('Company/Company-14/Page_ODTS System/span_Cn Hn Hp ng'), 'Còn Hạn Hợp Đồng')
} else {
    WebUI.verifyElementText(findTestObject('Company/Company-14/Page_ODTS System/span_Cn Hn Hp ng'), 'Đã hết hạn hợp đồng')
}

WebUI.closeBrowser()

