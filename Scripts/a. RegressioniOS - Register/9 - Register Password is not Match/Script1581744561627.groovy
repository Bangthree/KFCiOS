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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

Mobile.delay(2)

Mobile.startExistingApplication('com.kfcjv.staging', FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('iOS/Login Page/Welcome Page/loginpage_register_button'), 3)

Mobile.tap(findTestObject('iOS/Login Page/Welcome Page/loginpage_register_button'), 3)

Mobile.waitForElementPresent(findTestObject('iOS/Register/Join Us Page/joinus_header_title_joinus'), 3)

Mobile.setText(findTestObject('iOS/Register/Join Us Page/joinus_fullname_field_text_typeyour'), 'Automate' + RandomStringUtils.randomNumeric(
        3), 2)

Mobile.setText(findTestObject('iOS/Register/Join Us Page/joinus_mobilenum_field_text_mobilenumber'), '0858230' + RandomStringUtils.randomNumeric(
        6), 2)

Mobile.tap(findTestObject('iOS/Register/Join Us Page/joinus_header_btnNext'), 3)

Mobile.waitForElementPresent(findTestObject('iOS/Register/Password Page/passw_logo_imgKfcLogo'), 3)

Mobile.verifyElementExist(findTestObject('iOS/Register/Password Page/passw_imgThreeStripesRed'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Register/Password Page/passw_logo_desctext_createyour'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Register/Password Page/passw_header_btnNext'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Register/Password Page/passw_header_btnBack'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Register/Password Page/passw_header_btnNext_text_next'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Register/Password Page/passw_header_title_password'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Register/Password Page/passw_retypepassw_btnShow_enabled'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Register/Password Page/passw_retypepassw_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Register/Password Page/passw_typepassw_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Register/Password Page/passw_header_title_password'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Register/Password Page/passw_retypepassw_btnShow_enabled'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Register/Password Page/passw_retypepassw_field_text_typepassword'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Register/Password Page/passw_typepassw_btnShow_enabled'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Register/Password Page/passw_typepassw_field_text_typepassword'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('iOS/Register/Password Page/passw_typepassw_field_text_typepassword'), RandomStringUtils.randomAlphabetic(
        6), 1)

Mobile.setText(findTestObject('iOS/Register/Password Page/passw_retypepassw_field_text_typepassword'), RandomStringUtils.randomAlphabetic(
        6), 1)

Mobile.tap(findTestObject('iOS/Register/Password Page/passw_header_btnNext'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('iOS/Register/Error Handling Pop Up and Red Text/Password/errhandl_notmatchorless6char_title_error'), 
    3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Register/Error Handling Pop Up and Red Text/Password/errhandl_notmatchorless6char_title_error'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Register/Error Handling Pop Up and Red Text/Password/errhandl_notmatch_desc_thepassword'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('iOS/Register/Error Handling Pop Up and Red Text/Password/errhandl_notmatch_desc_thepassword'), 
    'The password you type does not match', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Register/Error Handling Pop Up and Red Text/Password/errhandl_notmatchorless6char_btnOk'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Register/Error Handling Pop Up and Red Text/Password/errhandl_notmatchorless6char_btnOk'), 
    1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Register/Error Handling Pop Up and Red Text/Password/errhandl_notmatch_redText_Oops'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Register/Error Handling Pop Up and Red Text/Password/errhandl_notmatch_redText_Oops'), 
    1, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Register Password Done, Next password less than 6')

