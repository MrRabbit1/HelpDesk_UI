import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://helpdesk.wisky.vn/')

WebUI.setText(findTestObject('Object Repository/Company/company14/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('Object Repository/Company/company14/Page_ODTS System/input_ODTS_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Company/company14/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('Object Repository/Company/company14/Page_ODTS System/a_Cng Ty'))

WebUI.click(findTestObject('Object Repository/Company/company14/Page_ODTS System/a_Xem Hp ng'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/Company/company14/Page_ODTS System/button_To Hp ng'))

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Object Repository/Company/company14/Page_ODTS System/input_M T Hp ng_conNameCreate'), 'anhtest')

WebUI.click(findTestObject('Object Repository/Company/company14/Page_ODTS System/ul_Dch V ng K_select2-selectio'))

WebUI.setText(findTestObject('Object Repository/Company/company14/Page_ODTS System/input_Dch V ng K_select2-searc'), 'WIFI')

WebUI.sendKeys(findTestObject('Object Repository/Company/company14/Page_ODTS System/input_Dch V ng K_select2-searc'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Company/company14/Page_ODTS System/input_Ngy Bt u_createDate'))

WebUI.click(findTestObject('Object Repository/Company/company14/Page_ODTS System/th_February 2019'))

WebUI.click(findTestObject('Object Repository/Company/company14/Page_ODTS System/span_Feb'))

WebUI.click(findTestObject('Object Repository/Company/company14/Page_ODTS System/td_5'))

WebUI.click(findTestObject('Object Repository/Company/company14/Page_ODTS System/input_Ngy Kt Thc_endDate'))

WebUI.click(findTestObject('Object Repository/Company/company14/Page_ODTS System/th_February 2019'))

WebUI.click(findTestObject('Object Repository/Company/company14/Page_ODTS System/span_Apr'))

WebUI.click(findTestObject('Object Repository/Company/company14/Page_ODTS System/td_25'))

WebUI.setText(findTestObject('Object Repository/Company/company14/Page_ODTS System/input_Gi Hp ng_price'), '200')

WebUI.click(findTestObject('Object Repository/Company/company14/Page_ODTS System/button_To Mi'))

def CDATE = new SimpleDateFormat('dd/MM/yyyy').format(Calendar.getInstance().getTime())

Writer writer = null;

try {
	writer = new BufferedWriter(new OutputStreamWriter(
		  new FileOutputStream("C:\\Users\\pc\\Katalon Studio\\Helpdesk\\creDateContract.txt"), "utf-8"));
	writer.write(CDATE);
} catch (IOException ex) {
	// Report
} finally {
   try {writer.close();} catch (Exception ex) {/*ignore*/}
}

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/Company/company14/Page_ODTS System/button_OK'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Object Repository/Company/company14/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('Object Repository/Company/company14/Page_ODTS System/input'), '25/04/2019')

WebUI.verifyElementText(findTestObject('Object Repository/Company/company14/Page_ODTS System/td_Passio'), 'Passio')

WebUI.verifyElementText(findTestObject('Object Repository/Company/company14/Page_ODTS System/td_05022019'), '05/02/2019')

WebUI.verifyElementText(findTestObject('Object Repository/Company/company14/Page_ODTS System/td_25042019'), '25/04/2019')

WebUI.verifyElementText(findTestObject('Object Repository/Company/company14/Page_ODTS System/td_200'), '200')

def EXPIREDDATE = WebUI.getText(findTestObject('Object Repository/Company/company14/Page_ODTS System/td_25042019'))

if (EXPIREDDATE.compareTo(CDATE) >= 0) {
	WebUI.verifyElementText(findTestObject('Object Repository/Company/company14/Page_ODTS System/span_Cn Hn Hp ng'), 'Còn Hạn Hợp Đồng')
} else {
	WebUI.verifyElementText(findTestObject('Object Repository/Company/company14/Page_ODTS System/span_Cn Hn Hp ng'), 'Đã hết hạn hợp đồng')
}

WebUI.closeBrowser()

