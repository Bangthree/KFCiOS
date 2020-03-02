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

Mobile.verifyElementExist(findTestObject('iOS/Home Page/home_points_btnRedeem'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page/home_points_btnRedeem'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Home Page/home_points_btnRedeem'), 2)

WebUI.comment('Check Choose Action Header')

Mobile.verifyElementExist(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_header_btnX'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_header_btnX'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_header_title_chooseaction'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_header_title_chooseaction'), 2, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Check Earn on Choose Action')

Mobile.verifyElementExist(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_earn_iconKFC'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_earn_iconKFC_border'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_earn_iconKFC_border'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_earn_imgNext'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_earn_title'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_earn_title'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_earn_title'), 'Earn', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_earn_desc'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_earn_desc'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_earn_desc'), 'Show QR to the cashier to earn KFC Points for cash and non-cash payments', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Check Redeem on Choose Action')

Mobile.verifyElementExist(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_redeem_iconCoupon'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_redeem_iconCoupon_border'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_redeem_iconCoupon_border'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_redeem_btnNext'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_redeem_title'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_redeem_title'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_redeem_title'), 'Redeem', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_redeem_desc'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_redeem_desc'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_header_btnX'), 0)

WebUI.comment('Earn and Redeem Done')

