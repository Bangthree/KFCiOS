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

Mobile.startExistingApplication('com.kfcjv.staging', FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('iOS/Login Page/Welcome Page/loginpage_logo_imgKfclogo'), 3)

Mobile.tap(findTestObject('iOS/Login Page/Welcome Page/loginpage_frgtpassw_button'), 3)

Mobile.waitForElementPresent(findTestObject('iOS/Login Page/Forgot Password Page/frgtpassw_header_btnBack'), 3)

Mobile.verifyElementExist(findTestObject('iOS/Login Page/Forgot Password Page/frgtpassw_header_btnBack'), 3)

Mobile.verifyElementExist(findTestObject('iOS/Login Page/Forgot Password Page/frgtpassw_header_btnNext'), 3)

Mobile.verifyElementExist(findTestObject('iOS/Login Page/Forgot Password Page/frgtpassw_header_btnNext_text_next'), 3)

Mobile.verifyElementExist(findTestObject('iOS/Login Page/Forgot Password Page/frgtpassw_header_placeholder'), 3)

Mobile.verifyElementExist(findTestObject('iOS/Login Page/Forgot Password Page/frgtpassw_header_title_forgotpassword'), 3)

Mobile.verifyElementExist(findTestObject('iOS/Login Page/Forgot Password Page/frgtpassw_imgThreeStripesRed'), 3)

Mobile.verifyElementExist(findTestObject('iOS/Login Page/Forgot Password Page/frgtpassw_logo_desctext_pleaseinput'), 3)

Mobile.verifyElementExist(findTestObject('iOS/Login Page/Forgot Password Page/frgtpassw_logo_imgKfcLogo'), 3)

Mobile.verifyElementExist(findTestObject('iOS/Login Page/Forgot Password Page/frgtpassw_logo_placeholder'), 3)

Mobile.verifyElementExist(findTestObject('iOS/Login Page/Forgot Password Page/frgtpassw_mobnuminput_field_text_mobilenumber'), 
    3)

Mobile.verifyElementExist(findTestObject('iOS/Login Page/Forgot Password Page/frgtpassw_mobnuminput_title_mobilenumber'), 
    3)

Mobile.setText(findTestObject('iOS/Login Page/Forgot Password Page/frgtpassw_mobnuminput_field_text_mobilenumber'), '000000000', 
    0)

Mobile.verifyElementExist(findTestObject('iOS/Login Page/Forgot Password Page/frgtpassw_btnCleartext'), 3)

Mobile.tap(findTestObject('iOS/Login Page/Forgot Password Page/frgtpassw_btnCleartext'), 3)

Mobile.tap(findTestObject('iOS/Login Page/Forgot Password Page/frgtpassw_header_btnNext'), 3)

Mobile.verifyElementExist(findTestObject('iOS/Login Page/Forgot Password Page/frgtpassw_err_descFieldisrequired'), 3)

Mobile.setText(findTestObject('iOS/Login Page/Forgot Password Page/frgtpassw_mobnuminput_field_text_mobilenumber'), '000000000', 
    0)

Mobile.tap(findTestObject('iOS/Login Page/Forgot Password Page/frgtpassw_header_btnNext'), 3)

Mobile.verifyElementExist(findTestObject('iOS/Login Page/Forgot Password Page/frgtpassw_err_descIncorrectphonnum'), 3)

Mobile.tap(findTestObject('iOS/Login Page/Forgot Password Page/frgtpassw_header_btnBack'), 3)

