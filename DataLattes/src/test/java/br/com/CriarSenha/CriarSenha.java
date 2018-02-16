package br.com.CriarSenha;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CriarSenha {
	private WebDriver driver;

	@Before
	public void inicializacao() {
		// DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("--incognito");
		// capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		this.driver = new ChromeDriver();
		this.driver.get("http://localhost:8080/");
		this.driver.close();
	}

	@Test
	public void Teste() throws InterruptedException {
		String key;
		this.driver.findElement(By.id("criarSenha")).click();
		Thread.sleep(1000);
		this.driver.findElement(By.id("checkboxformacaoMarkAll")).click();
		this.driver.findElement(By.id("checkboxProdArtMarkAll")).click();
		this.driver.findElement(By.id("checkboxProdTecMarkAll")).click();
		this.driver.findElement(By.id("checkboxOrienMarkAll")).click();
		this.driver.findElement(By.id("checkboxBancMarkAll")).click();
		this.driver.findElement(By.id("checkboxDadosGeraisMarkAll")).click();
		this.driver.findElement(By.id("checkboxProdBiblMarkAll")).click();
		this.driver.findElement(By.id("submitForm")).click();
		Thread.sleep(1000);
		this.driver.findElement(By.id("AnoInicio")).sendKeys("2000");
		key = "Ano>2000>2018%For!#";
		// graduacao
		this.driver.findElement(By.id("item0list0tipo0")).sendKeys("20");
		// esp
		this.driver.findElement(By.id("myCheckFormacaoItemLimite1")).click();
		this.driver.findElement(By.id("item1list0tipo0")).sendKeys("30");
		this.driver.findElement(By.id("item1list0tipo0limite")).sendKeys("200");
		// mestrado
		this.driver.findElement(By.id("myCheckFormacaoItemStatus2")).click();
		this.driver.findElement(By.id("item2list1tipo0")).sendKeys("15");
		this.driver.findElement(By.id("item2list1tipo1")).sendKeys("60");
	}

}
