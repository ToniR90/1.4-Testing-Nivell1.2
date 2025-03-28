package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int dni;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert Dni number between 00000000 - 99999999");
        dni = scanner.nextInt();
        System.out.println(CalculateDni.charExpected(dni));

    }
}
