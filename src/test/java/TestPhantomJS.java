import com.moodysalem.wrapper.PhantomJS;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestPhantomJS {
    @Test
    public void testRunScript() throws IOException {
        PhantomJS.exec("test-script.js");
    }
}