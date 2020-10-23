package br.eti.glauberfernando.serenity_bdd.steps;

import br.eti.glauberfernando.serenity_bdd.pages.PaginaInicialPage;
import net.thucydides.core.annotations.Step;

/**
 * <p>Classe de Steps do Serenity BDD.</p>
 *
 * @author Glauber Fernando
 * @version $Id: $Id
 * @since 1.0.0
 */
public class PaginaInicialSteps {

    private PaginaInicialPage paginaInicialPage;

    @Step
    public void openPage() {
        paginaInicialPage.openPage();
    }

    @Step
    public void clickOnPesquisaQaLink() {
        paginaInicialPage.clickOnPesquisaQaLink();
    }
}
