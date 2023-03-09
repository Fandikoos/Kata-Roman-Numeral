package org.example;

public class AppRomanNumeral {
    public String convertToRomanNumeral(int numDecimal) {
        String romanNumber = "";
        /*A traves de un for each recorremos la enumeracion para determinar las
        siglas romanas que se van a ir sumando en función del numero decimal*/
        for (RomanToDecimal romanToDecimal : RomanToDecimal.values()){
            while (numDecimal >= romanToDecimal.decimal){
                romanNumber += romanToDecimal.roman;
                numDecimal -= romanToDecimal.decimal;
            }
        }
        return romanNumber;
    }

    /* Creamos una enumeración (enum) que nos va a permitir contener unos valores
    definidos en una lista. Esa lista va a estar formada por todas las siglas romanas
    acompañadas de su valor decimal*/
    enum RomanToDecimal{
        TEN("X", 10),
        FIVE("V", 5),
        ONE("I", 1);
        private final String roman;
        private final int decimal;

        RomanToDecimal(String roman, int decimal){
            this.roman = roman;
            this.decimal = decimal;
        }
    }
}
