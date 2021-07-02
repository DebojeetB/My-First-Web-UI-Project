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

WebUI.navigateToUrl('https://www.google.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/NaukriWebTesting/Page_Google/input__q'), 'naukri')

WebUI.sendKeys(findTestObject('Object Repository/NaukriWebTesting/Page_Google/input__q'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/NaukriWebTesting/Page_naukri - Google Search/div_Naukri.com - Register Now - Indias Larg_1fd2ed'))

WebUI.click(findTestObject('Object Repository/NaukriWebTesting/Page_Register on Naukri.com Apply to Millio_3a6e3e/a_Login'))

WebUI.setText(findTestObject('Object Repository/NaukriWebTesting/Page_Jobseekers Login Search the Best Jobs _9df6bd/input_Email ID  Username_usernameField'), 
    'debojeet.bhattacharya@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/NaukriWebTesting/Page_Jobseekers Login Search the Best Jobs _9df6bd/input_Password_passwordField'), 
    'i0EvKanSSR+UbV0QchggBg==')

WebUI.click(findTestObject('Object Repository/NaukriWebTesting/Page_Jobseekers Login Search the Best Jobs _9df6bd/button_Login'))

WebUI.click(findTestObject('Object Repository/NaukriWebTesting/Page_Home  Mynaukri/div_Recruiters'))

WebUI.switchToWindowTitle('HR Manager - HR Executive - HR Recruiter Consultants - Naukri.com')

WebUI.click(findTestObject('Object Repository/NaukriWebTesting/Page_HR Manager - HR Executive - HR Recruit_9c9bd2/a_Recruiters by Location'))

WebUI.delay(7)

WebUI.switchToWindowTitle('Browse Recruiters by Top Locations - Browse Recruiters in India & International Locations - Naukri.com')

WebUI.click(findTestObject('Object Repository/NaukriWebTesting/Page_Browse Recruiters by Top Locations - B_426aab/a_Recruiters in Mumbai'))

WebUI.delay(7)

WebUI.closeWindowIndex(3)

WebUI.delay(7)

WebUI.switchToWindowTitle('Home | Mynaukri')

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/NaukriWebTesting/Page_Home  Mynaukri/div_Jobs'))

WebUI.delay(7)

WebUI.closeBrowser()

