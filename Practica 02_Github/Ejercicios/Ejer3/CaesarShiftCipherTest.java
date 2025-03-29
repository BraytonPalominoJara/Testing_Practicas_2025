import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    @ParameterizedTest
    @CsvSource({
        "'abc', 3, 'def'",
        "'xyz', 3, 'abc'",
        "'hello world', 1, 'ifmmp xpsme'",
        "'abc', -1, 'zab'",
        "'123', 2, 'invalid'",
        "'', 5, ''"
    })
    public void testCaesarShiftCipher(String input, int shift, String expected) {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        Assertions.assertEquals(expected, cipher.caesarShiftCipher(input, shift));
    }
}
