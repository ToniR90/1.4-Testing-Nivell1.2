package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;

public class CalculateDniTest {

    @ParameterizedTest
    @CsvSource({
            "12345678, 12345678-Z",
            "87654321, 87654321-X",
            "11223344, 11223344-B",
            "55667788, 55667788-Z",
            "22446688, 22446688-E",
            "34567890, 34567890-V",
            "90807060, 90807060-R",
            "10203040, 10203040-M", //Not valid
            "10101010, 10101010-K", //Not valid
            "90909090, 90909090-X"  //Not valid
    })
    public void testCharExpected_ValidDni(int dniNumber, String expectedOutput) {
        String result = CalculateDni.charExpected(dniNumber);
        assertEquals(expectedOutput, result, "Not the expected result");
    }

    @Test
    public void testCharExpected_InvalidDni_ShouldThrowException() {
        int invalidDni = -1;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CalculateDni.charExpected(invalidDni);
        });
        assertEquals("DNI number not valid", exception.getMessage());
    }
}