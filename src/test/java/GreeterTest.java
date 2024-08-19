import org.example.Greeter;
import org.junit.Test;

import static org.junit.matchers.JUnitMatchers.containsString;
import static org.junit.Assert.*;

public class GreeterTest {
    private Greeter greeterNamed = new Greeter("Ivan Auda");
    private Greeter greeterAnonymous = new Greeter();
    @Test
    public void greeterSayHello() {
        assertThat(greeterNamed.sayHello(), containsString("Hello"));
        assertThat(greeterAnonymous.sayHello(), containsString("Hello"));
    }
    @Test
    public void greeterSayIntroduction() {
        assertThat(greeterNamed.sayIntroduction(), containsString("Hello, my name is"));
        assertThat(greeterNamed.sayIntroduction(), containsString(greeterNamed.getName()));
        assertThat(greeterAnonymous.sayIntroduction(), containsString("Hello, my name is"));
        assertThat(greeterAnonymous.sayIntroduction(), containsString(greeterAnonymous.getName()));
    }
}
