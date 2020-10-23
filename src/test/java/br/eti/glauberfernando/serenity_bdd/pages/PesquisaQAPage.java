package br.eti.glauberfernando.serenity_bdd.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

/**
 * <p>Classe de Step Definitions do Cucumber.</p>
 *
 * @author Glauber Fernando
 * @version $Id: $Id
 * @since 1.0.0
 */
public class PesquisaQAPage extends BasePage {

    @FindBy(name = "fname")
    private WebElement nomeField;

     @FindBy(name = "lname")
    private WebElement sobrenomeField;

    @FindBy(name = "email")
    private WebElement emailField;

    @FindBy(name = "nf-field-8")
    private WebElement confEmailField;

    @FindBy(name = "nf-label-class-field-10-1")
    private WebElement idade3149CheckBox;

    @FindBy(name = "nf-field-12")
    private WebElement tempoQaList;

    @FindBy(name = "nf-field-13")
    private WebElement oQueMaisPrecisaMelhorarCheckBox;

    @FindBy(name = "nf-label-class-field-13-0")
    private WebElement oQueTeAtraiuList;

    @FindBy(name = "nf-field-14")
    private WebElement linguagemField;

    @FindBy(name = "nf-field-16")
    private WebElement enviarButton;

    @FindBy(xpath = '//*[@id="nf-form-2-cont"]/div/div[1]/p')
    private WebElement formSuccessfullyText;

    public PesquisaQAPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void fillNomeField(String text) {
        wait.until(driver -> nomeField.isDisplayed());
        nomeField.sendKeys(text);
    }

    public void fillSobrenomeField(String text) {
        wait.until(driver -> sobrenomeField.isDisplayed());
        sobrenomeField.sendKeys(text);
    }

    public void fillEmailField(String text) {
        wait.until(driver -> emailField.isDisplayed());
        emailField.sendKeys(text);
    }

    public void fillConfEmailField(String text) {
        wait.until(driver -> confEmailField.isDisplayed());
        confEmailField.sendKeys(text);
    }

    public void fillLinguagemField(String text) {
        wait.until(driver -> linguagemField.isDisplayed());
        linguagemField.sendKeys(text);
    }

    public void clickOnIdade3149CheckBox() {
        idade3149CheckBox = wait.until(elementToBeClickable(idade3149CheckBox));
        idade3149CheckBox.click();
    }

    public void clickOnOQueMaisPrecisaMelhorarTecnicoCheckBox() {
        oQueMaisPrecisaMelhorarCheckBox = wait.until(elementToBeClickable(oQueMaisPrecisaMelhorarCheckBox));
        oQueMaisPrecisaMelhorarCheckBox.click();
    }

    public void selectTempoQa(String text) {
        wait.until(driver -> tempoQaList.isDisplayed());
        Select tempoQaSelect = new Select(tempoQaList);
        tempoQaSelect.selectByVisibleText(text);
    }

    public void selectOQueTeAtraiu(String text) {
        wait.until(driver -> oQueTeAtraiuList.isDisplayed());
        Select oQueTeAtraiuSelect = new Select(oQueTeAtraiuList);
        oQueTeAtraiuSelect.selectByVisibleText(text);
    }

    public void clickOnEnviar(){
        enviarButton = wait.until(elementToBeClickable(enviarButton));
        enviarButton.click();
    }

    public String getFormSuccessfullyText(){
        formSuccessfullyText.getText();
    }
}
