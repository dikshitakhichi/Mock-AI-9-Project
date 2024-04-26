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

WebUI.click(findTestObject('Object Repository/Page_HR Administration/a_Job oxd_menu_down'))

WebUI.click(findTestObject('Object Repository/Page_HR Administration/a_Manage Job Titles'))

WebUI.click(findTestObject('Object Repository/Page_Job/i_add'))

WebUI.setText(findTestObject('Object Repository/Page_Job/input__jobTitleName'), 'fhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhsddgdtwutoyknfjfgstwshryfbcnhgjitytkkkkkkkgggggggggggggggggggggkTTkkfffff')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Job/span_Should not exceed 100 characters'), 'Should not exceed 100 characters')

WebUI.setText(findTestObject('Object Repository/Page_Job/textarea_Job Description_jobDescription'), 'fhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhsddgdtwutoyknfjfgstwshryfbcnhgjitytkkkkkkkgggggggggggggggggggggkkkfffffhghggnbtgjgjgvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvyyyyyyyyyyyyrutljowuagdjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjgggggggggggggggggggggggggnnnnnnnnnnnnnnnccctteeeeeeeeeeeejggggggggggggggggggggggggggooohnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnssssssssregdfjhfgjgjgjj')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Job/span_Should not exceed 400 characters'), 'Should not exceed 400 characters')

WebUI.setText(findTestObject('Object Repository/Page_Job/textarea_Note_note'), 'fhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhsddgdtwutoyknfjfgstwshryfbcnhgjitytkkkkkkkgggggggggggggggggggggkkkfffffhgggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggvnbknnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnlkoupuyotiuryudtsdraesfdgfgfhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhvbfyetwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwugjhhhhhhhhhhhhhhhhhhhhhh')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Job/span_Should not exceed 400 characters'), 'Should not exceed 400 characters')

WebUI.click(findTestObject('Page_Job/Page_Job/button_CancelMaxLength'))

WebUI.click(findTestObject('Object Repository/Page_Job/i_add'))

WebUI.setText(findTestObject('Object Repository/Page_Job/input__jobTitleName'), '14354675878$$$$$@@%11')

WebUI.setText(findTestObject('Object Repository/Page_Job/textarea_Job Description_jobDescription'), 'software dev')

WebUI.setText(findTestObject('Object Repository/Page_Job/textarea_Note_note'), 'test numbers, special characters in title')

WebUI.click(findTestObject('Object Repository/Page_Job/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Job/span_14354675878'), '14354675878$$$$$@@%11')

WebUI.click(findTestObject('Object Repository/Page_Job/i_add'))

WebUI.setText(findTestObject('Object Repository/Page_Job/input__jobTitleName'), 'Vice President - US')

WebUI.setText(findTestObject('Object Repository/Page_Job/textarea_Job Description_jobDescription'), '163564575847366##$$@')

WebUI.setText(findTestObject('Object Repository/Page_Job/textarea_Note_note'), 'test special characters in desc')

WebUI.click(findTestObject('Object Repository/Page_Job/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Job/span_163564575847366'), '163564575847366##$$@')

WebUI.click(findTestObject('Object Repository/Page_Job/i_add'))

WebUI.setText(findTestObject('Object Repository/Page_Job/input__jobTitleName'), 'VP- SP')

WebUI.setText(findTestObject('Object Repository/Page_Job/textarea_Job Description_jobDescription'), 'VP')

WebUI.setText(findTestObject('Object Repository/Page_Job/textarea_Note_note'), '15354475856758598$#@%^&*()')

WebUI.click(findTestObject('Object Repository/Page_Job/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Job/i_ohrm_edit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Job/textarea_Note_note'), '')

WebUI.click(findTestObject('Object Repository/Page_Job/button_'))

WebUI.click(findTestObject('Object Repository/Page_Job/i_add'))

WebUI.setText(findTestObject('Object Repository/Page_Job/input__jobTitleName'), 'VP - SPA')

WebUI.setText(findTestObject('Object Repository/Page_Job/textarea_Job Description_jobDescription'), 'VP')

WebUI.setText(findTestObject('Object Repository/Page_Job/textarea_Note_note'), 'TEST NO ATTACHMENT FILE')

WebUI.click(findTestObject('Object Repository/Page_Job/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Job/span_VP - US'), 'VP - SPA')

WebUI.click(findTestObject('Object Repository/Page_Job/i_ohrm_edit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Job/input_(Accepts up to 5MB)_jobSpecification'), '')

WebUI.click(findTestObject('Object Repository/Page_Job/button_'))

WebUI.closeBrowser()

