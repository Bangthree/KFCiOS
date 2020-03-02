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

Mobile.verifyElementExist(findTestObject('iOS/Home Page/home_bottombar_btnHome'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page/home_bottombar_btnHome'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Home Page/home_bottombar_btnHome'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Home Page/home_bottombar_btnEarn'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Earn Page/earn_QR_imgKFCRoundRed'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page/home_bottombar_btnEarn'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page/home_bottombar_btnEarn'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Home Page/home_bottombar_btnEarn'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Home Page/home_bottombar_btnVoucher'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('iOS/Pocket Page/pocket_danaUI'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Pocket Page/pocket_danaUI'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Pocket Page/pocket_header_btnBack'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page/home_bottombar_btnVoucher'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page/home_bottombar_btnVoucher'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Home Page/home_bottombar_btnVoucher'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Home Page/home_bottombar_btnHome'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page/home_logo_imgKfclogo'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Home Page/home_bottombar_btnHome'), 2, FailureHandling.STOP_ON_FAILURE)

