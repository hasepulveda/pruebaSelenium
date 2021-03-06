package com.automationpractice.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaPrincipalPage {
	
	private WebDriver driver;
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement registrarse;
	
	public PaginaPrincipalPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void click(WebElement elemento) {
		elemento.click();
	}
	
	public void register() {
		click(registrarse);
	}
	
}
