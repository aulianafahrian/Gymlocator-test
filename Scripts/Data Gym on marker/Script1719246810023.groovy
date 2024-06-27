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

WebUI.navigateToUrl('http://127.0.0.1:8000/')

WebUI.click(findTestObject('Object Repository/Data on Marker/Page_Gym Locator Bandung/a_Find Gym'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Data on Marker/Page_Gym Locator Bandung/span_'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Data on Marker/Page_Gym Locator Bandung/img_Detail_leaflet-marker-icon leaflet-zoom_b2eb43'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Data on Marker/Page_Gym Locator Bandung/div_Gym Festival CityLinkJalan CitylinkJam _560130'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Data on Marker/Page_Gym Locator Bandung/svg_Detail_bi bi-x-circle'))

WebUI.delay(5)

WebUI.closeBrowser()

