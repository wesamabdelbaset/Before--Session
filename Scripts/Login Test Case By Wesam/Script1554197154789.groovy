import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://edlservices.moi.gov.kw/_forms/default.aspx?ReturnUrl=%2f_layouts%2f15%2fAuthenticate.aspx%3fSource%3d%252F&Source=%2F')

WebUI.setText(findTestObject('Object Repository/Page_Sign In/input_Civil ID_ctl00PlaceHolderMainsignInControlUserName'), 
    '292072802528')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In/input_Password_ctl00PlaceHolderMainsignInControlpassword'), 
    'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Page_Sign In/input__ctl00PlaceHolderMainsignInControllogin'))

WebUI.click(findTestObject('Object Repository/Page_MOIEdl General Department of Traffic eServices/i_                           _fa fa-user'))

WebUI.click(findTestObject('Object Repository/Page_MOIEdl General Department of Traffic eServices/i_  _fa fa-sign-out'))

WebUI.closeBrowser()

