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

Mobile.verifyElementExist(findTestObject('iOS/Home Page/home_topbar_btnProfile'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Home Page/home_topbar_btnProfile'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3)

Mobile.comment('Points Section')

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_points_btnHistory_text'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_points_btnHistory_text'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Profile Page/profilepage_points_btnHistory_text'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_points_btnHistory'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_points_btnHistory'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_points_btnRedeem_text'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_points_btnRedeem_text'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Profile Page/profilepage_points_btnRedeem_text'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_points_btnRedeem'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_points_btnRedeem'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_points_desc_dynamicexpire'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_points_desc_dynamicexpire'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Profile Page/profilepage_points_desc_dynamicexpire'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_points_desc_dynamicpoints'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_points_desc_dynamicpoints'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Profile Page/profilepage_points_desc_dynamicpoints'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_points_imgBgPoints'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_points_imgInfoIcon'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_points_title_myKFC'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_points_title_myKFC'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Profile Page/profilepage_points_title_myKFC'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Points section done checking')

