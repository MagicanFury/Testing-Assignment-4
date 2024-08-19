import org.example.Greeter;
import org.junit.Test;

import static org.junit.matchers.JUnitMatchers.containsString;
import static org.junit.Assert.*;

public class GreeterTest {
    private Greeter greeter = new Greeter();

    @Test
    public void greeterSayHello() {
        assertThat(greeter.sayHello(), containsString("Hello"));
    }
}
