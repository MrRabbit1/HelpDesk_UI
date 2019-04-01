import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://helpdesk.unicode.edu.vn/')

WebUI.setText(findTestObject('TypeOfDevice/Type of device-02/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('TypeOfDevice/Type of device-02/Page_ODTS System/input_ODTS_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('TypeOfDevice/Type of device-02/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('TypeOfDevice/Type of device-02/Page_ODTS System/a_Loi Thit B'))

WebUI.click(findTestObject('TypeOfDevice/Type of device-02/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('TypeOfDevice/Type of device-02/Page_ODTS System/input'), 'anhtest')

WebUI.click(findTestObject('TypeOfDevice/Type of device-02/Page_ODTS System/button_hihi_btn btn-info fa fa'))

WebUI.waitForAlert(1)

WebUI.verifyElementText(findTestObject('TypeOfDevice/Type of device-02/Page_ODTS System/p_anhtest'), 'anhtest')

WebUI.verifyElementText(findTestObject('TypeOfDevice/Type of device-02/Page_ODTS System/p_CAMERA'), 'Camera')

WebUI.verifyElementText(findTestObject('TypeOfDevice/Type of device-02/Page_ODTS System/p_hihi'), 'hihi')

String CDATE = null

String UDATE = null

BufferedReader br = null

try {
    br = new BufferedReader(new FileReader('C:\\Users\\pc\\HelpdeskAutomation\\creDateTypeOfDevice.txt'))

    String sCurrentLine

    while ((sCurrentLine = br.readLine()) != null) {
        CDATE = sCurrentLine
    }
    
    //Lấy giá trị ngày tạo từ file
    br = new BufferedReader(new FileReader('C:\\Users\\pc\\HelpdeskAutomation\\upDateTypeOfDevice.txt'))

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

WebUI.verifyElementText(findTestObject('TypeOfDevice/Type of device-02/Page_ODTS System/p_25022019'), CDATE)

WebUI.verifyElementText(findTestObject('TypeOfDevice/Type of device-02/Page_ODTS System/p_25022019_1'), UDATE)

WebUI.click(findTestObject('TypeOfDevice/Type of device-02/Page_ODTS System/button_ng'))

WebUI.closeBrowser()

