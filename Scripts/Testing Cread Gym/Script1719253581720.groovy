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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://127.0.0.1:8000/login')

WebUI.setText(findTestObject('Object Repository/Testing create gym/Page_Gym Locator/input_Sign in to start your session_email'), 
    'auliana@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Testing create gym/Page_Gym Locator/input_Sign in to start your session_password'), 
    'dKb2SyvW5nh6MPtSWvU9Aw==')

WebUI.click(findTestObject('Object Repository/Testing create gym/Page_Gym Locator/span_Sign In_fas fa-sign-in-alt'))

WebUI.click(findTestObject('Object Repository/Testing create gym/Page_GYM LOCATOR BANDUNG/a_Data Gym'))

WebUI.click(findTestObject('Object Repository/Testing create gym/Page_GYM LOCATOR BANDUNG/span_Tambah Data'))

WebUI.setText(findTestObject('Object Repository/Testing create gym/Page_AdminLTE/input_Nama Gym_nama_gym'), 'Nature Gym')

WebUI.setText(findTestObject('Object Repository/Testing create gym/Page_AdminLTE/input_Alamat Gym_alamat'), 'Jalan Karimun no 13')

WebUI.setText(findTestObject('Object Repository/Testing create gym/Page_AdminLTE/textarea_Deskripsi Gym_deskripsi_gym'), 
    'Gym uang mengadopsi tema natural')

WebUI.click(findTestObject('Object Repository/Testing create gym/Page_AdminLTE/button_Bullets'))

WebUI.setText(findTestObject('Object Repository/Testing create gym/Page_AdminLTE/input_Nomor Telepon_nomor_telepon'), '02131232122')

WebUI.setText(findTestObject('Object Repository/Testing create gym/Page_AdminLTE/input_Harga Member_harga_member'), '500000')

WebUI.setText(findTestObject('Object Repository/Testing create gym/Page_AdminLTE/input_Harga Visit_harga_visit'), '50000')

WebUI.setText(findTestObject('Object Repository/Testing create gym/Page_AdminLTE/input_Jam Operasional_jam_operasional'), 
    '08.00-23.00')

WebUI.click(findTestObject('Object Repository/Testing create gym/Page_AdminLTE/div_Leaflet'))

WebUI.click(findTestObject('Object Repository/Testing create gym/Page_AdminLTE/div_Leaflet'))

WebUI.click(findTestObject('Object Repository/Testing create gym/Page_AdminLTE/div_Leaflet'))

WebUI.click(findTestObject('Object Repository/Testing create gym/Page_AdminLTE/div_Leaflet_1'))

WebUI.click(findTestObject('Object Repository/Testing create gym/Page_AdminLTE/div_Leaflet_1'))

WebUI.click(findTestObject('Object Repository/Testing create gym/Page_AdminLTE/div_Leaflet_1'))

WebUI.click(findTestObject('Object Repository/Testing create gym/Page_AdminLTE/div_Leaflet_1'))

WebUI.click(findTestObject('Object Repository/Testing create gym/Page_AdminLTE/div_Koordinat LatLng(-6.878121, 107.609526)_15ab87'))

WebUI.click(findTestObject('Object Repository/Testing create gym/Page_AdminLTE/div_Koordinat LatLng(-6.878121, 107.609526)_15ab87'))

WebUI.click(findTestObject('Object Repository/Testing create gym/Page_AdminLTE/div_Koordinat LatLng(-6.878256, 107.60992) Leaflet'))

WebUI.click(findTestObject('Object Repository/Testing create gym/Page_AdminLTE/div_Koordinat LatLng(-6.878387, 107.609868)_af36c9'))

WebUI.click(findTestObject('Object Repository/Testing create gym/Page_AdminLTE/button_Simpan'))

WebUI.closeBrowser()

