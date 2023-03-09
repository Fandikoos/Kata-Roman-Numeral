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
    acompañadas de su valor decimal.
    Como se ha comprobado hasta aquí, gracias a la enumeración podemos recoger el resto de
    siglas romanas respectivas a sus decimales pero tambien tendremos que recoger las excepciones
    correspondientes como se ha visto en los números 4 y 9*/
    enum RomanToDecimal{
        THOUSAND("M", 1000),
        NINE_HUNDRED("CM", 900),
        FIVE_HUNDRED("D", 500),
        FOUR_HUNDRED("CD", 400),
        HUNDRED ("C", 100),
        NINETY("XC", 90),
        FIFTY("L", 50),
        FORTY("XL", 40),
        TEN("X", 10),
        NINE("IX", 9),
        FIVE("V", 5),
        FOUR("IV", 4),
        ONE("I", 1);
        private final String roman;
        private final int decimal;

        RomanToDecimal(String roman, int decimal){
            this.roman = roman;
            this.decimal = decimal;
        }
    }
}
