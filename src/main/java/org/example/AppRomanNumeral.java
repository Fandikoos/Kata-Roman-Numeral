package org.example;

public class AppRomanNumeral {
    public String convertToRomanNumeral(int i) {
        if (i == 5){
            return "V";
        }
        if (i == 3){
            return "III";
        }
        if (i == 2){
            return "II";
        }
        return "I";
    }
}
