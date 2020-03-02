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

Mobile.verifyElementExist(findTestObject('iOS/Home Page/home_points_btnRedeem'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Home Page/home_points_btnRedeem'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_redeem_btnNext'), 1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

Mobile.tap(findTestObject('iOS/Home Page/Choose Action Prompt/chaction_redeem_title'), 1, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

Mobile.verifyElementExist(findTestObject('iOS/Voucher List Page/vouchlist_vouch1_title'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Voucher List Page/vouchlist_vouch1_redeemamt'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5)

Mobile.waitForElementPresent(findTestObject('iOS/Voucher Detail Page/vouchdet_info_title'), 1)

Mobile.verifyElementExist(findTestObject('iOS/Voucher Detail Page/vouchdet_header_btnBack'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher Detail Page/vouchdet_header_btnBack'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher Detail Page/vouchdet_header_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher Detail Page/vouchdet_header_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher Detail Page/vouchdet_header_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher Detail Page/vouchdet_info_imgCoupon'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher Detail Page/vouchdet_info_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher Detail Page/vouchdet_info_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher Detail Page/vouchdet_info_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher Detail Page/vouchdet_info_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher Detail Page/vouchdet_info_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher Detail Page/vouchdet_info_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher Detail Page/vouchdet_info_desc_price'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher Detail Page/vouchdet_info_desc_price'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher Detail Page/vouchdet_info_desc_price'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher Detail Page/vouchdet_voucherimage'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher Detail Page/vouchdet_info_desc_redeemamt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher Detail Page/vouchdet_info_desc_redeemamt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher Detail Page/vouchdet_info_desc_redeemamt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher Detail Page/vouchdet_btnCancel_text'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher Detail Page/vouchdet_btnCancel_text'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher Detail Page/vouchdet_btnCancel_text'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher Detail Page/vouchdet_btnCancel'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher Detail Page/vouchdet_btnCancel'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher Detail Page/vouchdet_btnConfirm_text'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher Detail Page/vouchdet_btnConfirm_text'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher Detail Page/vouchdet_btnConfirm_text'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher Detail Page/vouchdet_btnConfirm'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher Detail Page/vouchdet_btnConfirm'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher Detail Page/vouchdet_TC_btnTC_text'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher Detail Page/vouchdet_TC_btnTC_text'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher Detail Page/vouchdet_TC_btnTC_text'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher Detail Page/vouchdet_TC_btnTC'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher Detail Page/vouchdet_TC_btnTC'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher Detail Page/vouchdet_TC_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher Detail Page/vouchdet_TC_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher Detail Page/vouchdet_TC_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Voucher Detail Page/vouchdet_howto_btnHowto'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher Detail Page/vouchdet_howto_btnHowto_text'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher Detail Page/vouchdet_howto_btnHowto_text'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher Detail Page/vouchdet_howto_btnHowto_text'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher Detail Page/vouchdet_howto_btnHowto'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher Detail Page/vouchdet_howto_btnHowto'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher Detail Page/vouchdet_howto_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher Detail Page/vouchdet_howto_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher Detail Page/vouchdet_howto_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Voucher Detail Page/vouchdet_btnCancel'), 1)

