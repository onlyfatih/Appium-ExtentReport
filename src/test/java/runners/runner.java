package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/features"}, // Test senaryolarının (feature dosyalarının) yolunu belirtir.
        glue = {"stepDefinitions", "util"},    // Senaryoların adım tanımlama kodlarının bulunduğu paketleri belirtir.
        tags = "@SearchBusStop",                             // Hangi senaryoların çalıştırılacağını etiketle belirler.
        plugin = {
                "summary",                      // Özet raporunu konsola basar.
                "pretty",                       // Test sonuçlarını daha okunabilir bir biçimde konsola basar.
                "html:Reports/CucumberReport/Reports.html", // HTML raporunu belirtilen yere oluşturur.
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)
//@Listeners({ExtentITestListenerClassAdapter.class})
public class runner extends AbstractTestNGCucumberTests {
    // AbstractTestNGCucumberTests sınıfını genişleterek Cucumber testlerini TestNG ile çalıştırmamızı sağlar.
}


