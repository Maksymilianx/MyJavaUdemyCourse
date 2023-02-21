import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CodeTest {

    @Test
    public void testSaySth() {
        Code code = new Code();
        assertEquals("lol", code.saySth());
    }
}
