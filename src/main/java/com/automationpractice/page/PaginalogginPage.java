/**
 * 
 */
package com.automationpractice.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author sepul
 *
 */
public class PaginalogginPage {

	private WebDriver driver;

	@FindBy(xpath = "//a[@rel=\"nofollow\"][@class=\"logout\"]")
	WebElement SignOut;
	
	@FindBy(linkText = "pepito perez")
	WebElement UsuarioP;
	

	public PaginalogginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// metodo para dar click en los elementos
	public void click(WebElement elemento) {
		elemento.click();
	}
	
	public void CerrarSesion() {
		click(SignOut);
	}
	
	public String VerificarSignOut() {
		return UsuarioP.getText();
	
	}
	
}
