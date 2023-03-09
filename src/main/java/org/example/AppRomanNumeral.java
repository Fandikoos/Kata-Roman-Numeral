package org.example;

public class AppRomanNumeral {
    public String convertToRomanNumeral(int numDecimal) {
        String romanNumber = "";
        /*A traves de un for each recorremos la enumeracion para determinar las
        siglas romanas que se van a ir sumando en función del numero decimal*/
        for (RomanToDecimal romanToDecimal : RomanToDecimal.values()){
            if (numDecimal >= romanToDecimal.decimal){
                romanNumber += romanToDecimal.roman;
                numDecimal -= romanToDecimal.decimal;
            }
        }

        //Recorremos un array que nos permitira sacar los 3 primeros años
        for (int i = 0; i< numDecimal; i++){
            romanNumber += "I";
        }
        return romanNumber;
    }

    /* Creamos una enumeración (enum) que nos va a permitir contener unos valores
    definidos en una lista. Esa lista va a estar formada por todas las siglas romanas
    acompañadas de su valor decimal*/
    enum RomanToDecimal{
        TEN("X", 10),
        FIVE("V", 5);
        private final String roman;
        private final int decimal;

        RomanToDecimal(String roman, int decimal){
            this.roman = roman;
            this.decimal = decimal;
        }
    }
}
