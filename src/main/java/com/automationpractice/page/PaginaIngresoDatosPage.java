package com.automationpractice.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaginaIngresoDatosPage {
	

	private WebDriver driver;
	
	@FindBy(xpath ="//*[@id=\"id_gender1\"]")
	WebElement SenorButton;
	
	@FindBy(xpath ="//*[@id=\"customer_firstname\"]")
	WebElement nameTexbox;
	
	@FindBy(xpath ="//*[@id=\"customer_lastname\"]")
	WebElement LastNameTexbox;
	
	@FindBy(xpath ="//*[@id=\"passwd\"]")
	WebElement PasswordTexbox;
	
	@FindBy(xpath ="//*[@id=\"address1\"]")
	WebElement AddressAddressTexbox;
	
	@FindBy(xpath ="//*[@id=\"city\"]")
	WebElement CityTexbox;
	
	@FindBy(id ="postcode")
	WebElement CodePostalTexbox;
	
	@FindBy(xpath ="//*[@id=\"phone_mobile\"]")
	WebElement MobilePhoneTexbox;
	
	@FindBy(xpath ="//*[@id=\"alias\"]")
	WebElement AssignAlisaAdress;
	
	@FindBy(xpath ="//*[@id=\"id_state\"]/option")
	List<WebElement>  selectDropdownlist;
	
	@FindBy(xpath ="//*[@id=\"submitAccount\"]")
	WebElement  RegistrerButton;
	
	public PaginaIngresoDatosPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// metodo para dar click en los elementos 
	public void click(WebElement elemento) {
		elemento.click();
	}
	// metodo para escribir en los elementos 
	public void escribir(WebElement elemento, String texto) {
		elemento.sendKeys(texto);
	}
	
	public void SelecSeñorSeñora() {
		click(SenorButton);
	}
	// ingresa el nombre 
	public void IngresoDatos() {
		
		escribir(nameTexbox, "pepito");
		escribir(LastNameTexbox, "perez");
		escribir(PasswordTexbox, "12345");
		escribir(AddressAddressTexbox, "calle maple 123");
		escribir(CityTexbox, "Sogamoso");
		escribir(CodePostalTexbox, "22222");
		escribir(MobilePhoneTexbox, "855511");
		AssignAlisaAdress.clear();
		escribir(AssignAlisaAdress, "san fernando");
		
	}
	public void listaState() {
		/*Select selecList = new Select(selectDropdownlist);
		selecList.selectByVisibleText("Kansas");*/
		selectDropdownlist.get(27).click();
	}
	public void RegistrarmeBoton() {
		click(RegistrerButton);
	}
	
	
}
