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

    @Test
    public void greeterSayIntroduction() {
        assertThat(greeter.sayIntroduction(), containsString("Hello, my name is"));
        assertThat(greeter.sayIntroduction(), containsString(greeter.getName()));
    }
}
