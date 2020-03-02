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

Mobile.delay(2)

Mobile.setText(findTestObject('iOS/Register/Join Us Page/joinus_fullname_field_text_typeyour'), 'INvalid', 2)

Mobile.setText(findTestObject('iOS/Register/Join Us Page/joinus_mobilenum_field_text_mobilenumber'), '1234567890765', 2)

Mobile.tap(findTestObject('iOS/Register/Join Us Page/joinus_header_btnNext'), 3)

Mobile.waitForElementPresent(findTestObject('iOS/Register/Error Handling Pop Up and Red Text/errhandl_incorrectphonnum_redText'), 
    3)

Mobile.verifyElementExist(findTestObject('iOS/Register/Error Handling Pop Up and Red Text/errhandl_incorrectphonnum_redText'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('iOS/Register/Error Handling Pop Up and Red Text/errhandl_incorrectphonnum_redText'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Invalid phone number done, Next Register Password not Matc')

