////////////////////////////////////////////////////////////////////
// Massimo Chioru 2013449
// Stefano Bressan 1201199
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void convert1() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(1);
        // Assert
        assertEquals("I", roman);
    }

    @Test
    public void convert5() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(5);
        // Assert
        assertEquals("V", roman);
    }

    @Test
    public void convert10() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(10);
        // Assert
        assertEquals("X", roman);
    }

    @Test
    public void convert50() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(50);
        // Assert
        assertEquals("L", roman);
    }

    @Test
    public void convert100() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(100);
        // Assert
        assertEquals("C", roman);
    }

    @Test
    public void convert500() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(500);
        // Assert
        assertEquals("D", roman);
    }

    @Test
    public void convert1000() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(1000);
        // Assert
        assertEquals("M", roman);
    }

    @Test
    public void convert9() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(9);
        // Assert
        assertEquals("IX", roman);
    }

    @Test
    public void convert44() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(44);
        // Assert
        assertEquals("XLIV", roman);
    }

    @Test
    public void convert69() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(69);
        // Assert
        assertEquals("LXIX", roman);
    }

    @Test
    public void convert420() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(420);
        // Assert
        assertEquals("CDXX", roman);
    }

    @Test
    public void convert999() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(999);
        // Assert
        assertEquals("CMXCIX", roman);
    }

    @Test
    public void convertNegative() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(-1);
        // Assert
        assertEquals("Errore", roman);
    }

    @Test
    public void convertTooBig() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(1001);
        // Assert
        assertEquals("Errore", roman);
    }

    @Test
    public void convertZero() {
        // Arrange
        String roman;
        // Act
        roman = IntegerToRoman.convert(0);
        // Assert
        assertEquals("Errore", roman);
    }
}
