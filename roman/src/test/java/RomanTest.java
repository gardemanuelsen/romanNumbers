import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanTest {

    @Test
    void shouldConvert1toI (){
        assertEquals("I", RomanNumbers.toRoman(1));
    }

    @Test
    void shouldConvert2toII (){
        assertEquals("II", RomanNumbers.toRoman(2));
    }

    @Test
    void shouldConvert3toIII (){
        assertEquals("III", RomanNumbers.toRoman(3));
    }

    @Test
    void shouldConvert4toIV (){
        assertEquals("IV", RomanNumbers.toRoman(4));
    }

    @Test
    void shouldConvert5toV (){
        assertEquals("V", RomanNumbers.toRoman(5));
    }








}
