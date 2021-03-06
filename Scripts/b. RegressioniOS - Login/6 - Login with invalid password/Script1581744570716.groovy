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

Mobile.clearText(findTestObject('iOS/Login Page/Welcome Page/loginpage_phonenum_textfield'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('iOS/Login Page/Welcome Page/loginpage_phonenum_textfield'), '085643628232', 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('iOS/Login Page/Welcome Page/loginpage_passw_textfield'), 'hellobaby', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Login Page/Welcome Page/loginpage_btnLogin_bgRed'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('iOS/Login Page/Error Handling Pop Up and Red Text/errhandl_unmatchpassw_redText'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Login Page/Error Handling Pop Up and Red Text/errhandl_unmatchpassw_redText'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Login Page/Error Handling Pop Up and Red Text/errhandl_unmatchpassw_redText'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.clearText(findTestObject('iOS/Login Page/Welcome Page/loginpage_passw_textfield'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementNotExist(findTestObject('iOS/Login Page/Error Handling Pop Up and Red Text/errhandl_unmatchpassw_redText'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.clearText(findTestObject('iOS/Login Page/Welcome Page/loginpage_phonenum_textfield'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementNotExist(findTestObject('iOS/Login Page/Error Handling Pop Up and Red Text/errhandl_unmatchpassw_redText'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

