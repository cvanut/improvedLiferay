package Locators;

import org.openqa.selenium.By;

public class formsLocator {
	
	
	//CLASSE COM O FORMS LOCATOR PARA A MUDANCA DE PATHS FICAR CENTRALIZADA
	
	public By getPartyRockLocator() {
		return partyRockLocator;
	}
	public By getNameLocator() {
		return nameLocator;
	}
	public By getDateLocator() {
		return dateLocator;
	}
	public By getMotivationLocator() {
		return motivationLocator;
	}
	public By getSubmitLocator() {
		return submitLocator;
	}
	public By getRequiredLocator() {
		return requiredLocator;
	}
	public By getSuccessMessageLocator() {
		return successMessageLocator;
	}
	
	private final By partyRockLocator = By.xpath(".//*[contains(text(), 'party rock')]");
	
	private final By nameLocator = By.xpath(".//*[contains(@id, '_com_liferay_dynamic_data_mapping_form_web_portlet') and contains(@id, 'Nome')]");
	private final By dateLocator = By.xpath("//div[@class='input-group input-group-container']/input");
	private final By motivationLocator = By.xpath("//div[@class='input-group']/textarea[@class='field form-control']");
	
	private final By submitLocator = By.cssSelector(".btn.btn-primary.lfr-ddm-form-submit.pull-right");

	private final By requiredLocator = By.cssSelector(".form-feedback-item.help-block");
	private final By successMessageLocator = By.xpath("//*[contains(text(),'Informações enviadas com sucesso!')]");

}
