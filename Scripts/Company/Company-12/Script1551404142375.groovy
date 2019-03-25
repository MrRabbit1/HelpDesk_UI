import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat

import org.junit.After

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
WebUI.openBrowser('')

WebUI.navigateToUrl('http://helpdesk.wisky.vn/')

WebUI.setText(findTestObject('Company/Company-12/Page_ODTS System/input_ODTS_username'), 'admin01')

WebUI.setEncryptedText(findTestObject('Company/Company-12/Page_ODTS System/input_ODTS_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Company/Company-12/Page_ODTS System/button_ng Nhp'))

WebUI.click(findTestObject('Company/Company-12/Page_ODTS System/span_Cng Ty'))

WebUI.click(findTestObject('Company/Company-12/Page_ODTS System/a_Xem Chi Nhnh'))

WebUI.click(findTestObject('Company/Company-12/Page_ODTS System/a_Xem Thit b'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-12/Page_ODTS System/fieldSearch'))

WebUI.setText(findTestObject('Company/Company-12/Page_ODTS System/input'), 'anhtest')

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-12/Page_ODTS System/button_hihi_btn btn-warning fa'))

WebUI.waitForAlert(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Company/Company-12/Page_ODTS System/select_--Chn loi thit b--Access PointCameraPos My In BillMn HnhRouterFingerThit B in Lnhn Trong NhSwitch')
	, "4", true)

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Company/Company-12/Page_ODTS System/input_Tn Thit B_dvNameE'), 'anhtest22')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Company/Company-12/Page_ODTS System/input_Code_dvCodeE'), 'hihi22')

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-12/Page_ODTS System/input_Ngy Bo Hnh_dvGDateE'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-12/Page_ODTS System/chonNgayBaoHanh'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-12/Page_ODTS System/chonNgayBaoHanh2'))

WebUI.click(findTestObject('Company/Company-12/Page_ODTS System/td_4'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-12/Page_ODTS System/input_Hn Bo Hnh_dvGEndDateE'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-12/Page_ODTS System/chonNgayBaoHanh'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-12/Page_ODTS System/chonHanBaoHanh'))

WebUI.click(findTestObject('Company/Company-12/Page_ODTS System/td_10'))

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Company/Company-12/Page_ODTS System/input_Ip_dvIpE'), '192.168.1.2')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Company/Company-12/Page_ODTS System/input_Port_dvPortE'), '80')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Company/Company-12/Page_ODTS System/input_Device Account_dvAccE'), 'anh22')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Company/Company-12/Page_ODTS System/input_Device Password_dvPassE'), '12322')

WebUI.waitForAlert(1)

WebUI.setText(findTestObject('Company/Company-12/Page_ODTS System/input_Thng Tin_dvOtherE'), 'testdevice22')

WebUI.waitForAlert(1)

def UDATE = new SimpleDateFormat('dd/MM/yyyy').format(Calendar.getInstance().getTime())
//Lấy giá trị ngày cập nhật theo format dd/MM/yyyy

WebUI.click(findTestObject('Company/Company-12/Page_ODTS System/button_Cp Nht'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-12/Page_ODTS System/button_OK'))

WebUI.waitForAlert(1)

WebUI.click(findTestObject('Company/Company-12/Page_ODTS System/button_hihi22_btn btn-info fa'))

WebUI.waitForAlert(1)

WebUI.verifyElementText(findTestObject('Company/Company-12/Page_ODTS System/p_anhtest22'), 'anhtest22')

WebUI.verifyElementText(findTestObject('Company/Company-12/Page_ODTS System/p_Camera'), 'Pos')

WebUI.verifyElementText(findTestObject('Company/Company-12/Page_ODTS System/p_hihi22'), 'hihi22')

WebUI.verifyElementText(findTestObject('Company/Company-12/Page_ODTS System/p_04022019'), '04/02/2019')

WebUI.verifyElementText(findTestObject('Company/Company-12/Page_ODTS System/p_10042019'), '10/04/2019')

WebUI.verifyElementText(findTestObject('Company/Company-12/Page_ODTS System/p_192.168.1.2'), '192.168.1.2')

WebUI.verifyElementText(findTestObject('Company/Company-12/Page_ODTS System/p_80'), '80')

WebUI.verifyElementText(findTestObject('Company/Company-12/Page_ODTS System/p_anh22'), 'anh22')

WebUI.verifyElementText(findTestObject('Company/Company-12/Page_ODTS System/p_12322'), '12322')

WebUI.verifyElementText(findTestObject('Company/Company-12/Page_ODTS System/p_20022019'), '20/02/2019')

WebUI.verifyElementText(findTestObject('Company/Company-12/Page_ODTS System/p_22022019'), UDATE)

WebUI.verifyElementText(findTestObject('Company/Company-12/Page_ODTS System/p_testdevice22'), 'testdevice22')

WebUI.click(findTestObject('Company/Company-12/Page_ODTS System/button_ng'))

WebUI.closeBrowser()

