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

WebUI.comment('Voucher List Page Check')

Mobile.tap(findTestObject('iOS/Profile Page/profilepage_points_btnRedeem'), 0)

Mobile.waitForElementPresent(findTestObject('iOS/Voucher List Page/vouchlist_vouch1_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher List Page/vouchlist_header_btnBack'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher List Page/vouchlist_header_title_voucher'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher List Page/vouchlist_header_title_voucher'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher List Page/vouchlist_header_title_voucher'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher List Page/vouchlist_points_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher List Page/vouchlist_points_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher List Page/vouchlist_points_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher List Page/vouchlist_points_desc_pointexpired'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher List Page/vouchlist_points_desc_pointexpired'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher List Page/vouchlist_points_desc_pointexpired'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher List Page/vouchlist_points_desc_dynamicpoint'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher List Page/vouchlist_points_desc_dynamicpoint'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher List Page/vouchlist_points_desc_dynamicpoint'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher List Page/vouchlist_title_redeemyour'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher List Page/vouchlist_title_redeemyour'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher List Page/vouchlist_title_redeemyour'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher List Page/vouchlist_desc_youcan'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher List Page/vouchlist_desc_youcan'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher List Page/vouchlist_desc_youcan'), 1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Voucher 1 Check')

Mobile.verifyElementExist(findTestObject('iOS/Voucher List Page/vouchlist_vouch1_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher List Page/vouchlist_vouch1_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher List Page/vouchlist_vouch1_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher List Page/vouchlist_vouch1_redeemamt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher List Page/vouchlist_vouch1_redeemamt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher List Page/vouchlist_vouch1_redeemamt'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher List Page/vouchlist_vouch1_desc_price'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher List Page/vouchlist_vouch1_desc_price'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher List Page/vouchlist_vouch1_desc_price'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher List Page/vouchlist_vouch1_btnRedeem_text'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher List Page/vouchlist_vouch1_btnRedeem_text'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher List Page/vouchlist_vouch1_btnRedeem_text'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher List Page/vouchlist_vouch1_btnRedeem'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher List Page/vouchlist_vouch1_btnRedeem'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(100, 600, 100, 50, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(100, 600, 100, 50, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Voucher List Page/vouchlist_unbuyablevouch_text_550KFC'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3)

Mobile.verifyElementExist(findTestObject('iOS/Voucher Detail Page/vouchdet_header_btnBack'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher Detail Page/vouchdet_header_btnBack'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher Detail Page/vouchdet_header_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher Detail Page/vouchdet_header_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher Detail Page/vouchdet_btnConfirm_text'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher Detail Page/vouchdet_btnConfirm_text'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Voucher Detail Page/vouchdet_btnConfirm_text'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Voucher Detail Page/vouchdet_btnConfirm'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher Detail Page/vouchdet_btnConfirm'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Voucher Detail Page/vouchdet_btnConfirm'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3)

Mobile.verifyElementExist(findTestObject('iOS/Voucher Detail Page/vouchdet_btnCancel'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Voucher Detail Page/vouchdet_btnCancel'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Voucher Detail Page/vouchdet_btnCancel'), 1, FailureHandling.STOP_ON_FAILURE)

