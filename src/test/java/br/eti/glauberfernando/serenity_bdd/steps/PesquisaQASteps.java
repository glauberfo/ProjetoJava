package br.eti.glauberfernando.serenity_bdd.steps;

import br.eti.glauberfernando.serenity_bdd.pages.PesquisaQAPage;
import net.thucydides.core.annotations.Step;

/**
 * <p>Classe de Steps do Serenity BDD.</p>
 *
 * @author Glauber Fernando
 * @version $Id: $Id
 * @since 1.0.0
 */
public class PesquisaQASteps {

    private PesquisaQAPage pesquisaQAPage;

    @Step
    public void fillNomeField(String text) {
        pesquisaQAPage.fillNomeField(text);
    }

    @Step
    public void fillSobrenomeField(String text) {
        pesquisaQAPage.fillSobrenomeField(text);
    }

    @Step
    public void fillEmailField(String text) {
        pesquisaQAPage.fillEmailField(text);
    }

    @Step
    public void fillConfEmailField(String text) {
        pesquisaQAPage.fillConfEmailField(text);
    }

    @Step
    public void fillLinguagemField(String text) {
        pesquisaQAPage.fillLinguagemField(text);
    }

    @Step
    public void clickOnIdade3149CheckBox() {
        pesquisaQAPage.clickOnIdade3149CheckBox();
    }

    @Step
    public void clickOnOQueMaisPrecisaMelhorarTecnicoCheckBox() {
        pesquisaQAPage.clickOnOQueMaisPrecisaMelhorarTecnicoCheckBox();
    }

    @Step
    public void selectTempoQa(String text) {
        pesquisaQAPage.selectTempoQa(text);
    }

    @Step
    public void selectOQueTeAtraiu(String text) {
        pesquisaQAPage.selectOQueTeAtraiu(text);
    }

    @Step
    public void clickOnEnviar() {
        pesquisaQAPage.clickOnEnviar();
    }

    @Step
    public String getFormSuccessfullyText(){
        return pesquisaQAPage.getFormSuccessfullyText();
    }
}
