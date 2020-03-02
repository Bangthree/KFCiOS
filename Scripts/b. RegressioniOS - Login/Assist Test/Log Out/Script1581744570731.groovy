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

Mobile.tap(findTestObject('iOS/Home Page/home_topbar_btnProfile'), 2)

Mobile.scrollToText('Log Out', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Profile Page/profilepage_logout_btnLogout'), 1)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/Logout Confirmation/profilepage_logoutconf_desc'), 1)

Mobile.tap(findTestObject('iOS/Profile Page/Logout Confirmation/profilepage_logoutconf_btnOk'), 1)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Login Page/Welcome Page/loginpage_header_titletext_welcome'), 1)

