package org.example;

public class CalculateDni {

    private static char[] dniChar = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P',
            'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public static String charExpected(int dniNumber) {
        if (dniNumber < 0 || dniNumber > 99999999) {
            throw new IllegalArgumentException("DNI number not valid");
        }
        int index = dniNumber % 23;
        return dniNumber + "-" + dniChar[index];
    }
}

