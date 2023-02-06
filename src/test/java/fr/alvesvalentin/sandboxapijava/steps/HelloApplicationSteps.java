package fr.alvesvalentin.sandboxapijava.steps;

import fr.alvesvalentin.sandboxapijava.SandboxApiJavaApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;


@ContextConfiguration(initializers = HelloApplicationSteps.Initializer.class)
public class HelloApplicationSteps extends CucumberSetup{

    static class Initializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

        public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
            // here you can initialize the context with the properties needed by your application.

        }
    }
}