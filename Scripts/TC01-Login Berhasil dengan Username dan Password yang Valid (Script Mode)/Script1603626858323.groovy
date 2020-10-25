import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'Membuka Browser'
WebUI.openBrowser('')

'Navigasi Ke Halaman Web Yang Di tuju'
WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

'Maksimalkan Layar Browser'
WebUI.maximizeWindow()

'Masukkan Username Valid'
WebUI.setText( findTestObject('Object Repository/OrangeHRM - Object/Page_OrangeHRM/input_LOGIN Panel_txtUsername'),'Admin' )

'Masukkan Password Valid'
WebUI.setText( findTestObject('Object Repository/OrangeHRM - Object/Page_OrangeHRM/input_Username_txtPassword'), 'admin123' )

'Tekan Tombol Login'
WebUI.click(findTestObject('Object Repository/OrangeHRM - Object/Page_OrangeHRM/input_Password_Submit'))

'Tekan Tombol Welcome Paul'
WebUI.click( findTestObject('Object Repository/OrangeHRM - Object/Page_OrangeHRM/a_Welcome Paul') )

'Tekan Tombol Logout'
WebUI.click(findTestObject('Object Repository/OrangeHRM - Object/Page_OrangeHRM/a_Logout') )

'Menunggu 2 Detik Sampai Halaman Web Menutup'
WebUI.delay(2)

'Menutup Browser'
WebUI.closeBrowser()