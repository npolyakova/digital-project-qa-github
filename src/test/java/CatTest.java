import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CatTest {

    Cat newCat;

    @BeforeEach
    public void setUp() {
        newCat = new Cat("Мурка", 3);
    }

    @Test
    public void shouldGetAge() {
        Assertions.assertEquals(4, newCat.getAge());
    }

    @Test
    public void shouldMeow() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        newCat.meow();
        Assertions.assertEquals(output.toString(), "Meow!\n");
    }

    @Test
    public void shouldSetName() {
        newCat.name = "Васька";
        Assertions.assertEquals(newCat.name, "Васька");
    }

    @Test
    public void shouldGetName() {
        Assertions.assertEquals(newCat.name, "Мурка");
    }

    @AfterEach
    public void remove() {
        newCat = null;
    }
}
