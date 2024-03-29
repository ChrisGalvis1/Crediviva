package com.front.runners;

import com.front.utilidades.FeatureOverright;
import com.ibm.icu.impl.InvalidFormatException;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;

public class RunnerFlujosCrediviva {
    private static final Logger LOGGER = LoggerFactory.getLogger(RunnerFlujosCrediviva.class);

    @Test
    public void subRunner() {

        JUnitCore.runClasses(RunnerCrediviva.class);
    }

    @Before
    public void test() throws InvalidFormatException, IOException {
        try {
            LOGGER.info("Inicio test");
            FeatureOverright.overrideFeatureFiles("src/test/java/features");
        } catch (Exception e) {
            Assert.assertTrue(false);
        }
    }
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/java/features/Crediviva.feature"},
        tags = "@FlujosCrediviva",
        glue = "com.front.definitions"
)
public class RunnerCrediviva {
    }
}