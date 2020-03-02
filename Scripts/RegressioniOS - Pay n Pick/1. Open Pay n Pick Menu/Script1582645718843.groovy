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

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('iOS/Login Page/Welcome Page/loginpage_logo_imgKfclogo'), 2, FailureHandling.OPTIONAL) == 
true) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.callTestCase(findTestCase('b. RegressioniOS - Login/Assist Test/Login Dana'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    println = 'Logged in'
}

Mobile.waitForElementPresent(findTestObject('iOS/Home Page/home_logo_imgKfclogo'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('PNP Page Check Begin')

Mobile.verifyElementExist(findTestObject('iOS/Home Page/home_PNP_btnPNP'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Home Page/home_PNP_btnPNP'), 2, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('iOS/Pay n Pick Page/Camera Permission/PNP_CameraPermission'), 2, FailureHandling.OPTIONAL) == 
true) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('iOS/Pay n Pick Page/Camera Permission/PNP_CameraPermission_btnDontallow'), 
        2, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('iOS/Pay n Pick Page/Camera Permission/PNP_CameraPermission_btnOk'), 2, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('iOS/Pay n Pick Page/Camera Permission/PNP_CameraPermission_desc'), 2, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementExist(findTestObject('iOS/Pay n Pick Page/Camera Permission/PNP_CameraPermission_title'), 2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('iOS/Pay n Pick Page/Camera Permission/PNP_CameraPermission_btnOk'), 2, FailureHandling.STOP_ON_FAILURE)
} else {
    println = 'Camera permission not appear, permission already granted'
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Pay n Pick Page/PNP_bottombar_danainfo_backgroundwhite'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Pay n Pick Page/PNP_bottombar_danainfo_backgroundwhite'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Pay n Pick Page/PNP_bottombar_danainfo_desctext'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Pay n Pick Page/PNP_bottombar_danainfo_desctext'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Pay n Pick Page/PNP_bottombar_danainfo_desctext'), 0)

Mobile.verifyElementExist(findTestObject('iOS/Pay n Pick Page/PNP_header_btnX'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Pay n Pick Page/PNP_header_btnX'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Pay n Pick Page/PNP_imageScanner'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Pay n Pick Page/PNP_info_backgroundwhite'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Pay n Pick Page/PNP_info_backgroundwhite'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Pay n Pick Page/PNP_info_desctext'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Pay n Pick Page/PNP_info_desctext'), 0)

Mobile.verifyElementExist(findTestObject('iOS/Pay n Pick Page/PNP_info_icon'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Pay n Pick Page/PNP_header_btnTurnOn'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Pay n Pick Page/PNP_header_btnTurnOn'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Pay n Pick Page/PNP_header_btnTurnOn_desctext'), 0)

Mobile.tap(findTestObject('iOS/Pay n Pick Page/PNP_header_btnTurnOn'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Pay n Pick Page/PNP_header_btnTurnOff'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Pay n Pick Page/PNP_header_btnTurnOff'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Pay n Pick Page/PNP_header_btnTurnOff_desctext'), 0)

Mobile.tap(findTestObject('iOS/Pay n Pick Page/PNP_header_btnX'), 1, FailureHandling.STOP_ON_FAILURE)

