package pages;

import static com.liferay.gs.testFramework.SeleniumReadPropertyKeys.DRIVER;

import Locators.formsLocator;
import utils.CommonMethods;

public class formsPage {
	
	CommonMethods commonMethods = new CommonMethods();
	formsLocator formsLocator = new formsLocator();
			
	public void clickOnSubmit() {
		commonMethods.waitElementVisibilityAndBeClickable(formsLocator.getSubmitLocator());
		DRIVER.findElement(formsLocator.getSubmitLocator()).click();
	}
	
	public boolean verifyPartyRockIsPresentOnScreen() {
		commonMethods.waitElementAppearOnScreen(formsLocator.getPartyRockLocator());
		return DRIVER.findElement(formsLocator.getPartyRockLocator()).isDisplayed();
	}
	
	//NOVO: Preencher o campo nome
	public void fillName (String name) {
		commonMethods.waitElementVisibilityAndBeClickable(formsLocator.getNameLocator());
		DRIVER.findElement(formsLocator.getNameLocator()).sendKeys(name);
	}
	
	//NOVO: Preenncher a data de nascimento
	public void setDate () {
		commonMethods.waitElementVisibilityAndBeClickable(formsLocator.getDateLocator());
		DRIVER.findElement(formsLocator.getDateLocator()).sendKeys("07/05/1991");
	}
	
	//NOVO: Preenncher a motivação
	public void fillMotivation () {
		commonMethods.waitElementVisibilityAndBeClickable(formsLocator.getMotivationLocator());
		DRIVER.findElement(formsLocator.getMotivationLocator()).sendKeys("Motivation Text...");
	}
	
	//NOVO: Verificar texto de sucesso
	public boolean verifySuccess () {
		commonMethods.waitElementAppearOnScreen(formsLocator.getSuccessMessageLocator());
		return DRIVER.findElement(formsLocator.getSuccessMessageLocator()).isDisplayed();
	}
	
	//NOVO: Verificar texto de sucesso
	public boolean requiredAppear () {
		commonMethods.waitElementAppearOnScreen(formsLocator.getRequiredLocator());
		return DRIVER.findElement(formsLocator.getRequiredLocator()).isDisplayed();
	}
	
}
