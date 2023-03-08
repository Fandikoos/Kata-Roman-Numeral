package org.example;

public class AppRomanNumeral {
    public String convertToRomanNumeral(int numDecimal) {
        String romanNumber = "";
        if (numDecimal == 5){
            return "V";
        }

        //Recorremos un array que nos permitira sacar los 3 primeros años
        for (int i = 0; i< numDecimal; i++){
            romanNumber += "I";
        }
        return romanNumber;
    }
}
