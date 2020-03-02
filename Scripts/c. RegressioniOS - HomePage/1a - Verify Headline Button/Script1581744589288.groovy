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

WebUI.comment('Check History Button Existence')

Mobile.verifyElementExist(findTestObject('iOS/Home Page/home_topbar_btnHistory'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page/home_topbar_btnHistory'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Home Page/home_topbar_btnHistory'), 2)

WebUI.comment('Check History Button Redirection')

Mobile.verifyElementExist(findTestObject('iOS/Order History Page/ordhis_tab_inProgress'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Order History Page/ordhis_tab_inProgress'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Order History Page/ordhis_header_title'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Order History Page/ordhis_header_title'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Order History Page/ordhis_header_btnBack'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Order History Page/ordhis_header_btnBack'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'Tap using Back Button (Embedded Back Button)'
Mobile.tap(findTestObject('iOS/Order History Page/ordhis_header_btnBack'), 2)

WebUI.comment('Check History Button Back Button Redirection')

Mobile.waitForElementPresent(findTestObject('iOS/Home Page/home_logo_imgKfclogo'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page/home_delivorder_btnDelivorder'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page/home_delivorder_title'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page/home_PNP_btnPNP'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page/home_PNP_title'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Verify Headline Button done')

