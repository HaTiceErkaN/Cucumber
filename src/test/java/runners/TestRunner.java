package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features ="src/test/resources/features",
        glue ="stepDefinitions",
        tags ="@aut",
        dryRun = false
)
public class TestRunner {

    /*
        Bir frameworkte bir tek runner classi yeterli olabilir, Runner classindan class bodysinde hiçbir şey olmaz
        Runner classimizi önemli yapan iki adet annotation vardir.

        @RunWtih(Cucumber.class) notasyonu, Runner classina calismaözelligi katar. Bu notasyon oldugu icin cucumber
        frameworkümüzde Junit kullanmayi terih ediyoruz.

        dryRun: iki secenek var
        dryRun= true;  testimizi calistirmadan sadece eksik adimlari bize verir, amazon sayfasi acilmaz, sadece kontrol
        eder, eksik adim var mi yok mu?

        dryRun=false; testlerimizi calistirir.

     */
}
