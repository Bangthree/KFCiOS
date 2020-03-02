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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver

Mobile.startExistingApplication('com.kfcjv.staging')

Mobile.tap(findTestObject('iOS/Home Page/home_topbar_btnProfile'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1)

Mobile.tap(findTestObject('iOS/Profile Page/profilepage_points_btnRedeem'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3)

Mobile.swipe(100, 600, 100, 50, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(100, 600, 100, 50, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('iOS/Voucher List Page/vouchlist_unbuyablevouch_text_550KFC'), 2, FailureHandling.STOP_ON_FAILURE)

