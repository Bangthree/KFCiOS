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

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('iOS/Login Page/Welcome Page/loginpage_logo_imgKfclogo'), 2, FailureHandling.OPTIONAL) == 
true) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.callTestCase(findTestCase('b. RegressioniOS - Login/Assist Test/Login Dana'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    println = 'Logged in'
}

Mobile.waitForElementPresent(findTestObject('iOS/Home Page - New Sprnt 25B/home_logo_imgKFC'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Quick Check on Delivery Order Button')

Mobile.verifyElementExist(findTestObject('iOS/Home Page - New Sprnt 25B/home_delivorder_btnDeliv'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page - New Sprnt 25B/home_delivorder_btnDeliv'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page - New Sprnt 25B/home_delivorder_txtPesan'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Home Page - New Sprnt 25B/home_delivorder_txtPesan'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page - New Sprnt 25B/home_delivorder_txtAntar'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Home Page - New Sprnt 25B/home_delivorder_txtAntar'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Quick Check on Pay & Pick Button')

Mobile.verifyElementExist(findTestObject('iOS/Home Page - New Sprnt 25B/home_PNP_btnPNP'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page - New Sprnt 25B/home_PNP_btnPNP'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page - New Sprnt 25B/home_PNP_txtPay'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Home Page - New Sprnt 25B/home_PNP_txtPay'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page - New Sprnt 25B/home_PNP_txtPick'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Home Page - New Sprnt 25B/home_PNP_txtPick'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Quick Check on KFC Points Button')

Mobile.verifyElementExist(findTestObject('iOS/Home Page - New Sprnt 25B/home_points_btnRedeem'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page - New Sprnt 25B/home_points_btnRedeem'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page - New Sprnt 25B/home_points_txtPointsAmt'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Home Page - New Sprnt 25B/home_points_txtPointsAmt'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page - New Sprnt 25B/home_points_txtPoints'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Home Page - New Sprnt 25B/home_points_txtPoints'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page - New Sprnt 25B/home_points_txtKFC'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Home Page - New Sprnt 25B/home_points_txtKFC'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Quick Check on History Button')

Mobile.verifyElementExist(findTestObject('iOS/Home Page - New Sprnt 25B/home_topbar_btnHistory'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page - New Sprnt 25B/home_topbar_btnHistory'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page - New Sprnt 25B/home_topbar_btnHistory_newHistory'), 2, FailureHandling.OPTIONAL)

WebUI.comment('Quick Check on Profile Button')

Mobile.verifyElementExist(findTestObject('iOS/Home Page - New Sprnt 25B/home_topbar_btnProfile'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page - New Sprnt 25B/home_topbar_btnProfile'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Quick Check on KFC Logo on Homepage')

Mobile.verifyElementExist(findTestObject('iOS/Home Page - New Sprnt 25B/home_logo_imgKFC'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Quick Check on Ongoing Promo')

Mobile.verifyElementExist(findTestObject('iOS/Home Page - New Sprnt 25B/home_promo_txtOngoingPromo'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Home Page - New Sprnt 25B/home_promo_txtOngoingPromo'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page - New Sprnt 25B/home_promo_btnViewAll'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page - New Sprnt 25B/home_promo_btnViewAll'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page/home_promo_activepromo_imgPromo'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page/home_promo_pagecontrol'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page/home_promo_pagecontrol'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page/home_promo_slidingsection'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page/home_promo_slidingsection'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page/home_promo_nextpromo'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page/home_promo_nextpromo'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page/home_promo_nextpromo_imgPromo'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page/home_imgBgLong'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Quick Check on Bottom Bar')

Mobile.verifyElementExist(findTestObject('iOS/Home Page - New Sprnt 25B/home_bottombar_btnHome'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page - New Sprnt 25B/home_bottombar_btnHome'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page - New Sprnt 25B/home_bottombar_btnEarn'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page - New Sprnt 25B/home_bottombar_btnEarn'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Home Page - New Sprnt 25B/home_bottombar_btnVoucher'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Home Page - New Sprnt 25B/home_bottombar_btnVoucher'), 2, FailureHandling.CONTINUE_ON_FAILURE)

