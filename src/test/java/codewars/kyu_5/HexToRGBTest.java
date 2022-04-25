package codewars.kyu_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HexToRGBTest {

    @Test
    void should_correctly_convert_hex_to_RGB() {

        assertArrayEquals(HexToRGB.hexStringToRGB("#111111"), new int[]{17, 17, 17});
        assertArrayEquals(HexToRGB.hexStringToRGB("#000000"), new int[]{0, 0, 0});
        assertArrayEquals(HexToRGB.hexStringToRGB("#FF9933"), new int[]{255, 153, 51});
        assertArrayEquals(HexToRGB.hexStringToRGB("#beaded"), new int[]{190, 173, 237});
        assertArrayEquals(HexToRGB.hexStringToRGB("#Fa3456"), new int[]{250, 52, 86});

    }
}
