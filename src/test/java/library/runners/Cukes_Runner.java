package library.runners;

import io.cucumber.core.options.CucumberOptionsAnnotationParser;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {
            "html:target/cucumber-reports.html",
            "rerun:target/rerun.txt",
            "me.jvt.cucumber.report.PrettyReports:target/cucumber"
            },
            features = "src/test/resources/features",
            glue = "library/step_Definitions",
            dryRun = false,
            tags = ""

            )
public class Cukes_Runner {




}
