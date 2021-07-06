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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.naukri.com/')

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Object Repository/Naukri_Mouse Over/Page_Jobs - Recruitment - Job Search - Empl_eadd87/div_Jobs'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Naukri_Mouse Over/Page_Jobs - Recruitment - Job Search - Empl_eadd87/a_Search Jobs'))

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Object Repository/Naukri_Mouse Over/Page_Jobs - Recruitment - Job Search - Empl_eadd87/div_Recruiters'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Naukri_Mouse Over/Page_Jobs - Recruitment - Job Search - Empl_eadd87/a_Browse All Recruiters'))

WebUI.delay(3)

WebUI.switchToWindowTitle('Browse Recruiters by Locations, Companies, FA & Industries - Naukri.com')

WebUI.click(findTestObject('Object Repository/Naukri_Mouse Over/Page_Browse Recruiters by Locations, Compan_099479/span_Recruiters in Mumbai_mum'))

WebUI.delay(3)

not_run: WebUI.closeWindowIndex(2)

not_run: WebUI.switchToWindowIndex(2)

WebUI.click(findTestObject('Object Repository/Naukri_Mouse Over/Page_Browse Recruiters by Locations, Compan_099479/a_Recruiters by Category'))

WebUI.delay(3)

WebUI.closeWindowIndex(3)

WebUI.delay(3)

WebUI.switchToWindowTitle('Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com')

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Object Repository/Naukri_Mouse Over/Page_Jobs - Recruitment - Job Search - Empl_eadd87/div_For Employers'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Naukri_Mouse Over/Page_Jobs - Recruitment - Job Search - Empl_eadd87/a_Employer Login'))

WebUI.delay(2)

WebUI.closeBrowser()

