package fr.alvesvalentin.sandboxapijava.steps;


import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(initializers = RecupererTousLesUtilisateursStep.Initializer.class)
public class RecupererTousLesUtilisateursStep {

    static class Initializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

        public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
            // here you can initialize the context with the properties needed by your application.

        }
    }
}