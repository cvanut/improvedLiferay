package tests;

import static com.liferay.gs.testFramework.SeleniumReadPropertyKeys.DRIVER;
import static com.liferay.gs.testFramework.SeleniumReadPropertyKeys.getTimeOut;
import static com.liferay.gs.testFramework.SeleniumReadPropertyKeys.getUrlToHome;
import static com.liferay.gs.testFramework.SeleniumWaitMethods.getWaitDriver;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import pages.formsPage;

public class testeLiferay {

	formsPage formsPage = new formsPage();

	@BeforeClass
	public static void setUp() {
		DRIVER.get(getUrlToHome());
		DRIVER.manage().timeouts().implicitlyWait(getTimeOut(), TimeUnit.SECONDS);
		DRIVER.manage().window().maximize();

		JavascriptExecutor jse = (JavascriptExecutor) DRIVER;
		getWaitDriver().until(webDriver -> jse.executeScript("return document.readyState").equals("complete"));
		System.out.println("page loaded");
	}

	@Ignore
	public void executarTestes() {

		// Verificação se existe o texto "party rock" no formulário.
		assertTrue(formsPage.verifyPartyRockIsPresentOnScreen());

		// Verificação se os campos são obrigatóros
		// Neste caso, se um texto de notificação é exibido pedindo o preenchimento dos
		// campos, eles são obrigatórios.

		/*
		 * navegador.findElement(By.cssSelector(
		 * ".btn.btn-primary.lfr-ddm-form-submit.pull-right")).click();
		 */

		/*
		 * Se existe uma mensagem de erro, em cada campo, ao enviar o formulário sem ter
		 * preenchido todos os campos WebElement requiredField =
		 * navegador.findElement(By.cssSelector(".form-feedback-item.help-block"));
		 * String textoErro2 = requiredField.getText();
		 * Assert.assertEquals("This field is required.", textoErro2);
		 */

		// Envio de formulário preenchido
		// Preenchimento do Campo Nome

		/*
		 * CODIGO ANTIGO
		 * 
		 * CAMPO NOME WebElement formNome =
		 * navegador.findElement(By.className("input-group-item"));
		 * formNome.findElement(By.cssSelector(".field.form-control")).sendKeys("Jose");
		 * 
		 * CAMPO DATA DE NASCIMENTO
		 * formData.findElement(By.cssSelector(".form-control")).sendKeys("07/05/1991");
		 */

		// Verify if Party Rock exists
		formsPage.verifyPartyRockIsPresentOnScreen();

		// SCENARIO: CADASTRO COM SUCESSO
		// Given that a user have to fill the form
		// And he/she fill all the form and click on submit
		// Then a page showing a success text should be loaded.

//		formsPage.fillName();
		formsPage.setDate();
		formsPage.fillMotivation();
		formsPage.clickOnSubmit();
		formsPage.verifySuccess();

	}

	@Test
	public void verifyPartyRockIsPresent() {
		// Verificação se existe o texto "party rock" no formulário.
		assertTrue(formsPage.verifyPartyRockIsPresentOnScreen());
	}

	@Test
	public void successMessageAppear() {
		// SCENARIO: CADASTRO COM SUCESSO
		// Given that a user have to fill the form
		// And he/she fill all the form and click on submit
		// Then a page showing a success text should be loaded.

		formsPage.fillName("Cleyton");
		formsPage.setDate();
		formsPage.fillMotivation();
		formsPage.clickOnSubmit();
		assertTrue(formsPage.verifySuccess());
	}

	@Ignore
	public void verifyFieldRequired() {
		// MENSAGEM DE ERRO NOS CAMPOS
		// Given that a user left AT LEAST a blank form on the page
		//
	}

	@AfterClass
	public static void tearDown() {
		DRIVER.quit();
	}

}
