package fr.alvesvalentin.sandboxapijava.steps;

import fr.alvesvalentin.sandboxapijava.SandboxApiJavaApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@CucumberContextConfiguration
@SpringBootTest(webEnvironment = RANDOM_PORT, classes = SandboxApiJavaApplication.class)
public class CucumberSetup {
}