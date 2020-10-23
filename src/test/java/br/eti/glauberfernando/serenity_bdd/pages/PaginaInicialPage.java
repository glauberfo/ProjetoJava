package br.eti.glauberfernando.serenity_bdd.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

/**
 * <p>Classe de Step Definitions do Cucumber.</p>
 *
 * @author Glauber Fernando
 * @version $Id: $Id
 * @since 1.0.0
 */
public class PaginaInicialPage extends BasePage {

    @FindBy(link = "Pesquisa – QA")
    private WebElement pesquisaQaLink;

    public PaginaInicialPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void openPage() {
        open();
        driver.navigate().refresh();
    }
    
    public void clickOnPesquisaQaLink() {
        pesquisaQaLink = wait.until(elementToBeClickable(pesquisaQaLink));
        pesquisaQaLink.click();
    }
}
