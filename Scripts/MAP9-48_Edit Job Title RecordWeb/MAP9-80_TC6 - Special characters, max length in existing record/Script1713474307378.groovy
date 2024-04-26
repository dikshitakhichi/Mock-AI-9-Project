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

WebUI.click(findTestObject('Object Repository/Page_Job/td_ohrm_edit'))

WebUI.setText(findTestObject('Object Repository/Page_Job/input__jobTitleName'), 'eCVV920jhfnhvkjdnvkjdvnldjjvljgkrgngvjknfdvknjnkdnkjcnvksdjffjjjjjjjjjjjjjjkdkdkdjgnghtirkidmdnfngjgitttt')

WebUI.setText(findTestObject('Object Repository/Page_Job/textarea_Job Description_jobDescription'), 'Responsible for developiggjhgsgsgshhjhxjhxjxiucyctctxtxgtgxggxggggggggggggggggggggxxhhhcnvvvvvvbcisapaosjjjjjjjjjjjjjjjjjjjjjjjjjjckckkkkkkkkkkkkkkxkmmmjjjssssssssssssssssssssssssssssssssssqqqqqqqqqqqqqqqqqaaaaaaaaaaaatttttttzzzzggggggggggccccccccccccccchhhhhhh nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnncccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccng software requirements')

WebUI.setText(findTestObject('Object Repository/Page_Job/textarea_Note_note'), 'demo2fffffffffffffffffffffffffffffffffffffffdddddddddddddddddddddddrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrreeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeddddddddddddddddddddddddssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuhhhhhhhhhhhhhhhhhhhhggggggggggbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnm')

WebUI.click(findTestObject('Object Repository/Page_Job/button_'))

WebUI.click(findTestObject('Object Repository/Page_Job/td_ohrm_edit'))

WebUI.setText(findTestObject('Object Repository/Page_Job/input__jobTitleName'), 'eCVV920445356785&&#21111')

WebUI.click(findTestObject('Page_Job/Page_Job/button_SaveEditJobMaxLength'))

WebUI.click(findTestObject('Object Repository/Page_Job/td_ohrm_edit'))

WebUI.setText(findTestObject('Object Repository/Page_Job/textarea_Job Description_jobDescription'), 'Responsible for developing software requirements1223456567755ffd5%%@@@@@44')

WebUI.click(findTestObject('Object Repository/Page_Job/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Job/td_ohrm_edit'))

WebUI.setText(findTestObject('Object Repository/Page_Job/textarea_Note_note'), 'demo2ffghhffr55555677889899@@%%&***55')

WebUI.click(findTestObject('Object Repository/Page_Job/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Job/td_ohrm_edit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Job/textarea_Note_note'), '')

WebUI.closeBrowser()

