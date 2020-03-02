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

Mobile.verifyElementExist(findTestObject('iOS/Home Page/home_topbar_btnProfile'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Home Page/home_topbar_btnProfile'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('User Profile Page Component check begin')

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_header_btnBack'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_header_btnBack'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_header_title_profile'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_header_title_profile'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Profile Section')

Mobile.delay(3)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_userinfo_btnEdit'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_userinfo_btnEdit'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_userinfo_desc_phonenum'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_userinfo_desc_phonenum'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Profile Page/profilepage_userinfo_desc_phonenum'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_userinfo_desc_username'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_userinfo_desc_username'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Profile Page/profilepage_userinfo_desc_username'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_userinfo_imgBgProfile'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Dana Section')

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_dana_btnTopup'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_dana_btnTopup'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_dana_btnTopup_text'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_dana_btnTopup_text'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Profile Page/profilepage_dana_btnTopup_text'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_dana_desc_active'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_dana_desc_active'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Profile Page/profilepage_dana_desc_active'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_dana_desc_danabalance'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_dana_desc_danabalance'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Profile Page/profilepage_dana_desc_danabalance'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_dana_desc_mobilenum'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_dana_desc_mobilenum'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Profile Page/profilepage_dana_desc_mobilenum'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_dana_desc_moneyamount'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_dana_desc_moneyamount'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Profile Page/profilepage_dana_desc_moneyamount'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_dana_imgBgactive'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_dana_imgBgactive'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_dana_imgBgDana'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_dana_imgDanalogo'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_dana_imgDanalogo'), 2, FailureHandling.CONTINUE_ON_FAILURE)

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

Mobile.comment('Info Section')

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_submenus_CC_desc_customerservice'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_submenus_CC_desc_customerservice'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Profile Page/profilepage_submenus_CC_desc_customerservice'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_submenus_CC_imgCC'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_submenus_CC_imgNext'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_submenus_howto_desc_howto'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_submenus_howto_desc_howto'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Profile Page/profilepage_submenus_howto_desc_howto'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_submenus_howto_imgHowto'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_submenus_howto_imgNext'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_submenus_PP_desc_privacypolicy'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_submenus_PP_desc_privacypolicy'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Profile Page/profilepage_submenus_PP_desc_privacypolicy'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_submenus_PP_imgNext'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_submenus_PP_imgPP'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_submenus_TC_desc_termsand'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_submenus_TC_desc_termsand'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Profile Page/profilepage_submenus_TC_desc_termsand'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_submenus_TC_imgNext'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_submenus_TC_imgTC'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Logout Pop Up')

Mobile.scrollToText('Log Out', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_logout_desc_logout'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_logout_desc_logout'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Profile Page/profilepage_logout_desc_logout'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_logout_btnLogout'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('iOS/Profile Page/profilepage_logout_btnLogout'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('iOS/Profile Page/profilepage_logout_imgLogoutIcon'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Profile Page/profilepage_header_btnBack'), 2, FailureHandling.STOP_ON_FAILURE)

