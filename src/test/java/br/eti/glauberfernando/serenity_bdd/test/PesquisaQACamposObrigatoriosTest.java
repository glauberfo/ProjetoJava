package br.eti.glauberfernando.serenity_bdd.test;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * <p>Classe de Teste.</p>
 *
 * @author Glauber Fernando
 * @version $Id: $Id
 * @since 1.0.0
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/preencher_campos_obrigatorios.feature", glue = {"classpath:br.eti.glauberfernando.serenity_bdd.stepdefinitions", "classpath:br.eti.glauberfernando.serenity_bdd.hooks"})
public class PesquisaQACamposObrigatoriosTest {

}
