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

Mobile.comment('Empty Phone Number and Password')

Mobile.clearText(findTestObject('iOS/Login Page/Welcome Page/loginpage_phonenum_textfield'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.clearText(findTestObject('iOS/Login Page/Welcome Page/loginpage_passw_textfield'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Login Page/Welcome Page/loginpage_btnLogin_bgRed'), 2)

Mobile.comment('Check Error Messages - Empty field')

Mobile.verifyElementExist(findTestObject('iOS/Login Page/Error Handling Pop Up and Red Text/errhandl_general_title_error'), 
    1)

Mobile.verifyElementExist(findTestObject('iOS/Login Page/Error Handling Pop Up and Red Text/errhandl_reqfield_desc_pleasefillin'), 
    1)

Mobile.verifyElementText(findTestObject('iOS/Login Page/Error Handling Pop Up and Red Text/errhandl_reqfield_desc_pleasefillin'), 
    'Please fill in all of the required fields')

Mobile.verifyElementExist(findTestObject('iOS/Login Page/Error Handling Pop Up and Red Text/errhandl_general_btnOk'), 1)

Mobile.tap(findTestObject('iOS/Login Page/Error Handling Pop Up and Red Text/errhandl_general_btnOk'), 2)

