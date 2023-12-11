package runner;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class parallel {

    @Test
    void testParallel() {
        Results results = Runner.path("classpath:features")
                //.outputCucumberJson(true)
                .parallel(8);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }

}
