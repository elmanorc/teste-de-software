package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteSelenium {

	public static void main(String[] args) {

		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://qacademico.ifpe.edu.br/qacademico/index.asp?t=1000");
		WebElement login = driver.findElement(By.name("LOGIN"));
		WebElement senha = driver.findElement(By.name("SENHA"));
		login.sendKeys("1958765");
		senha.sendKeys("senha");
		login.submit();
		
		
		System.out.println(driver.getPageSource().toString());
		 
		String urlConsultaAluno = "https://qacademico.ifpe.edu.br/qacademico/index.asp?t=3081";
		
		driver.get(urlConsultaAluno);
		WebElement nomeAluno = driver.findElement(By.name("NOME_ALUNO"));
		nomeAluno.sendKeys("Thiago");
		nomeAluno.submit();
		
		String nomeConsultado = "Thiago Lins do Nascimento";
		
		if(driver.getPageSource().contains(nomeConsultado)) {
			System.out.println("O estudante " +nomeConsultado + " é estudante do IFPE.");
		} else {
			System.out.println("O estudante " +nomeConsultado + "é estudante do IFPE.");
		}
	}

}
