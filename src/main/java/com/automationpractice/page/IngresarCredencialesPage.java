package com.automationpractice.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IngresarCredencialesPage {

	private WebDriver driver;
	
	@FindBy(xpath ="//*[@id=\"SubmitCreate\"]")
	WebElement BttCrearCuenta;	
	
	@FindBy(xpath = "//*[@id=\"email_create\"]")
	WebElement email;
	/*
	@FindBy(xpath = "//*[@id=\"create_account_error\"]/ol/li")
	WebElement MensajeError;
	*/

	
	
	public IngresarCredencialesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void click(WebElement elemento) {
		elemento.click();
	}
	
	public void escribir(WebElement elemento, String texto) {
		elemento.sendKeys(texto);
	}
	public void IngresarCorreo() {
		escribir(email, "jghdfsk@gsjew.com");//pepito11@perez.com
	}
	public void CrearCuenta() {
		click(BttCrearCuenta);
	}
	/*public void validarMensaje() {
		String mensajeE = MensajeError.getText();
		System.out.println(mensajeE);
	}*/
	
	
}
