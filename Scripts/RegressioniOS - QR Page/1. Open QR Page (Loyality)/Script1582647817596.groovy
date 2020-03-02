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

Mobile.comment('Earn Page Components check started')

if (Mobile.verifyElementExist(findTestObject('iOS/Login Page/Relogin Alert/reloginalert_alerttype'), 2, FailureHandling.OPTIONAL) == 
true) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('b. RegressioniOS - Login/Assist Test/Session Time Out Reset'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    println = 'Session is new'
}

if (Mobile.verifyElementExist(findTestObject('iOS/Login Page/Welcome Page/loginpage_header_titletext_welcome'), 2, FailureHandling.OPTIONAL) == 
true) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('b. RegressioniOS - Login/Assist Test/Login Dana'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    println = 'Logged in, Homepage ready'
}

Mobile.verifyElementExist(findTestObject('iOS/Home Page/home_bottombar_btnHome'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Home Page/home_bottombar_btnEarn'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Earn Page/earn_QR_imgKFCRoundRed'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Earn Page/earn_bottombar_btnEarn'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Earn Page/earn_bottombar_btnEarn'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Earn Page/earn_bottombar_btnHome'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Earn Page/earn_bottombar_btnHome'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Earn Page/earn_bottombar_btnVoucher'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Earn Page/earn_bottombar_btnVoucher'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Earn Page/earn_dismissableinfo'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Earn Page/earn_dismissableinfo'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Earn Page/earn_dismissableinfo_btnX'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Earn Page/earn_dismissableinfo_btnX'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Earn Page/earn_dismissableinfo_desc_showthis'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Earn Page/earn_dismissableinfo_desc_showthis'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Earn Page/earn_dismissableinfo_desc_showthis'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Earn Page/earn_dismissableinfo_imgScanning'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Earn Page/earn_QR_desctext_youwill'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Earn Page/earn_QR_desctext_youwill'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Earn Page/earn_QR_desctext_youwill'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Earn Page/earn_QR_imgQRBlackandWhite'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Earn Page/earn_QR_title_earnKFCPoints'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Earn Page/earn_QR_title_earnKFCPoints'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Earn Page/earn_QR_title_earnKFCPoints'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Earn Page/earn_topbar_title_earn'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Earn Page/earn_topbar_title_earn'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Earn Page/earn_topbar_title_earn'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Earn Page/earn_bottombar_btnHome'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Earn Page Components check finished')

