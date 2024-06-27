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

WebUI.setText(findTestObject('Object Repository/update data gym admin/Page_Gym Locator/input_Sign in to start your session_email'), 
    'auliana@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/update data gym admin/Page_Gym Locator/input_Sign in to start your session_password'), 
    'dKb2SyvW5nh6MPtSWvU9Aw==')

WebUI.click(findTestObject('Object Repository/update data gym admin/Page_Gym Locator/button_Sign In'))

WebUI.click(findTestObject('Object Repository/update data gym admin/Page_GYM LOCATOR BANDUNG/a_Data Gym'))

WebUI.click(findTestObject('Object Repository/update data gym admin/Page_GYM LOCATOR BANDUNG/a_Next'))

WebUI.click(findTestObject('Object Repository/update data gym admin/Page_GYM LOCATOR BANDUNG/a_Edit'))

WebUI.setText(findTestObject('Object Repository/update data gym admin/Page_AdminLTE/input_Alamat Gym_alamat'), 'Jalan karimun no 14')

WebUI.click(findTestObject('Object Repository/update data gym admin/Page_AdminLTE/button_Clear Polygon'))

WebUI.click(findTestObject('Object Repository/update data gym admin/Page_AdminLTE/div_Leaflet'))

WebUI.click(findTestObject('Object Repository/update data gym admin/Page_AdminLTE/div_Leaflet'))

WebUI.click(findTestObject('Object Repository/update data gym admin/Page_AdminLTE/div_Leaflet'))

WebUI.click(findTestObject('Object Repository/update data gym admin/Page_AdminLTE/button_Update'))

WebUI.click(findTestObject('Object Repository/update data gym admin/Page_GYM LOCATOR BANDUNG/a_Next'))

WebUI.closeBrowser()

