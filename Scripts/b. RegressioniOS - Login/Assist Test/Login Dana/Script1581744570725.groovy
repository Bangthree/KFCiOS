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

Mobile.waitForElementPresent(findTestObject('iOS/Login Page/Welcome Page/loginpage_btnLogin_bgRed'), 3)

Mobile.comment('Login USER 085643628232')

Mobile.setText(findTestObject('iOS/Login Page/Welcome Page/loginpage_phonenum_textfield'), '085643628232', 1)

Mobile.setText(findTestObject('iOS/Login Page/Welcome Page/loginpage_passw_textfield'), '111111', 0)

Mobile.tap(findTestObject('iOS/Login Page/Welcome Page/loginpage_btnLogin_bgRed'), 2)

Mobile.comment('Redirect to DANA LOGIN PAGE')

Mobile.comment('DANA PIN INPUT, Please input MANUALLY or WAIT to input automatically')

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('iOS/Login Page/Login to DANA Page/logtodana_desc_enteryour'), 2, FailureHandling.OPTIONAL) == 
true) {
    Mobile.delay(2)

    Mobile.tap(findTestObject('iOS/Login Page/Login to DANA Page/TypeKey - 2'), 1, FailureHandling.OPTIONAL)

    Mobile.tap(findTestObject('iOS/Login Page/Login to DANA Page/TypeKey - 5'), 1, FailureHandling.OPTIONAL)

    Mobile.tap(findTestObject('iOS/Login Page/Login to DANA Page/TypeKey - 8'), 1, FailureHandling.OPTIONAL)

    Mobile.tap(findTestObject('iOS/Login Page/Login to DANA Page/TypeKey - 0'), 1, FailureHandling.OPTIONAL)

    Mobile.tap(findTestObject('iOS/Login Page/Login to DANA Page/TypeKey - 0'), 1, FailureHandling.OPTIONAL)

    Mobile.tap(findTestObject('iOS/Login Page/Login to DANA Page/TypeKey - 7'), 1, FailureHandling.OPTIONAL)
} else if (Mobile.verifyElementExist(findTestObject('iOS/Login Page/Login to DANA Page/logtodana_errorfound'), 2, FailureHandling.OPTIONAL) == 
true) {
    Mobile.takeScreenshot('Error Found during DANA LOGIN', FailureHandling.STOP_ON_FAILURE)
} else {
    println = 'Homepage ready'
}

