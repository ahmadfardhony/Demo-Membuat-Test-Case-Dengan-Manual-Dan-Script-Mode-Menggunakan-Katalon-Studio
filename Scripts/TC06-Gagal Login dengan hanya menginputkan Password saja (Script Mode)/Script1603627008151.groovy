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

'Navigasi Ke Halaman Web Yang Dituju'
WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

'Maksimalkan Layar Browser'
WebUI.maximizeWindow()

'Tidak Memasukkan Username'
WebUI.setText(findTestObject('OrangeHRM - Object/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), '')

'Masukkan valid Password'
WebUI.setText(findTestObject('OrangeHRM - Object/Page_OrangeHRM/input_Username_txtPassword'), 'admin123')

'Tekan Tombol Login'
WebUI.click(findTestObject('OrangeHRM - Object/Page_OrangeHRM/input_Password_Submit'))

'Verifikasi Teks Error Message Yang Muncul'
WebUI.verifyTextPresent('Username cannot be empty', false)

'Menunggu 2 Detik Sampai Halam Web Menutup'
WebUI.delay(2)

'Menutup Browser'
WebUI.closeBrowser()
