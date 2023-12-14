package com.morse.morseCode.logic;

public class Morse {

    // Metodos de conversion
    private static String convertirPalabraAMorse(String palabra) {
        StringBuilder morsePalabraBuilder = new StringBuilder();

        for (char caracter : palabra.toCharArray()) {
            morsePalabraBuilder.append(convertirCaracterAMorse(caracter)).append(" ");
        }

        return morsePalabraBuilder.toString().trim();
    }
    public static String convertir(String frase) {
        StringBuilder resultado = new StringBuilder();
        String[] palabras = frase.toUpperCase().split("\\s+");

        for (int i = 0; i < palabras.length; i++) {
            resultado.append(convertirPalabraAMorse(palabras[i]));
            if (i < palabras.length - 1) {
                resultado.append("   "); // Espacios para separar en morse (3)
            }
        }

        return resultado.toString();
    }

    // Alfabeto morse
    private static String convertirCaracterAMorse(char caracter) {
        return switch (caracter) {
            case 'A' -> ".-";
            case 'B' -> "-...";
            case 'C' -> "-.-.";
            case 'D' -> "-..";
            case 'E' -> ".";
            case 'F' -> "..-.";
            case 'G' -> "--.";
            case 'H' -> "....";
            case 'I' -> "..";
            case 'J' -> ".---";
            case 'K' -> "-.-";
            case 'L' -> ".-..";
            case 'M' -> "--";
            case 'N' -> "-.";
            case 'O' -> "---";
            case 'P' -> ".--.";
            case 'Q' -> "--.-";
            case 'R' -> ".-.";
            case 'S' -> "...";
            case 'T' -> "-";
            case 'U' -> "..-";
            case 'V' -> "...-";
            case 'W' -> ".--";
            case 'X' -> "-..-";
            case 'Y' -> "-.--";
            case 'Z' -> "--..";
            case '0' -> "-----";
            case '1' -> ".----";
            case '2' -> "..---";
            case '3' -> "...--";
            case '4' -> "....-";
            case '5' -> ".....";
            case '6' -> "-....";
            case '7' -> "--...";
            case '8' -> "---..";
            case '9' -> "----.";
            default -> ""; // En caso de que no se encuentre dentro del alfabeto (null)
        };
    }
}
