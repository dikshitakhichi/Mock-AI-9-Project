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

randomText = CustomKeywords.'job.title.RandomString.createRandomString'()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dikshita-trials712.orangehrmlive.com/auth/seamlessLogin')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input__txtUsername'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input__txtPassword'), 'Xp8G66PC5R7LYltEwI8yqw==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Employee Management/a_pathfill64728cHR Administration'))

WebUI.click(findTestObject('Object Repository/Page_HR Administration/a_Job oxd_menu_down'))

WebUI.click(findTestObject('Object Repository/Page_HR Administration/a_Manage Job Titles'))

WebUI.click(findTestObject('Object Repository/Page_Job/i_add'))

WebUI.setText(findTestObject('Object Repository/Page_Job/input__jobTitleName'), 'Business Analyst')

WebUI.setText(findTestObject('Object Repository/Page_Job/textarea_Job Description_jobDescription'), 'responsible for developing reqs')

WebUI.setText(findTestObject('Object Repository/Page_Job/textarea_Note_note'), 'demo')

WebUI.click(findTestObject('Object Repository/Page_Job/button_'))

WebUI.click(findTestObject('Object Repository/Page_Job/i_add'))

WebUI.setText(findTestObject('Object Repository/Page_Job/input__jobTitleName'), 'BA11')

WebUI.setText(findTestObject('Object Repository/Page_Job/textarea_Job Description_jobDescription'), 'Responsible for developing software requirements')

WebUI.setText(findTestObject('Object Repository/Page_Job/textarea_Note_note'), 'demo2')

WebUI.click(findTestObject('Object Repository/Page_Job/button_Save'))

WebUI.verifyElementText(findTestObject('Page_Job/span_business analystTest2'), 'BA11')

WebUI.click(findTestObject('Object Repository/Page_Job/i_add'))

WebUI.setText(findTestObject('Object Repository/Page_Job/input__jobTitleName'), 'BA22')

WebUI.setText(findTestObject('Object Repository/Page_Job/textarea_Job Description_jobDescription'), 'requirements')

WebUI.setText(findTestObject('Object Repository/Page_Job/textarea_Note_note'), 'demo business analyst role')

WebUI.click(findTestObject('Object Repository/Page_Job/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Job/span_business analyst4'), 'BA22')

WebUI.closeBrowser()

