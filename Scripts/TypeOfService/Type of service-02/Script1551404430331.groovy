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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('TypeOfService/Type of service-02/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('TypeOfService/Type of service-02/Page_ODTS System/input_ODTS_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('TypeOfService/Type of service-02/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('TypeOfService/Type of service-02/Page_ODTS System/a_Loi Dch V'))

WebUI.click(findTestObject('TypeOfService/Type of service-02/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('TypeOfService/Type of service-02/Page_ODTS System/input'), 'anhtest')

WebUI.click(findTestObject('TypeOfService/Type of service-02/Page_ODTS System/button_Xem Dch V_btn btn-info'))

WebUI.waitForAlert(1)

WebUI.verifyElementText(findTestObject('TypeOfService/Type of service-02/Page_ODTS System/p_anhtest'), 'anhtest')

WebUI.verifyElementText(findTestObject('TypeOfService/Type of service-02/Page_ODTS System/p_hihi'), 'hihi')

String CDATE = null

String UDATE = null

BufferedReader br = null

def fileNameCre = 'creDateTypeOfService.txt'

def fileNameUp = 'upDateTypeOfService.txt'

def workingDirectory = System.getProperty('user.dir')

def absoluteFilePathCre = (workingDirectory + File.separator) + fileNameCre

def absoluteFilePathUp = (workingDirectory + File.separator) + fileNameUp

try {
    br = new BufferedReader(new FileReader(absoluteFilePathCre))

    String sCurrentLine

    while ((sCurrentLine = br.readLine()) != null) {
        CDATE = sCurrentLine
    }
    
    //Lấy giá trị ngày tạo từ file
    br = new BufferedReader(new FileReader(absoluteFilePathUp))

    sCurrentLine

    while ((sCurrentLine = br.readLine()) != null) {
        UDATE = sCurrentLine //Lấy giá trị ngày cập nhật từ file
    }
}
catch (IOException e) {
} 
finally { 
    br.close()
}

WebUI.verifyElementText(findTestObject('TypeOfService/Type of service-02/Page_ODTS System/p_25022019'), CDATE)

WebUI.verifyElementText(findTestObject('TypeOfService/Type of service-02/Page_ODTS System/p_25022019_1'), UDATE)

WebUI.click(findTestObject('TypeOfService/Type of service-02/Page_ODTS System/button_ng'))

WebUI.closeBrowser()

