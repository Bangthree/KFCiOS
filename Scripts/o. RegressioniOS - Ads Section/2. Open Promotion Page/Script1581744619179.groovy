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

Mobile.comment('Promotion Page Check Finished')

Mobile.delay(3)

Mobile.tap(findTestObject('iOS/Home Page/home_promo_btnViewall'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(3)

Mobile.verifyElementExist(findTestObject('iOS/Promo List Page/promolist_header_title_Promo'), 1, FailureHandling.CONTINUE_ON_FAILURE)

'Check Promo Title Header'
Mobile.verifyElementVisible(findTestObject('iOS/Promo List Page/promolist_header_title_Promo'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Promo List Page/promolist_header_btnBack'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Promo List Page/promolist_header_btnBack'), 1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Promo List Page/promolist_promo_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Promo List Page/promolist_promo_1'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Promo List Page/promolist_promo_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Promo List Page/promolist_promo_2'), 1, FailureHandling.CONTINUE_ON_FAILURE)

'Need Update for iOS\n'
Mobile.swipe(500, 1500, 500, 750)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('Open Promo List', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Promo List Page/promolist_header_btnBack'), 1, FailureHandling.CONTINUE_ON_FAILURE)

