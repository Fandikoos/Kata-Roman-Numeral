package org.example;

public class AppRomanNumeral {
    public String convertToRomanNumeral(int numDecimal) {
        String romanNumber = "";

        /* Si el decimal es mayor que 5, viene a este if, entonces se suma al string
        * la sigla romana V y luego le restamos al decimal 5 para que pueda seguir progresanod
        * en el siguiente array y que pueda sumar la sigla I en función de lo que se necesite
        * para transoformar el número*/
        
        if (numDecimal >= 5){
            romanNumber += "V";
            numDecimal -= 5;
        }

        //Recorremos un array que nos permitira sacar los 3 primeros años
        for (int i = 0; i< numDecimal; i++){
            romanNumber += "I";
        }
        return romanNumber;
    }
}
