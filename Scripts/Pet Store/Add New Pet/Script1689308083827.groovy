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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import groovy.json.JsonSlurper
import groovy.json.JsonOutput
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

responseAddPet = WS.sendRequest(findTestObject('Object Repository/API/PetStore/addPet'))

JsonSlurper slupper = new JsonSlurper();

Map petStore = slupper.parseText(responseAddPet.getResponseBodyContent()) 
//String status = petStore.status
//int id = petStore.id
//WS.verifyEqual(status, 'available')
def pretty = JsonOutput.prettyPrint(petStore)
println(pretty)

//responseGetPet = WS.sendRequest(findTestObject('Object Repository/API/PetStore/getPet', [('id'): id]))
//
//Map getPetStore = slupper.parseText(responseGetPet.getResponseBodyContent())


