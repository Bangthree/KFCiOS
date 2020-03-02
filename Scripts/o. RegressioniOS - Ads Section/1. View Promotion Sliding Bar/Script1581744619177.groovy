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

Mobile.comment('Promotion Sliding Bar Check Started')

if (Mobile.verifyElementExist(findTestObject('iOS/Login Page/Relogin Alert/reloginalert_alerttype'), 2, FailureHandling.OPTIONAL) == 
true) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('b. RegressioniOS - Login/Assist Test/Session Time Out Reset'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    println = 'Session is new'
}

if (Mobile.verifyElementExist(findTestObject('iOS/Login Page/Welcome Page/loginpage_header_titletext_welcome'), 2, FailureHandling.OPTIONAL) == true) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('b. RegressioniOS - Login/Assist Test/Login Dana'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    println = 'Logged in, Homepage ready'
}

//Mobile.swipe(500, 1500, 500, 1200)
for (int i = 0; i <= 6; i++) {
    //Mobile.delay(2)
    Mobile.verifyElementExist(findTestObject('iOS/Home Page/home_promo_activepromo_imgPromo'), 1)

    Mobile.swipe(350, 500, 50, 500)
}

System.out.println('Banner (Swipe Right) Checked')

for (int i = 0; i <= 6; i++) {
    //Mobile.delay(2)
    Mobile.verifyElementExist(findTestObject('iOS/Home Page/home_promo_activepromo_imgPromo'), 1)

    Mobile.swipe(50, 500, 350, 500)
}

System.out.println('Banner (Swipe Left) Checked')

Mobile.comment('Promotion Sliding Bar Check Finished')

