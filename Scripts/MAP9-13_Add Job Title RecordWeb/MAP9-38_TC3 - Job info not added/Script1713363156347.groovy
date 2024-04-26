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

WebUI.navigateToUrl('https://dikshita-trials712.orangehrmlive.com/auth/seamlessLogin')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input__txtUsername'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input__txtPassword'), 'Xp8G66PC5R7LYltEwI8yqw==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Employee Management/span_HR Administration'))

WebUI.click(findTestObject('Object Repository/Page_HR Administration/span_oxd_menu_down'))

WebUI.click(findTestObject('Object Repository/Page_HR Administration/a_Manage Job Titles'))

WebUI.click(findTestObject('Object Repository/Page_Job/i_add'))

WebUI.setText(findTestObject('Object Repository/Page_Job/input__jobTitleName'), 'Sftd1234')

WebUI.setText(findTestObject('Object Repository/Page_Job/textarea_Job Description_jobDescription'), 'needs to develop the code for the website')

WebUI.setText(findTestObject('Object Repository/Page_Job/textarea_Note_note'), 'demo SD role')

WebUI.click(findTestObject('Page_Job/Page_Job/button_CancelAddJob'))

WebUI.closeBrowser()

