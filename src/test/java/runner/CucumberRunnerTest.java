package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        tags = "@GroupSelectPageElementsCheck or @LoginPageElementsCheck or @MainPageElementsCheck or @NavigationPageElementsCheck", //Вписать индивидуальный тег, теги для тестов, которые необходимо протестировать отдельно с генерацией отчета
        //для запуска нескольких тестов писать так: "@GroupSelectPageElementsCheck or @LoginPageElementsCheck or ..."

        features = "classpath:features/",
        glue = "bdd.stepdefs"
)

public class CucumberRunnerTest{
}
