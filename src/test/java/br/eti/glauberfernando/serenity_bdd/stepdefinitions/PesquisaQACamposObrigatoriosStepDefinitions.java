package br.eti.glauberfernando.serenity_bdd.stepdefinitions;

import br.eti.glauberfernando.serenity_bdd.steps.PaginaInicialSteps;
import br.eti.glauberfernando.serenity_bdd.steps.PesquisaQASteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

/**
 * <p>Classe de Step Definitions do Cucumber.</p>
 *
 * @author Glauber Fernando
 * @version $Id: $Id
 * @since 1.0.0
 */
public class PesquisaQACamposObrigatoriosStepDefinitions {

    @Steps
    PaginaInicialSteps paginaInicialSteps;

    @Steps
    PesquisaQASteps pesquisaQASteps;

    @Given("^que eu acesse a página da VV Test$")
    public void que_eu_acesse_a_pagina_da_vv_test() {
        paginaInicialSteps.openPage();
    }

    @And("^acesse o menu \"Pesquisa - QA\"$")
    public void acesse_o_menu_pesquisa_qa() {
        paginaInicialSteps.clickOnPesquisaQaLink();
    }

    @When("^eu preencher todos os campos obrigatórios$")
    public void eu_preencher_todos_os_campos_obrigatorios() {
        pesquisaQASteps.fillNomeField("Glauber");
        pesquisaQASteps.fillSobrenomeField("Fernando");
        pesquisaQASteps.fillEmailField("glauber.fernando@gmail.com");
        pesquisaQASteps.fillConfEmailField("glauber.fernando@gmail.com");
        pesquisaQASteps.clickOnIdade3149CheckBox();
        pesquisaQASteps.selectTempoQa("mais de 5 anos");
        pesquisaQASteps.selectOQueTeAtraiu("Desafio");
        pesquisaQASteps.clickOnOQueMaisPrecisaMelhorarTecnicoCheckBox();
        pesquisaQASteps.fillLinguagemField("JAVA");
        pesquisaQASteps.clickOnEnviar();
    }

    @Then("^deve ser direcionado para uma página de sucesso$")
    public void deve_ser_direcionado_para_uma_pagina_de_sucesso() {
        assertThat(pesquisaQASteps.getFormSuccessfullyText(), equals("Your form has been successfully submitted."));
    }

}
