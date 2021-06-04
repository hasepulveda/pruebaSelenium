package com.automationpractice.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automationpractice.page.IngresarCredencialesPage;
import com.automationpractice.page.PaginaIngresoDatosPage;
import com.automationpractice.page.PaginaPrincipalPage;
import com.automationpractice.page.PaginalogginPage;

public class IngresarEmailTest {
	private String rutaWebDriver = "src/test/java/driver/chromedriver.exe";
	private String URL = "http://automationpractice.com/index.php";
	WebDriver driver;
	
	@Before
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", rutaWebDriver);
		driver = new ChromeDriver();
	}
	@Test
	public void ingresarEmail() throws InterruptedException {
		driver.get(URL);
		PaginaPrincipalPage page = new PaginaPrincipalPage(driver);
		page.register();
		Thread.sleep(3000);
		assertEquals("ALREADY REGISTERED?", driver.findElement(By.xpath("//*[@id=\"login_form\"]/h3")).getText());
		IngresarCredencialesPage PageRegistro = new IngresarCredencialesPage(driver);
		PageRegistro.IngresarCorreo();
		PageRegistro.CrearCuenta();
		Thread.sleep(3000);
		PaginaIngresoDatosPage PageRegistroDeDatos = new PaginaIngresoDatosPage(driver);
		PageRegistroDeDatos.SelecSeñorSeñora();
		PageRegistroDeDatos.IngresoDatos();
		PageRegistroDeDatos.listaState();
		PageRegistroDeDatos.RegistrarmeBoton();
		Thread.sleep(3000);
		
		PaginalogginPage paginalogginPage = new PaginalogginPage(driver);
		assertEquals("pepito perez", paginalogginPage.VerificarSignOut());
		paginalogginPage.CerrarSesion();
	}
	
	
	@After
	public void mensajeError() {
		//IngresarCredencialesPage PageRegistro = new IngresarCredencialesPage(driver);
		//PageRegistro.validarMensaje();
	}
}
