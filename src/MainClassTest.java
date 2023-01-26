import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassString() {

        String actual = this.getClassString();
        String actual1 = this.getAnotherClassString();
        Assert.assertTrue("The string must contain 'hello' or 'Hello'", actual.contains("Hello"));
        Assert.assertTrue("The string must contain 'hello' or 'Hello'", actual1.contains("hello"));

    }
}

