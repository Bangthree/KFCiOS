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

Mobile.delay(2)

Mobile.setText(findTestObject('iOS/Register/Password Page/passw_typepassw_field_text_typepassword'), 'Hello', 1)

Mobile.setText(findTestObject('iOS/Register/Password Page/passw_retypepassw_field_text_typepassword'), 'Hello', 1)

Mobile.tap(findTestObject('iOS/Register/Password Page/passw_header_btnNext'), 3)

Mobile.waitForElementPresent(findTestObject('iOS/Register/Error Handling Pop Up and Red Text/Password/errhandl_less6char_alerttype'), 
    3)

Mobile.verifyElementExist(findTestObject('iOS/Register/Error Handling Pop Up and Red Text/Password/errhandl_less6char_btnOk'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Register/Error Handling Pop Up and Red Text/Password/errhandl_less6char_title'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Register/Error Handling Pop Up and Red Text/Password/errhandl_less6char_desc'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('iOS/Register/Error Handling Pop Up and Red Text/Password/errhandl_less6char_desc'), 
    'Password should be at least 6 characters', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Register/Error Handling Pop Up and Red Text/Password/errhandl_less6char_btnOk'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('iOS/Register/Password Page/passw_typepassw_field_text_typepassword'), '', 1)

Mobile.setText(findTestObject('iOS/Register/Password Page/passw_retypepassw_field_text_typepassword'), '', 1)

Mobile.tap(findTestObject('iOS/Register/Password Page/passw_header_btnNext'), 3)

Mobile.waitForElementPresent(findTestObject('iOS/Register/Error Handling Pop Up and Red Text/Password/errhandl_reqfield_title_error'), 
    3)

Mobile.verifyElementExist(findTestObject('iOS/Register/Error Handling Pop Up and Red Text/Password/errhandl_reqfield_title_error'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Register/Error Handling Pop Up and Red Text/Password/errhandl_reqfield_desc_pleasefill'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('iOS/Register/Error Handling Pop Up and Red Text/Password/errhandl_reqfield_desc_pleasefill'), 
    'Please fill in all of the required fields', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Register/Error Handling Pop Up and Red Text/Password/errhandl_reqfield_btnOk'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Register/Error Handling Pop Up and Red Text/Password/errhandl_reqfield_btnOk'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Error Handling on Password Done, Next Edit the User Profile')

